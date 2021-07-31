package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessPointResult extends StObject {
  
  /**
    * The name of the bucket associated with the specified access point.
    */
  var Bucket: js.UndefOr[BucketName] = js.undefined
  
  /**
    * The date and time when the specified access point was created.
    */
  var CreationDate: js.UndefOr[typings.awsSdk.s3controlMod.CreationDate] = js.undefined
  
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
    * Contains the virtual private cloud (VPC) configuration for the specified access point.
    */
  var VpcConfiguration: js.UndefOr[typings.awsSdk.s3controlMod.VpcConfiguration] = js.undefined
}
object GetAccessPointResult {
  
  @scala.inline
  def apply(): GetAccessPointResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccessPointResult]
  }
  
  @scala.inline
  implicit class GetAccessPointResultMutableBuilder[Self <: GetAccessPointResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
    
    @scala.inline
    def setCreationDate(value: CreationDate): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setName(value: AccessPointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setNetworkOrigin(value: NetworkOrigin): Self = StObject.set(x, "NetworkOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkOriginUndefined: Self = StObject.set(x, "NetworkOrigin", js.undefined)
    
    @scala.inline
    def setPublicAccessBlockConfiguration(value: PublicAccessBlockConfiguration): Self = StObject.set(x, "PublicAccessBlockConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicAccessBlockConfigurationUndefined: Self = StObject.set(x, "PublicAccessBlockConfiguration", js.undefined)
    
    @scala.inline
    def setVpcConfiguration(value: VpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigurationUndefined: Self = StObject.set(x, "VpcConfiguration", js.undefined)
  }
}
