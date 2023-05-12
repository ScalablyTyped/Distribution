package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhysicsUpdraftEventData extends StObject {
  
  /**
    * A cylinder used for the updraft event
    */
  var cylinder: js.UndefOr[Mesh] = js.undefined
}
object PhysicsUpdraftEventData {
  
  inline def apply(): PhysicsUpdraftEventData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhysicsUpdraftEventData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhysicsUpdraftEventData] (val x: Self) extends AnyVal {
    
    inline def setCylinder(value: Mesh): Self = StObject.set(x, "cylinder", value.asInstanceOf[js.Any])
    
    inline def setCylinderUndefined: Self = StObject.set(x, "cylinder", js.undefined)
  }
}
