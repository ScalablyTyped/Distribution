package typings.cannon.mod

import typings.cannon.CANNON.IConeTwistConstraintOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "ConeTwistConstraint")
@js.native
class ConeTwistConstraint protected ()
  extends typings.cannon.CANNON.ConeTwistConstraint {
  def this(bodyA: typings.cannon.CANNON.Body, bodyB: typings.cannon.CANNON.Body) = this()
  def this(
    bodyA: typings.cannon.CANNON.Body,
    bodyB: typings.cannon.CANNON.Body,
    options: IConeTwistConstraintOptions
  ) = this()
}

