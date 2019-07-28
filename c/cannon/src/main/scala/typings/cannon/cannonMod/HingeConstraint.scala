package typings.cannon.cannonMod

import typings.cannon.CANNONNs.IHingeConstraintOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "HingeConstraint")
@js.native
class HingeConstraint protected ()
  extends typings.cannon.CANNONNs.HingeConstraint {
  def this(bodyA: typings.cannon.CANNONNs.Body, bodyB: typings.cannon.CANNONNs.Body) = this()
  def this(
    bodyA: typings.cannon.CANNONNs.Body,
    bodyB: typings.cannon.CANNONNs.Body,
    options: IHingeConstraintOptions
  ) = this()
}

