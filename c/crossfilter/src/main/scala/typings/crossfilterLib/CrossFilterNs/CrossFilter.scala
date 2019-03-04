package typings
package crossfilterLib.CrossFilterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrossFilter[T] extends js.Object {
  def GroupAll(): GroupAll[T, T]
  def add(records: js.Array[T]): CrossFilter[T]
  def dimension[TDimension](value: js.Function1[/* data */ T, TDimension]): Dimension[T, TDimension]
  def groupAll[TValue](): GroupAll[T, TValue]
  def remove(): CrossFilter[T]
  def size(): scala.Double
}

object CrossFilter {
  @scala.inline
  def apply[T](
    GroupAll: js.Function0[GroupAll[T, T]],
    add: js.Function1[js.Array[T], CrossFilter[T]],
    dimension: js.Function1[js.Function1[/* data */ T, js.Any], Dimension[T, js.Any]],
    groupAll: js.Function0[GroupAll[T, js.Any]],
    remove: js.Function0[CrossFilter[T]],
    size: js.Function0[scala.Double]
  ): CrossFilter[T] = {
    val __obj = js.Dynamic.literal(GroupAll = GroupAll, add = add, dimension = dimension, groupAll = groupAll, remove = remove, size = size)
  
    __obj.asInstanceOf[CrossFilter[T]]
  }
}

