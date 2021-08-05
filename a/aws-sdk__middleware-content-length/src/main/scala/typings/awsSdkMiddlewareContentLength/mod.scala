package typings.awsSdkMiddlewareContentLength

import typings.awsSdkMiddlewareContentLength.anon.BodyLengthChecker
import typings.awsSdkTypes.middlewareMod.BuildHandlerOptions
import typings.awsSdkTypes.middlewareMod.BuildMiddleware
import typings.awsSdkTypes.middlewareMod.Pluggable
import typings.awsSdkTypes.utilMod.BodyLengthCalculator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-content-length", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def contentLengthMiddleware(bodyLengthChecker: BodyLengthCalculator): BuildMiddleware[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("contentLengthMiddleware")(bodyLengthChecker.asInstanceOf[js.Any]).asInstanceOf[BuildMiddleware[js.Any, js.Any]]
  
  @JSImport("@aws-sdk/middleware-content-length", "contentLengthMiddlewareOptions")
  @js.native
  val contentLengthMiddlewareOptions: BuildHandlerOptions = js.native
  
  inline def getContentLengthPlugin(options: BodyLengthChecker): Pluggable[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getContentLengthPlugin")(options.asInstanceOf[js.Any]).asInstanceOf[Pluggable[js.Any, js.Any]]
}
