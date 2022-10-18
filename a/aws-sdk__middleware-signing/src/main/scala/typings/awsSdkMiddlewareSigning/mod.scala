package typings.awsSdkMiddlewareSigning

import typings.awsSdkMiddlewareSigning.distTypesConfigurationsMod.AwsAuthInputConfig
import typings.awsSdkMiddlewareSigning.distTypesConfigurationsMod.AwsAuthResolvedConfig
import typings.awsSdkMiddlewareSigning.distTypesConfigurationsMod.PreviouslyResolved
import typings.awsSdkMiddlewareSigning.distTypesConfigurationsMod.SigV4AuthInputConfig
import typings.awsSdkMiddlewareSigning.distTypesConfigurationsMod.SigV4AuthResolvedConfig
import typings.awsSdkMiddlewareSigning.distTypesConfigurationsMod.SigV4PreviouslyResolved
import typings.awsSdkTypes.distTypesMiddlewareMod.FinalizeRequestMiddleware
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import typings.awsSdkTypes.distTypesMiddlewareMod.RelativeMiddlewareOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-signing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def awsAuthMiddleware[Input /* <: js.Object */, Output /* <: js.Object */](options: AwsAuthResolvedConfig): FinalizeRequestMiddleware[Input, Output] = ^.asInstanceOf[js.Dynamic].applyDynamic("awsAuthMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[FinalizeRequestMiddleware[Input, Output]]
  
  @JSImport("@aws-sdk/middleware-signing", "awsAuthMiddlewareOptions")
  @js.native
  val awsAuthMiddlewareOptions: RelativeMiddlewareOptions = js.native
  
  inline def getAwsAuthPlugin(options: AwsAuthResolvedConfig): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAwsAuthPlugin")(options.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
  
  inline def getSigV4AuthPlugin(options: AwsAuthResolvedConfig): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSigV4AuthPlugin")(options.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
  
  inline def resolveAwsAuthConfig[T](input: T & AwsAuthInputConfig & PreviouslyResolved): T & AwsAuthResolvedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAwsAuthConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & AwsAuthResolvedConfig]
  
  inline def resolveSigV4AuthConfig[T](input: T & SigV4AuthInputConfig & SigV4PreviouslyResolved): T & SigV4AuthResolvedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveSigV4AuthConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & SigV4AuthResolvedConfig]
}
