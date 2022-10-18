package typings.awsSdkMiddlewareBucketEndpoint

import typings.awsSdkMiddlewareBucketEndpoint.anon.AccesspointName
import typings.awsSdkMiddlewareBucketEndpoint.anon.AllowFipsRegion
import typings.awsSdkMiddlewareBucketEndpoint.anon.ClientPartition
import typings.awsSdkMiddlewareBucketEndpoint.anon.TlsCompatible
import typings.awsSdkMiddlewareBucketEndpoint.distTypesBucketHostnameMod.BucketHostname_
import typings.awsSdkMiddlewareBucketEndpoint.distTypesBucketHostnameUtilsMod.ArnHostnameParams
import typings.awsSdkMiddlewareBucketEndpoint.distTypesBucketHostnameUtilsMod.BucketHostnameParams
import typings.awsSdkMiddlewareBucketEndpoint.distTypesConfigurationsMod.BucketEndpointInputConfig
import typings.awsSdkMiddlewareBucketEndpoint.distTypesConfigurationsMod.BucketEndpointResolvedConfig
import typings.awsSdkMiddlewareBucketEndpoint.distTypesConfigurationsMod.PreviouslyResolved
import typings.awsSdkNodeConfigProvider.distTypesConfigLoaderMod.LoadedConfigSelectors
import typings.awsSdkTypes.distTypesMiddlewareMod.BuildMiddleware
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import typings.awsSdkTypes.distTypesMiddlewareMod.RelativeMiddlewareOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-bucket-endpoint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/middleware-bucket-endpoint", "NODE_DISABLE_MULTIREGION_ACCESS_POINT_CONFIG_OPTIONS")
  @js.native
  val NODE_DISABLE_MULTIREGION_ACCESS_POINT_CONFIG_OPTIONS: LoadedConfigSelectors[Boolean] = js.native
  
  @JSImport("@aws-sdk/middleware-bucket-endpoint", "NODE_DISABLE_MULTIREGION_ACCESS_POINT_ENV_NAME")
  @js.native
  val NODE_DISABLE_MULTIREGION_ACCESS_POINT_ENV_NAME: /* "AWS_S3_DISABLE_MULTIREGION_ACCESS_POINTS" */ String = js.native
  
  @JSImport("@aws-sdk/middleware-bucket-endpoint", "NODE_DISABLE_MULTIREGION_ACCESS_POINT_INI_NAME")
  @js.native
  val NODE_DISABLE_MULTIREGION_ACCESS_POINT_INI_NAME: /* "s3_disable_multiregion_access_points" */ String = js.native
  
  @JSImport("@aws-sdk/middleware-bucket-endpoint", "NODE_USE_ARN_REGION_CONFIG_OPTIONS")
  @js.native
  val NODE_USE_ARN_REGION_CONFIG_OPTIONS: LoadedConfigSelectors[Boolean] = js.native
  
  @JSImport("@aws-sdk/middleware-bucket-endpoint", "NODE_USE_ARN_REGION_ENV_NAME")
  @js.native
  val NODE_USE_ARN_REGION_ENV_NAME: /* "AWS_S3_USE_ARN_REGION" */ String = js.native
  
  @JSImport("@aws-sdk/middleware-bucket-endpoint", "NODE_USE_ARN_REGION_INI_NAME")
  @js.native
  val NODE_USE_ARN_REGION_INI_NAME: /* "s3_use_arn_region" */ String = js.native
  
  inline def bucketEndpointMiddleware(options: BucketEndpointResolvedConfig): BuildMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("bucketEndpointMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[BuildMiddleware[Any, Any]]
  
  @JSImport("@aws-sdk/middleware-bucket-endpoint", "bucketEndpointMiddlewareOptions")
  @js.native
  val bucketEndpointMiddlewareOptions: RelativeMiddlewareOptions = js.native
  
  inline def bucketHostname(options: ArnHostnameParams): BucketHostname_ = ^.asInstanceOf[js.Dynamic].applyDynamic("bucketHostname")(options.asInstanceOf[js.Any]).asInstanceOf[BucketHostname_]
  inline def bucketHostname(options: BucketHostnameParams): BucketHostname_ = ^.asInstanceOf[js.Dynamic].applyDynamic("bucketHostname")(options.asInstanceOf[js.Any]).asInstanceOf[BucketHostname_]
  
  inline def getArnResources(resource: String): AccesspointName = ^.asInstanceOf[js.Dynamic].applyDynamic("getArnResources")(resource.asInstanceOf[js.Any]).asInstanceOf[AccesspointName]
  
  inline def getBucketEndpointPlugin(options: BucketEndpointResolvedConfig): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBucketEndpointPlugin")(options.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
  
  inline def getSuffixForArnEndpoint(hostname: String): js.Tuple2[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSuffixForArnEndpoint")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[String, String]]
  
  inline def resolveBucketEndpointConfig[T](input: T & PreviouslyResolved & BucketEndpointInputConfig): T & BucketEndpointResolvedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveBucketEndpointConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & BucketEndpointResolvedConfig]
  
  inline def validateAccountId(accountId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateAccountId")(accountId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateDNSHostLabel(label: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateDNSHostLabel")(label.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def validateDNSHostLabel(label: String, options: TlsCompatible): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateDNSHostLabel")(label.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateNoDualstack(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateNoDualstack")().asInstanceOf[Unit]
  inline def validateNoDualstack(dualstackEndpoint: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateNoDualstack")(dualstackEndpoint.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateNoFIPS(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateNoFIPS")().asInstanceOf[Unit]
  inline def validateNoFIPS(useFipsEndpoint: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateNoFIPS")(useFipsEndpoint.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateOutpostService(service: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateOutpostService")(service.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validatePartition(partition: String, options: ClientPartition): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validatePartition")(partition.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateRegion(region: String, options: AllowFipsRegion): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateRegion")(region.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
