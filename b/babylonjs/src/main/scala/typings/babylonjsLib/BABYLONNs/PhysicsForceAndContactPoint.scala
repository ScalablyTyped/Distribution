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

