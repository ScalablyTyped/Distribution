package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalGatewayRoute extends js.Object {
  /**
    * The CIDR block used for destination matches.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.native
  /**
    * The ID of the local gateway route table.
    */
  var LocalGatewayRouteTableId: js.UndefOr[LocalGatewayRoutetableId] = js.native
  /**
    * The ID of the virtual interface group.
    */
  var LocalGatewayVirtualInterfaceGroupId: js.UndefOr[typings.awsSdk.ec2Mod.LocalGatewayVirtualInterfaceGroupId] = js.native
  /**
    * The state of the route.
    */
  var State: js.UndefOr[LocalGatewayRouteState] = js.native
  /**
    * The route type.
    */
  var Type: js.UndefOr[LocalGatewayRouteType] = js.native
}

object LocalGatewayRoute {
  @scala.inline
  def apply(): LocalGatewayRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalGatewayRoute]
  }
  @scala.inline
  implicit class LocalGatewayRouteOps[Self <: LocalGatewayRoute] (val x: Self) extends AnyVal {
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
    def setDestinationCidrBlock(value: String): Self = this.set("DestinationCidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationCidrBlock: Self = this.set("DestinationCidrBlock", js.undefined)
    @scala.inline
    def setLocalGatewayRouteTableId(value: LocalGatewayRoutetableId): Self = this.set("LocalGatewayRouteTableId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalGatewayRouteTableId: Self = this.set("LocalGatewayRouteTableId", js.undefined)
    @scala.inline
    def setLocalGatewayVirtualInterfaceGroupId(value: LocalGatewayVirtualInterfaceGroupId): Self = this.set("LocalGatewayVirtualInterfaceGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalGatewayVirtualInterfaceGroupId: Self = this.set("LocalGatewayVirtualInterfaceGroupId", js.undefined)
    @scala.inline
    def setState(value: LocalGatewayRouteState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setType(value: LocalGatewayRouteType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

