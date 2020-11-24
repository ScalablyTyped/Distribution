package typings.denque.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Denque[T] extends js.Object {
  
  def clear(): Unit = js.native
  
  def get(index: Double): js.UndefOr[T] = js.native
  
  def isEmpty(): Boolean = js.native
  
  var length: Double = js.native
  
  def peekAt(index: Double): js.UndefOr[T] = js.native
  
  def peekBack(): js.UndefOr[T] = js.native
  
  def peekFront(): js.UndefOr[T] = js.native
  
  def pop(): js.UndefOr[T] = js.native
  
  def push(item: T): Double = js.native
  
  def remove(index: Double, count: Double): js.Array[T] = js.native
  
  def removeBack(): js.UndefOr[T] = js.native
  
  def removeOne(index: Double): js.UndefOr[T] = js.native
  
  def shift(): js.UndefOr[T] = js.native
  
  def splice(index: Double, count: Double, item: T*): js.UndefOr[js.Array[T]] = js.native
  
  def toArray(): js.Array[T] = js.native
  
  def unshift(item: T): Double = js.native
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
  
  @scala.inline
  implicit class DenqueOps[Self <: Denque[_], T] (val x: Self with Denque[T]) extends AnyVal {
    
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
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet(value: Double => js.UndefOr[T]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = this.set("isEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeekAt(value: Double => js.UndefOr[T]): Self = this.set("peekAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPeekBack(value: () => js.UndefOr[T]): Self = this.set("peekBack", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPeekFront(value: () => js.UndefOr[T]): Self = this.set("peekFront", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPop(value: () => js.UndefOr[T]): Self = this.set("pop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPush(value: T => Double): Self = this.set("push", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: (Double, Double) => js.Array[T]): Self = this.set("remove", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveBack(value: () => js.UndefOr[T]): Self = this.set("removeBack", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveOne(value: Double => js.UndefOr[T]): Self = this.set("removeOne", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShift(value: () => js.UndefOr[T]): Self = this.set("shift", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSplice(value: (Double, Double, /* repeated */ T) => js.UndefOr[js.Array[T]]): Self = this.set("splice", js.Any.fromFunction3(value))
    
    @scala.inline
    def setToArray(value: () => js.Array[T]): Self = this.set("toArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnshift(value: T => Double): Self = this.set("unshift", js.Any.fromFunction1(value))
  }
}
