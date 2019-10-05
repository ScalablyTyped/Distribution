package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.HingeConstraint")
@js.native
class HingeConstraint protected () extends Constraint {
  def this(bodyA: Body, bodyB: Body) = this()
  def this(bodyA: Body, bodyB: Body, options: IHingeConstraintOptions) = this()
  var motorEnabled: Boolean = js.native
  var motorEquation: RotationalMotorEquation = js.native
  var motorMaxForce: Double = js.native
  var motorMinForce: Double = js.native
  var motorTargetVelocity: Double = js.native
  def disableMotor(): Unit = js.native
  def enableMotor(): Unit = js.native
}

