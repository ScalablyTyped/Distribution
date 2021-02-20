package typings.blazorJavascriptInterop

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object DotNet {
    
    /**
      * Invokes the specified .NET public method synchronously. Not all hosting scenarios support
      * synchronous invocation, so if possible use invokeMethodAsync instead.
      *
      * @param assemblyName The short name (without key/version or .dll extension) of the .NET assembly containing the method.
      * @param methodIdentifier The identifier of the method to invoke. The method must have a [JSInvokable] attribute specifying this identifier.
      * @param args Arguments to pass to the method, each of which must be JSON-serializable.
      * @returns The result of the operation.
      */
    @JSGlobal("DotNet.invokeMethod")
    @js.native
    def invokeMethod[T](assemblyName: String, methodIdentifier: String, args: js.Any*): T = js.native
    
    /**
      * Invokes the specified .NET public method asynchronously.
      *
      * @param assemblyName The short name (without key/version or .dll extension) of the .NET assembly containing the method.
      * @param methodIdentifier The identifier of the method to invoke. The method must have a [JSInvokable] attribute specifying this identifier.
      * @param args Arguments to pass to the method, each of which must be JSON-serializable.
      * @returns A promise representing the result of the operation.
      */
    @JSGlobal("DotNet.invokeMethodAsync")
    @js.native
    def invokeMethodAsync[T](assemblyName: String, methodIdentifier: String, args: js.Any*): js.Promise[T] = js.native
  }
}
