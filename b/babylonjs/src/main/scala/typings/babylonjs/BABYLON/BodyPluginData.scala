package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyPluginData extends StObject {
  
  var hpBodyId: Any
  
  var userMassProps: PhysicsMassProperties
  
  var worldTransformOffset: Double
}
object BodyPluginData {
  
  inline def apply(hpBodyId: Any, userMassProps: PhysicsMassProperties, worldTransformOffset: Double): BodyPluginData = {
    val __obj = js.Dynamic.literal(hpBodyId = hpBodyId.asInstanceOf[js.Any], userMassProps = userMassProps.asInstanceOf[js.Any], worldTransformOffset = worldTransformOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyPluginData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BodyPluginData] (val x: Self) extends AnyVal {
    
    inline def setHpBodyId(value: Any): Self = StObject.set(x, "hpBodyId", value.asInstanceOf[js.Any])
    
    inline def setUserMassProps(value: PhysicsMassProperties): Self = StObject.set(x, "userMassProps", value.asInstanceOf[js.Any])
    
    inline def setWorldTransformOffset(value: Double): Self = StObject.set(x, "worldTransformOffset", value.asInstanceOf[js.Any])
  }
}
