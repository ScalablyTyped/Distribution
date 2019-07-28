package typings.bintrees.bintreesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bintrees", "BinTree")
@js.native
class BinTree[T] protected () extends TreeBase[T] {
  def this(comparator: Comparator[T]) = this()
  /* CompleteClass */
  override var size: Double = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def each(cb: Callback[T]): Unit = js.native
  /* CompleteClass */
  override def find(data: T): T = js.native
  /* CompleteClass */
  override def findIter(data: T): Iterator[T] = js.native
  def insert(item: T): Boolean = js.native
  /* CompleteClass */
  override def iterator(): Iterator[T] = js.native
  /* CompleteClass */
  override def lowerBound(item: T): Iterator[T] = js.native
  /* CompleteClass */
  override def max(): T = js.native
  /* CompleteClass */
  override def min(): T = js.native
  /* CompleteClass */
  override def reach(cb: Callback[T]): Unit = js.native
  def remove(item: T): Boolean = js.native
  /* CompleteClass */
  override def upperBound(item: T): Iterator[T] = js.native
}

