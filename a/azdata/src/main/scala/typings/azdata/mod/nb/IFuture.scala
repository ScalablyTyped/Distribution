package typings.azdata.mod.nb

import typings.vscode.Thenable
import typings.vscode.mod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFuture extends Disposable {
  /**
    * A Thenable that resolves when the future is done.
    *
    * #### Notes
    * The future is done when there are no more responses expected from the
    * kernel.
    *
    * The `done` Thenable resolves to the reply message if there is one,
    * otherwise it resolves to `undefined`.
    */
  val done: Thenable[js.UndefOr[IShellMessage]] = js.native
  /**
    * The original outgoing message.
    */
  val msg: IMessage = js.native
  /**
    * Register hook for IOPub messages.
    *
    * @param hook - The callback invoked for an IOPub message.
    *
    * #### Notes
    * The IOPub hook system allows you to preempt the handlers for IOPub
    * messages handled by the future.
    *
    * The most recently registered hook is run first. A hook can return a
    * boolean or a Thenable to a boolean, in which case all kernel message
    * processing pauses until the Thenable is fulfilled. If a hook return value
    * resolves to false, any later hooks will not run and the function will
    * return a Thenable resolving to false. If a hook throws an error, the error
    * is logged to the console and the next hook is run. If a hook is
    * registered during the hook processing, it will not run until the next
    * message. If a hook is removed during the hook processing, it will be
    * deactivated immediately.
    */
  def registerMessageHook(hook: js.Function1[/* msg */ IIOPubMessage, Boolean | Thenable[Boolean]]): Unit = js.native
  /**
    * Remove a hook for IOPub messages.
    *
    * @param hook - The hook to remove.
    *
    * #### Notes
    * If a hook is removed during the hook processing, it will be deactivated immediately.
    */
  def removeMessageHook(hook: js.Function1[/* msg */ IIOPubMessage, Boolean | Thenable[Boolean]]): Unit = js.native
  /**
    * Send an `input_reply` message.
    */
  def sendInputReply(content: IInputReply): Unit = js.native
  /**
    * Sets the iopub handler for the kernel future.
    *
    * #### Notes
    * If the handler returns a Thenable, all kernel message processing pauses
    * until the Thenable is resolved.
    */
  def setIOPubHandler(handler: MessageHandler[IIOPubMessage]): Unit = js.native
  /**
    * Set the reply handler for the kernel future.
    *
    * #### Notes
    * If the handler returns a Thenable, all kernel message processing pauses
    * until the Thenable is resolved. If there is a reply message, the future
    * `done` Thenable also resolves to the reply message after this handler has
    * been called.
    */
  def setReplyHandler(handler: MessageHandler[IShellMessage]): Unit = js.native
  /**
    * Sets the stdin handler for the kernel future.
    *
    * #### Notes
    * If the handler returns a Thenable, all kernel message processing pauses
    * until the Thenable is resolved.
    */
  def setStdInHandler(handler: MessageHandler[IStdinMessage]): Unit = js.native
}

