package typings.cannon.mod

import typings.cannon.CANNON.IHingeConstraintOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "HingeConstraint")
@js.native
class HingeConstraint protected ()
  extends typings.cannon.CANNON.HingeConstraint {
  def this(bodyA: typings.cannon.CANNON.Body, bodyB: typings.cannon.CANNON.Body) = this()
  def this(
    bodyA: typings.cannon.CANNON.Body,
    bodyB: typings.cannon.CANNON.Body,
    options: IHingeConstraintOptions
  ) = this()
  /* CompleteClass */
  override var bodyA: typings.cannon.CANNON.Body = js.native
  /* CompleteClass */
  override var bodyB: typings.cannon.CANNON.Body = js.native
  /* CompleteClass */
  override var collideConnected: Boolean = js.native
  /* CompleteClass */
  override var equations: js.Array[_] = js.native
  /* CompleteClass */
  override var id: Double = js.native
  /* CompleteClass */
  override var motorEnabled: Boolean = js.native
  /* CompleteClass */
  override var motorEquation: typings.cannon.CANNON.RotationalMotorEquation = js.native
  /* CompleteClass */
  override var motorMaxForce: Double = js.native
  /* CompleteClass */
  override var motorMinForce: Double = js.native
  /* CompleteClass */
  override var motorTargetVelocity: Double = js.native
  /* CompleteClass */
  override def disable(): Unit = js.native
  /* CompleteClass */
  override def disableMotor(): Unit = js.native
  /* CompleteClass */
  override def enable(): Unit = js.native
  /* CompleteClass */
  override def enableMotor(): Unit = js.native
  /* CompleteClass */
  override def update(): Unit = js.native
}

