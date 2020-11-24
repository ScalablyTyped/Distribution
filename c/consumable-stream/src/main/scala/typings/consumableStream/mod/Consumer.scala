package typings.consumableStream.mod

import typings.std.IteratorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Consumer[T] extends js.Object {
  
  def next(): js.Promise[IteratorResult[T, _]] = js.native
  
  def `return`(): Unit = js.native
}
object Consumer {
  
  @scala.inline
  def apply[T](next: () => js.Promise[IteratorResult[T, _]], `return`: () => Unit): Consumer[T] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.updateDynamic("return")(js.Any.fromFunction0(`return`))
    __obj.asInstanceOf[Consumer[T]]
  }
  
  @scala.inline
  implicit class ConsumerOps[Self <: Consumer[_], T] (val x: Self with Consumer[T]) extends AnyVal {
    
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
    def setNext(value: () => js.Promise[IteratorResult[T, _]]): Self = this.set("next", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReturn(value: () => Unit): Self = this.set("return", js.Any.fromFunction0(value))
  }
}
