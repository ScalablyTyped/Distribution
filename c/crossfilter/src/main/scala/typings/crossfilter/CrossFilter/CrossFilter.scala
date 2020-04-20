package typings.crossfilter.CrossFilter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrossFilter[T] extends js.Object {
  def GroupAll(): typings.crossfilter.CrossFilter.GroupAll[T, T]
  def add(records: js.Array[T]): typings.crossfilter.CrossFilter.CrossFilter[T]
  def dimension[TDimension](value: js.Function1[/* data */ T, TDimension]): Dimension[T, TDimension]
  def groupAll[TValue](): GroupAll[T, TValue]
  def remove(): typings.crossfilter.CrossFilter.CrossFilter[T]
  def size(): Double
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
}

