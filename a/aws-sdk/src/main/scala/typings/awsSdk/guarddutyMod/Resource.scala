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
  def apply(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  implicit class ResourceOps[Self <: Resource] (val x: Self) extends AnyVal {
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
    def setAccessKeyDetails(value: AccessKeyDetails): Self = this.set("AccessKeyDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessKeyDetails: Self = this.set("AccessKeyDetails", js.undefined)
    @scala.inline
    def setInstanceDetails(value: InstanceDetails): Self = this.set("InstanceDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceDetails: Self = this.set("InstanceDetails", js.undefined)
    @scala.inline
    def setResourceType(value: String): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
    @scala.inline
    def setS3BucketDetailsVarargs(value: S3BucketDetail*): Self = this.set("S3BucketDetails", js.Array(value :_*))
    @scala.inline
    def setS3BucketDetails(value: S3BucketDetails): Self = this.set("S3BucketDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3BucketDetails: Self = this.set("S3BucketDetails", js.undefined)
  }
  
}

