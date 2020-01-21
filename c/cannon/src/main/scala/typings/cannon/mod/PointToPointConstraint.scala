package typings.cannon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "PointToPointConstraint")
@js.native
class PointToPointConstraint protected ()
  extends typings.cannon.CANNON.PointToPointConstraint {
  def this(
    bodyA: typings.cannon.CANNON.Body,
    pivotA: typings.cannon.CANNON.Vec3,
    bodyB: typings.cannon.CANNON.Body,
    pivotB: typings.cannon.CANNON.Vec3
  ) = this()
  def this(
    bodyA: typings.cannon.CANNON.Body,
    pivotA: typings.cannon.CANNON.Vec3,
    bodyB: typings.cannon.CANNON.Body,
    pivotB: typings.cannon.CANNON.Vec3,
    maxForce: Double
  ) = this()
}

