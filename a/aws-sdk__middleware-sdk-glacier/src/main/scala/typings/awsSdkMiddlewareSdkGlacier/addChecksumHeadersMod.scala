package typings.awsSdkMiddlewareSdkGlacier

import typings.awsSdkMiddlewareSdkGlacier.configurationsMod.PreviouslyResolved
import typings.awsSdkTypes.middlewareMod.BuildHandlerOptions
import typings.awsSdkTypes.middlewareMod.BuildMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addChecksumHeadersMod {
  
  @JSImport("@aws-sdk/middleware-sdk-glacier/dist-types/add-checksum-headers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addChecksumHeadersMiddleware(options: PreviouslyResolved): BuildMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("addChecksumHeadersMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[BuildMiddleware[Any, Any]]
  
  @JSImport("@aws-sdk/middleware-sdk-glacier/dist-types/add-checksum-headers", "addChecksumHeadersMiddlewareOptions")
  @js.native
  val addChecksumHeadersMiddlewareOptions: BuildHandlerOptions = js.native
}
