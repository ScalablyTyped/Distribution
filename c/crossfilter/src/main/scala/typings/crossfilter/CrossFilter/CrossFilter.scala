package typings.crossfilter.CrossFilter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrossFilter[T] extends js.Object {
  def GroupAll(): typings.crossfilter.CrossFilter.GroupAll[T, T] = js.native
  def add(records: js.Array[T]): typings.crossfilter.CrossFilter.CrossFilter[T] = js.native
  def dimension[TDimension](value: js.Function1[/* data */ T, TDimension]): Dimension[T, TDimension] = js.native
  def groupAll[TValue](): GroupAll[T, TValue] = js.native
  def remove(): typings.crossfilter.CrossFilter.CrossFilter[T] = js.native
  def size(): Double = js.native
}

object CrossFilter {
  @scala.inline
  def apply[T](
    GroupAll: () => GroupAll[T, T],
    add: js.Array[T] => typings.crossfilter.CrossFilter.CrossFilter[T],
    dimension: js.Function1[/* data */ T, js.Any] => Dimension[T, js.Any],
    groupAll: () => GroupAll[T, js.Any],
    remove: () => typings.crossfilter.CrossFilter.CrossFilter[T],
    size: () => Double
  ): CrossFilter[T] = {
    val __obj = js.Dynamic.literal(GroupAll = js.Any.fromFunction0(GroupAll), add = js.Any.fromFunction1(add), dimension = js.Any.fromFunction1(dimension), groupAll = js.Any.fromFunction0(groupAll), remove = js.Any.fromFunction0(remove), size = js.Any.fromFunction0(size))
    __obj.asInstanceOf[CrossFilter[T]]
  }
  @scala.inline
  implicit class CrossFilterOps[Self <: typings.crossfilter.CrossFilter.CrossFilter[_], T] (val x: Self with typings.crossfilter.CrossFilter.CrossFilter[T]) extends AnyVal {
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
    def setGroupAll(value: () => GroupAll[T, T]): Self = this.set("GroupAll", js.Any.fromFunction0(value))
    @scala.inline
    def setAdd(value: js.Array[T] => typings.crossfilter.CrossFilter.CrossFilter[T]): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setDimension(value: js.Function1[/* data */ T, js.Any] => Dimension[T, js.Any]): Self = this.set("dimension", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: () => typings.crossfilter.CrossFilter.CrossFilter[T]): Self = this.set("remove", js.Any.fromFunction0(value))
    @scala.inline
    def setSize(value: () => Double): Self = this.set("size", js.Any.fromFunction0(value))
  }
  
}

