package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachNetworkInterfaceRequest extends js.Object {
  /**
    * The ID of the attachment.
    */
  var AttachmentId: NetworkInterfaceAttachmentId = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether to force a detachment.    Use the Force parameter only as a last resort to detach a network interface from a failed instance.    If you use the Force parameter to detach a network interface, you might not be able to attach a different network interface to the same index on the instance without first stopping and starting the instance.   If you force the detachment of a network interface, the instance metadata might not get updated. This means that the attributes associated with the detached network interface might still be visible. The instance metadata will get updated when you stop and start the instance.   
    */
  var Force: js.UndefOr[Boolean] = js.native
}

object DetachNetworkInterfaceRequest {
  @scala.inline
  def apply(
    AttachmentId: NetworkInterfaceAttachmentId,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Force: js.UndefOr[Boolean] = js.undefined
  ): DetachNetworkInterfaceRequest = {
    val __obj = js.Dynamic.literal(AttachmentId = AttachmentId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Force)) __obj.updateDynamic("Force")(Force.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachNetworkInterfaceRequest]
  }
}

