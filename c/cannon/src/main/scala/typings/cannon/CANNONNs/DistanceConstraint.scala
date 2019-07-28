package typings.cannon.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.DistanceConstraint")
@js.native
class DistanceConstraint protected () extends Constraint {
  def this(bodyA: Body, bodyB: Body, distance: Double) = this()
  def this(bodyA: Body, bodyB: Body, distance: Double, maxForce: Double) = this()
}

