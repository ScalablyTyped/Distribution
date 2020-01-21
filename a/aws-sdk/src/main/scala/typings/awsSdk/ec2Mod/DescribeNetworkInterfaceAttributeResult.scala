package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNetworkInterfaceAttributeResult extends js.Object {
  /**
    * The attachment (if any) of the network interface.
    */
  var Attachment: js.UndefOr[NetworkInterfaceAttachment] = js.native
  /**
    * The description of the network interface.
    */
  var Description: js.UndefOr[AttributeValue] = js.native
  /**
    * The security groups associated with the network interface.
    */
  var Groups: js.UndefOr[GroupIdentifierList] = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
  /**
    * Indicates whether source/destination checking is enabled.
    */
  var SourceDestCheck: js.UndefOr[AttributeBooleanValue] = js.native
}

object DescribeNetworkInterfaceAttributeResult {
  @scala.inline
  def apply(
    Attachment: NetworkInterfaceAttachment = null,
    Description: AttributeValue = null,
    Groups: GroupIdentifierList = null,
    NetworkInterfaceId: String = null,
    SourceDestCheck: AttributeBooleanValue = null
  ): DescribeNetworkInterfaceAttributeResult = {
    val __obj = js.Dynamic.literal()
    if (Attachment != null) __obj.updateDynamic("Attachment")(Attachment.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Groups != null) __obj.updateDynamic("Groups")(Groups.asInstanceOf[js.Any])
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId.asInstanceOf[js.Any])
    if (SourceDestCheck != null) __obj.updateDynamic("SourceDestCheck")(SourceDestCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNetworkInterfaceAttributeResult]
  }
}

