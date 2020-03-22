package typings.blazorJavascriptInterop.DotNet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DotNet.invokeMethod")
@js.native
object invokeMethod extends js.Object {
  /**
    * Invokes the specified .NET public method synchronously. Not all hosting scenarios support
    * synchronous invocation, so if possible use invokeMethodAsync instead.
    *
    * @param assemblyName The short name (without key/version or .dll extension) of the .NET assembly containing the method.
    * @param methodIdentifier The identifier of the method to invoke. The method must have a [JSInvokable] attribute specifying this identifier.
    * @param args Arguments to pass to the method, each of which must be JSON-serializable.
    * @returns The result of the operation.
    */
  def apply[T](assemblyName: String, methodIdentifier: String, args: js.Any*): T = js.native
}

