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
  def apply(
    AttachTime: DateTime = null,
    AttachmentId: String = null,
    DeleteOnTermination: js.UndefOr[scala.Boolean] = js.undefined,
    DeviceIndex: Int | scala.Double = null,
    Status: AttachmentStatus = null
  ): InstanceNetworkInterfaceAttachment = {
    val __obj = js.Dynamic.literal()
    if (AttachTime != null) __obj.updateDynamic("AttachTime")(AttachTime.asInstanceOf[js.Any])
    if (AttachmentId != null) __obj.updateDynamic("AttachmentId")(AttachmentId.asInstanceOf[js.Any])
    if (!js.isUndefined(DeleteOnTermination)) __obj.updateDynamic("DeleteOnTermination")(DeleteOnTermination.asInstanceOf[js.Any])
    if (DeviceIndex != null) __obj.updateDynamic("DeviceIndex")(DeviceIndex.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceNetworkInterfaceAttachment]
  }
}

