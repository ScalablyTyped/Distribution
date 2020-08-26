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
  var LocalGatewayRouteTableId: js.UndefOr[LocalGatewayId] = js.native
  /**
    * The ID of the association.
    */
  var LocalGatewayRouteTableVirtualInterfaceGroupAssociationId: js.UndefOr[typings.awsSdk.ec2Mod.LocalGatewayRouteTableVirtualInterfaceGroupAssociationId] = js.native
  /**
    * The ID of the virtual interface group.
    */
  var LocalGatewayVirtualInterfaceGroupId: js.UndefOr[typings.awsSdk.ec2Mod.LocalGatewayVirtualInterfaceGroupId] = js.native
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
  def apply(): LocalGatewayRouteTableVirtualInterfaceGroupAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalGatewayRouteTableVirtualInterfaceGroupAssociation]
  }
  @scala.inline
  implicit class LocalGatewayRouteTableVirtualInterfaceGroupAssociationOps[Self <: LocalGatewayRouteTableVirtualInterfaceGroupAssociation] (val x: Self) extends AnyVal {
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
    def setLocalGatewayRouteTableId(value: LocalGatewayId): Self = this.set("LocalGatewayRouteTableId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalGatewayRouteTableId: Self = this.set("LocalGatewayRouteTableId", js.undefined)
    @scala.inline
    def setLocalGatewayRouteTableVirtualInterfaceGroupAssociationId(value: LocalGatewayRouteTableVirtualInterfaceGroupAssociationId): Self = this.set("LocalGatewayRouteTableVirtualInterfaceGroupAssociationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalGatewayRouteTableVirtualInterfaceGroupAssociationId: Self = this.set("LocalGatewayRouteTableVirtualInterfaceGroupAssociationId", js.undefined)
    @scala.inline
    def setLocalGatewayVirtualInterfaceGroupId(value: LocalGatewayVirtualInterfaceGroupId): Self = this.set("LocalGatewayVirtualInterfaceGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalGatewayVirtualInterfaceGroupId: Self = this.set("LocalGatewayVirtualInterfaceGroupId", js.undefined)
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
  }
  
}

