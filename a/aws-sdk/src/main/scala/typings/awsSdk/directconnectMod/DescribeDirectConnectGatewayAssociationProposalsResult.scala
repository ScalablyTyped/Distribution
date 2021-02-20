package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDirectConnectGatewayAssociationProposalsResult extends StObject {
  
  /**
    * Describes the Direct Connect gateway association proposals.
    */
  var directConnectGatewayAssociationProposals: js.UndefOr[DirectConnectGatewayAssociationProposalList] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}
object DescribeDirectConnectGatewayAssociationProposalsResult {
  
  @scala.inline
  def apply(): DescribeDirectConnectGatewayAssociationProposalsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDirectConnectGatewayAssociationProposalsResult]
  }
  
  @scala.inline
  implicit class DescribeDirectConnectGatewayAssociationProposalsResultMutableBuilder[Self <: DescribeDirectConnectGatewayAssociationProposalsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectConnectGatewayAssociationProposals(value: DirectConnectGatewayAssociationProposalList): Self = StObject.set(x, "directConnectGatewayAssociationProposals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectConnectGatewayAssociationProposalsUndefined: Self = StObject.set(x, "directConnectGatewayAssociationProposals", js.undefined)
    
    @scala.inline
    def setDirectConnectGatewayAssociationProposalsVarargs(value: DirectConnectGatewayAssociationProposal*): Self = StObject.set(x, "directConnectGatewayAssociationProposals", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
