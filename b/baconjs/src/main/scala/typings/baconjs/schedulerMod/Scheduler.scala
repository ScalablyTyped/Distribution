package typings.baconjs.schedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scheduler extends js.Object {
  def clearInterval(id: Double): js.Any
  def clearTimeout(id: Double): js.Any
  def now(): Double
  def setInterval(f: js.Function, i: Double): Double
  def setTimeout(f: js.Function, d: Double): Double
}

object Scheduler {
  @scala.inline
  def apply(
    clearInterval: Double => js.Any,
    clearTimeout: Double => js.Any,
    now: () => Double,
    setInterval: (js.Function, Double) => Double,
    setTimeout: (js.Function, Double) => Double
  ): Scheduler = {
    val __obj = js.Dynamic.literal(clearInterval = js.Any.fromFunction1(clearInterval), clearTimeout = js.Any.fromFunction1(clearTimeout), now = js.Any.fromFunction0(now), setInterval = js.Any.fromFunction2(setInterval), setTimeout = js.Any.fromFunction2(setTimeout))
    __obj.asInstanceOf[Scheduler]
  }
}

