package typings.azdata.mod.nb

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageHandler[T /* <: IMessage */] extends js.Object {
  
  def handle(message: T): Unit | Thenable[Unit] = js.native
}
object MessageHandler {
  
  @scala.inline
  def apply[T /* <: IMessage */](handle: T => Unit | Thenable[Unit]): MessageHandler[T] = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle))
    __obj.asInstanceOf[MessageHandler[T]]
  }
  
  @scala.inline
  implicit class MessageHandlerOps[Self <: MessageHandler[_], T /* <: IMessage */] (val x: Self with MessageHandler[T]) extends AnyVal {
    
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
    def setHandle(value: T => Unit | Thenable[Unit]): Self = this.set("handle", js.Any.fromFunction1(value))
  }
}
