package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalGatewayRouteTableVpcAssociation extends js.Object {
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
  var LocalGatewayRouteTableVpcAssociationId: js.UndefOr[typings.awsSdk.ec2Mod.LocalGatewayRouteTableVpcAssociationId] = js.native
  /**
    * The state of the association.
    */
  var State: js.UndefOr[String] = js.native
  /**
    * The tags assigned to the association.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object LocalGatewayRouteTableVpcAssociation {
  @scala.inline
  def apply(
    LocalGatewayId: String = null,
    LocalGatewayRouteTableId: String = null,
    LocalGatewayRouteTableVpcAssociationId: LocalGatewayRouteTableVpcAssociationId = null,
    State: String = null,
    Tags: TagList = null,
    VpcId: String = null
  ): LocalGatewayRouteTableVpcAssociation = {
    val __obj = js.Dynamic.literal()
    if (LocalGatewayId != null) __obj.updateDynamic("LocalGatewayId")(LocalGatewayId.asInstanceOf[js.Any])
    if (LocalGatewayRouteTableId != null) __obj.updateDynamic("LocalGatewayRouteTableId")(LocalGatewayRouteTableId.asInstanceOf[js.Any])
    if (LocalGatewayRouteTableVpcAssociationId != null) __obj.updateDynamic("LocalGatewayRouteTableVpcAssociationId")(LocalGatewayRouteTableVpcAssociationId.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalGatewayRouteTableVpcAssociation]
  }
}

