package typings.bintrees.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeBase[T] extends js.Object {
  
  def clear(): Unit = js.native
  
  def each(cb: Callback[T]): Unit = js.native
  
  def find(data: T): T = js.native
  
  def findIter(data: T): Iterator[T] = js.native
  
  def iterator(): Iterator[T] = js.native
  
  def lowerBound(item: T): Iterator[T] = js.native
  
  def max(): T = js.native
  
  def min(): T = js.native
  
  def reach(cb: Callback[T]): Unit = js.native
  
  var size: Double = js.native
  
  def upperBound(item: T): Iterator[T] = js.native
}
object TreeBase {
  
  @scala.inline
  def apply[T](
    clear: () => Unit,
    each: Callback[T] => Unit,
    find: T => T,
    findIter: T => Iterator[T],
    iterator: () => Iterator[T],
    lowerBound: T => Iterator[T],
    max: () => T,
    min: () => T,
    reach: Callback[T] => Unit,
    size: Double,
    upperBound: T => Iterator[T]
  ): TreeBase[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), each = js.Any.fromFunction1(each), find = js.Any.fromFunction1(find), findIter = js.Any.fromFunction1(findIter), iterator = js.Any.fromFunction0(iterator), lowerBound = js.Any.fromFunction1(lowerBound), max = js.Any.fromFunction0(max), min = js.Any.fromFunction0(min), reach = js.Any.fromFunction1(reach), size = size.asInstanceOf[js.Any], upperBound = js.Any.fromFunction1(upperBound))
    __obj.asInstanceOf[TreeBase[T]]
  }
  
  @scala.inline
  implicit class TreeBaseOps[Self <: TreeBase[_], T] (val x: Self with TreeBase[T]) extends AnyVal {
    
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
    def setEach(value: Callback[T] => Unit): Self = this.set("each", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFind(value: T => T): Self = this.set("find", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindIter(value: T => Iterator[T]): Self = this.set("findIter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIterator(value: () => Iterator[T]): Self = this.set("iterator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLowerBound(value: T => Iterator[T]): Self = this.set("lowerBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMax(value: () => T): Self = this.set("max", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMin(value: () => T): Self = this.set("min", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReach(value: Callback[T] => Unit): Self = this.set("reach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperBound(value: T => Iterator[T]): Self = this.set("upperBound", js.Any.fromFunction1(value))
  }
}
