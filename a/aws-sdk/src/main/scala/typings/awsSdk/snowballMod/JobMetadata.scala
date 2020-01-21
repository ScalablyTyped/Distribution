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
}

object JobMetadata {
  @scala.inline
  def apply(
    AddressId: AddressId = null,
    ClusterId: String = null,
    CreationDate: Timestamp = null,
    DataTransferProgress: DataTransfer = null,
    Description: String = null,
    ForwardingAddressId: AddressId = null,
    JobId: String = null,
    JobLogInfo: JobLogs = null,
    JobState: JobState = null,
    JobType: JobType = null,
    KmsKeyARN: KmsKeyARN = null,
    Notification: Notification = null,
    Resources: JobResource = null,
    RoleARN: RoleARN = null,
    ShippingDetails: ShippingDetails = null,
    SnowballCapacityPreference: SnowballCapacity = null,
    SnowballType: SnowballType = null
  ): JobMetadata = {
    val __obj = js.Dynamic.literal()
    if (AddressId != null) __obj.updateDynamic("AddressId")(AddressId.asInstanceOf[js.Any])
    if (ClusterId != null) __obj.updateDynamic("ClusterId")(ClusterId.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (DataTransferProgress != null) __obj.updateDynamic("DataTransferProgress")(DataTransferProgress.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ForwardingAddressId != null) __obj.updateDynamic("ForwardingAddressId")(ForwardingAddressId.asInstanceOf[js.Any])
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    if (JobLogInfo != null) __obj.updateDynamic("JobLogInfo")(JobLogInfo.asInstanceOf[js.Any])
    if (JobState != null) __obj.updateDynamic("JobState")(JobState.asInstanceOf[js.Any])
    if (JobType != null) __obj.updateDynamic("JobType")(JobType.asInstanceOf[js.Any])
    if (KmsKeyARN != null) __obj.updateDynamic("KmsKeyARN")(KmsKeyARN.asInstanceOf[js.Any])
    if (Notification != null) __obj.updateDynamic("Notification")(Notification.asInstanceOf[js.Any])
    if (Resources != null) __obj.updateDynamic("Resources")(Resources.asInstanceOf[js.Any])
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN.asInstanceOf[js.Any])
    if (ShippingDetails != null) __obj.updateDynamic("ShippingDetails")(ShippingDetails.asInstanceOf[js.Any])
    if (SnowballCapacityPreference != null) __obj.updateDynamic("SnowballCapacityPreference")(SnowballCapacityPreference.asInstanceOf[js.Any])
    if (SnowballType != null) __obj.updateDynamic("SnowballType")(SnowballType.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobMetadata]
  }
}

