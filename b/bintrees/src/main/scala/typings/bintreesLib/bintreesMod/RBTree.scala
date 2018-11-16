package typings
package bintreesLib.bintreesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bintrees", "RBTree")
@js.native
class RBTree[T] protected () extends TreeBase[T] {
  def this(comparator: Comparator[T]) = this()
  /* CompleteClass */
  override var size: scala.Double = js.native
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /* CompleteClass */
  override def each(cb: Callback[T]): scala.Unit = js.native
  /* CompleteClass */
  override def find(data: T): T = js.native
  /* CompleteClass */
  override def findIter(data: T): Iterator[T] = js.native
  def insert(item: T): scala.Boolean = js.native
  /* CompleteClass */
  override def iterator(): Iterator[T] = js.native
  /* CompleteClass */
  override def lowerBound(item: T): Iterator[T] = js.native
  /* CompleteClass */
  override def max(): T = js.native
  /* CompleteClass */
  override def min(): T = js.native
  /* CompleteClass */
  override def reach(cb: Callback[T]): scala.Unit = js.native
  def remove(item: T): scala.Boolean = js.native
  /* CompleteClass */
  override def upperBound(item: T): Iterator[T] = js.native
}

