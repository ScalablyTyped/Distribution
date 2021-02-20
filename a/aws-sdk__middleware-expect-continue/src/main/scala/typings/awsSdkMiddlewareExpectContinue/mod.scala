package typings.awsSdkMiddlewareExpectContinue

import typings.awsSdkTypes.middlewareMod.BuildHandlerOptions
import typings.awsSdkTypes.middlewareMod.BuildMiddleware
import typings.awsSdkTypes.middlewareMod.Pluggable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-expect-continue", "addExpectContinueMiddleware")
  @js.native
  def addExpectContinueMiddleware(options: PreviouslyResolved): BuildMiddleware[_, _] = js.native
  
  @JSImport("@aws-sdk/middleware-expect-continue", "addExpectContinueMiddlewareOptions")
  @js.native
  val addExpectContinueMiddlewareOptions: BuildHandlerOptions = js.native
  
  @JSImport("@aws-sdk/middleware-expect-continue", "getAddExpectContinuePlugin")
  @js.native
  def getAddExpectContinuePlugin(options: PreviouslyResolved): Pluggable[_, _] = js.native
  
  @js.native
  trait PreviouslyResolved extends StObject {
    
    var runtime: String = js.native
  }
  object PreviouslyResolved {
    
    @scala.inline
    def apply(runtime: String): PreviouslyResolved = {
      val __obj = js.Dynamic.literal(runtime = runtime.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviouslyResolved]
    }
    
    @scala.inline
    implicit class PreviouslyResolvedMutableBuilder[Self <: PreviouslyResolved] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    }
  }
}
