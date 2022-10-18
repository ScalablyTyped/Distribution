package typings.awsSdkMiddlewareContentLength

import typings.awsSdkMiddlewareContentLength.anon.BodyLengthChecker
import typings.awsSdkTypes.distTypesMiddlewareMod.BuildHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.BuildMiddleware
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import typings.awsSdkTypes.distTypesUtilMod.BodyLengthCalculator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-content-length", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def contentLengthMiddleware(bodyLengthChecker: BodyLengthCalculator): BuildMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("contentLengthMiddleware")(bodyLengthChecker.asInstanceOf[js.Any]).asInstanceOf[BuildMiddleware[Any, Any]]
  
  @JSImport("@aws-sdk/middleware-content-length", "contentLengthMiddlewareOptions")
  @js.native
  val contentLengthMiddlewareOptions: BuildHandlerOptions = js.native
  
  inline def getContentLengthPlugin(options: BodyLengthChecker): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getContentLengthPlugin")(options.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
}
