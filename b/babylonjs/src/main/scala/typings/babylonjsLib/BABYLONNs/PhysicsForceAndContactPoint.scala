package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a physics force and contact point
  * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
  */
trait PhysicsForceAndContactPoint extends js.Object {
  /**
    * The contact point
    */
  var contactPoint: Vector3
  /**
    * The force applied at the contact point
    */
  var force: Vector3
}

object PhysicsForceAndContactPoint {
  @scala.inline
  def apply(contactPoint: Vector3, force: Vector3): PhysicsForceAndContactPoint = {
    val __obj = js.Dynamic.literal(contactPoint = contactPoint, force = force)
  
    __obj.asInstanceOf[PhysicsForceAndContactPoint]
  }
}

