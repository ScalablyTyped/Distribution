package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLocalGatewayRouteTableVpcAssociationResult extends js.Object {
  /**
    * Information about the association.
    */
  var LocalGatewayRouteTableVpcAssociation: js.UndefOr[typings.awsSdk.ec2Mod.LocalGatewayRouteTableVpcAssociation] = js.native
}

object CreateLocalGatewayRouteTableVpcAssociationResult {
  @scala.inline
  def apply(): CreateLocalGatewayRouteTableVpcAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocalGatewayRouteTableVpcAssociationResult]
  }
  @scala.inline
  implicit class CreateLocalGatewayRouteTableVpcAssociationResultOps[Self <: CreateLocalGatewayRouteTableVpcAssociationResult] (val x: Self) extends AnyVal {
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
    def setLocalGatewayRouteTableVpcAssociation(value: LocalGatewayRouteTableVpcAssociation): Self = this.set("LocalGatewayRouteTableVpcAssociation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalGatewayRouteTableVpcAssociation: Self = this.set("LocalGatewayRouteTableVpcAssociation", js.undefined)
  }
  
}

