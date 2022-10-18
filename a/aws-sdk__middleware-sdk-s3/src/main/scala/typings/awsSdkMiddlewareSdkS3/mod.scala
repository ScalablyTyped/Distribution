package typings.awsSdkMiddlewareSdkS3

import typings.awsSdkMiddlewareSdkS3.distTypesConfigurationMod.S3InputConfig
import typings.awsSdkMiddlewareSdkS3.distTypesConfigurationMod.S3ResolvedConfig
import typings.awsSdkMiddlewareSdkS3.distTypesThrow200ExceptionsMod.PreviouslyResolved
import typings.awsSdkTypes.distTypesMiddlewareMod.BuildMiddleware
import typings.awsSdkTypes.distTypesMiddlewareMod.DeserializeMiddleware
import typings.awsSdkTypes.distTypesMiddlewareMod.FinalizeRequestHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.FinalizeRequestMiddleware
import typings.awsSdkTypes.distTypesMiddlewareMod.InitializeHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.InitializeMiddleware
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import typings.awsSdkTypes.distTypesMiddlewareMod.RelativeMiddlewareOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-sdk-s3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkContentLengthHeader(): FinalizeRequestMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkContentLengthHeader")().asInstanceOf[FinalizeRequestMiddleware[Any, Any]]
  
  @JSImport("@aws-sdk/middleware-sdk-s3", "checkContentLengthHeaderMiddlewareOptions")
  @js.native
  val checkContentLengthHeaderMiddlewareOptions: FinalizeRequestHandlerOptions = js.native
  
  inline def getCheckContentLengthHeaderPlugin(unused: Any): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCheckContentLengthHeaderPlugin")(unused.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
  
  inline def getThrow200ExceptionsPlugin(config: PreviouslyResolved): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getThrow200ExceptionsPlugin")(config.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
  
  inline def getValidateBucketNamePlugin(unused: Any): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getValidateBucketNamePlugin")(unused.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
  
  inline def getWriteGetObjectResponseEndpointPlugin(
    config: typings.awsSdkMiddlewareSdkS3.distTypesWriteGetObjectResponseEndpointMod.PreviouslyResolved
  ): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWriteGetObjectResponseEndpointPlugin")(config.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
  
  inline def resolveS3Config[T](input: T & S3InputConfig): T & S3ResolvedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveS3Config")(input.asInstanceOf[js.Any]).asInstanceOf[T & S3ResolvedConfig]
  
  inline def throw200ExceptionsMiddleware(config: PreviouslyResolved): DeserializeMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("throw200ExceptionsMiddleware")(config.asInstanceOf[js.Any]).asInstanceOf[DeserializeMiddleware[Any, Any]]
  
  @JSImport("@aws-sdk/middleware-sdk-s3", "throw200ExceptionsMiddlewareOptions")
  @js.native
  val throw200ExceptionsMiddlewareOptions: RelativeMiddlewareOptions = js.native
  
  inline def validateBucketNameMiddleware(): InitializeMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("validateBucketNameMiddleware")().asInstanceOf[InitializeMiddleware[Any, Any]]
  
  @JSImport("@aws-sdk/middleware-sdk-s3", "validateBucketNameMiddlewareOptions")
  @js.native
  val validateBucketNameMiddlewareOptions: InitializeHandlerOptions = js.native
  
  inline def writeGetObjectResponseEndpointMiddleware(
    config: typings.awsSdkMiddlewareSdkS3.distTypesWriteGetObjectResponseEndpointMod.PreviouslyResolved
  ): BuildMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("writeGetObjectResponseEndpointMiddleware")(config.asInstanceOf[js.Any]).asInstanceOf[BuildMiddleware[Any, Any]]
  
  @JSImport("@aws-sdk/middleware-sdk-s3", "writeGetObjectResponseEndpointMiddlewareOptions")
  @js.native
  val writeGetObjectResponseEndpointMiddlewareOptions: RelativeMiddlewareOptions = js.native
}
