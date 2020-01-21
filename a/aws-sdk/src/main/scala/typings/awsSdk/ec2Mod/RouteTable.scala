package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteTable extends js.Object {
  /**
    * The associations between the route table and one or more subnets or a gateway.
    */
  var Associations: js.UndefOr[RouteTableAssociationList] = js.native
  /**
    * The ID of the AWS account that owns the route table.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * Any virtual private gateway (VGW) propagating routes.
    */
  var PropagatingVgws: js.UndefOr[PropagatingVgwList] = js.native
  /**
    * The ID of the route table.
    */
  var RouteTableId: js.UndefOr[String] = js.native
  /**
    * The routes in the route table.
    */
  var Routes: js.UndefOr[RouteList] = js.native
  /**
    * Any tags assigned to the route table.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object RouteTable {
  @scala.inline
  def apply(
    Associations: RouteTableAssociationList = null,
    OwnerId: String = null,
    PropagatingVgws: PropagatingVgwList = null,
    RouteTableId: String = null,
    Routes: RouteList = null,
    Tags: TagList = null,
    VpcId: String = null
  ): RouteTable = {
    val __obj = js.Dynamic.literal()
    if (Associations != null) __obj.updateDynamic("Associations")(Associations.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (PropagatingVgws != null) __obj.updateDynamic("PropagatingVgws")(PropagatingVgws.asInstanceOf[js.Any])
    if (RouteTableId != null) __obj.updateDynamic("RouteTableId")(RouteTableId.asInstanceOf[js.Any])
    if (Routes != null) __obj.updateDynamic("Routes")(Routes.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteTable]
  }
}

