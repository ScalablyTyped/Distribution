package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhysicsHitData extends js.Object {
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
  @scala.inline
  def apply(contactPoint: Vector3, distanceFromOrigin: Double, force: Vector3): PhysicsHitData = {
    val __obj = js.Dynamic.literal(contactPoint = contactPoint.asInstanceOf[js.Any], distanceFromOrigin = distanceFromOrigin.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PhysicsHitData]
  }
}

