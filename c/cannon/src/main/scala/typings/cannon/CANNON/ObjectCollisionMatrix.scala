package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectCollisionMatrix extends js.Object {
  var matrix: js.Array[Double]
  def get(i: Double, j: Double): Double
  def reset(): Unit
  def set(i: Double, j: Double, value: Double): Unit
  def setNumObjects(n: Double): Unit
}

object ObjectCollisionMatrix {
  @scala.inline
  def apply(
    get: (Double, Double) => Double,
    matrix: js.Array[Double],
    reset: () => Unit,
    set: (Double, Double, Double) => Unit,
    setNumObjects: Double => Unit
  ): ObjectCollisionMatrix = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), matrix = matrix.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction3(set), setNumObjects = js.Any.fromFunction1(setNumObjects))
    __obj.asInstanceOf[ObjectCollisionMatrix]
  }
}

