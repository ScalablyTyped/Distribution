package typings.crossfilter.CrossFilter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupAll[T, TValue] extends js.Object {
  def dispose(): GroupAll[T, TValue] = js.native
  def reduce[TValue](
    add: js.Function2[/* p */ TValue, /* v */ T, TValue],
    remove: js.Function2[/* p */ TValue, /* v */ T, TValue],
    initial: js.Function0[TValue]
  ): GroupAll[T, TValue] = js.native
  def reduceCount(): GroupAll[T, TValue] = js.native
  def reduceSum(value: Selector[T]): GroupAll[T, TValue] = js.native
  def value(): TValue = js.native
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
  @scala.inline
  implicit class GroupAllOps[Self <: GroupAll[_, _], T, TValue] (val x: Self with (GroupAll[T, TValue])) extends AnyVal {
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
    def setDispose(value: () => GroupAll[T, TValue]): Self = this.set("dispose", js.Any.fromFunction0(value))
    @scala.inline
    def setReduce(
      value: (js.Function2[js.Any, /* v */ T, js.Any], js.Function2[js.Any, /* v */ T, js.Any], js.Function0[js.Any]) => GroupAll[T, js.Any]
    ): Self = this.set("reduce", js.Any.fromFunction3(value))
    @scala.inline
    def setReduceCount(value: () => GroupAll[T, TValue]): Self = this.set("reduceCount", js.Any.fromFunction0(value))
    @scala.inline
    def setReduceSum(value: Selector[T] => GroupAll[T, TValue]): Self = this.set("reduceSum", js.Any.fromFunction1(value))
    @scala.inline
    def setValue(value: () => TValue): Self = this.set("value", js.Any.fromFunction0(value))
  }
  
}

