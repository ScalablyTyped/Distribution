package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterMetadata extends js.Object {
  
  /**
    * The automatically generated ID for a specific address.
    */
  var AddressId: js.UndefOr[typings.awsSdk.snowballMod.AddressId] = js.native
  
  /**
    * The automatically generated ID for a cluster.
    */
  var ClusterId: js.UndefOr[String] = js.native
  
  /**
    * The current status of the cluster.
    */
  var ClusterState: js.UndefOr[typings.awsSdk.snowballMod.ClusterState] = js.native
  
  /**
    * The creation date for this cluster.
    */
  var CreationDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The optional description of the cluster.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The ID of the address that you want a cluster shipped to, after it will be shipped to its primary address. This field is not supported in most regions.
    */
  var ForwardingAddressId: js.UndefOr[AddressId] = js.native
  
  /**
    * The type of job for this cluster. Currently, the only job type supported for clusters is LOCAL_USE.
    */
  var JobType: js.UndefOr[typings.awsSdk.snowballMod.JobType] = js.native
  
  /**
    * The KmsKeyARN Amazon Resource Name (ARN) associated with this cluster. This ARN was created using the CreateKey API action in AWS Key Management Service (AWS KMS).
    */
  var KmsKeyARN: js.UndefOr[typings.awsSdk.snowballMod.KmsKeyARN] = js.native
  
  /**
    * The Amazon Simple Notification Service (Amazon SNS) notification settings for this cluster.
    */
  var Notification: js.UndefOr[typings.awsSdk.snowballMod.Notification] = js.native
  
  /**
    * The arrays of JobResource objects that can include updated S3Resource objects or LambdaResource objects.
    */
  var Resources: js.UndefOr[JobResource] = js.native
  
  /**
    * The role ARN associated with this cluster. This ARN was created using the CreateRole API action in AWS Identity and Access Management (IAM).
    */
  var RoleARN: js.UndefOr[typings.awsSdk.snowballMod.RoleARN] = js.native
  
  /**
    * The shipping speed for each node in this cluster. This speed doesn't dictate how soon you'll get each device, rather it represents how quickly each device moves to its destination while in transit. Regional shipping speeds are as follows:   In Australia, you have access to express shipping. Typically, devices shipped express are delivered in about a day.   In the European Union (EU), you have access to express shipping. Typically, Snow devices shipped express are delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically takes less than a week, one way.   In India, Snow devices are delivered in one to seven days.   In the US, you have access to one-day shipping and two-day shipping.  
    */
  var ShippingOption: js.UndefOr[typings.awsSdk.snowballMod.ShippingOption] = js.native
  
  /**
    * The type of AWS Snow device to use for this cluster.   For cluster jobs, AWS Snow Family currently supports only the EDGE device type. 
    */
  var SnowballType: js.UndefOr[typings.awsSdk.snowballMod.SnowballType] = js.native
  
  /**
    * The tax documents required in your AWS Region.
    */
  var TaxDocuments: js.UndefOr[typings.awsSdk.snowballMod.TaxDocuments] = js.native
}
object ClusterMetadata {
  
  @scala.inline
  def apply(): ClusterMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterMetadata]
  }
  
  @scala.inline
  implicit class ClusterMetadataOps[Self <: ClusterMetadata] (val x: Self) extends AnyVal {
    
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
    def deleteAddressId: Self = this.set("AddressId", js.undefined)
    
    @scala.inline
    def setClusterId(value: String): Self = this.set("ClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterId: Self = this.set("ClusterId", js.undefined)
    
    @scala.inline
    def setClusterState(value: ClusterState): Self = this.set("ClusterState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterState: Self = this.set("ClusterState", js.undefined)
    
    @scala.inline
    def setCreationDate(value: Timestamp): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setForwardingAddressId(value: AddressId): Self = this.set("ForwardingAddressId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardingAddressId: Self = this.set("ForwardingAddressId", js.undefined)
    
    @scala.inline
    def setJobType(value: JobType): Self = this.set("JobType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobType: Self = this.set("JobType", js.undefined)
    
    @scala.inline
    def setKmsKeyARN(value: KmsKeyARN): Self = this.set("KmsKeyARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyARN: Self = this.set("KmsKeyARN", js.undefined)
    
    @scala.inline
    def setNotification(value: Notification): Self = this.set("Notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotification: Self = this.set("Notification", js.undefined)
    
    @scala.inline
    def setResources(value: JobResource): Self = this.set("Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("Resources", js.undefined)
    
    @scala.inline
    def setRoleARN(value: RoleARN): Self = this.set("RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleARN: Self = this.set("RoleARN", js.undefined)
    
    @scala.inline
    def setShippingOption(value: ShippingOption): Self = this.set("ShippingOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingOption: Self = this.set("ShippingOption", js.undefined)
    
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
