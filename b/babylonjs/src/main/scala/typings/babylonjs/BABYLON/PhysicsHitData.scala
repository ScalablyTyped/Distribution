package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhysicsHitData extends StObject {
  
  /**
    * The contact point
    */
  var contactPoint: Vector3
  
  /**
    * The distance from the origin to the contact point
    */
  var distanceFromOrigin: Double
  
  /**
    * The force applied at the contact point
    */
  var force: Vector3
}
object PhysicsHitData {
  
  inline def apply(contactPoint: Vector3, distanceFromOrigin: Double, force: Vector3): PhysicsHitData = {
    val __obj = js.Dynamic.literal(contactPoint = contactPoint.asInstanceOf[js.Any], distanceFromOrigin = distanceFromOrigin.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsHitData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhysicsHitData] (val x: Self) extends AnyVal {
    
    inline def setContactPoint(value: Vector3): Self = StObject.set(x, "contactPoint", value.asInstanceOf[js.Any])
    
    inline def setDistanceFromOrigin(value: Double): Self = StObject.set(x, "distanceFromOrigin", value.asInstanceOf[js.Any])
    
    inline def setForce(value: Vector3): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
  }
}
