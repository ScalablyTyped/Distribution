package typings.cannon.global.CANNON

import typings.cannon.CANNON.ILockConstraintOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.LockConstraint")
@js.native
class LockConstraint protected ()
  extends typings.cannon.CANNON.Constraint {
  def this(bodyA: typings.cannon.CANNON.Body, bodyB: typings.cannon.CANNON.Body) = this()
  def this(
    bodyA: typings.cannon.CANNON.Body,
    bodyB: typings.cannon.CANNON.Body,
    options: ILockConstraintOptions
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
  override def disable(): Unit = js.native
  /* CompleteClass */
  override def enable(): Unit = js.native
  /* CompleteClass */
  override def update(): Unit = js.native
}

