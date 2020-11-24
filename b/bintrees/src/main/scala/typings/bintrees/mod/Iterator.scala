package typings.bintrees.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Iterator[T] extends js.Object {
  
  def data(): T = js.native
  
  def next(): T = js.native
  
  def prev(): T = js.native
}
object Iterator {
  
  @scala.inline
  def apply[T](data: () => T, next: () => T, prev: () => T): Iterator[T] = {
    val __obj = js.Dynamic.literal(data = js.Any.fromFunction0(data), next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev))
    __obj.asInstanceOf[Iterator[T]]
  }
  
  @scala.inline
  implicit class IteratorOps[Self <: Iterator[_], T] (val x: Self with Iterator[T]) extends AnyVal {
    
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
    def setData(value: () => T): Self = this.set("data", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNext(value: () => T): Self = this.set("next", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrev(value: () => T): Self = this.set("prev", js.Any.fromFunction0(value))
  }
}
