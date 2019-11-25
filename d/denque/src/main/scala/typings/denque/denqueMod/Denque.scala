package typings.denque.denqueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Denque[T] extends js.Object {
  var length: Double
  def clear(): Unit
  def get(index: Double): js.UndefOr[T]
  def isEmpty(): Boolean
  def peekAt(index: Double): js.UndefOr[T]
  def peekBack(): js.UndefOr[T]
  def peekFront(): js.UndefOr[T]
  def pop(): js.UndefOr[T]
  def push(item: T): Double
  def remove(index: Double, count: Double): js.Array[T]
  def removeBack(): js.UndefOr[T]
  def removeOne(index: Double): js.UndefOr[T]
  def shift(): js.UndefOr[T]
  def splice(index: Double, count: Double, item: T*): js.UndefOr[js.Array[T]]
  def toArray(): js.Array[T]
  def unshift(item: T): Double
}

object Denque {
  @scala.inline
  def apply[T](
    clear: () => Unit,
    get: Double => js.UndefOr[T],
    isEmpty: () => Boolean,
    length: Double,
    peekAt: Double => js.UndefOr[T],
    peekBack: () => js.UndefOr[T],
    peekFront: () => js.UndefOr[T],
    pop: () => js.UndefOr[T],
    push: T => Double,
    remove: (Double, Double) => js.Array[T],
    removeBack: () => js.UndefOr[T],
    removeOne: Double => js.UndefOr[T],
    shift: () => js.UndefOr[T],
    splice: (Double, Double, /* repeated */ T) => js.UndefOr[js.Array[T]],
    toArray: () => js.Array[T],
    unshift: T => Double
  ): Denque[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), isEmpty = js.Any.fromFunction0(isEmpty), length = length.asInstanceOf[js.Any], peekAt = js.Any.fromFunction1(peekAt), peekBack = js.Any.fromFunction0(peekBack), peekFront = js.Any.fromFunction0(peekFront), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), remove = js.Any.fromFunction2(remove), removeBack = js.Any.fromFunction0(removeBack), removeOne = js.Any.fromFunction1(removeOne), shift = js.Any.fromFunction0(shift), splice = js.Any.fromFunction3(splice), toArray = js.Any.fromFunction0(toArray), unshift = js.Any.fromFunction1(unshift))
  
    __obj.asInstanceOf[Denque[T]]
  }
}

