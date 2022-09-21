package typings.awsSdkMiddlewareSdkS3

import typings.awsSdkMiddlewareSdkS3.throw200ExceptionsMod.PreviouslyResolved
import typings.awsSdkTypes.middlewareMod.BuildMiddleware
import typings.awsSdkTypes.middlewareMod.DeserializeMiddleware
import typings.awsSdkTypes.middlewareMod.FinalizeRequestHandlerOptions
import typings.awsSdkTypes.middlewareMod.FinalizeRequestMiddleware
import typings.awsSdkTypes.middlewareMod.InitializeHandlerOptions
import typings.awsSdkTypes.middlewareMod.InitializeMiddleware
import typings.awsSdkTypes.middlewareMod.Pluggable
import typings.awsSdkTypes.middlewareMod.RelativeMiddlewareOptions
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
  
  inline def getWriteGetObjectResponseEndpointPlugin(config: typings.awsSdkMiddlewareSdkS3.writeGetObjectResponseEndpointMod.PreviouslyResolved): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWriteGetObjectResponseEndpointPlugin")(config.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
  
  inline def throw200ExceptionsMiddleware(config: PreviouslyResolved): DeserializeMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("throw200ExceptionsMiddleware")(config.asInstanceOf[js.Any]).asInstanceOf[DeserializeMiddleware[Any, Any]]
  
  @JSImport("@aws-sdk/middleware-sdk-s3", "throw200ExceptionsMiddlewareOptions")
  @js.native
  val throw200ExceptionsMiddlewareOptions: RelativeMiddlewareOptions = js.native
  
  inline def validateBucketNameMiddleware(): InitializeMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("validateBucketNameMiddleware")().asInstanceOf[InitializeMiddleware[Any, Any]]
  
  @JSImport("@aws-sdk/middleware-sdk-s3", "validateBucketNameMiddlewareOptions")
  @js.native
  val validateBucketNameMiddlewareOptions: InitializeHandlerOptions = js.native
  
  inline def writeGetObjectResponseEndpointMiddleware(config: typings.awsSdkMiddlewareSdkS3.writeGetObjectResponseEndpointMod.PreviouslyResolved): BuildMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("writeGetObjectResponseEndpointMiddleware")(config.asInstanceOf[js.Any]).asInstanceOf[BuildMiddleware[Any, Any]]
  
  @JSImport("@aws-sdk/middleware-sdk-s3", "writeGetObjectResponseEndpointMiddlewareOptions")
  @js.native
  val writeGetObjectResponseEndpointMiddlewareOptions: RelativeMiddlewareOptions = js.native
}
