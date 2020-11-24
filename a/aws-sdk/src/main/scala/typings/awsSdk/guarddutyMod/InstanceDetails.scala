package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceDetails extends js.Object {
  
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
  implicit class InstanceDetailsOps[Self <: InstanceDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    
    @scala.inline
    def setIamInstanceProfile(value: IamInstanceProfile): Self = this.set("IamInstanceProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamInstanceProfile: Self = this.set("IamInstanceProfile", js.undefined)
    
    @scala.inline
    def setImageDescription(value: String): Self = this.set("ImageDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageDescription: Self = this.set("ImageDescription", js.undefined)
    
    @scala.inline
    def setImageId(value: String): Self = this.set("ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageId: Self = this.set("ImageId", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    
    @scala.inline
    def setInstanceState(value: String): Self = this.set("InstanceState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceState: Self = this.set("InstanceState", js.undefined)
    
    @scala.inline
    def setInstanceType(value: String): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    
    @scala.inline
    def setLaunchTime(value: String): Self = this.set("LaunchTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchTime: Self = this.set("LaunchTime", js.undefined)
    
    @scala.inline
    def setNetworkInterfacesVarargs(value: NetworkInterface*): Self = this.set("NetworkInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setNetworkInterfaces(value: NetworkInterfaces): Self = this.set("NetworkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterfaces: Self = this.set("NetworkInterfaces", js.undefined)
    
    @scala.inline
    def setOutpostArn(value: String): Self = this.set("OutpostArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutpostArn: Self = this.set("OutpostArn", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("Platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("Platform", js.undefined)
    
    @scala.inline
    def setProductCodesVarargs(value: ProductCode*): Self = this.set("ProductCodes", js.Array(value :_*))
    
    @scala.inline
    def setProductCodes(value: ProductCodes): Self = this.set("ProductCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductCodes: Self = this.set("ProductCodes", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
