package typings.awsSdkMiddlewareSdkGlacier

import typings.awsSdkMiddlewareSdkGlacier.configurationsMod.GlacierMiddlewareInputConfig
import typings.awsSdkMiddlewareSdkGlacier.configurationsMod.PreviouslyResolved
import typings.awsSdkMiddlewareSdkGlacier.configurationsMod.ResolvedGlacierMiddlewareConfig
import typings.awsSdkTypes.middlewareMod.BuildHandlerOptions
import typings.awsSdkTypes.middlewareMod.BuildMiddleware
import typings.awsSdkTypes.middlewareMod.InitializeHandlerOptions
import typings.awsSdkTypes.middlewareMod.InitializeMiddleware
import typings.awsSdkTypes.middlewareMod.Pluggable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/middleware-sdk-glacier", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def accountIdDefaultMiddleware(): InitializeMiddleware[_, _] = js.native
  
  val accountIdDefaultMiddlewareOptions: InitializeHandlerOptions = js.native
  
  def addChecksumHeadersMiddleware(options: ResolvedGlacierMiddlewareConfig): BuildMiddleware[_, _] = js.native
  
  val addChecksumHeadersMiddlewareOptions: BuildHandlerOptions = js.native
  
  def addGlacierApiVersionMiddleware(options: ResolvedGlacierMiddlewareConfig): BuildMiddleware[_, _] = js.native
  
  val addGlacierApiVersionMiddlewareOptions: BuildHandlerOptions = js.native
  
  def getGlacierPlugin(config: PreviouslyResolved): Pluggable[_, _] = js.native
  
  def resolveGlacierMiddlewareConfig[T](input: T with PreviouslyResolved with GlacierMiddlewareInputConfig): T with ResolvedGlacierMiddlewareConfig = js.native
}
