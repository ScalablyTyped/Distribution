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
  def apply(): DeleteDirectConnectGatewayAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDirectConnectGatewayAssociationResult]
  }
  @scala.inline
  implicit class DeleteDirectConnectGatewayAssociationResultOps[Self <: DeleteDirectConnectGatewayAssociationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDirectConnectGatewayAssociation(value: DirectConnectGatewayAssociation): Self = this.set("directConnectGatewayAssociation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectConnectGatewayAssociation: Self = this.set("directConnectGatewayAssociation", js.undefined)
  }
  
}

