package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents a dual hinge physics joint (same as wheel joint)
  * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
  */
@JSGlobal("BABYLON.Hinge2Joint")
@js.native
class Hinge2Joint protected () extends MotorEnabledJoint {
  /**
    * Initializes the Hinge2-Joint
    * @param jointData The joint data for the Hinge2-Joint
    */
  def this(jointData: PhysicsJointData) = this()
}

