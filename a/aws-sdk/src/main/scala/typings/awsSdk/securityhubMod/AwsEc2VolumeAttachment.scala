package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsEc2VolumeAttachment extends js.Object {
  /**
    * The datetime when the attachment initiated.
    */
  var AttachTime: js.UndefOr[NonEmptyString] = js.native
  /**
    * Whether the EBS volume is deleted when the EC2 instance is terminated.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.native
  /**
    * The identifier of the EC2 instance.
    */
  var InstanceId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The attachment state of the volume.
    */
  var Status: js.UndefOr[NonEmptyString] = js.native
}

object AwsEc2VolumeAttachment {
  @scala.inline
  def apply(): AwsEc2VolumeAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2VolumeAttachment]
  }
  @scala.inline
  implicit class AwsEc2VolumeAttachmentOps[Self <: AwsEc2VolumeAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttachTime(value: NonEmptyString): Self = this.set("AttachTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachTime: Self = this.set("AttachTime", js.undefined)
    @scala.inline
    def setDeleteOnTermination(value: Boolean): Self = this.set("DeleteOnTermination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteOnTermination: Self = this.set("DeleteOnTermination", js.undefined)
    @scala.inline
    def setInstanceId(value: NonEmptyString): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    @scala.inline
    def setStatus(value: NonEmptyString): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

