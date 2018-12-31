package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a motor enabled joint
  * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
  */
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
  def setLimit(upperLimit: scala.Double): scala.Unit = js.native
  def setLimit(upperLimit: scala.Double, lowerLimit: scala.Double): scala.Unit = js.native
  def setLimit(upperLimit: scala.Double, lowerLimit: scala.Double, motorIndex: scala.Double): scala.Unit = js.native
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

