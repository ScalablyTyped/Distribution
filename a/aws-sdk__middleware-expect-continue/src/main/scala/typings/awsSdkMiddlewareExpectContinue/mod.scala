package typings.awsSdkMiddlewareExpectContinue

import typings.awsSdkTypes.middlewareMod.BuildHandlerOptions
import typings.awsSdkTypes.middlewareMod.BuildMiddleware
import typings.awsSdkTypes.middlewareMod.Pluggable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-expect-continue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addExpectContinueMiddleware(options: PreviouslyResolved): BuildMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("addExpectContinueMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[BuildMiddleware[Any, Any]]
  
  @JSImport("@aws-sdk/middleware-expect-continue", "addExpectContinueMiddlewareOptions")
  @js.native
  val addExpectContinueMiddlewareOptions: BuildHandlerOptions = js.native
  
  inline def getAddExpectContinuePlugin(options: PreviouslyResolved): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAddExpectContinuePlugin")(options.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
  
  trait PreviouslyResolved extends StObject {
    
    var runtime: String
  }
  object PreviouslyResolved {
    
    inline def apply(runtime: String): PreviouslyResolved = {
      val __obj = js.Dynamic.literal(runtime = runtime.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviouslyResolved]
    }
    
    extension [Self <: PreviouslyResolved](x: Self) {
      
      inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    }
  }
}
