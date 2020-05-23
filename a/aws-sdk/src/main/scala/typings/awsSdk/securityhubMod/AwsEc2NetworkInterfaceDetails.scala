package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsEc2NetworkInterfaceDetails extends js.Object {
  /**
    * The network interface attachment.
    */
  var Attachment: js.UndefOr[AwsEc2NetworkInterfaceAttachment] = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[NonEmptyString] = js.native
  /**
    * Security groups for the network interface.
    */
  var SecurityGroups: js.UndefOr[AwsEc2NetworkInterfaceSecurityGroupList] = js.native
  /**
    * Indicates whether traffic to or from the instance is validated.
    */
  var SourceDestCheck: js.UndefOr[Boolean] = js.native
}

object AwsEc2NetworkInterfaceDetails {
  @scala.inline
  def apply(
    Attachment: AwsEc2NetworkInterfaceAttachment = null,
    NetworkInterfaceId: NonEmptyString = null,
    SecurityGroups: AwsEc2NetworkInterfaceSecurityGroupList = null,
    SourceDestCheck: js.UndefOr[Boolean] = js.undefined
  ): AwsEc2NetworkInterfaceDetails = {
    val __obj = js.Dynamic.literal()
    if (Attachment != null) __obj.updateDynamic("Attachment")(Attachment.asInstanceOf[js.Any])
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId.asInstanceOf[js.Any])
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups.asInstanceOf[js.Any])
    if (!js.isUndefined(SourceDestCheck)) __obj.updateDynamic("SourceDestCheck")(SourceDestCheck.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsEc2NetworkInterfaceDetails]
  }
}

