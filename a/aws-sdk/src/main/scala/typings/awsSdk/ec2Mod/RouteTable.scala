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
  def apply(): RouteTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteTable]
  }
  @scala.inline
  implicit class RouteTableOps[Self <: RouteTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssociationsVarargs(value: RouteTableAssociation*): Self = this.set("Associations", js.Array(value :_*))
    @scala.inline
    def setAssociations(value: RouteTableAssociationList): Self = this.set("Associations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociations: Self = this.set("Associations", js.undefined)
    @scala.inline
    def setOwnerId(value: String): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    @scala.inline
    def setPropagatingVgwsVarargs(value: PropagatingVgw*): Self = this.set("PropagatingVgws", js.Array(value :_*))
    @scala.inline
    def setPropagatingVgws(value: PropagatingVgwList): Self = this.set("PropagatingVgws", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropagatingVgws: Self = this.set("PropagatingVgws", js.undefined)
    @scala.inline
    def setRouteTableId(value: String): Self = this.set("RouteTableId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouteTableId: Self = this.set("RouteTableId", js.undefined)
    @scala.inline
    def setRoutesVarargs(value: Route*): Self = this.set("Routes", js.Array(value :_*))
    @scala.inline
    def setRoutes(value: RouteList): Self = this.set("Routes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoutes: Self = this.set("Routes", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setVpcId(value: String): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
  
}

