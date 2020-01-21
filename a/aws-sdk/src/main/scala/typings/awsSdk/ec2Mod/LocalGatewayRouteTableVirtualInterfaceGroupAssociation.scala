package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalGatewayRouteTableVirtualInterfaceGroupAssociation extends js.Object {
  /**
    * The ID of the local gateway.
    */
  var LocalGatewayId: js.UndefOr[String] = js.native
  /**
    * The ID of the local gateway route table.
    */
  var LocalGatewayRouteTableId: js.UndefOr[String] = js.native
  /**
    * The ID of the association.
    */
  var LocalGatewayRouteTableVirtualInterfaceGroupAssociationId: js.UndefOr[String] = js.native
  /**
    * The ID of the virtual interface group.
    */
  var LocalGatewayVirtualInterfaceGroupId: js.UndefOr[String] = js.native
  /**
    * The state of the association.
    */
  var State: js.UndefOr[String] = js.native
  /**
    * The tags assigned to the association.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object LocalGatewayRouteTableVirtualInterfaceGroupAssociation {
  @scala.inline
  def apply(
    LocalGatewayId: String = null,
    LocalGatewayRouteTableId: String = null,
    LocalGatewayRouteTableVirtualInterfaceGroupAssociationId: String = null,
    LocalGatewayVirtualInterfaceGroupId: String = null,
    State: String = null,
    Tags: TagList = null
  ): LocalGatewayRouteTableVirtualInterfaceGroupAssociation = {
    val __obj = js.Dynamic.literal()
    if (LocalGatewayId != null) __obj.updateDynamic("LocalGatewayId")(LocalGatewayId.asInstanceOf[js.Any])
    if (LocalGatewayRouteTableId != null) __obj.updateDynamic("LocalGatewayRouteTableId")(LocalGatewayRouteTableId.asInstanceOf[js.Any])
    if (LocalGatewayRouteTableVirtualInterfaceGroupAssociationId != null) __obj.updateDynamic("LocalGatewayRouteTableVirtualInterfaceGroupAssociationId")(LocalGatewayRouteTableVirtualInterfaceGroupAssociationId.asInstanceOf[js.Any])
    if (LocalGatewayVirtualInterfaceGroupId != null) __obj.updateDynamic("LocalGatewayVirtualInterfaceGroupId")(LocalGatewayVirtualInterfaceGroupId.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalGatewayRouteTableVirtualInterfaceGroupAssociation]
  }
}

