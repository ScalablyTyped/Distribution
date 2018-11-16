package typings
package cannonLib.cannonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "SAPBroadphase")
@js.native
class SAPBroadphase ()
  extends cannonLib.CANNONNs.SAPBroadphase {
  def this(world: cannonLib.CANNONNs.World) = this()
}

@JSImport("cannon", "SAPBroadphase")
@js.native
object SAPBroadphase extends js.Object {
  def checkBounds(bi: cannonLib.CANNONNs.Body, bj: cannonLib.CANNONNs.Body): scala.Boolean = js.native
  def checkBounds(bi: cannonLib.CANNONNs.Body, bj: cannonLib.CANNONNs.Body, axisIndex: scala.Double): scala.Boolean = js.native
  def insertionSortX(a: js.Array[_]): js.Array[_] = js.native
  def insertionSortY(a: js.Array[_]): js.Array[_] = js.native
  def insertionSortZ(a: js.Array[_]): js.Array[_] = js.native
}

