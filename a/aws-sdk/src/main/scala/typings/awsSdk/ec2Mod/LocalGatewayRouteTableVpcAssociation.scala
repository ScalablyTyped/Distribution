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
  def apply(): LocalGatewayRouteTableVpcAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalGatewayRouteTableVpcAssociation]
  }
  @scala.inline
  implicit class LocalGatewayRouteTableVpcAssociationOps[Self <: LocalGatewayRouteTableVpcAssociation] (val x: Self) extends AnyVal {
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
    def setLocalGatewayId(value: String): Self = this.set("LocalGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalGatewayId: Self = this.set("LocalGatewayId", js.undefined)
    @scala.inline
    def setLocalGatewayRouteTableId(value: String): Self = this.set("LocalGatewayRouteTableId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalGatewayRouteTableId: Self = this.set("LocalGatewayRouteTableId", js.undefined)
    @scala.inline
    def setLocalGatewayRouteTableVpcAssociationId(value: LocalGatewayRouteTableVpcAssociationId): Self = this.set("LocalGatewayRouteTableVpcAssociationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalGatewayRouteTableVpcAssociationId: Self = this.set("LocalGatewayRouteTableVpcAssociationId", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
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

