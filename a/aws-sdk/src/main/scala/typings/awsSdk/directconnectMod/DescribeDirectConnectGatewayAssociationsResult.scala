package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDirectConnectGatewayAssociationsResult extends StObject {
  
  /**
    * Information about the associations.
    */
  var directConnectGatewayAssociations: js.UndefOr[DirectConnectGatewayAssociationList] = js.native
  
  /**
    * The token to retrieve the next page.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}
object DescribeDirectConnectGatewayAssociationsResult {
  
  @scala.inline
  def apply(): DescribeDirectConnectGatewayAssociationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDirectConnectGatewayAssociationsResult]
  }
  
  @scala.inline
  implicit class DescribeDirectConnectGatewayAssociationsResultMutableBuilder[Self <: DescribeDirectConnectGatewayAssociationsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectConnectGatewayAssociations(value: DirectConnectGatewayAssociationList): Self = StObject.set(x, "directConnectGatewayAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectConnectGatewayAssociationsUndefined: Self = StObject.set(x, "directConnectGatewayAssociations", js.undefined)
    
    @scala.inline
    def setDirectConnectGatewayAssociationsVarargs(value: DirectConnectGatewayAssociation*): Self = StObject.set(x, "directConnectGatewayAssociations", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
