package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGroupsRequest extends StObject {
  
  /**
    * The maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.workmailMod.MaxResults] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. The first call does not contain any tokens.
    */
  var NextToken: js.UndefOr[typings.awsSdk.workmailMod.NextToken] = js.undefined
  
  /**
    * The identifier for the organization under which the groups exist.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId
}
object ListGroupsRequest {
  
  @scala.inline
  def apply(OrganizationId: OrganizationId): ListGroupsRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGroupsRequest]
  }
  
  @scala.inline
  implicit class ListGroupsRequestMutableBuilder[Self <: ListGroupsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
