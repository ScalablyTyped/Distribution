package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobMetadata extends js.Object {
  /**
    * The ID for the address that you want the Snowball shipped to.
    */
  var AddressId: js.UndefOr[typings.awsSdk.snowballMod.AddressId] = js.native
  /**
    * The 39-character ID for the cluster, for example CID123e4567-e89b-12d3-a456-426655440000.
    */
  var ClusterId: js.UndefOr[String] = js.native
  /**
    * The creation date for this job.
    */
  var CreationDate: js.UndefOr[Timestamp] = js.native
  /**
    * A value that defines the real-time status of a Snowball's data transfer while the device is at AWS. This data is only available while a job has a JobState value of InProgress, for both import and export jobs.
    */
  var DataTransferProgress: js.UndefOr[DataTransfer] = js.native
  /**
    * The description of the job, provided at job creation.
    */
  var Description: js.UndefOr[String] = js.native
  var DeviceConfiguration: js.UndefOr[typings.awsSdk.snowballMod.DeviceConfiguration] = js.native
  /**
    * The ID of the address that you want a job shipped to, after it will be shipped to its primary address. This field is not supported in most regions.
    */
  var ForwardingAddressId: js.UndefOr[AddressId] = js.native
  /**
    * The automatically generated ID for a job, for example JID123e4567-e89b-12d3-a456-426655440000.
    */
  var JobId: js.UndefOr[String] = js.native
  /**
    * Links to Amazon S3 presigned URLs for the job report and logs. For import jobs, the PDF job report becomes available at the end of the import process. For export jobs, your job report typically becomes available while the Snowball for your job part is being delivered to you.
    */
  var JobLogInfo: js.UndefOr[JobLogs] = js.native
  /**
    * The current status of the jobs.
    */
  var JobState: js.UndefOr[typings.awsSdk.snowballMod.JobState] = js.native
  /**
    * The type of job.
    */
  var JobType: js.UndefOr[typings.awsSdk.snowballMod.JobType] = js.native
  /**
    * The Amazon Resource Name (ARN) for the AWS Key Management Service (AWS KMS) key associated with this job. This ARN was created using the CreateKey API action in AWS KMS.
    */
  var KmsKeyARN: js.UndefOr[typings.awsSdk.snowballMod.KmsKeyARN] = js.native
  /**
    * The Amazon Simple Notification Service (Amazon SNS) notification settings associated with a specific job. The Notification object is returned as a part of the response syntax of the DescribeJob action in the JobMetadata data type.
    */
  var Notification: js.UndefOr[typings.awsSdk.snowballMod.Notification] = js.native
  /**
    * An array of S3Resource objects. Each S3Resource object represents an Amazon S3 bucket that your transferred data will be exported from or imported into.
    */
  var Resources: js.UndefOr[JobResource] = js.native
  /**
    * The role ARN associated with this job. This ARN was created using the CreateRole API action in AWS Identity and Access Management (IAM).
    */
  var RoleARN: js.UndefOr[typings.awsSdk.snowballMod.RoleARN] = js.native
  /**
    * A job's shipping information, including inbound and outbound tracking numbers and shipping speed options.
    */
  var ShippingDetails: js.UndefOr[typings.awsSdk.snowballMod.ShippingDetails] = js.native
  /**
    * The Snowball capacity preference for this job, specified at job creation. In US regions, you can choose between 50 TB and 80 TB Snowballs. All other regions use 80 TB capacity Snowballs.
    */
  var SnowballCapacityPreference: js.UndefOr[SnowballCapacity] = js.native
  /**
    * The type of device used with this job.
    */
  var SnowballType: js.UndefOr[typings.awsSdk.snowballMod.SnowballType] = js.native
  /**
    * The metadata associated with the tax documents required in your AWS Region.
    */
  var TaxDocuments: js.UndefOr[typings.awsSdk.snowballMod.TaxDocuments] = js.native
}

object JobMetadata {
  @scala.inline
  def apply(): JobMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobMetadata]
  }
  @scala.inline
  implicit class JobMetadataOps[Self <: JobMetadata] (val x: Self) extends AnyVal {
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
    def setCreationDate(value: Timestamp): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setDataTransferProgress(value: DataTransfer): Self = this.set("DataTransferProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTransferProgress: Self = this.set("DataTransferProgress", js.undefined)
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
    def setJobId(value: String): Self = this.set("JobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobId: Self = this.set("JobId", js.undefined)
    @scala.inline
    def setJobLogInfo(value: JobLogs): Self = this.set("JobLogInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobLogInfo: Self = this.set("JobLogInfo", js.undefined)
    @scala.inline
    def setJobState(value: JobState): Self = this.set("JobState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobState: Self = this.set("JobState", js.undefined)
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
    def setShippingDetails(value: ShippingDetails): Self = this.set("ShippingDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShippingDetails: Self = this.set("ShippingDetails", js.undefined)
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

