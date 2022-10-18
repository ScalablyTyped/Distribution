package typings.awsSdkMiddlewareSigning

import typings.awsSdkMiddlewareSigning.distTypesConfigurationsMod.AwsAuthResolvedConfig
import typings.awsSdkTypes.distTypesMiddlewareMod.FinalizeRequestMiddleware
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import typings.awsSdkTypes.distTypesMiddlewareMod.RelativeMiddlewareOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMiddlewareMod {
  
  @JSImport("@aws-sdk/middleware-signing/dist-types/middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def awsAuthMiddleware[Input /* <: js.Object */, Output /* <: js.Object */](options: AwsAuthResolvedConfig): FinalizeRequestMiddleware[Input, Output] = ^.asInstanceOf[js.Dynamic].applyDynamic("awsAuthMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[FinalizeRequestMiddleware[Input, Output]]
  
  @JSImport("@aws-sdk/middleware-signing/dist-types/middleware", "awsAuthMiddlewareOptions")
  @js.native
  val awsAuthMiddlewareOptions: RelativeMiddlewareOptions = js.native
  
  inline def getAwsAuthPlugin(options: AwsAuthResolvedConfig): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAwsAuthPlugin")(options.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
  
  inline def getSigV4AuthPlugin(options: AwsAuthResolvedConfig): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSigV4AuthPlugin")(options.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
}
