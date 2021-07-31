package typings.awsSdkMiddlewareSdkGlacier

import typings.awsSdkMiddlewareSdkGlacier.configurationsMod.GlacierMiddlewareInputConfig
import typings.awsSdkMiddlewareSdkGlacier.configurationsMod.PreviouslyResolved
import typings.awsSdkMiddlewareSdkGlacier.configurationsMod.ResolvedGlacierMiddlewareConfig
import typings.awsSdkTypes.middlewareMod.BuildHandlerOptions
import typings.awsSdkTypes.middlewareMod.BuildMiddleware
import typings.awsSdkTypes.middlewareMod.InitializeHandlerOptions
import typings.awsSdkTypes.middlewareMod.InitializeMiddleware
import typings.awsSdkTypes.middlewareMod.Pluggable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-sdk-glacier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def accountIdDefaultMiddleware(): InitializeMiddleware[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("accountIdDefaultMiddleware")().asInstanceOf[InitializeMiddleware[js.Any, js.Any]]
  
  @JSImport("@aws-sdk/middleware-sdk-glacier", "accountIdDefaultMiddlewareOptions")
  @js.native
  val accountIdDefaultMiddlewareOptions: InitializeHandlerOptions = js.native
  
  @scala.inline
  def addChecksumHeadersMiddleware(options: ResolvedGlacierMiddlewareConfig): BuildMiddleware[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("addChecksumHeadersMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[BuildMiddleware[js.Any, js.Any]]
  
  @JSImport("@aws-sdk/middleware-sdk-glacier", "addChecksumHeadersMiddlewareOptions")
  @js.native
  val addChecksumHeadersMiddlewareOptions: BuildHandlerOptions = js.native
  
  @scala.inline
  def addGlacierApiVersionMiddleware(options: ResolvedGlacierMiddlewareConfig): BuildMiddleware[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("addGlacierApiVersionMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[BuildMiddleware[js.Any, js.Any]]
  
  @JSImport("@aws-sdk/middleware-sdk-glacier", "addGlacierApiVersionMiddlewareOptions")
  @js.native
  val addGlacierApiVersionMiddlewareOptions: BuildHandlerOptions = js.native
  
  @scala.inline
  def getGlacierPlugin(config: PreviouslyResolved): Pluggable[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlacierPlugin")(config.asInstanceOf[js.Any]).asInstanceOf[Pluggable[js.Any, js.Any]]
  
  @scala.inline
  def resolveGlacierMiddlewareConfig[T](input: T & PreviouslyResolved & GlacierMiddlewareInputConfig): T & ResolvedGlacierMiddlewareConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveGlacierMiddlewareConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & ResolvedGlacierMiddlewareConfig]
}
