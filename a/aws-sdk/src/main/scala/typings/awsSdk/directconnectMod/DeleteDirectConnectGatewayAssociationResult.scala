package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDirectConnectGatewayAssociationResult extends js.Object {
  /**
    * Information about the deleted association.
    */
  var directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation] = js.native
}

object DeleteDirectConnectGatewayAssociationResult {
  @scala.inline
  def apply(directConnectGatewayAssociation: DirectConnectGatewayAssociation = null): DeleteDirectConnectGatewayAssociationResult = {
    val __obj = js.Dynamic.literal()
    if (directConnectGatewayAssociation != null) __obj.updateDynamic("directConnectGatewayAssociation")(directConnectGatewayAssociation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDirectConnectGatewayAssociationResult]
  }
}

