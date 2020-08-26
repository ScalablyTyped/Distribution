package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterfaceAttachment extends js.Object {
  /**
    * The timestamp indicating when the attachment initiated.
    */
  var AttachTime: js.UndefOr[DateTime] = js.native
  /**
    * The ID of the network interface attachment.
    */
  var AttachmentId: js.UndefOr[String] = js.native
  /**
    * Indicates whether the network interface is deleted when the instance is terminated.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.native
  /**
    * The device index of the network interface attachment on the instance.
    */
  var DeviceIndex: js.UndefOr[Integer] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The AWS account ID of the owner of the instance.
    */
  var InstanceOwnerId: js.UndefOr[String] = js.native
  /**
    * The attachment state.
    */
  var Status: js.UndefOr[AttachmentStatus] = js.native
}

object NetworkInterfaceAttachment {
  @scala.inline
  def apply(): NetworkInterfaceAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterfaceAttachment]
  }
  @scala.inline
  implicit class NetworkInterfaceAttachmentOps[Self <: NetworkInterfaceAttachment] (val x: Self) extends AnyVal {
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
    def setAttachTime(value: DateTime): Self = this.set("AttachTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachTime: Self = this.set("AttachTime", js.undefined)
    @scala.inline
    def setAttachmentId(value: String): Self = this.set("AttachmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachmentId: Self = this.set("AttachmentId", js.undefined)
    @scala.inline
    def setDeleteOnTermination(value: Boolean): Self = this.set("DeleteOnTermination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteOnTermination: Self = this.set("DeleteOnTermination", js.undefined)
    @scala.inline
    def setDeviceIndex(value: Integer): Self = this.set("DeviceIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceIndex: Self = this.set("DeviceIndex", js.undefined)
    @scala.inline
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    @scala.inline
    def setInstanceOwnerId(value: String): Self = this.set("InstanceOwnerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceOwnerId: Self = this.set("InstanceOwnerId", js.undefined)
    @scala.inline
    def setStatus(value: AttachmentStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

