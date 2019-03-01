package typings
package crossfilterLib.CrossFilterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupAll[T, TValue] extends js.Object {
  def dispose(): GroupAll[T, TValue]
  def reduce[TValue](
    add: js.Function2[/* p */ TValue, /* v */ T, TValue],
    remove: js.Function2[/* p */ TValue, /* v */ T, TValue],
    initial: js.Function0[TValue]
  ): GroupAll[T, TValue]
  def reduceCount(): GroupAll[T, TValue]
  def reduceSum(value: Selector[T]): GroupAll[T, TValue]
  def value(): TValue
}

object GroupAll {
  @scala.inline
  def apply[T, TValue](
    dispose: js.Function0[GroupAll[T, TValue]],
    reduce: js.Function3[
      js.Function2[js.Any, /* v */ T, js.Any], 
      js.Function2[js.Any, /* v */ T, js.Any], 
      js.Function0[js.Any], 
      GroupAll[T, js.Any]
    ],
    reduceCount: js.Function0[GroupAll[T, TValue]],
    reduceSum: js.Function1[Selector[T], GroupAll[T, TValue]],
    value: js.Function0[TValue]
  ): GroupAll[T, TValue] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("reduce")(reduce)
    __obj.updateDynamic("reduceCount")(reduceCount)
    __obj.updateDynamic("reduceSum")(reduceSum)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[GroupAll[T, TValue]]
  }
}

