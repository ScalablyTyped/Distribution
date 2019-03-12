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
    clear: () => scala.Unit,
    each: Callback[T] => scala.Unit,
    find: T => T,
    findIter: T => Iterator[T],
    iterator: () => Iterator[T],
    lowerBound: T => Iterator[T],
    max: () => T,
    min: () => T,
    reach: Callback[T] => scala.Unit,
    size: scala.Double,
    upperBound: T => Iterator[T]
  ): TreeBase[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), each = js.Any.fromFunction1(each), find = js.Any.fromFunction1(find), findIter = js.Any.fromFunction1(findIter), iterator = js.Any.fromFunction0(iterator), lowerBound = js.Any.fromFunction1(lowerBound), max = js.Any.fromFunction0(max), min = js.Any.fromFunction0(min), reach = js.Any.fromFunction1(reach), size = size, upperBound = js.Any.fromFunction1(upperBound))
  
    __obj.asInstanceOf[TreeBase[T]]
  }
}

