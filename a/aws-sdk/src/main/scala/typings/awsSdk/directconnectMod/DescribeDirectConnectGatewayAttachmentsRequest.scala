package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDirectConnectGatewayAttachmentsRequest extends StObject {
  
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value. If MaxResults is given a value larger than 100, only 100 results are returned.
    */
  var maxResults: js.UndefOr[MaxResultSetSize] = js.undefined
  
  /**
    * The token provided in the previous call to retrieve the next page.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined
}
object DescribeDirectConnectGatewayAttachmentsRequest {
  
  @scala.inline
  def apply(): DescribeDirectConnectGatewayAttachmentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDirectConnectGatewayAttachmentsRequest]
  }
  
  @scala.inline
  implicit class DescribeDirectConnectGatewayAttachmentsRequestMutableBuilder[Self <: DescribeDirectConnectGatewayAttachmentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectConnectGatewayId(value: DirectConnectGatewayId): Self = StObject.set(x, "directConnectGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectConnectGatewayIdUndefined: Self = StObject.set(x, "directConnectGatewayId", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResultSetSize): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setVirtualInterfaceId(value: VirtualInterfaceId): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualInterfaceIdUndefined: Self = StObject.set(x, "virtualInterfaceId", js.undefined)
  }
}
