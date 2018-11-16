package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.SAPBroadphase")
@js.native
class SAPBroadphase () extends BroadPhase {
  def this(world: World) = this()
  var axisIndex: scala.Double = js.native
  var axisList: js.Array[_] = js.native
  def aabbQuery(world: World, aabb: AABB): js.Array[Body] = js.native
  def autoDetectAxis(): scala.Unit = js.native
}

@JSGlobal("CANNON.SAPBroadphase")
@js.native
object SAPBroadphase extends js.Object {
  def checkBounds(bi: cannonLib.CANNONNs.Body, bj: cannonLib.CANNONNs.Body): scala.Boolean = js.native
  def checkBounds(bi: cannonLib.CANNONNs.Body, bj: cannonLib.CANNONNs.Body, axisIndex: scala.Double): scala.Boolean = js.native
  def insertionSortX(a: js.Array[_]): js.Array[_] = js.native
  def insertionSortY(a: js.Array[_]): js.Array[_] = js.native
  def insertionSortZ(a: js.Array[_]): js.Array[_] = js.native
}

