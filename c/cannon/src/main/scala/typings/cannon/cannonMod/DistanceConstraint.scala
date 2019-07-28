package typings.cannon.cannonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "DistanceConstraint")
@js.native
class DistanceConstraint protected ()
  extends typings.cannon.CANNONNs.DistanceConstraint {
  def this(bodyA: typings.cannon.CANNONNs.Body, bodyB: typings.cannon.CANNONNs.Body, distance: Double) = this()
  def this(
    bodyA: typings.cannon.CANNONNs.Body,
    bodyB: typings.cannon.CANNONNs.Body,
    distance: Double,
    maxForce: Double
  ) = this()
}

