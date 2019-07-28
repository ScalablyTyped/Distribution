package typings.cannon.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.ObjectCollisionMatrix")
@js.native
class ObjectCollisionMatrix () extends js.Object {
  var matrix: js.Array[Double] = js.native
  def get(i: Double, j: Double): Double = js.native
  def reset(): Unit = js.native
  def set(i: Double, j: Double, value: Double): Unit = js.native
  def setNumObjects(n: Double): Unit = js.native
}

