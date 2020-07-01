package typings.azdata.mod.nb

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageHandler[T /* <: IMessage */] extends js.Object {
  def handle(message: T): Unit | Thenable[Unit]
}

object MessageHandler {
  @scala.inline
  def apply[/* <: typings.azdata.mod.nb.IMessage */ T](handle: T => Unit | Thenable[Unit]): MessageHandler[T] = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle))
    __obj.asInstanceOf[MessageHandler[T]]
  }
}

