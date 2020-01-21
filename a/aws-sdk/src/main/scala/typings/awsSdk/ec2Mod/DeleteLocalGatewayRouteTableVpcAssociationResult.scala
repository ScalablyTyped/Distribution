package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLocalGatewayRouteTableVpcAssociationResult extends js.Object {
  /**
    * Information about the association.
    */
  var LocalGatewayRouteTableVpcAssociation: js.UndefOr[typings.awsSdk.ec2Mod.LocalGatewayRouteTableVpcAssociation] = js.native
}

object DeleteLocalGatewayRouteTableVpcAssociationResult {
  @scala.inline
  def apply(LocalGatewayRouteTableVpcAssociation: LocalGatewayRouteTableVpcAssociation = null): DeleteLocalGatewayRouteTableVpcAssociationResult = {
    val __obj = js.Dynamic.literal()
    if (LocalGatewayRouteTableVpcAssociation != null) __obj.updateDynamic("LocalGatewayRouteTableVpcAssociation")(LocalGatewayRouteTableVpcAssociation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLocalGatewayRouteTableVpcAssociationResult]
  }
}

