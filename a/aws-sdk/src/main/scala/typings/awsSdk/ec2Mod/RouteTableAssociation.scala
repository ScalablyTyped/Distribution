package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteTableAssociation extends js.Object {
  /**
    * The state of the association.
    */
  var AssociationState: js.UndefOr[RouteTableAssociationState] = js.native
  /**
    * The ID of the internet gateway or virtual private gateway.
    */
  var GatewayId: js.UndefOr[String] = js.native
  /**
    * Indicates whether this is the main route table.
    */
  var Main: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the association.
    */
  var RouteTableAssociationId: js.UndefOr[String] = js.native
  /**
    * The ID of the route table.
    */
  var RouteTableId: js.UndefOr[String] = js.native
  /**
    * The ID of the subnet. A subnet ID is not returned for an implicit association.
    */
  var SubnetId: js.UndefOr[String] = js.native
}

object RouteTableAssociation {
  @scala.inline
  def apply(
    AssociationState: RouteTableAssociationState = null,
    GatewayId: String = null,
    Main: js.UndefOr[scala.Boolean] = js.undefined,
    RouteTableAssociationId: String = null,
    RouteTableId: String = null,
    SubnetId: String = null
  ): RouteTableAssociation = {
    val __obj = js.Dynamic.literal()
    if (AssociationState != null) __obj.updateDynamic("AssociationState")(AssociationState.asInstanceOf[js.Any])
    if (GatewayId != null) __obj.updateDynamic("GatewayId")(GatewayId.asInstanceOf[js.Any])
    if (!js.isUndefined(Main)) __obj.updateDynamic("Main")(Main.asInstanceOf[js.Any])
    if (RouteTableAssociationId != null) __obj.updateDynamic("RouteTableAssociationId")(RouteTableAssociationId.asInstanceOf[js.Any])
    if (RouteTableId != null) __obj.updateDynamic("RouteTableId")(RouteTableId.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteTableAssociation]
  }
}

