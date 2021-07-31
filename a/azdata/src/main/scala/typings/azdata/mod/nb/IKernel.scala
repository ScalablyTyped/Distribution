package typings.azdata.mod.nb

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKernel extends StObject {
  
  /**
    * Gets the full specification for this kernel, which can be serialized to
    * a noteobok file
    */
  def getSpec(): Thenable[IKernelSpec] = js.native
  
  val id: String = js.native
  
  /**
    * The cached kernel info.
    *
    * #### Notes
    * This value will be null until the kernel is ready.
    */
  val info: IInfoReply | Null = js.native
  
  /**
    * Interrupt a kernel.
    *
    * #### Notes
    * Uses the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/kernels).
    *
    * The promise is fulfilled on a valid response and rejected otherwise.
    *
    * It is assumed that the API call does not mutate the kernel id or name.
    *
    * The promise will be rejected if the kernel status is `Dead` or if the
    * request fails or the response is invalid.
    */
  def interrupt(): Thenable[Unit] = js.native
  
  /**
    * Test whether the kernel is ready.
    */
  val isReady: Boolean = js.native
  
  val name: String = js.native
  
  /**
    * A Thenable that is fulfilled when the kernel is ready.
    */
  val ready: Thenable[Unit] = js.native
  
  /**
    * Send a `complete_request` message.
    *
    * @param content - The content of the request.
    *
    * @returns A Thenable that resolves with the response message.
    *
    * #### Notes
    * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#completion).
    *
    * Fulfills with the `complete_reply` content when the shell reply is
    * received and validated.
    */
  def requestComplete(content: ICompleteRequest): Thenable[ICompleteReplyMsg] = js.native
  
  /**
    * Send an `execute_request` message.
    *
    * @param content - The content of the request.
    *
    * @param disposeOnDone - Whether to dispose of the future when done.
    *
    * @returns A kernel future.
    *
    * #### Notes
    * See [Messaging in
    * Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#execute).
    *
    * This method returns a kernel future, rather than a Thenable, since execution may
    * have many response messages (for example, many iopub display messages).
    *
    * Future `onReply` is called with the `execute_reply` content when the
    * shell reply is received and validated.
    *
    * **See also:** [[IExecuteReply]]
    */
  def requestExecute(content: IExecuteRequest): IFuture = js.native
  def requestExecute(content: IExecuteRequest, disposeOnDone: Boolean): IFuture = js.native
  
  val requiresConnection: js.UndefOr[Boolean] = js.native
  
  val supportsIntellisense: Boolean = js.native
}
