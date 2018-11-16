package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.ArrayCollisionMatrix")
@js.native
class ArrayCollisionMatrix () extends js.Object {
  var matrix: js.Array[Mat3] = js.native
  def get(i: scala.Double, j: scala.Double): scala.Double = js.native
  def reset(): scala.Unit = js.native
  def set(i: scala.Double, j: scala.Double, value: scala.Double): scala.Unit = js.native
  def setNumObjects(n: scala.Double): scala.Unit = js.native
}

