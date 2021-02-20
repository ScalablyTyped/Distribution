package typings.awsSdkMiddlewareSigning

import typings.awsSdkMiddlewareSigning.configurationsMod.AwsAuthResolvedConfig
import typings.awsSdkTypes.middlewareMod.FinalizeRequestMiddleware
import typings.awsSdkTypes.middlewareMod.Pluggable
import typings.awsSdkTypes.middlewareMod.RelativeMiddlewareOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object middlewareMod {
  
  @JSImport("@aws-sdk/middleware-signing/dist/cjs/middleware", "awsAuthMiddleware")
  @js.native
  def awsAuthMiddleware[Input /* <: js.Object */, Output /* <: js.Object */](options: AwsAuthResolvedConfig): FinalizeRequestMiddleware[Input, Output] = js.native
  
  @JSImport("@aws-sdk/middleware-signing/dist/cjs/middleware", "awsAuthMiddlewareOptions")
  @js.native
  val awsAuthMiddlewareOptions: RelativeMiddlewareOptions = js.native
  
  @JSImport("@aws-sdk/middleware-signing/dist/cjs/middleware", "getAwsAuthPlugin")
  @js.native
  def getAwsAuthPlugin(options: AwsAuthResolvedConfig): Pluggable[_, _] = js.native
}
