package typings
package cannonLib.cannonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "PointToPointConstraint")
@js.native
class PointToPointConstraint protected ()
  extends cannonLib.CANNONNs.PointToPointConstraint {
  def this(bodyA: cannonLib.CANNONNs.Body, pivotA: cannonLib.CANNONNs.Vec3, bodyB: cannonLib.CANNONNs.Body, pivotB: cannonLib.CANNONNs.Vec3) = this()
  def this(bodyA: cannonLib.CANNONNs.Body, pivotA: cannonLib.CANNONNs.Vec3, bodyB: cannonLib.CANNONNs.Body, pivotB: cannonLib.CANNONNs.Vec3, maxForce: scala.Double) = this()
}

