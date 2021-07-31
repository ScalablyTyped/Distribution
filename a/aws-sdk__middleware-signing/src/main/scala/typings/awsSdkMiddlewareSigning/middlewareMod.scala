package typings.awsSdkMiddlewareSigning

import typings.awsSdkMiddlewareSigning.configurationsMod.AwsAuthResolvedConfig
import typings.awsSdkTypes.middlewareMod.FinalizeRequestMiddleware
import typings.awsSdkTypes.middlewareMod.Pluggable
import typings.awsSdkTypes.middlewareMod.RelativeMiddlewareOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object middlewareMod {
  
  @JSImport("@aws-sdk/middleware-signing/dist/cjs/middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def awsAuthMiddleware[Input /* <: js.Object */, Output /* <: js.Object */](options: AwsAuthResolvedConfig): FinalizeRequestMiddleware[Input, Output] = ^.asInstanceOf[js.Dynamic].applyDynamic("awsAuthMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[FinalizeRequestMiddleware[Input, Output]]
  
  @JSImport("@aws-sdk/middleware-signing/dist/cjs/middleware", "awsAuthMiddlewareOptions")
  @js.native
  val awsAuthMiddlewareOptions: RelativeMiddlewareOptions = js.native
  
  @scala.inline
  def getAwsAuthPlugin(options: AwsAuthResolvedConfig): Pluggable[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAwsAuthPlugin")(options.asInstanceOf[js.Any]).asInstanceOf[Pluggable[js.Any, js.Any]]
}
