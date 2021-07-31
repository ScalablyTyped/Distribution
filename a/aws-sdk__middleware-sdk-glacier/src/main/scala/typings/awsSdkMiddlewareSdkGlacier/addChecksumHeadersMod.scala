package typings.awsSdkMiddlewareSdkGlacier

import typings.awsSdkMiddlewareSdkGlacier.configurationsMod.ResolvedGlacierMiddlewareConfig
import typings.awsSdkTypes.middlewareMod.BuildHandlerOptions
import typings.awsSdkTypes.middlewareMod.BuildMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addChecksumHeadersMod {
  
  @JSImport("@aws-sdk/middleware-sdk-glacier/dist/cjs/add-checksum-headers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addChecksumHeadersMiddleware(options: ResolvedGlacierMiddlewareConfig): BuildMiddleware[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("addChecksumHeadersMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[BuildMiddleware[js.Any, js.Any]]
  
  @JSImport("@aws-sdk/middleware-sdk-glacier/dist/cjs/add-checksum-headers", "addChecksumHeadersMiddlewareOptions")
  @js.native
  val addChecksumHeadersMiddlewareOptions: BuildHandlerOptions = js.native
}
