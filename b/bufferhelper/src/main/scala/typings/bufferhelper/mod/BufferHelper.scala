package typings.bufferhelper.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferHelper extends js.Object {
  
  def concat(buffer: js.Any): BufferHelper = js.native
  
  def empty(): BufferHelper = js.native
  
  def load(stream: js.Any, callback: js.Function1[/* arg */ js.Any, _]): Unit = js.native
  
  def toBuffer(): Buffer = js.native
  
  def toString(encoding: encoding): String = js.native
}
object BufferHelper {
  
  @scala.inline
  def apply(
    concat: js.Any => BufferHelper,
    empty: () => BufferHelper,
    load: (js.Any, js.Function1[/* arg */ js.Any, _]) => Unit,
    toBuffer: () => Buffer,
    toString: encoding => String
  ): BufferHelper = {
    val __obj = js.Dynamic.literal(concat = js.Any.fromFunction1(concat), empty = js.Any.fromFunction0(empty), load = js.Any.fromFunction2(load), toBuffer = js.Any.fromFunction0(toBuffer), toString = js.Any.fromFunction1(toString))
    __obj.asInstanceOf[BufferHelper]
  }
  
  @scala.inline
  implicit class BufferHelperOps[Self <: BufferHelper] (val x: Self) extends AnyVal {
    
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
    def setConcat(value: js.Any => BufferHelper): Self = this.set("concat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmpty(value: () => BufferHelper): Self = this.set("empty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoad(value: (js.Any, js.Function1[/* arg */ js.Any, _]) => Unit): Self = this.set("load", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToBuffer(value: () => Buffer): Self = this.set("toBuffer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToString(value: encoding => String): Self = this.set("toString", js.Any.fromFunction1(value))
  }
}
