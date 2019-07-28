package typings.cannon.cannonMod

import typings.cannon.CANNONNs.ILockConstraintOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "LockConstraint")
@js.native
class LockConstraint protected ()
  extends typings.cannon.CANNONNs.LockConstraint {
  def this(bodyA: typings.cannon.CANNONNs.Body, bodyB: typings.cannon.CANNONNs.Body) = this()
  def this(
    bodyA: typings.cannon.CANNONNs.Body,
    bodyB: typings.cannon.CANNONNs.Body,
    options: ILockConstraintOptions
  ) = this()
}

