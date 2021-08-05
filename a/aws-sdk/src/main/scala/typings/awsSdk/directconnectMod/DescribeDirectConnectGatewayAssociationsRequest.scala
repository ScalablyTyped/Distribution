package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDirectConnectGatewayAssociationsRequest extends StObject {
  
  /**
    * The ID of the associated gateway.
    */
  var associatedGatewayId: js.UndefOr[AssociatedGatewayId] = js.undefined
  
  /**
    * The ID of the Direct Connect gateway association.
    */
  var associationId: js.UndefOr[DirectConnectGatewayAssociationId] = js.undefined
  
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
    * The ID of the virtual private gateway.
    */
  var virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined
}
object DescribeDirectConnectGatewayAssociationsRequest {
  
  inline def apply(): DescribeDirectConnectGatewayAssociationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDirectConnectGatewayAssociationsRequest]
  }
  
  extension [Self <: DescribeDirectConnectGatewayAssociationsRequest](x: Self) {
    
    inline def setAssociatedGatewayId(value: AssociatedGatewayId): Self = StObject.set(x, "associatedGatewayId", value.asInstanceOf[js.Any])
    
    inline def setAssociatedGatewayIdUndefined: Self = StObject.set(x, "associatedGatewayId", js.undefined)
    
    inline def setAssociationId(value: DirectConnectGatewayAssociationId): Self = StObject.set(x, "associationId", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdUndefined: Self = StObject.set(x, "associationId", js.undefined)
    
    inline def setDirectConnectGatewayId(value: DirectConnectGatewayId): Self = StObject.set(x, "directConnectGatewayId", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectGatewayIdUndefined: Self = StObject.set(x, "directConnectGatewayId", js.undefined)
    
    inline def setMaxResults(value: MaxResultSetSize): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setVirtualGatewayId(value: VirtualGatewayId): Self = StObject.set(x, "virtualGatewayId", value.asInstanceOf[js.Any])
    
    inline def setVirtualGatewayIdUndefined: Self = StObject.set(x, "virtualGatewayId", js.undefined)
  }
}
