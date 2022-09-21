package typings.awsSdk.migrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationComponentsRequest extends StObject {
  
  /**
    *  Criteria for filtering the list of application components. 
    */
  var applicationComponentCriteria: js.UndefOr[ApplicationComponentCriteria] = js.undefined
  
  /**
    *  Specify the value based on the application component criteria type. For example, if applicationComponentCriteria is set to SERVER_ID and filterValue is set to server1, then ListApplicationComponents returns all the application components running on server1. 
    */
  var filterValue: js.UndefOr[ListApplicationComponentsRequestFilterValueString] = js.undefined
  
  /**
    *  The group ID specified in to filter on. 
    */
  var groupIdFilter: js.UndefOr[GroupIds] = js.undefined
  
  /**
    *  The maximum number of items to include in the response. The maximum value is 100. 
    */
  var maxResults: js.UndefOr[MaxResult] = js.undefined
  
  /**
    *  The token from a previous call that you use to retrieve the next set of results. For example, if a previous call to this action returned 100 items, but you set maxResults to 10. You'll receive a set of 10 results along with a token. You then use the returned token to retrieve the next set of 10. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    *  Specifies whether to sort by ascending (ASC) or descending (DESC) order. 
    */
  var sort: js.UndefOr[SortOrder] = js.undefined
}
object ListApplicationComponentsRequest {
  
  inline def apply(): ListApplicationComponentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationComponentsRequest]
  }
  
  extension [Self <: ListApplicationComponentsRequest](x: Self) {
    
    inline def setApplicationComponentCriteria(value: ApplicationComponentCriteria): Self = StObject.set(x, "applicationComponentCriteria", value.asInstanceOf[js.Any])
    
    inline def setApplicationComponentCriteriaUndefined: Self = StObject.set(x, "applicationComponentCriteria", js.undefined)
    
    inline def setFilterValue(value: ListApplicationComponentsRequestFilterValueString): Self = StObject.set(x, "filterValue", value.asInstanceOf[js.Any])
    
    inline def setFilterValueUndefined: Self = StObject.set(x, "filterValue", js.undefined)
    
    inline def setGroupIdFilter(value: GroupIds): Self = StObject.set(x, "groupIdFilter", value.asInstanceOf[js.Any])
    
    inline def setGroupIdFilterUndefined: Self = StObject.set(x, "groupIdFilter", js.undefined)
    
    inline def setGroupIdFilterVarargs(value: Group*): Self = StObject.set(x, "groupIdFilter", js.Array(value*))
    
    inline def setMaxResults(value: MaxResult): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSort(value: SortOrder): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
