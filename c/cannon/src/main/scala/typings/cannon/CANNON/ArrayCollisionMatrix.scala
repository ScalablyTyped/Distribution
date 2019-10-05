package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.ArrayCollisionMatrix")
@js.native
class ArrayCollisionMatrix () extends js.Object {
  var matrix: js.Array[Mat3] = js.native
  def get(i: Double, j: Double): Double = js.native
  def reset(): Unit = js.native
  def set(i: Double, j: Double, value: Double): Unit = js.native
  def setNumObjects(n: Double): Unit = js.native
}

