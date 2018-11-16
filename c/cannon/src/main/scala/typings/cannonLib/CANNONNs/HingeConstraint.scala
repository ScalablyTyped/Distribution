package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.HingeConstraint")
@js.native
class HingeConstraint protected () extends Constraint {
  def this(bodyA: Body, bodyB: Body) = this()
  def this(bodyA: Body, bodyB: Body, options: IHingeConstraintOptions) = this()
  var motorEnabled: scala.Boolean = js.native
  var motorEquation: RotationalMotorEquation = js.native
  var motorMaxForce: scala.Double = js.native
  var motorMinForce: scala.Double = js.native
  var motorTargetVelocity: scala.Double = js.native
  def disableMotor(): scala.Unit = js.native
  def enableMotor(): scala.Unit = js.native
}

