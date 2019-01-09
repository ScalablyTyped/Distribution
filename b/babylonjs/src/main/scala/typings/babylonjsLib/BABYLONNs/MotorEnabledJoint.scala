package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Motor-Enabled Joint
  * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- babylonjsLib.BABYLONNs.IMotorEnabledJoint because var conflicts: physicsJoint. Inlined setMotor, setMotor, setMotor, setMotor, setLimit, setLimit, setLimit */ @JSGlobal("BABYLON.MotorEnabledJoint")
@js.native
class MotorEnabledJoint protected () extends PhysicsJoint {
  /**
    * Initializes the Motor-Enabled Joint
    * @param type The type of the joint
    * @param jointData The physica joint data for the joint
    */
  def this(`type`: scala.Double, jointData: PhysicsJointData) = this()
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
  def setLimit(upperLimit: scala.Double): scala.Unit = js.native
  def setLimit(upperLimit: scala.Double, lowerLimit: scala.Double): scala.Unit = js.native
  def setLimit(upperLimit: scala.Double, lowerLimit: scala.Double, motorIndex: scala.Double): scala.Unit = js.native
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
  def setMotor(): scala.Unit = js.native
  def setMotor(force: scala.Double): scala.Unit = js.native
  def setMotor(force: scala.Double, maxForce: scala.Double): scala.Unit = js.native
  def setMotor(force: scala.Double, maxForce: scala.Double, motorIndex: scala.Double): scala.Unit = js.native
}

