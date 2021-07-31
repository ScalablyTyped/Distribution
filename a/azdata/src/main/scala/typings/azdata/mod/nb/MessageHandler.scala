package typings.azdata.mod.nb

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageHandler[T /* <: IMessage */] extends StObject {
  
  def handle(message: T): Unit | Thenable[Unit]
}
object MessageHandler {
  
  @scala.inline
  def apply[T /* <: IMessage */](handle: T => Unit | Thenable[Unit]): MessageHandler[T] = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle))
    __obj.asInstanceOf[MessageHandler[T]]
  }
  
  @scala.inline
  implicit class MessageHandlerMutableBuilder[Self <: MessageHandler[?], T /* <: IMessage */] (val x: Self & MessageHandler[T]) extends AnyVal {
    
    @scala.inline
    def setHandle(value: T => Unit | Thenable[Unit]): Self = StObject.set(x, "handle", js.Any.fromFunction1(value))
  }
}
