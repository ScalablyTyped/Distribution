package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobRequest extends js.Object {
  /**
    * The ID for the address that you want the Snowball shipped to.
    */
  var AddressId: js.UndefOr[typings.awsSdk.snowballMod.AddressId] = js.native
  /**
    * The ID of a cluster. If you're creating a job for a node in a cluster, you need to provide only this clusterId value. The other job attributes are inherited from the cluster.
    */
  var ClusterId: js.UndefOr[typings.awsSdk.snowballMod.ClusterId] = js.native
  /**
    * Defines an optional description of this specific job, for example Important Photos 2016-08-11.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Defines the device configuration for an AWS Snowcone job.
    */
  var DeviceConfiguration: js.UndefOr[typings.awsSdk.snowballMod.DeviceConfiguration] = js.native
  /**
    * The forwarding address ID for a job. This field is not supported in most regions.
    */
  var ForwardingAddressId: js.UndefOr[AddressId] = js.native
  /**
    * Defines the type of job that you're creating. 
    */
  var JobType: js.UndefOr[typings.awsSdk.snowballMod.JobType] = js.native
  /**
    * The KmsKeyARN that you want to associate with this job. KmsKeyARNs are created using the CreateKey AWS Key Management Service (KMS) API action.
    */
  var KmsKeyARN: js.UndefOr[typings.awsSdk.snowballMod.KmsKeyARN] = js.native
  /**
    * Defines the Amazon Simple Notification Service (Amazon SNS) notification settings for this job.
    */
  var Notification: js.UndefOr[typings.awsSdk.snowballMod.Notification] = js.native
  /**
    * Defines the Amazon S3 buckets associated with this job. With IMPORT jobs, you specify the bucket or buckets that your transferred data will be imported into. With EXPORT jobs, you specify the bucket or buckets that your transferred data will be exported from. Optionally, you can also specify a KeyRange value. If you choose to export a range, you define the length of the range by providing either an inclusive BeginMarker value, an inclusive EndMarker value, or both. Ranges are UTF-8 binary sorted.
    */
  var Resources: js.UndefOr[JobResource] = js.native
  /**
    * The RoleARN that you want to associate with this job. RoleArns are created using the CreateRole AWS Identity and Access Management (IAM) API action.
    */
  var RoleARN: js.UndefOr[typings.awsSdk.snowballMod.RoleARN] = js.native
  /**
    * The shipping speed for this job. This speed doesn't dictate how soon you'll get the Snowball, rather it represents how quickly the Snowball moves to its destination while in transit. Regional shipping speeds are as follows:   In Australia, you have access to express shipping. Typically, Snowballs shipped express are delivered in about a day.   In the European Union (EU), you have access to express shipping. Typically, Snowballs shipped express are delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically takes less than a week, one way.   In India, Snowballs are delivered in one to seven days.   In the US, you have access to one-day shipping and two-day shipping.  
    */
  var ShippingOption: js.UndefOr[typings.awsSdk.snowballMod.ShippingOption] = js.native
  /**
    * If your job is being created in one of the US regions, you have the option of specifying what size Snowball you'd like for this job. In all other regions, Snowballs come with 80 TB in storage capacity.
    */
  var SnowballCapacityPreference: js.UndefOr[SnowballCapacity] = js.native
  /**
    * The type of AWS Snowball device to use for this job.   For cluster jobs, AWS Snowball currently supports only the EDGE device type.  The type of AWS Snowball device to use for this job. Currently, the only supported device type for cluster jobs is EDGE. For more information, see Snowball Edge Device Options in the Snowball Edge Developer Guide.
    */
  var SnowballType: js.UndefOr[typings.awsSdk.snowballMod.SnowballType] = js.native
  /**
    * The tax documents required in your AWS Region.
    */
  var TaxDocuments: js.UndefOr[typings.awsSdk.snowballMod.TaxDocuments] = js.native
}

object CreateJobRequest {
  @scala.inline
  def apply(): CreateJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateJobRequest]
  }
  @scala.inline
  implicit class CreateJobRequestOps[Self <: CreateJobRequest] (val x: Self) extends AnyVal {
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
    def setClusterId(value: ClusterId): Self = this.set("ClusterId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterId: Self = this.set("ClusterId", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDeviceConfiguration(value: DeviceConfiguration): Self = this.set("DeviceConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceConfiguration: Self = this.set("DeviceConfiguration", js.undefined)
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
    def setSnowballCapacityPreference(value: SnowballCapacity): Self = this.set("SnowballCapacityPreference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnowballCapacityPreference: Self = this.set("SnowballCapacityPreference", js.undefined)
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

