package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMailDomainsRequest extends StObject {
  
  /**
    * The maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsWorkmailMod.MaxResults] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. The first call does not require a token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsWorkmailMod.NextToken] = js.undefined
  
  /**
    * The WorkMail organization for which to list domains.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
}
object ListMailDomainsRequest {
  
  inline def apply(OrganizationId: OrganizationId): ListMailDomainsRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMailDomainsRequest]
  }
  
  extension [Self <: ListMailDomainsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
