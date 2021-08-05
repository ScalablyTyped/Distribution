package typings.azdata.mod.nb

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageHandler[T /* <: IMessage */] extends StObject {
  
  def handle(message: T): Unit | Thenable[Unit]
}
object MessageHandler {
  
  inline def apply[T /* <: IMessage */](handle: T => Unit | Thenable[Unit]): MessageHandler[T] = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle))
    __obj.asInstanceOf[MessageHandler[T]]
  }
  
  extension [Self <: MessageHandler[?], T /* <: IMessage */](x: Self & MessageHandler[T]) {
    
    inline def setHandle(value: T => Unit | Thenable[Unit]): Self = StObject.set(x, "handle", js.Any.fromFunction1(value))
  }
}
