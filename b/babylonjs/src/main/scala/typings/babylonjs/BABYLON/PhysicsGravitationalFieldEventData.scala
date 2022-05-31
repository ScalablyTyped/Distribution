package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhysicsGravitationalFieldEventData extends StObject {
  
  /**
    * A sphere mesh used for the gravitational field event
    */
  var sphere: Mesh
}
object PhysicsGravitationalFieldEventData {
  
  inline def apply(sphere: Mesh): PhysicsGravitationalFieldEventData = {
    val __obj = js.Dynamic.literal(sphere = sphere.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsGravitationalFieldEventData]
  }
  
  extension [Self <: PhysicsGravitationalFieldEventData](x: Self) {
    
    inline def setSphere(value: Mesh): Self = StObject.set(x, "sphere", value.asInstanceOf[js.Any])
  }
}
