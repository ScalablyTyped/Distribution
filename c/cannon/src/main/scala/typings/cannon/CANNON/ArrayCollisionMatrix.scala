package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayCollisionMatrix extends js.Object {
  var matrix: js.Array[Mat3] = js.native
  def get(i: Double, j: Double): Double = js.native
  def reset(): Unit = js.native
  def set(i: Double, j: Double, value: Double): Unit = js.native
  def setNumObjects(n: Double): Unit = js.native
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
  @scala.inline
  implicit class ArrayCollisionMatrixOps[Self <: ArrayCollisionMatrix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: (Double, Double) => Double): Self = this.set("get", js.Any.fromFunction2(value))
    @scala.inline
    def setMatrixVarargs(value: Mat3*): Self = this.set("matrix", js.Array(value :_*))
    @scala.inline
    def setMatrix(value: js.Array[Mat3]): Self = this.set("matrix", value.asInstanceOf[js.Any])
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: (Double, Double, Double) => Unit): Self = this.set("set", js.Any.fromFunction3(value))
    @scala.inline
    def setSetNumObjects(value: Double => Unit): Self = this.set("setNumObjects", js.Any.fromFunction1(value))
  }
  
}

