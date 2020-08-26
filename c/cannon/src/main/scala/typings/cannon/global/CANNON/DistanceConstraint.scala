package typings.cannon.global.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.DistanceConstraint")
@js.native
class DistanceConstraint protected ()
  extends typings.cannon.CANNON.Constraint {
  def this(bodyA: typings.cannon.CANNON.Body, bodyB: typings.cannon.CANNON.Body, distance: Double) = this()
  def this(
    bodyA: typings.cannon.CANNON.Body,
    bodyB: typings.cannon.CANNON.Body,
    distance: Double,
    maxForce: Double
  ) = this()
}

