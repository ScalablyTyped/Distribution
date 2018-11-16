package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents a Motor-Enabled Joint
     * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
     */
/* RemoveMultipleInheritance: Dropped parents List(babylonjsLib.BABYLONNs.IMotorEnabledJoint because Would inherit conflicting mutable fields List(physicsJoint))*/
@JSGlobal("BABYLON.MotorEnabledJoint")
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
  def setLimit(upperLimit: scala.Double): scala.Unit = js.native
  /**
           * Set the motor's limits.
           * Attention, this function is plugin specific. Engines won't react 100% the same.
           * @param upperLimit The upper limit of the motor
           * @param lowerLimit The lower limit of the motor
           */
  def setLimit(upperLimit: scala.Double, lowerLimit: scala.Double): scala.Unit = js.native
  /**
           * Set the motor values.
           * Attention, this function is plugin specific. Engines won't react 100% the same.
           * @param force the force to apply
           * @param maxForce max force for this motor.
           */
  def setMotor(): scala.Unit = js.native
  /**
           * Set the motor values.
           * Attention, this function is plugin specific. Engines won't react 100% the same.
           * @param force the force to apply
           * @param maxForce max force for this motor.
           */
  def setMotor(force: scala.Double): scala.Unit = js.native
  /**
           * Set the motor values.
           * Attention, this function is plugin specific. Engines won't react 100% the same.
           * @param force the force to apply
           * @param maxForce max force for this motor.
           */
  def setMotor(force: scala.Double, maxForce: scala.Double): scala.Unit = js.native
}

