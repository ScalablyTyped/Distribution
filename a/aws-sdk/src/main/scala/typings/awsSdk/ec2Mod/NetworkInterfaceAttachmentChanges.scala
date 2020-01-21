package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterfaceAttachmentChanges extends js.Object {
  /**
    * The ID of the network interface attachment.
    */
  var AttachmentId: js.UndefOr[String] = js.native
  /**
    * Indicates whether the network interface is deleted when the instance is terminated.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.native
}

object NetworkInterfaceAttachmentChanges {
  @scala.inline
  def apply(AttachmentId: String = null, DeleteOnTermination: js.UndefOr[scala.Boolean] = js.undefined): NetworkInterfaceAttachmentChanges = {
    val __obj = js.Dynamic.literal()
    if (AttachmentId != null) __obj.updateDynamic("AttachmentId")(AttachmentId.asInstanceOf[js.Any])
    if (!js.isUndefined(DeleteOnTermination)) __obj.updateDynamic("DeleteOnTermination")(DeleteOnTermination.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfaceAttachmentChanges]
  }
}

