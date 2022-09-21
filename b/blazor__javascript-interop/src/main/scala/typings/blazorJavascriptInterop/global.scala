package typings.blazorJavascriptInterop

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object DotNet {
    
    @JSGlobal("DotNet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Invokes the specified .NET public method synchronously. Not all hosting scenarios support
      * synchronous invocation, so if possible use invokeMethodAsync instead.
      *
      * @param assemblyName The short name (without key/version or .dll extension) of the .NET assembly containing the method.
      * @param methodIdentifier The identifier of the method to invoke. The method must have a [JSInvokable] attribute specifying this identifier.
      * @param args Arguments to pass to the method, each of which must be JSON-serializable.
      * @returns The result of the operation.
      */
    inline def invokeMethod[T](assemblyName: String, methodIdentifier: String, args: Any*): T = (^.asInstanceOf[js.Dynamic].applyDynamic("invokeMethod")((List(assemblyName.asInstanceOf[js.Any], methodIdentifier.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[T]
    
    /**
      * Invokes the specified .NET public method asynchronously.
      *
      * @param assemblyName The short name (without key/version or .dll extension) of the .NET assembly containing the method.
      * @param methodIdentifier The identifier of the method to invoke. The method must have a [JSInvokable] attribute specifying this identifier.
      * @param args Arguments to pass to the method, each of which must be JSON-serializable.
      * @returns A promise representing the result of the operation.
      */
    inline def invokeMethodAsync[T](assemblyName: String, methodIdentifier: String, args: Any*): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("invokeMethodAsync")((List(assemblyName.asInstanceOf[js.Any], methodIdentifier.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[T]]
  }
}
