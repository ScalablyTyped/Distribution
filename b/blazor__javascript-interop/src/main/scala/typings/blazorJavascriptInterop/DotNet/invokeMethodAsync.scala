package typings.blazorJavascriptInterop.DotNet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DotNet.invokeMethodAsync")
@js.native
object invokeMethodAsync extends js.Object {
  /**
    * Invokes the specified .NET public method asynchronously.
    *
    * @param assemblyName The short name (without key/version or .dll extension) of the .NET assembly containing the method.
    * @param methodIdentifier The identifier of the method to invoke. The method must have a [JSInvokable] attribute specifying this identifier.
    * @param args Arguments to pass to the method, each of which must be JSON-serializable.
    * @returns A promise representing the result of the operation.
    */
  def apply[T](assemblyName: String, methodIdentifier: String, args: js.Any*): js.Promise[T] = js.native
}

