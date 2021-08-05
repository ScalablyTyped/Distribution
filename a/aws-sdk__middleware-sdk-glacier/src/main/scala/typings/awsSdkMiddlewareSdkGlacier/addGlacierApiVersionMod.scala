package typings.awsSdkMiddlewareSdkGlacier

import typings.awsSdkMiddlewareSdkGlacier.configurationsMod.ResolvedGlacierMiddlewareConfig
import typings.awsSdkTypes.middlewareMod.BuildHandlerOptions
import typings.awsSdkTypes.middlewareMod.BuildMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addGlacierApiVersionMod {
  
  @JSImport("@aws-sdk/middleware-sdk-glacier/dist/cjs/add-glacier-api-version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addGlacierApiVersionMiddleware(options: ResolvedGlacierMiddlewareConfig): BuildMiddleware[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("addGlacierApiVersionMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[BuildMiddleware[js.Any, js.Any]]
  
  @JSImport("@aws-sdk/middleware-sdk-glacier/dist/cjs/add-glacier-api-version", "addGlacierApiVersionMiddlewareOptions")
  @js.native
  val addGlacierApiVersionMiddlewareOptions: BuildHandlerOptions = js.native
}
