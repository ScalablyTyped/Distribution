package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents a single physics Hinge-Joint
  * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
  */
@JSGlobal("BABYLON.HingeJoint")
@js.native
class HingeJoint protected () extends MotorEnabledJoint {
  /**
    * Initializes the Hinge-Joint
    * @param jointData The joint data for the Hinge-Joint
    */
  def this(jointData: PhysicsJointData) = this()
}

