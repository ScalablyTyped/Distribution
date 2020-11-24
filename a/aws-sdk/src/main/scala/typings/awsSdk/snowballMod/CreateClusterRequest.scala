package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateClusterRequest extends js.Object {
  
  /**
    * The ID for the address that you want the cluster shipped to.
    */
  var AddressId: typings.awsSdk.snowballMod.AddressId = js.native
  
  /**
    * An optional description of this specific cluster, for example Environmental Data Cluster-01.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The forwarding address ID for a cluster. This field is not supported in most regions.
    */
  var ForwardingAddressId: js.UndefOr[AddressId] = js.native
  
  /**
    * The type of job for this cluster. Currently, the only job type supported for clusters is LOCAL_USE.
    */
  var JobType: typings.awsSdk.snowballMod.JobType = js.native
  
  /**
    * The KmsKeyARN value that you want to associate with this cluster. KmsKeyARN values are created by using the CreateKey API action in AWS Key Management Service (AWS KMS). 
    */
  var KmsKeyARN: js.UndefOr[typings.awsSdk.snowballMod.KmsKeyARN] = js.native
  
  /**
    * The Amazon Simple Notification Service (Amazon SNS) notification settings for this cluster.
    */
  var Notification: js.UndefOr[typings.awsSdk.snowballMod.Notification] = js.native
  
  /**
    * The resources associated with the cluster job. These resources include Amazon S3 buckets and optional AWS Lambda functions written in the Python language. 
    */
  var Resources: JobResource = js.native
  
  /**
    * The RoleARN that you want to associate with this cluster. RoleArn values are created by using the CreateRole API action in AWS Identity and Access Management (IAM).
    */
  var RoleARN: typings.awsSdk.snowballMod.RoleARN = js.native
  
  /**
    * The shipping speed for each node in this cluster. This speed doesn't dictate how soon you'll get each Snowball Edge device, rather it represents how quickly each device moves to its destination while in transit. Regional shipping speeds are as follows:    In Australia, you have access to express shipping. Typically, Snow devices shipped express are delivered in about a day.   In the European Union (EU), you have access to express shipping. Typically, Snow devices shipped express are delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically takes less than a week, one way.   In India, Snow device are delivered in one to seven days.   In the United States of America (US), you have access to one-day shipping and two-day shipping.     In Australia, you have access to express shipping. Typically, devices shipped express are delivered in about a day.   In the European Union (EU), you have access to express shipping. Typically, Snow devices shipped express are delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically takes less than a week, one way.   In India, Snow device are delivered in one to seven days.   In the US, you have access to one-day shipping and two-day shipping.  
    */
  var ShippingOption: typings.awsSdk.snowballMod.ShippingOption = js.native
  
  /**
    * The type of AWS Snow Family device to use for this cluster.   For cluster jobs, AWS Snow Family currently supports only the EDGE device type. 
    */
  var SnowballType: js.UndefOr[typings.awsSdk.snowballMod.SnowballType] = js.native
  
  /**
    * The tax documents required in your AWS Region.
    */
  var TaxDocuments: js.UndefOr[typings.awsSdk.snowballMod.TaxDocuments] = js.native
}
object CreateClusterRequest {
  
  @scala.inline
  def apply(
    AddressId: AddressId,
    JobType: JobType,
    Resources: JobResource,
    RoleARN: RoleARN,
    ShippingOption: ShippingOption
  ): CreateClusterRequest = {
    val __obj = js.Dynamic.literal(AddressId = AddressId.asInstanceOf[js.Any], JobType = JobType.asInstanceOf[js.Any], Resources = Resources.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any], ShippingOption = ShippingOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterRequest]
  }
  
  @scala.inline
  implicit class CreateClusterRequestOps[Self <: CreateClusterRequest] (val x: Self) extends AnyVal {
    
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
    def setAddressId(value: AddressId): Self = this.set("AddressId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobType(value: JobType): Self = this.set("JobType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResources(value: JobResource): Self = this.set("Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleARN(value: RoleARN): Self = this.set("RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingOption(value: ShippingOption): Self = this.set("ShippingOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setForwardingAddressId(value: AddressId): Self = this.set("ForwardingAddressId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardingAddressId: Self = this.set("ForwardingAddressId", js.undefined)
    
    @scala.inline
    def setKmsKeyARN(value: KmsKeyARN): Self = this.set("KmsKeyARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyARN: Self = this.set("KmsKeyARN", js.undefined)
    
    @scala.inline
    def setNotification(value: Notification): Self = this.set("Notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotification: Self = this.set("Notification", js.undefined)
    
    @scala.inline
    def setSnowballType(value: SnowballType): Self = this.set("SnowballType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnowballType: Self = this.set("SnowballType", js.undefined)
    
    @scala.inline
    def setTaxDocuments(value: TaxDocuments): Self = this.set("TaxDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaxDocuments: Self = this.set("TaxDocuments", js.undefined)
  }
}
