package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceDetails extends StObject {
  
  /**
    * The Availability Zone of the EC2 instance.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * The profile information of the EC2 instance.
    */
  var IamInstanceProfile: js.UndefOr[typings.awsSdk.guarddutyMod.IamInstanceProfile] = js.native
  
  /**
    * The image description of the EC2 instance.
    */
  var ImageDescription: js.UndefOr[String] = js.native
  
  /**
    * The image ID of the EC2 instance.
    */
  var ImageId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the EC2 instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  
  /**
    * The state of the EC2 instance.
    */
  var InstanceState: js.UndefOr[String] = js.native
  
  /**
    * The type of the EC2 instance.
    */
  var InstanceType: js.UndefOr[String] = js.native
  
  /**
    * The launch time of the EC2 instance.
    */
  var LaunchTime: js.UndefOr[String] = js.native
  
  /**
    * The elastic network interface information of the EC2 instance.
    */
  var NetworkInterfaces: js.UndefOr[typings.awsSdk.guarddutyMod.NetworkInterfaces] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Outpost. Only applicable to AWS Outposts instances.
    */
  var OutpostArn: js.UndefOr[String] = js.native
  
  /**
    * The platform of the EC2 instance.
    */
  var Platform: js.UndefOr[String] = js.native
  
  /**
    * The product code of the EC2 instance.
    */
  var ProductCodes: js.UndefOr[typings.awsSdk.guarddutyMod.ProductCodes] = js.native
  
  /**
    * The tags of the EC2 instance.
    */
  var Tags: js.UndefOr[typings.awsSdk.guarddutyMod.Tags] = js.native
}
object InstanceDetails {
  
  @scala.inline
  def apply(): InstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceDetails]
  }
  
  @scala.inline
  implicit class InstanceDetailsMutableBuilder[Self <: InstanceDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setIamInstanceProfile(value: IamInstanceProfile): Self = StObject.set(x, "IamInstanceProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamInstanceProfileUndefined: Self = StObject.set(x, "IamInstanceProfile", js.undefined)
    
    @scala.inline
    def setImageDescription(value: String): Self = StObject.set(x, "ImageDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageDescriptionUndefined: Self = StObject.set(x, "ImageDescription", js.undefined)
    
    @scala.inline
    def setImageId(value: String): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setInstanceState(value: String): Self = StObject.set(x, "InstanceState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceStateUndefined: Self = StObject.set(x, "InstanceState", js.undefined)
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setLaunchTime(value: String): Self = StObject.set(x, "LaunchTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTimeUndefined: Self = StObject.set(x, "LaunchTime", js.undefined)
    
    @scala.inline
    def setNetworkInterfaces(value: NetworkInterfaces): Self = StObject.set(x, "NetworkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfacesUndefined: Self = StObject.set(x, "NetworkInterfaces", js.undefined)
    
    @scala.inline
    def setNetworkInterfacesVarargs(value: NetworkInterface*): Self = StObject.set(x, "NetworkInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setOutpostArn(value: String): Self = StObject.set(x, "OutpostArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutpostArnUndefined: Self = StObject.set(x, "OutpostArn", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
    
    @scala.inline
    def setProductCodes(value: ProductCodes): Self = StObject.set(x, "ProductCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductCodesUndefined: Self = StObject.set(x, "ProductCodes", js.undefined)
    
    @scala.inline
    def setProductCodesVarargs(value: ProductCode*): Self = StObject.set(x, "ProductCodes", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
