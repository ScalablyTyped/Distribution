package typings.awsSdk.connectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCampaignsRequest extends StObject {
  
  var filters: js.UndefOr[CampaignFilters] = js.undefined
  
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListCampaignsRequest {
  
  inline def apply(): ListCampaignsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCampaignsRequest]
  }
  
  extension [Self <: ListCampaignsRequest](x: Self) {
    
    inline def setFilters(value: CampaignFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
