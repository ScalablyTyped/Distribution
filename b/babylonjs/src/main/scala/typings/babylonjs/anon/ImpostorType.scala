package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImpostorType extends StObject {
  
  var friction: js.UndefOr[Double] = js.undefined
  
  var impostorSize: js.UndefOr[Double | DepthHeight] = js.undefined
  
  var impostorType: js.UndefOr[Double] = js.undefined
  
  var restitution: js.UndefOr[Double] = js.undefined
}
object ImpostorType {
  
  inline def apply(): ImpostorType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImpostorType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImpostorType] (val x: Self) extends AnyVal {
    
    inline def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    inline def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
    
    inline def setImpostorSize(value: Double | DepthHeight): Self = StObject.set(x, "impostorSize", value.asInstanceOf[js.Any])
    
    inline def setImpostorSizeUndefined: Self = StObject.set(x, "impostorSize", js.undefined)
    
    inline def setImpostorType(value: Double): Self = StObject.set(x, "impostorType", value.asInstanceOf[js.Any])
    
    inline def setImpostorTypeUndefined: Self = StObject.set(x, "impostorType", js.undefined)
    
    inline def setRestitution(value: Double): Self = StObject.set(x, "restitution", value.asInstanceOf[js.Any])
    
    inline def setRestitutionUndefined: Self = StObject.set(x, "restitution", js.undefined)
  }
}
