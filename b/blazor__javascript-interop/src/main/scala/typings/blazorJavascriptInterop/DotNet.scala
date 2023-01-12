package typings.blazorJavascriptInterop

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DotNet {
  
  /**
    * Represents the .NET instance passed by reference to JavaScript.
    */
  trait DotNetObject extends StObject {
    
    /**
      * Invokes the specified .NET instance public method synchronously. Not all hosting scenarios support
      * synchronous invocation, so if possible use invokeMethodAsync instead.
      *
      * @param methodIdentifier The identifier of the method to invoke. The method must have a [JSInvokable] attribute specifying this identifier.
      * @param args Arguments to pass to the method, each of which must be JSON-serializable.
      * @returns The result of the operation.
      */
    def invokeMethod[T](methodIdentifier: String, args: Any*): T
    
    /**
      * Invokes the specified .NET instance public method asynchronously.
      *
      * @param methodIdentifier The identifier of the method to invoke. The method must have a [JSInvokable] attribute specifying this identifier.
      * @param args Arguments to pass to the method, each of which must be JSON-serializable.
      * @returns A promise representing the result of the operation.
      */
    def invokeMethodAsync[T](methodIdentifier: String, args: Any*): js.Promise[T]
  }
  object DotNetObject {
    
    inline def apply(
      invokeMethod: (String, /* repeated */ Any) => Any,
      invokeMethodAsync: (String, /* repeated */ Any) => js.Promise[Any]
    ): DotNetObject = {
      val __obj = js.Dynamic.literal(invokeMethod = js.Any.fromFunction2(invokeMethod), invokeMethodAsync = js.Any.fromFunction2(invokeMethodAsync))
      __obj.asInstanceOf[DotNetObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DotNetObject] (val x: Self) extends AnyVal {
      
      inline def setInvokeMethod(value: (String, /* repeated */ Any) => Any): Self = StObject.set(x, "invokeMethod", js.Any.fromFunction2(value))
      
      inline def setInvokeMethodAsync(value: (String, /* repeated */ Any) => js.Promise[Any]): Self = StObject.set(x, "invokeMethodAsync", js.Any.fromFunction2(value))
    }
  }
}
