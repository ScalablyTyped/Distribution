package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents a Motor-Enabled Joint
     * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
     */
@JSImport("babylonjs", "MotorEnabledJoint")
@js.native
class MotorEnabledJoint protected ()
  extends babylonjsLib.BABYLONNs.MotorEnabledJoint {
  /**
           * Initializes the Motor-Enabled Joint
           * @param type The type of the joint
           * @param jointData The physica joint data for the joint
           */
  def this(`type`: scala.Double, jointData: babylonjsLib.BABYLONNs.PhysicsJointData) = this()
}

