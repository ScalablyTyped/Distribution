package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitGatewayRouteTable extends js.Object {
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[DateTime] = js.native
  /**
    * Indicates whether this is the default association route table for the transit gateway.
    */
  var DefaultAssociationRouteTable: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether this is the default propagation route table for the transit gateway.
    */
  var DefaultPropagationRouteTable: js.UndefOr[Boolean] = js.native
  /**
    * The state of the transit gateway route table.
    */
  var State: js.UndefOr[TransitGatewayRouteTableState] = js.native
  /**
    * Any tags assigned to the route table.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: js.UndefOr[String] = js.native
  /**
    * The ID of the transit gateway route table.
    */
  var TransitGatewayRouteTableId: js.UndefOr[String] = js.native
}

object TransitGatewayRouteTable {
  @scala.inline
  def apply(
    CreationTime: DateTime = null,
    DefaultAssociationRouteTable: js.UndefOr[scala.Boolean] = js.undefined,
    DefaultPropagationRouteTable: js.UndefOr[scala.Boolean] = js.undefined,
    State: TransitGatewayRouteTableState = null,
    Tags: TagList = null,
    TransitGatewayId: String = null,
    TransitGatewayRouteTableId: String = null
  ): TransitGatewayRouteTable = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (!js.isUndefined(DefaultAssociationRouteTable)) __obj.updateDynamic("DefaultAssociationRouteTable")(DefaultAssociationRouteTable.asInstanceOf[js.Any])
    if (!js.isUndefined(DefaultPropagationRouteTable)) __obj.updateDynamic("DefaultPropagationRouteTable")(DefaultPropagationRouteTable.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (TransitGatewayId != null) __obj.updateDynamic("TransitGatewayId")(TransitGatewayId.asInstanceOf[js.Any])
    if (TransitGatewayRouteTableId != null) __obj.updateDynamic("TransitGatewayRouteTableId")(TransitGatewayRouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitGatewayRouteTable]
  }
}

