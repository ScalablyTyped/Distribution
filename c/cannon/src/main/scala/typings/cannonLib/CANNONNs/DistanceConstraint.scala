package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.DistanceConstraint")
@js.native
class DistanceConstraint protected () extends Constraint {
  def this(bodyA: Body, bodyB: Body, distance: scala.Double) = this()
  def this(bodyA: Body, bodyB: Body, distance: scala.Double, maxForce: scala.Double) = this()
}

