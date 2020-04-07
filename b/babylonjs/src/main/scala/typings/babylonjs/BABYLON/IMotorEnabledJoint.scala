package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMotorEnabledJoint extends js.Object {
  /**
    * Physics joint
    */
  var physicsJoint: js.Any = js.native
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

