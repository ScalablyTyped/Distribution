package typings.crossfilter.CrossFilterNs

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
    dispose: () => GroupAll[T, TValue],
    reduce: (js.Function2[js.Any, /* v */ T, js.Any], js.Function2[js.Any, /* v */ T, js.Any], js.Function0[js.Any]) => GroupAll[T, js.Any],
    reduceCount: () => GroupAll[T, TValue],
    reduceSum: Selector[T] => GroupAll[T, TValue],
    value: () => TValue
  ): GroupAll[T, TValue] = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), reduce = js.Any.fromFunction3(reduce), reduceCount = js.Any.fromFunction0(reduceCount), reduceSum = js.Any.fromFunction1(reduceSum), value = js.Any.fromFunction0(value))
  
    __obj.asInstanceOf[GroupAll[T, TValue]]
  }
}

