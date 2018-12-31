package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Joint data from a spring joint
  * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
  */
trait SpringJointData extends PhysicsJointData {
  /**
    * Damping of the spring
    */
  var damping: scala.Double
  /**
    * Length of the spring
    */
  var length: scala.Double
  /**
    * Stiffness of the spring
    */
  var stiffness: scala.Double
  /** this callback will be called when applying the force to the impostors. */
  def forceApplicationCallback(): scala.Unit
}

