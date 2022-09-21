package typings.awsSdkMiddlewareBucketEndpoint

import typings.awsSdkMiddlewareBucketEndpoint.configurationsMod.BucketEndpointResolvedConfig
import typings.awsSdkTypes.middlewareMod.BuildMiddleware
import typings.awsSdkTypes.middlewareMod.Pluggable
import typings.awsSdkTypes.middlewareMod.RelativeMiddlewareOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bucketEndpointMiddlewareMod {
  
  @JSImport("@aws-sdk/middleware-bucket-endpoint/dist-types/bucketEndpointMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bucketEndpointMiddleware(options: BucketEndpointResolvedConfig): BuildMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("bucketEndpointMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[BuildMiddleware[Any, Any]]
  
  @JSImport("@aws-sdk/middleware-bucket-endpoint/dist-types/bucketEndpointMiddleware", "bucketEndpointMiddlewareOptions")
  @js.native
  val bucketEndpointMiddlewareOptions: RelativeMiddlewareOptions = js.native
  
  inline def getBucketEndpointPlugin(options: BucketEndpointResolvedConfig): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBucketEndpointPlugin")(options.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
}
