package typings.cannon.cannonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "Box")
@js.native
class Box protected ()
  extends typings.cannon.CANNONNs.Box {
  def this(halfExtents: typings.cannon.CANNONNs.Vec3) = this()
}

/* static members */
@JSImport("cannon", "Box")
@js.native
object Box extends js.Object {
  def calculateIntertia(halfExtents: typings.cannon.CANNONNs.Vec3, mass: Double, target: typings.cannon.CANNONNs.Vec3): Unit = js.native
}

