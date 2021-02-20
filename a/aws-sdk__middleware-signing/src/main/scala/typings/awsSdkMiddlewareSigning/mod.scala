package typings.awsSdkMiddlewareSigning

import typings.awsSdkMiddlewareSigning.configurationsMod.AwsAuthInputConfig
import typings.awsSdkMiddlewareSigning.configurationsMod.AwsAuthResolvedConfig
import typings.awsSdkMiddlewareSigning.configurationsMod.PreviouslyResolved
import typings.awsSdkTypes.middlewareMod.FinalizeRequestMiddleware
import typings.awsSdkTypes.middlewareMod.Pluggable
import typings.awsSdkTypes.middlewareMod.RelativeMiddlewareOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-signing", "awsAuthMiddleware")
  @js.native
  def awsAuthMiddleware[Input /* <: js.Object */, Output /* <: js.Object */](options: AwsAuthResolvedConfig): FinalizeRequestMiddleware[Input, Output] = js.native
  
  @JSImport("@aws-sdk/middleware-signing", "awsAuthMiddlewareOptions")
  @js.native
  val awsAuthMiddlewareOptions: RelativeMiddlewareOptions = js.native
  
  @JSImport("@aws-sdk/middleware-signing", "getAwsAuthPlugin")
  @js.native
  def getAwsAuthPlugin(options: AwsAuthResolvedConfig): Pluggable[_, _] = js.native
  
  @JSImport("@aws-sdk/middleware-signing", "resolveAwsAuthConfig")
  @js.native
  def resolveAwsAuthConfig[T](input: T with AwsAuthInputConfig with PreviouslyResolved): T with AwsAuthResolvedConfig = js.native
}
