package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDirectConnectGatewayAssociationsResult extends StObject {
  
  /**
    * Information about the associations.
    */
  var directConnectGatewayAssociations: js.UndefOr[DirectConnectGatewayAssociationList] = js.undefined
  
  /**
    * The token to retrieve the next page.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeDirectConnectGatewayAssociationsResult {
  
  inline def apply(): DescribeDirectConnectGatewayAssociationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDirectConnectGatewayAssociationsResult]
  }
  
  extension [Self <: DescribeDirectConnectGatewayAssociationsResult](x: Self) {
    
    inline def setDirectConnectGatewayAssociations(value: DirectConnectGatewayAssociationList): Self = StObject.set(x, "directConnectGatewayAssociations", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectGatewayAssociationsUndefined: Self = StObject.set(x, "directConnectGatewayAssociations", js.undefined)
    
    inline def setDirectConnectGatewayAssociationsVarargs(value: DirectConnectGatewayAssociation*): Self = StObject.set(x, "directConnectGatewayAssociations", js.Array(value :_*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
