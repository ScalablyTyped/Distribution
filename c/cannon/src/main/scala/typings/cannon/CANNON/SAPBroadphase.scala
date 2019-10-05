package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.SAPBroadphase")
@js.native
class SAPBroadphase () extends BroadPhase {
  def this(world: World) = this()
  var axisIndex: Double = js.native
  var axisList: js.Array[_] = js.native
  def aabbQuery(world: World, aabb: AABB): js.Array[Body] = js.native
  def autoDetectAxis(): Unit = js.native
}

/* static members */
@JSGlobal("CANNON.SAPBroadphase")
@js.native
object SAPBroadphase extends js.Object {
  def checkBounds(bi: Body, bj: Body): Boolean = js.native
  def checkBounds(bi: Body, bj: Body, axisIndex: Double): Boolean = js.native
  def insertionSortX(a: js.Array[_]): js.Array[_] = js.native
  def insertionSortY(a: js.Array[_]): js.Array[_] = js.native
  def insertionSortZ(a: js.Array[_]): js.Array[_] = js.native
}

