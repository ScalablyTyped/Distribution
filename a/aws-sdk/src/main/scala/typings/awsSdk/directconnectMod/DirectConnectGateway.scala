package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectConnectGateway extends js.Object {
  
  /**
    * The autonomous system number (ASN) for the Amazon side of the connection.
    */
  var amazonSideAsn: js.UndefOr[LongAsn] = js.native
  
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.native
  
  /**
    * The name of the Direct Connect gateway.
    */
  var directConnectGatewayName: js.UndefOr[DirectConnectGatewayName] = js.native
  
  /**
    * The state of the Direct Connect gateway. The following are the possible values:    pending: The initial state after calling CreateDirectConnectGateway.    available: The Direct Connect gateway is ready for use.    deleting: The initial state after calling DeleteDirectConnectGateway.    deleted: The Direct Connect gateway is deleted and cannot pass traffic.  
    */
  var directConnectGatewayState: js.UndefOr[DirectConnectGatewayState] = js.native
  
  /**
    * The ID of the AWS account that owns the Direct Connect gateway.
    */
  var ownerAccount: js.UndefOr[OwnerAccount] = js.native
  
  /**
    * The error message if the state of an object failed to advance.
    */
  var stateChangeError: js.UndefOr[StateChangeError] = js.native
}
object DirectConnectGateway {
  
  @scala.inline
  def apply(): DirectConnectGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectConnectGateway]
  }
  
  @scala.inline
  implicit class DirectConnectGatewayOps[Self <: DirectConnectGateway] (val x: Self) extends AnyVal {
    
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
    def setAmazonSideAsn(value: LongAsn): Self = this.set("amazonSideAsn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmazonSideAsn: Self = this.set("amazonSideAsn", js.undefined)
    
    @scala.inline
    def setDirectConnectGatewayId(value: DirectConnectGatewayId): Self = this.set("directConnectGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectConnectGatewayId: Self = this.set("directConnectGatewayId", js.undefined)
    
    @scala.inline
    def setDirectConnectGatewayName(value: DirectConnectGatewayName): Self = this.set("directConnectGatewayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectConnectGatewayName: Self = this.set("directConnectGatewayName", js.undefined)
    
    @scala.inline
    def setDirectConnectGatewayState(value: DirectConnectGatewayState): Self = this.set("directConnectGatewayState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectConnectGatewayState: Self = this.set("directConnectGatewayState", js.undefined)
    
    @scala.inline
    def setOwnerAccount(value: OwnerAccount): Self = this.set("ownerAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerAccount: Self = this.set("ownerAccount", js.undefined)
    
    @scala.inline
    def setStateChangeError(value: StateChangeError): Self = this.set("stateChangeError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateChangeError: Self = this.set("stateChangeError", js.undefined)
  }
}
