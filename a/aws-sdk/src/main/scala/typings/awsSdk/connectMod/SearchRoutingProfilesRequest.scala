package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchRoutingProfilesRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
  
  /**
    * The maximum number of results to return per page.
    */
  var MaxResults: js.UndefOr[MaxResult100] = js.undefined
  
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[NextToken2500] = js.undefined
  
  /**
    * The search criteria to be used to return routing profiles.
    */
  var SearchCriteria: js.UndefOr[RoutingProfileSearchCriteria] = js.undefined
  
  /**
    * Filters to be applied to search results.
    */
  var SearchFilter: js.UndefOr[RoutingProfileSearchFilter] = js.undefined
}
object SearchRoutingProfilesRequest {
  
  inline def apply(InstanceId: InstanceId): SearchRoutingProfilesRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchRoutingProfilesRequest]
  }
  
  extension [Self <: SearchRoutingProfilesRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResult100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken2500): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSearchCriteria(value: RoutingProfileSearchCriteria): Self = StObject.set(x, "SearchCriteria", value.asInstanceOf[js.Any])
    
    inline def setSearchCriteriaUndefined: Self = StObject.set(x, "SearchCriteria", js.undefined)
    
    inline def setSearchFilter(value: RoutingProfileSearchFilter): Self = StObject.set(x, "SearchFilter", value.asInstanceOf[js.Any])
    
    inline def setSearchFilterUndefined: Self = StObject.set(x, "SearchFilter", js.undefined)
  }
}
