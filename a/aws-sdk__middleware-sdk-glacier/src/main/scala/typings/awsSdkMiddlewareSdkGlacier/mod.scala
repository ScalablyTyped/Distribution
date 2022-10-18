package typings.awsSdkMiddlewareSdkGlacier

import typings.awsSdkMiddlewareSdkGlacier.distTypesConfigurationsMod.PreviouslyResolved
import typings.awsSdkTypes.distTypesMiddlewareMod.BuildHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.BuildMiddleware
import typings.awsSdkTypes.distTypesMiddlewareMod.InitializeHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.InitializeMiddleware
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-sdk-glacier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def accountIdDefaultMiddleware(): InitializeMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("accountIdDefaultMiddleware")().asInstanceOf[InitializeMiddleware[Any, Any]]
  
  @JSImport("@aws-sdk/middleware-sdk-glacier", "accountIdDefaultMiddlewareOptions")
  @js.native
  val accountIdDefaultMiddlewareOptions: InitializeHandlerOptions = js.native
  
  inline def addChecksumHeadersMiddleware(options: PreviouslyResolved): BuildMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("addChecksumHeadersMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[BuildMiddleware[Any, Any]]
  
  @JSImport("@aws-sdk/middleware-sdk-glacier", "addChecksumHeadersMiddlewareOptions")
  @js.native
  val addChecksumHeadersMiddlewareOptions: BuildHandlerOptions = js.native
  
  inline def addGlacierApiVersionMiddleware(options: PreviouslyResolved): BuildMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("addGlacierApiVersionMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[BuildMiddleware[Any, Any]]
  
  @JSImport("@aws-sdk/middleware-sdk-glacier", "addGlacierApiVersionMiddlewareOptions")
  @js.native
  val addGlacierApiVersionMiddlewareOptions: BuildHandlerOptions = js.native
  
  inline def getGlacierPlugin(config: PreviouslyResolved): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlacierPlugin")(config.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
}
