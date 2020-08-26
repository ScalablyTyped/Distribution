package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDirectConnectGatewayAssociationRequest extends js.Object {
  /**
    * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
    */
  var addAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.native
  /**
    * The ID of the Direct Connect gateway association.
    */
  var associationId: js.UndefOr[DirectConnectGatewayAssociationId] = js.native
  /**
    * The Amazon VPC prefixes to no longer advertise to the Direct Connect gateway.
    */
  var removeAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.native
}

object UpdateDirectConnectGatewayAssociationRequest {
  @scala.inline
  def apply(): UpdateDirectConnectGatewayAssociationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDirectConnectGatewayAssociationRequest]
  }
  @scala.inline
  implicit class UpdateDirectConnectGatewayAssociationRequestOps[Self <: UpdateDirectConnectGatewayAssociationRequest] (val x: Self) extends AnyVal {
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
    def setAddAllowedPrefixesToDirectConnectGatewayVarargs(value: RouteFilterPrefix*): Self = this.set("addAllowedPrefixesToDirectConnectGateway", js.Array(value :_*))
    @scala.inline
    def setAddAllowedPrefixesToDirectConnectGateway(value: RouteFilterPrefixList): Self = this.set("addAllowedPrefixesToDirectConnectGateway", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddAllowedPrefixesToDirectConnectGateway: Self = this.set("addAllowedPrefixesToDirectConnectGateway", js.undefined)
    @scala.inline
    def setAssociationId(value: DirectConnectGatewayAssociationId): Self = this.set("associationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociationId: Self = this.set("associationId", js.undefined)
    @scala.inline
    def setRemoveAllowedPrefixesToDirectConnectGatewayVarargs(value: RouteFilterPrefix*): Self = this.set("removeAllowedPrefixesToDirectConnectGateway", js.Array(value :_*))
    @scala.inline
    def setRemoveAllowedPrefixesToDirectConnectGateway(value: RouteFilterPrefixList): Self = this.set("removeAllowedPrefixesToDirectConnectGateway", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveAllowedPrefixesToDirectConnectGateway: Self = this.set("removeAllowedPrefixesToDirectConnectGateway", js.undefined)
  }
  
}

