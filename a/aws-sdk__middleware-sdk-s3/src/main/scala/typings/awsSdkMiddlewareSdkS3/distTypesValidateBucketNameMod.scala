package typings.awsSdkMiddlewareSdkS3

import typings.awsSdkTypes.distTypesMiddlewareMod.InitializeHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.InitializeMiddleware
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesValidateBucketNameMod {
  
  @JSImport("@aws-sdk/middleware-sdk-s3/dist-types/validate-bucket-name", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getValidateBucketNamePlugin(unused: Any): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getValidateBucketNamePlugin")(unused.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
  
  inline def validateBucketNameMiddleware(): InitializeMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("validateBucketNameMiddleware")().asInstanceOf[InitializeMiddleware[Any, Any]]
  
  @JSImport("@aws-sdk/middleware-sdk-s3/dist-types/validate-bucket-name", "validateBucketNameMiddlewareOptions")
  @js.native
  val validateBucketNameMiddlewareOptions: InitializeHandlerOptions = js.native
}
