package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayCollisionMatrix extends js.Object {
  var matrix: js.Array[Mat3]
  def get(i: Double, j: Double): Double
  def reset(): Unit
  def set(i: Double, j: Double, value: Double): Unit
  def setNumObjects(n: Double): Unit
}

object ArrayCollisionMatrix {
  @scala.inline
  def apply(
    get: (Double, Double) => Double,
    matrix: js.Array[Mat3],
    reset: () => Unit,
    set: (Double, Double, Double) => Unit,
    setNumObjects: Double => Unit
  ): ArrayCollisionMatrix = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), matrix = matrix.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction3(set), setNumObjects = js.Any.fromFunction1(setNumObjects))
    __obj.asInstanceOf[ArrayCollisionMatrix]
  }
}

