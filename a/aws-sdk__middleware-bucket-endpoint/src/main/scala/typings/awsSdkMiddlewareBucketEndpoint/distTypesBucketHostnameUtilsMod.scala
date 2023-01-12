package typings.awsSdkMiddlewareBucketEndpoint

import typings.awsSdkMiddlewareBucketEndpoint.anon.AccelerateEndpoint
import typings.awsSdkMiddlewareBucketEndpoint.anon.AccesspointName
import typings.awsSdkMiddlewareBucketEndpoint.anon.AllowFipsRegion
import typings.awsSdkMiddlewareBucketEndpoint.anon.ClientPartition
import typings.awsSdkMiddlewareBucketEndpoint.anon.DualstackEndpoint
import typings.awsSdkMiddlewareBucketEndpoint.anon.TlsCompatible
import typings.awsSdkUtilArnParser.mod.ARN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBucketHostnameUtilsMod {
  
  @JSImport("@aws-sdk/middleware-bucket-endpoint/dist-types/bucketHostnameUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/middleware-bucket-endpoint/dist-types/bucketHostnameUtils", "DOT_PATTERN")
  @js.native
  val DOT_PATTERN: js.RegExp = js.native
  
  @JSImport("@aws-sdk/middleware-bucket-endpoint/dist-types/bucketHostnameUtils", "S3_HOSTNAME_PATTERN")
  @js.native
  val S3_HOSTNAME_PATTERN: js.RegExp = js.native
  
  inline def getArnResources(resource: String): AccesspointName = ^.asInstanceOf[js.Dynamic].applyDynamic("getArnResources")(resource.asInstanceOf[js.Any]).asInstanceOf[AccesspointName]
  
  inline def getSuffix(hostname: String): js.Tuple2[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSuffix")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[String, String]]
  
  inline def getSuffixForArnEndpoint(hostname: String): js.Tuple2[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSuffixForArnEndpoint")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[String, String]]
  
  inline def isBucketNameOptions(options: ArnHostnameParams): /* is @aws-sdk/middleware-bucket-endpoint.@aws-sdk/middleware-bucket-endpoint/dist-types/bucketHostnameUtils.BucketHostnameParams */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBucketNameOptions")(options.asInstanceOf[js.Any]).asInstanceOf[/* is @aws-sdk/middleware-bucket-endpoint.@aws-sdk/middleware-bucket-endpoint/dist-types/bucketHostnameUtils.BucketHostnameParams */ Boolean]
  inline def isBucketNameOptions(options: BucketHostnameParams): /* is @aws-sdk/middleware-bucket-endpoint.@aws-sdk/middleware-bucket-endpoint/dist-types/bucketHostnameUtils.BucketHostnameParams */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBucketNameOptions")(options.asInstanceOf[js.Any]).asInstanceOf[/* is @aws-sdk/middleware-bucket-endpoint.@aws-sdk/middleware-bucket-endpoint/dist-types/bucketHostnameUtils.BucketHostnameParams */ Boolean]
  
  inline def isDnsCompatibleBucketName(bucketName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDnsCompatibleBucketName")(bucketName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def validateAccountId(accountId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateAccountId")(accountId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateArnEndpointOptions(options: AccelerateEndpoint): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateArnEndpointOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateCustomEndpoint(options: DualstackEndpoint): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateCustomEndpoint")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateDNSHostLabel(label: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateDNSHostLabel")(label.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def validateDNSHostLabel(label: String, options: TlsCompatible): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateDNSHostLabel")(label.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateMrapAlias(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateMrapAlias")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateNoDualstack(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateNoDualstack")().asInstanceOf[Unit]
  inline def validateNoDualstack(dualstackEndpoint: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateNoDualstack")(dualstackEndpoint.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateNoFIPS(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateNoFIPS")().asInstanceOf[Unit]
  inline def validateNoFIPS(useFipsEndpoint: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateNoFIPS")(useFipsEndpoint.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateOutpostService(service: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateOutpostService")(service.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validatePartition(partition: String, options: ClientPartition): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validatePartition")(partition.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateRegion(region: String, options: AllowFipsRegion): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateRegion")(region.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateRegionalClient(region: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateRegionalClient")(region.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateS3Service(service: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateS3Service")(service.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateService(service: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateService")(service.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait AccessPointArn
    extends StObject
       with ARN {
    
    var accessPointName: String
  }
  object AccessPointArn {
    
    inline def apply(
      accessPointName: String,
      accountId: String,
      partition: String,
      region: String,
      resource: String,
      service: String
    ): AccessPointArn = {
      val __obj = js.Dynamic.literal(accessPointName = accessPointName.asInstanceOf[js.Any], accountId = accountId.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessPointArn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccessPointArn] (val x: Self) extends AnyVal {
      
      inline def setAccessPointName(value: String): Self = StObject.set(x, "accessPointName", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Omit<@aws-sdk/middleware-bucket-endpoint.@aws-sdk/middleware-bucket-endpoint/dist-types/bucketHostnameUtils.BucketHostnameParams, 'bucketName'> */
  trait ArnHostnameParams extends StObject {
    
    var accelerateEndpoint: js.UndefOr[Boolean] = js.undefined
    
    var baseHostname: String
    
    var bucketName: ARN
    
    var clientPartition: js.UndefOr[String] = js.undefined
    
    var clientRegion: String
    
    var clientSigningRegion: js.UndefOr[String] = js.undefined
    
    var disableMultiregionAccessPoints: js.UndefOr[Boolean] = js.undefined
    
    var dualstackEndpoint: js.UndefOr[Boolean] = js.undefined
    
    var fipsEndpoint: js.UndefOr[Boolean] = js.undefined
    
    var isCustomEndpoint: js.UndefOr[Boolean] = js.undefined
    
    var pathStyleEndpoint: js.UndefOr[Boolean] = js.undefined
    
    var tlsCompatible: js.UndefOr[Boolean] = js.undefined
    
    var useArnRegion: js.UndefOr[Boolean] = js.undefined
  }
  object ArnHostnameParams {
    
    inline def apply(baseHostname: String, bucketName: ARN, clientRegion: String): ArnHostnameParams = {
      val __obj = js.Dynamic.literal(baseHostname = baseHostname.asInstanceOf[js.Any], bucketName = bucketName.asInstanceOf[js.Any], clientRegion = clientRegion.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArnHostnameParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArnHostnameParams] (val x: Self) extends AnyVal {
      
      inline def setAccelerateEndpoint(value: Boolean): Self = StObject.set(x, "accelerateEndpoint", value.asInstanceOf[js.Any])
      
      inline def setAccelerateEndpointUndefined: Self = StObject.set(x, "accelerateEndpoint", js.undefined)
      
      inline def setBaseHostname(value: String): Self = StObject.set(x, "baseHostname", value.asInstanceOf[js.Any])
      
      inline def setBucketName(value: ARN): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
      
      inline def setClientPartition(value: String): Self = StObject.set(x, "clientPartition", value.asInstanceOf[js.Any])
      
      inline def setClientPartitionUndefined: Self = StObject.set(x, "clientPartition", js.undefined)
      
      inline def setClientRegion(value: String): Self = StObject.set(x, "clientRegion", value.asInstanceOf[js.Any])
      
      inline def setClientSigningRegion(value: String): Self = StObject.set(x, "clientSigningRegion", value.asInstanceOf[js.Any])
      
      inline def setClientSigningRegionUndefined: Self = StObject.set(x, "clientSigningRegion", js.undefined)
      
      inline def setDisableMultiregionAccessPoints(value: Boolean): Self = StObject.set(x, "disableMultiregionAccessPoints", value.asInstanceOf[js.Any])
      
      inline def setDisableMultiregionAccessPointsUndefined: Self = StObject.set(x, "disableMultiregionAccessPoints", js.undefined)
      
      inline def setDualstackEndpoint(value: Boolean): Self = StObject.set(x, "dualstackEndpoint", value.asInstanceOf[js.Any])
      
      inline def setDualstackEndpointUndefined: Self = StObject.set(x, "dualstackEndpoint", js.undefined)
      
      inline def setFipsEndpoint(value: Boolean): Self = StObject.set(x, "fipsEndpoint", value.asInstanceOf[js.Any])
      
      inline def setFipsEndpointUndefined: Self = StObject.set(x, "fipsEndpoint", js.undefined)
      
      inline def setIsCustomEndpoint(value: Boolean): Self = StObject.set(x, "isCustomEndpoint", value.asInstanceOf[js.Any])
      
      inline def setIsCustomEndpointUndefined: Self = StObject.set(x, "isCustomEndpoint", js.undefined)
      
      inline def setPathStyleEndpoint(value: Boolean): Self = StObject.set(x, "pathStyleEndpoint", value.asInstanceOf[js.Any])
      
      inline def setPathStyleEndpointUndefined: Self = StObject.set(x, "pathStyleEndpoint", js.undefined)
      
      inline def setTlsCompatible(value: Boolean): Self = StObject.set(x, "tlsCompatible", value.asInstanceOf[js.Any])
      
      inline def setTlsCompatibleUndefined: Self = StObject.set(x, "tlsCompatible", js.undefined)
      
      inline def setUseArnRegion(value: Boolean): Self = StObject.set(x, "useArnRegion", value.asInstanceOf[js.Any])
      
      inline def setUseArnRegionUndefined: Self = StObject.set(x, "useArnRegion", js.undefined)
    }
  }
  
  trait BucketHostnameParams extends StObject {
    
    var accelerateEndpoint: js.UndefOr[Boolean] = js.undefined
    
    var baseHostname: String
    
    var bucketName: String
    
    var clientRegion: String
    
    var dualstackEndpoint: js.UndefOr[Boolean] = js.undefined
    
    var fipsEndpoint: js.UndefOr[Boolean] = js.undefined
    
    var isCustomEndpoint: js.UndefOr[Boolean] = js.undefined
    
    var pathStyleEndpoint: js.UndefOr[Boolean] = js.undefined
    
    var tlsCompatible: js.UndefOr[Boolean] = js.undefined
  }
  object BucketHostnameParams {
    
    inline def apply(baseHostname: String, bucketName: String, clientRegion: String): BucketHostnameParams = {
      val __obj = js.Dynamic.literal(baseHostname = baseHostname.asInstanceOf[js.Any], bucketName = bucketName.asInstanceOf[js.Any], clientRegion = clientRegion.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketHostnameParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BucketHostnameParams] (val x: Self) extends AnyVal {
      
      inline def setAccelerateEndpoint(value: Boolean): Self = StObject.set(x, "accelerateEndpoint", value.asInstanceOf[js.Any])
      
      inline def setAccelerateEndpointUndefined: Self = StObject.set(x, "accelerateEndpoint", js.undefined)
      
      inline def setBaseHostname(value: String): Self = StObject.set(x, "baseHostname", value.asInstanceOf[js.Any])
      
      inline def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
      
      inline def setClientRegion(value: String): Self = StObject.set(x, "clientRegion", value.asInstanceOf[js.Any])
      
      inline def setDualstackEndpoint(value: Boolean): Self = StObject.set(x, "dualstackEndpoint", value.asInstanceOf[js.Any])
      
      inline def setDualstackEndpointUndefined: Self = StObject.set(x, "dualstackEndpoint", js.undefined)
      
      inline def setFipsEndpoint(value: Boolean): Self = StObject.set(x, "fipsEndpoint", value.asInstanceOf[js.Any])
      
      inline def setFipsEndpointUndefined: Self = StObject.set(x, "fipsEndpoint", js.undefined)
      
      inline def setIsCustomEndpoint(value: Boolean): Self = StObject.set(x, "isCustomEndpoint", value.asInstanceOf[js.Any])
      
      inline def setIsCustomEndpointUndefined: Self = StObject.set(x, "isCustomEndpoint", js.undefined)
      
      inline def setPathStyleEndpoint(value: Boolean): Self = StObject.set(x, "pathStyleEndpoint", value.asInstanceOf[js.Any])
      
      inline def setPathStyleEndpointUndefined: Self = StObject.set(x, "pathStyleEndpoint", js.undefined)
      
      inline def setTlsCompatible(value: Boolean): Self = StObject.set(x, "tlsCompatible", value.asInstanceOf[js.Any])
      
      inline def setTlsCompatibleUndefined: Self = StObject.set(x, "tlsCompatible", js.undefined)
    }
  }
}
