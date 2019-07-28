package typings.cannon.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.PointToPointConstraint")
@js.native
class PointToPointConstraint protected () extends Constraint {
  def this(bodyA: Body, pivotA: Vec3, bodyB: Body, pivotB: Vec3) = this()
  def this(bodyA: Body, pivotA: Vec3, bodyB: Body, pivotB: Vec3, maxForce: Double) = this()
}

