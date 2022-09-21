package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessPointResult extends StObject {
  
  /**
    * The ARN of the access point.
    */
  var AccessPointArn: js.UndefOr[S3AccessPointArn] = js.undefined
  
  /**
    * The name or alias of the access point.
    */
  var Alias: js.UndefOr[typings.awsSdk.s3controlMod.Alias] = js.undefined
  
  /**
    * The name of the bucket associated with the specified access point.
    */
  var Bucket: js.UndefOr[BucketName] = js.undefined
  
  /**
    * The date and time when the specified access point was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The VPC endpoint for the access point.
    */
  var Endpoints: js.UndefOr[typings.awsSdk.s3controlMod.Endpoints] = js.undefined
  
  /**
    * The name of the specified access point.
    */
  var Name: js.UndefOr[AccessPointName] = js.undefined
  
  /**
    * Indicates whether this access point allows access from the public internet. If VpcConfiguration is specified for this access point, then NetworkOrigin is VPC, and the access point doesn't allow access from the public internet. Otherwise, NetworkOrigin is Internet, and the access point allows access from the public internet, subject to the access point and bucket access policies. This will always be true for an Amazon S3 on Outposts access point
    */
  var NetworkOrigin: js.UndefOr[typings.awsSdk.s3controlMod.NetworkOrigin] = js.undefined
  
  var PublicAccessBlockConfiguration: js.UndefOr[typings.awsSdk.s3controlMod.PublicAccessBlockConfiguration] = js.undefined
  
  /**
    * Contains the virtual private cloud (VPC) configuration for the specified access point.  This element is empty if this access point is an Amazon S3 on Outposts access point that is used by other Amazon Web Services. 
    */
  var VpcConfiguration: js.UndefOr[typings.awsSdk.s3controlMod.VpcConfiguration] = js.undefined
}
object GetAccessPointResult {
  
  inline def apply(): GetAccessPointResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccessPointResult]
  }
  
  extension [Self <: GetAccessPointResult](x: Self) {
    
    inline def setAccessPointArn(value: S3AccessPointArn): Self = StObject.set(x, "AccessPointArn", value.asInstanceOf[js.Any])
    
    inline def setAccessPointArnUndefined: Self = StObject.set(x, "AccessPointArn", js.undefined)
    
    inline def setAlias(value: Alias): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "Alias", js.undefined)
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setEndpoints(value: Endpoints): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
    
    inline def setName(value: AccessPointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNetworkOrigin(value: NetworkOrigin): Self = StObject.set(x, "NetworkOrigin", value.asInstanceOf[js.Any])
    
    inline def setNetworkOriginUndefined: Self = StObject.set(x, "NetworkOrigin", js.undefined)
    
    inline def setPublicAccessBlockConfiguration(value: PublicAccessBlockConfiguration): Self = StObject.set(x, "PublicAccessBlockConfiguration", value.asInstanceOf[js.Any])
    
    inline def setPublicAccessBlockConfigurationUndefined: Self = StObject.set(x, "PublicAccessBlockConfiguration", js.undefined)
    
    inline def setVpcConfiguration(value: VpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationUndefined: Self = StObject.set(x, "VpcConfiguration", js.undefined)
  }
}
