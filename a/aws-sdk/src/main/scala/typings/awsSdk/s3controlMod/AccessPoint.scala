package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessPoint extends StObject {
  
  /**
    * The ARN for the access point.
    */
  var AccessPointArn: js.UndefOr[S3AccessPointArn] = js.native
  
  /**
    * The name of the bucket associated with this access point.
    */
  var Bucket: BucketName = js.native
  
  /**
    * The name of this access point.
    */
  var Name: AccessPointName = js.native
  
  /**
    * Indicates whether this access point allows access from the public internet. If VpcConfiguration is specified for this access point, then NetworkOrigin is VPC, and the access point doesn't allow access from the public internet. Otherwise, NetworkOrigin is Internet, and the access point allows access from the public internet, subject to the access point and bucket access policies.
    */
  var NetworkOrigin: typings.awsSdk.s3controlMod.NetworkOrigin = js.native
  
  /**
    * The virtual private cloud (VPC) configuration for this access point, if one exists.
    */
  var VpcConfiguration: js.UndefOr[typings.awsSdk.s3controlMod.VpcConfiguration] = js.native
}
object AccessPoint {
  
  @scala.inline
  def apply(Bucket: BucketName, Name: AccessPointName, NetworkOrigin: NetworkOrigin): AccessPoint = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NetworkOrigin = NetworkOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessPoint]
  }
  
  @scala.inline
  implicit class AccessPointMutableBuilder[Self <: AccessPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessPointArn(value: S3AccessPointArn): Self = StObject.set(x, "AccessPointArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPointArnUndefined: Self = StObject.set(x, "AccessPointArn", js.undefined)
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: AccessPointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkOrigin(value: NetworkOrigin): Self = StObject.set(x, "NetworkOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfiguration(value: VpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigurationUndefined: Self = StObject.set(x, "VpcConfiguration", js.undefined)
  }
}
