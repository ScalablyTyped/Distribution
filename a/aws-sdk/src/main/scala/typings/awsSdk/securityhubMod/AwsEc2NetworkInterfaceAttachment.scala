package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsEc2NetworkInterfaceAttachment extends js.Object {
  /**
    * The timestamp indicating when the attachment initiated.
    */
  var AttachTime: js.UndefOr[NonEmptyString] = js.native
  /**
    * The identifier of the network interface attachment
    */
  var AttachmentId: js.UndefOr[NonEmptyString] = js.native
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
  var InstanceId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The AWS account ID of the owner of the instance.
    */
  var InstanceOwnerId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The attachment state. Valid values: attaching | attached | detaching | detached 
    */
  var Status: js.UndefOr[NonEmptyString] = js.native
}

object AwsEc2NetworkInterfaceAttachment {
  @scala.inline
  def apply(
    AttachTime: NonEmptyString = null,
    AttachmentId: NonEmptyString = null,
    DeleteOnTermination: js.UndefOr[Boolean] = js.undefined,
    DeviceIndex: js.UndefOr[Integer] = js.undefined,
    InstanceId: NonEmptyString = null,
    InstanceOwnerId: NonEmptyString = null,
    Status: NonEmptyString = null
  ): AwsEc2NetworkInterfaceAttachment = {
    val __obj = js.Dynamic.literal()
    if (AttachTime != null) __obj.updateDynamic("AttachTime")(AttachTime.asInstanceOf[js.Any])
    if (AttachmentId != null) __obj.updateDynamic("AttachmentId")(AttachmentId.asInstanceOf[js.Any])
    if (!js.isUndefined(DeleteOnTermination)) __obj.updateDynamic("DeleteOnTermination")(DeleteOnTermination.get.asInstanceOf[js.Any])
    if (!js.isUndefined(DeviceIndex)) __obj.updateDynamic("DeviceIndex")(DeviceIndex.get.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (InstanceOwnerId != null) __obj.updateDynamic("InstanceOwnerId")(InstanceOwnerId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsEc2NetworkInterfaceAttachment]
  }
}

