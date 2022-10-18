package typings.awsSdkMiddlewareSdkGlacier

import typings.awsSdkMiddlewareSdkGlacier.distTypesConfigurationsMod.PreviouslyResolved
import typings.awsSdkTypes.distTypesMiddlewareMod.BuildHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.BuildMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAddChecksumHeadersMod {
  
  @JSImport("@aws-sdk/middleware-sdk-glacier/dist-types/add-checksum-headers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addChecksumHeadersMiddleware(options: PreviouslyResolved): BuildMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("addChecksumHeadersMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[BuildMiddleware[Any, Any]]
  
  @JSImport("@aws-sdk/middleware-sdk-glacier/dist-types/add-checksum-headers", "addChecksumHeadersMiddlewareOptions")
  @js.native
  val addChecksumHeadersMiddlewareOptions: BuildHandlerOptions = js.native
}
