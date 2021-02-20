package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhysicsHitData extends StObject {
  
  /**
    * The contact point
    */
  var contactPoint: Vector3 = js.native
  
  /**
    * The distance from the origin to the contact point
    */
  var distanceFromOrigin: Double = js.native
  
  /**
    * The force applied at the contact point
    */
  var force: Vector3 = js.native
}
object PhysicsHitData {
  
  @scala.inline
  def apply(contactPoint: Vector3, distanceFromOrigin: Double, force: Vector3): PhysicsHitData = {
    val __obj = js.Dynamic.literal(contactPoint = contactPoint.asInstanceOf[js.Any], distanceFromOrigin = distanceFromOrigin.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsHitData]
  }
  
  @scala.inline
  implicit class PhysicsHitDataMutableBuilder[Self <: PhysicsHitData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactPoint(value: Vector3): Self = StObject.set(x, "contactPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceFromOrigin(value: Double): Self = StObject.set(x, "distanceFromOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForce(value: Vector3): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
  }
}
