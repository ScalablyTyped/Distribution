package typings
package bintreesLib.bintreesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeBase[T] extends js.Object {
  var size: scala.Double
  def clear(): scala.Unit
  def each(cb: Callback[T]): scala.Unit
  def find(data: T): T
  def findIter(data: T): Iterator[T]
  def iterator(): Iterator[T]
  def lowerBound(item: T): Iterator[T]
  def max(): T
  def min(): T
  def reach(cb: Callback[T]): scala.Unit
  def upperBound(item: T): Iterator[T]
}

object TreeBase {
  @scala.inline
  def apply[T](
    clear: js.Function0[scala.Unit],
    each: js.Function1[Callback[T], scala.Unit],
    find: js.Function1[T, T],
    findIter: js.Function1[T, Iterator[T]],
    iterator: js.Function0[Iterator[T]],
    lowerBound: js.Function1[T, Iterator[T]],
    max: js.Function0[T],
    min: js.Function0[T],
    reach: js.Function1[Callback[T], scala.Unit],
    size: scala.Double,
    upperBound: js.Function1[T, Iterator[T]]
  ): TreeBase[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("each")(each)
    __obj.updateDynamic("find")(find)
    __obj.updateDynamic("findIter")(findIter)
    __obj.updateDynamic("iterator")(iterator)
    __obj.updateDynamic("lowerBound")(lowerBound)
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("min")(min)
    __obj.updateDynamic("reach")(reach)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("upperBound")(upperBound)
    __obj.asInstanceOf[TreeBase[T]]
  }
}

