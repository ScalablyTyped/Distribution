package typings.cannon.cannonMod

import typings.cannon.CANNONNs.IConeTwistConstraintOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "ConeTwistConstraint")
@js.native
class ConeTwistConstraint protected ()
  extends typings.cannon.CANNONNs.ConeTwistConstraint {
  def this(bodyA: typings.cannon.CANNONNs.Body, bodyB: typings.cannon.CANNONNs.Body) = this()
  def this(
    bodyA: typings.cannon.CANNONNs.Body,
    bodyB: typings.cannon.CANNONNs.Body,
    options: IConeTwistConstraintOptions
  ) = this()
}

