package typings.awsSdkMiddlewareSigning

import typings.awsSdkMiddlewareSigning.configurationsMod.AwsAuthInputConfig
import typings.awsSdkMiddlewareSigning.configurationsMod.AwsAuthResolvedConfig
import typings.awsSdkMiddlewareSigning.configurationsMod.PreviouslyResolved
import typings.awsSdkTypes.middlewareMod.FinalizeRequestMiddleware
import typings.awsSdkTypes.middlewareMod.Pluggable
import typings.awsSdkTypes.middlewareMod.RelativeMiddlewareOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-signing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def awsAuthMiddleware[Input /* <: js.Object */, Output /* <: js.Object */](options: AwsAuthResolvedConfig): FinalizeRequestMiddleware[Input, Output] = ^.asInstanceOf[js.Dynamic].applyDynamic("awsAuthMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[FinalizeRequestMiddleware[Input, Output]]
  
  @JSImport("@aws-sdk/middleware-signing", "awsAuthMiddlewareOptions")
  @js.native
  val awsAuthMiddlewareOptions: RelativeMiddlewareOptions = js.native
  
  @scala.inline
  def getAwsAuthPlugin(options: AwsAuthResolvedConfig): Pluggable[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAwsAuthPlugin")(options.asInstanceOf[js.Any]).asInstanceOf[Pluggable[js.Any, js.Any]]
  
  @scala.inline
  def resolveAwsAuthConfig[T](input: T & AwsAuthInputConfig & PreviouslyResolved): T & AwsAuthResolvedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAwsAuthConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & AwsAuthResolvedConfig]
}
