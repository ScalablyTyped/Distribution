package typings.babylonjs.physicsJointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babylonjs.physicsJointMod.IMotorEnabledJoint because var conflicts: physicsJoint. Inlined setMotor, setMotor, setMotor, setMotor, setLimit, setLimit, setLimit */ @JSImport("babylonjs/Physics/physicsJoint", "MotorEnabledJoint")
@js.native
class MotorEnabledJoint protected () extends PhysicsJoint {
  /**
    * Initializes the Motor-Enabled Joint
    * @param type The type of the joint
    * @param jointData The physica joint data for the joint
    */
  def this(`type`: Double, jointData: PhysicsJointData) = this()
  /**
    * Set the motor's limits.
    * Attention, this function is plugin specific. Engines won't react 100% the same.
    * @param upperLimit The upper limit of the motor
    * @param lowerLimit The lower limit of the motor
    */
  /**
    * Sets the limit of the motor
    * @param upperLimit The upper limit of the motor
    * @param lowerLimit The lower limit of the motor
    * @param motorIndex The index of the motor
    */
  def setLimit(upperLimit: Double): Unit = js.native
  def setLimit(upperLimit: Double, lowerLimit: Double): Unit = js.native
  def setLimit(upperLimit: Double, lowerLimit: Double, motorIndex: Double): Unit = js.native
  /**
    * Set the motor values.
    * Attention, this function is plugin specific. Engines won't react 100% the same.
    * @param force the force to apply
    * @param maxForce max force for this motor.
    */
  /**
    * Sets the motor of the motor-enabled joint
    * @param force The force of the motor
    * @param maxForce The maximum force of the motor
    * @param motorIndex The index of the motor
    */
  def setMotor(): Unit = js.native
  def setMotor(force: Double): Unit = js.native
  def setMotor(force: Double, maxForce: Double): Unit = js.native
  def setMotor(force: Double, maxForce: Double, motorIndex: Double): Unit = js.native
}

