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
  /**
           * Set the motor limits.
           * Attention, this function is plugin specific. Engines won't react 100% the same.
           * @param {number} upperLimit the upper limit
           * @param {number} lowerLimit lower limit
           * @param {motorIndex} the motor's index, 0 or 1.
           */
  def setLimit(upperLimit: scala.Double, lowerLimit: scala.Double, motorIndex: scala.Double): scala.Unit = js.native
  /**
           * Set the motor values.
           * Attention, this function is plugin specific. Engines won't react 100% the same.
           * @param {number} force the force to apply
           * @param {number} maxForce max force for this motor.
           * @param {motorIndex} the motor's index, 0 or 1.
           */
  def setMotor(force: scala.Double, maxForce: scala.Double, motorIndex: scala.Double): scala.Unit = js.native
}

