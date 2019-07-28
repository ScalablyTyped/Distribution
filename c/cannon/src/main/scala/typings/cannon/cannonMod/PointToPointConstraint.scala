package typings.cannon.cannonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "PointToPointConstraint")
@js.native
class PointToPointConstraint protected ()
  extends typings.cannon.CANNONNs.PointToPointConstraint {
  def this(
    bodyA: typings.cannon.CANNONNs.Body,
    pivotA: typings.cannon.CANNONNs.Vec3,
    bodyB: typings.cannon.CANNONNs.Body,
    pivotB: typings.cannon.CANNONNs.Vec3
  ) = this()
  def this(
    bodyA: typings.cannon.CANNONNs.Body,
    pivotA: typings.cannon.CANNONNs.Vec3,
    bodyB: typings.cannon.CANNONNs.Body,
    pivotB: typings.cannon.CANNONNs.Vec3,
    maxForce: Double
  ) = this()
}

