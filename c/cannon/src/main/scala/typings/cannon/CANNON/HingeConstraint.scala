package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HingeConstraint extends Constraint {
  var motorEnabled: Boolean
  var motorEquation: RotationalMotorEquation
  var motorMaxForce: Double
  var motorMinForce: Double
  var motorTargetVelocity: Double
  def disableMotor(): Unit
  def enableMotor(): Unit
}

object HingeConstraint {
  @scala.inline
  def apply(
    bodyA: Body,
    bodyB: Body,
    collideConnected: Boolean,
    disable: () => Unit,
    disableMotor: () => Unit,
    enable: () => Unit,
    enableMotor: () => Unit,
    equations: js.Array[_],
    id: Double,
    motorEnabled: Boolean,
    motorEquation: RotationalMotorEquation,
    motorMaxForce: Double,
    motorMinForce: Double,
    motorTargetVelocity: Double,
    update: () => Unit
  ): HingeConstraint = {
    val __obj = js.Dynamic.literal(bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collideConnected = collideConnected.asInstanceOf[js.Any], disable = js.Any.fromFunction0(disable), disableMotor = js.Any.fromFunction0(disableMotor), enable = js.Any.fromFunction0(enable), enableMotor = js.Any.fromFunction0(enableMotor), equations = equations.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], motorEnabled = motorEnabled.asInstanceOf[js.Any], motorEquation = motorEquation.asInstanceOf[js.Any], motorMaxForce = motorMaxForce.asInstanceOf[js.Any], motorMinForce = motorMinForce.asInstanceOf[js.Any], motorTargetVelocity = motorTargetVelocity.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[HingeConstraint]
  }
}

