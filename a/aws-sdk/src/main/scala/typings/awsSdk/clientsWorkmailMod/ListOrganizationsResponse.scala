package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOrganizationsResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. The value is "null" when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsWorkmailMod.NextToken] = js.undefined
  
  /**
    * The overview of owned organizations presented as a list of organization summaries.
    */
  var OrganizationSummaries: js.UndefOr[typings.awsSdk.clientsWorkmailMod.OrganizationSummaries] = js.undefined
}
object ListOrganizationsResponse {
  
  inline def apply(): ListOrganizationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOrganizationsResponse]
  }
  
  extension [Self <: ListOrganizationsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOrganizationSummaries(value: OrganizationSummaries): Self = StObject.set(x, "OrganizationSummaries", value.asInstanceOf[js.Any])
    
    inline def setOrganizationSummariesUndefined: Self = StObject.set(x, "OrganizationSummaries", js.undefined)
    
    inline def setOrganizationSummariesVarargs(value: OrganizationSummary*): Self = StObject.set(x, "OrganizationSummaries", js.Array(value*))
  }
}
