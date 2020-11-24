package typings.cassanknex.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamParams extends js.Object {
  
  def end(): js.Any = js.native
  
  def error(err: Error): js.Any = js.native
  
  def readable(): js.Any = js.native
}
object StreamParams {
  
  @scala.inline
  def apply(end: () => js.Any, error: Error => js.Any, readable: () => js.Any): StreamParams = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), error = js.Any.fromFunction1(error), readable = js.Any.fromFunction0(readable))
    __obj.asInstanceOf[StreamParams]
  }
  
  @scala.inline
  implicit class StreamParamsOps[Self <: StreamParams] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: () => js.Any): Self = this.set("end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setError(value: Error => js.Any): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReadable(value: () => js.Any): Self = this.set("readable", js.Any.fromFunction0(value))
  }
}
