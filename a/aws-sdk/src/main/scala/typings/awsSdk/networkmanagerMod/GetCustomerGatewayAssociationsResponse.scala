package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCustomerGatewayAssociationsResponse extends js.Object {
  
  /**
    * The customer gateway associations.
    */
  var CustomerGatewayAssociations: js.UndefOr[CustomerGatewayAssociationList] = js.native
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object GetCustomerGatewayAssociationsResponse {
  
  @scala.inline
  def apply(): GetCustomerGatewayAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCustomerGatewayAssociationsResponse]
  }
  
  @scala.inline
  implicit class GetCustomerGatewayAssociationsResponseOps[Self <: GetCustomerGatewayAssociationsResponse] (val x: Self) extends AnyVal {
    
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
    def setCustomerGatewayAssociationsVarargs(value: CustomerGatewayAssociation*): Self = this.set("CustomerGatewayAssociations", js.Array(value :_*))
    
    @scala.inline
    def setCustomerGatewayAssociations(value: CustomerGatewayAssociationList): Self = this.set("CustomerGatewayAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerGatewayAssociations: Self = this.set("CustomerGatewayAssociations", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
