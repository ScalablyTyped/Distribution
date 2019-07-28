package typings.cannon.cannonMod

import typings.cannon.CANNONNs.IConstraintOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "Constraint")
@js.native
class Constraint protected ()
  extends typings.cannon.CANNONNs.Constraint {
  def this(bodyA: typings.cannon.CANNONNs.Body, bodyB: typings.cannon.CANNONNs.Body) = this()
  def this(
    bodyA: typings.cannon.CANNONNs.Body,
    bodyB: typings.cannon.CANNONNs.Body,
    options: IConstraintOptions
  ) = this()
}

