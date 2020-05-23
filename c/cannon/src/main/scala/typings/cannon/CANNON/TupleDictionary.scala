package typings.cannon.CANNON

import typings.cannon.anon.Keys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TupleDictionary extends js.Object {
  var data: Keys
  def get(i: Double, j: Double): Double
  def reset(): Unit
  def set(i: Double, j: Double, value: Double): Unit
}

object TupleDictionary {
  @scala.inline
  def apply(
    data: Keys,
    get: (Double, Double) => Double,
    reset: () => Unit,
    set: (Double, Double, Double) => Unit
  ): TupleDictionary = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], get = js.Any.fromFunction2(get), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction3(set))
    __obj.asInstanceOf[TupleDictionary]
  }
}

