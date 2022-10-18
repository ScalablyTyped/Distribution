package typings.awsSdkMiddlewareSdkGlacier

import typings.awsSdkMiddlewareSdkGlacier.distTypesConfigurationsMod.PreviouslyResolved
import typings.awsSdkTypes.distTypesMiddlewareMod.BuildHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.BuildMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAddGlacierApiVersionMod {
  
  @JSImport("@aws-sdk/middleware-sdk-glacier/dist-types/add-glacier-api-version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addGlacierApiVersionMiddleware(options: PreviouslyResolved): BuildMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("addGlacierApiVersionMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[BuildMiddleware[Any, Any]]
  
  @JSImport("@aws-sdk/middleware-sdk-glacier/dist-types/add-glacier-api-version", "addGlacierApiVersionMiddlewareOptions")
  @js.native
  val addGlacierApiVersionMiddlewareOptions: BuildHandlerOptions = js.native
}
