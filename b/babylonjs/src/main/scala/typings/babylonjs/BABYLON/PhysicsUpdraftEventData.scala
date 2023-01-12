package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhysicsUpdraftEventData extends StObject {
  
  /**
    * A cylinder used for the updraft event
    */
  var cylinder: Mesh
}
object PhysicsUpdraftEventData {
  
  inline def apply(cylinder: Mesh): PhysicsUpdraftEventData = {
    val __obj = js.Dynamic.literal(cylinder = cylinder.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsUpdraftEventData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhysicsUpdraftEventData] (val x: Self) extends AnyVal {
    
    inline def setCylinder(value: Mesh): Self = StObject.set(x, "cylinder", value.asInstanceOf[js.Any])
  }
}
