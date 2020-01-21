package typings.denque.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("denque", JSImport.Namespace)
@js.native
class ^[T] () extends Denque[T] {
  def this(array: js.Array[T]) = this()
  /* CompleteClass */
  override var length: Double = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def get(index: Double): js.UndefOr[T] = js.native
  /* CompleteClass */
  override def isEmpty(): Boolean = js.native
  /* CompleteClass */
  override def peekAt(index: Double): js.UndefOr[T] = js.native
  /* CompleteClass */
  override def peekBack(): js.UndefOr[T] = js.native
  /* CompleteClass */
  override def peekFront(): js.UndefOr[T] = js.native
  /* CompleteClass */
  override def pop(): js.UndefOr[T] = js.native
  /* CompleteClass */
  override def push(item: T): Double = js.native
  /* CompleteClass */
  override def remove(index: Double, count: Double): js.Array[T] = js.native
  /* CompleteClass */
  override def removeBack(): js.UndefOr[T] = js.native
  /* CompleteClass */
  override def removeOne(index: Double): js.UndefOr[T] = js.native
  /* CompleteClass */
  override def shift(): js.UndefOr[T] = js.native
  /* CompleteClass */
  override def splice(index: Double, count: Double, item: T*): js.UndefOr[js.Array[T]] = js.native
  /* CompleteClass */
  override def toArray(): js.Array[T] = js.native
  /* CompleteClass */
  override def unshift(item: T): Double = js.native
}

