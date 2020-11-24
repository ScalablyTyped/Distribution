package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDirectConnectGatewayAssociationsRequest extends js.Object {
  
  /**
    * The ID of the associated gateway.
    */
  var associatedGatewayId: js.UndefOr[AssociatedGatewayId] = js.native
  
  /**
    * The ID of the Direct Connect gateway association.
    */
  var associationId: js.UndefOr[DirectConnectGatewayAssociationId] = js.native
  
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.native
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value. If MaxResults is given a value larger than 100, only 100 results are returned.
    */
  var maxResults: js.UndefOr[MaxResultSetSize] = js.native
  
  /**
    * The token provided in the previous call to retrieve the next page.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The ID of the virtual private gateway.
    */
  var virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.native
}
object DescribeDirectConnectGatewayAssociationsRequest {
  
  @scala.inline
  def apply(): DescribeDirectConnectGatewayAssociationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDirectConnectGatewayAssociationsRequest]
  }
  
  @scala.inline
  implicit class DescribeDirectConnectGatewayAssociationsRequestOps[Self <: DescribeDirectConnectGatewayAssociationsRequest] (val x: Self) extends AnyVal {
    
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
    def setAssociatedGatewayId(value: AssociatedGatewayId): Self = this.set("associatedGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociatedGatewayId: Self = this.set("associatedGatewayId", js.undefined)
    
    @scala.inline
    def setAssociationId(value: DirectConnectGatewayAssociationId): Self = this.set("associationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociationId: Self = this.set("associationId", js.undefined)
    
    @scala.inline
    def setDirectConnectGatewayId(value: DirectConnectGatewayId): Self = this.set("directConnectGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectConnectGatewayId: Self = this.set("directConnectGatewayId", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResultSetSize): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setVirtualGatewayId(value: VirtualGatewayId): Self = this.set("virtualGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualGatewayId: Self = this.set("virtualGatewayId", js.undefined)
  }
}
