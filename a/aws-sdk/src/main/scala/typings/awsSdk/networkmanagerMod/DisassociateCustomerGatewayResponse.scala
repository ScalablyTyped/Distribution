package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateCustomerGatewayResponse extends StObject {
  
  /**
    * Information about the customer gateway association.
    */
  var CustomerGatewayAssociation: js.UndefOr[typings.awsSdk.networkmanagerMod.CustomerGatewayAssociation] = js.native
}
object DisassociateCustomerGatewayResponse {
  
  @scala.inline
  def apply(): DisassociateCustomerGatewayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateCustomerGatewayResponse]
  }
  
  @scala.inline
  implicit class DisassociateCustomerGatewayResponseMutableBuilder[Self <: DisassociateCustomerGatewayResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerGatewayAssociation(value: CustomerGatewayAssociation): Self = StObject.set(x, "CustomerGatewayAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerGatewayAssociationUndefined: Self = StObject.set(x, "CustomerGatewayAssociation", js.undefined)
  }
}
