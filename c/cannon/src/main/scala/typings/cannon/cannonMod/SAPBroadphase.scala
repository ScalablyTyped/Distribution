package typings.cannon.cannonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "SAPBroadphase")
@js.native
class SAPBroadphase ()
  extends typings.cannon.CANNON.SAPBroadphase {
  def this(world: typings.cannon.CANNON.World) = this()
}

/* static members */
@JSImport("cannon", "SAPBroadphase")
@js.native
object SAPBroadphase extends js.Object {
  def checkBounds(bi: typings.cannon.CANNON.Body, bj: typings.cannon.CANNON.Body): Boolean = js.native
  def checkBounds(bi: typings.cannon.CANNON.Body, bj: typings.cannon.CANNON.Body, axisIndex: Double): Boolean = js.native
  def insertionSortX(a: js.Array[_]): js.Array[_] = js.native
  def insertionSortY(a: js.Array[_]): js.Array[_] = js.native
  def insertionSortZ(a: js.Array[_]): js.Array[_] = js.native
}

