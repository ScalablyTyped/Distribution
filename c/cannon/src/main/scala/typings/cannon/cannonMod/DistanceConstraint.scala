package typings.cannon.cannonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "DistanceConstraint")
@js.native
class DistanceConstraint protected ()
  extends typings.cannon.CANNON.DistanceConstraint {
  def this(bodyA: typings.cannon.CANNON.Body, bodyB: typings.cannon.CANNON.Body, distance: Double) = this()
  def this(
    bodyA: typings.cannon.CANNON.Body,
    bodyB: typings.cannon.CANNON.Body,
    distance: Double,
    maxForce: Double
  ) = this()
}

