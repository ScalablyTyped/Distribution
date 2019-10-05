package typings.cannon.cannonMod

import typings.cannon.CANNON.ILockConstraintOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "LockConstraint")
@js.native
class LockConstraint protected ()
  extends typings.cannon.CANNON.LockConstraint {
  def this(bodyA: typings.cannon.CANNON.Body, bodyB: typings.cannon.CANNON.Body) = this()
  def this(
    bodyA: typings.cannon.CANNON.Body,
    bodyB: typings.cannon.CANNON.Body,
    options: ILockConstraintOptions
  ) = this()
}

