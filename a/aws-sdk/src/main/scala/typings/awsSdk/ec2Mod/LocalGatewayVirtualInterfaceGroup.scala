package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalGatewayVirtualInterfaceGroup extends js.Object {
  /**
    * The ID of the local gateway.
    */
  var LocalGatewayId: js.UndefOr[String] = js.native
  /**
    * The ID of the virtual interface group.
    */
  var LocalGatewayVirtualInterfaceGroupId: js.UndefOr[typings.awsSdk.ec2Mod.LocalGatewayVirtualInterfaceGroupId] = js.native
  /**
    * The IDs of the virtual interfaces.
    */
  var LocalGatewayVirtualInterfaceIds: js.UndefOr[LocalGatewayVirtualInterfaceIdSet] = js.native
  /**
    * The tags assigned to the virtual interface group.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object LocalGatewayVirtualInterfaceGroup {
  @scala.inline
  def apply(
    LocalGatewayId: String = null,
    LocalGatewayVirtualInterfaceGroupId: LocalGatewayVirtualInterfaceGroupId = null,
    LocalGatewayVirtualInterfaceIds: LocalGatewayVirtualInterfaceIdSet = null,
    Tags: TagList = null
  ): LocalGatewayVirtualInterfaceGroup = {
    val __obj = js.Dynamic.literal()
    if (LocalGatewayId != null) __obj.updateDynamic("LocalGatewayId")(LocalGatewayId.asInstanceOf[js.Any])
    if (LocalGatewayVirtualInterfaceGroupId != null) __obj.updateDynamic("LocalGatewayVirtualInterfaceGroupId")(LocalGatewayVirtualInterfaceGroupId.asInstanceOf[js.Any])
    if (LocalGatewayVirtualInterfaceIds != null) __obj.updateDynamic("LocalGatewayVirtualInterfaceIds")(LocalGatewayVirtualInterfaceIds.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalGatewayVirtualInterfaceGroup]
  }
}

