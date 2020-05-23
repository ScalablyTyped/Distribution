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
  /* CompleteClass */
  override var bodyA: typings.cannon.CANNON.Body = js.native
  /* CompleteClass */
  override var bodyB: typings.cannon.CANNON.Body = js.native
  /* CompleteClass */
  override var collideConnected: Boolean = js.native
  /* CompleteClass */
  override var equations: js.Array[_] = js.native
  /* CompleteClass */
  override var id: Double = js.native
  /* CompleteClass */
  override def disable(): Unit = js.native
  /* CompleteClass */
  override def enable(): Unit = js.native
  /* CompleteClass */
  override def update(): Unit = js.native
}

