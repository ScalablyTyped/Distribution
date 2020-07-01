package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resource extends js.Object {
  /**
    * The IAM access key details (IAM user information) of a user that engaged in the activity that prompted GuardDuty to generate a finding.
    */
  var AccessKeyDetails: js.UndefOr[typings.awsSdk.guarddutyMod.AccessKeyDetails] = js.native
  /**
    * The information about the EC2 instance associated with the activity that prompted GuardDuty to generate a finding.
    */
  var InstanceDetails: js.UndefOr[typings.awsSdk.guarddutyMod.InstanceDetails] = js.native
  /**
    * The type of AWS resource.
    */
  var ResourceType: js.UndefOr[String] = js.native
  /**
    * Contains information on the S3 bucket.
    */
  var S3BucketDetails: js.UndefOr[typings.awsSdk.guarddutyMod.S3BucketDetails] = js.native
}

object Resource {
  @scala.inline
  def apply(
    AccessKeyDetails: AccessKeyDetails = null,
    InstanceDetails: InstanceDetails = null,
    ResourceType: String = null,
    S3BucketDetails: S3BucketDetails = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (AccessKeyDetails != null) __obj.updateDynamic("AccessKeyDetails")(AccessKeyDetails.asInstanceOf[js.Any])
    if (InstanceDetails != null) __obj.updateDynamic("InstanceDetails")(InstanceDetails.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (S3BucketDetails != null) __obj.updateDynamic("S3BucketDetails")(S3BucketDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
}

