package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceNetworkInterfaceAttachment extends js.Object {
  /**
    * The time stamp when the attachment initiated.
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
    * The index of the device on the instance for the network interface attachment.
    */
  var DeviceIndex: js.UndefOr[Integer] = js.native
  /**
    * The attachment state.
    */
  var Status: js.UndefOr[AttachmentStatus] = js.native
}

object InstanceNetworkInterfaceAttachment {
  @scala.inline
  def apply(): InstanceNetworkInterfaceAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceNetworkInterfaceAttachment]
  }
  @scala.inline
  implicit class InstanceNetworkInterfaceAttachmentOps[Self <: InstanceNetworkInterfaceAttachment] (val x: Self) extends AnyVal {
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
    def setStatus(value: AttachmentStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

