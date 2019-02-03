package typings
package cannonLib.cannonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "Box")
@js.native
class Box protected ()
  extends cannonLib.CANNONNs.Box {
  def this(halfExtents: cannonLib.CANNONNs.Vec3) = this()
}

/* static members */
@JSImport("cannon", "Box")
@js.native
object Box extends js.Object {
  def calculateIntertia(halfExtents: cannonLib.CANNONNs.Vec3, mass: scala.Double, target: cannonLib.CANNONNs.Vec3): scala.Unit = js.native
}

