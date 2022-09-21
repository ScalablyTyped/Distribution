package typings.awsSdk.migrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServersRequest extends StObject {
  
  /**
    *  Specifies the filter value, which is based on the type of server criteria. For example, if serverCriteria is OS_NAME, and the filterValue is equal to WindowsServer, then ListServers returns all of the servers matching the OS name WindowsServer. 
    */
  var filterValue: js.UndefOr[String] = js.undefined
  
  /**
    *  Specifies the group ID to filter on. 
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
    *  Criteria for filtering servers. 
    */
  var serverCriteria: js.UndefOr[ServerCriteria] = js.undefined
  
  /**
    *  Specifies whether to sort by ascending (ASC) or descending (DESC) order. 
    */
  var sort: js.UndefOr[SortOrder] = js.undefined
}
object ListServersRequest {
  
  inline def apply(): ListServersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServersRequest]
  }
  
  extension [Self <: ListServersRequest](x: Self) {
    
    inline def setFilterValue(value: String): Self = StObject.set(x, "filterValue", value.asInstanceOf[js.Any])
    
    inline def setFilterValueUndefined: Self = StObject.set(x, "filterValue", js.undefined)
    
    inline def setGroupIdFilter(value: GroupIds): Self = StObject.set(x, "groupIdFilter", value.asInstanceOf[js.Any])
    
    inline def setGroupIdFilterUndefined: Self = StObject.set(x, "groupIdFilter", js.undefined)
    
    inline def setGroupIdFilterVarargs(value: Group*): Self = StObject.set(x, "groupIdFilter", js.Array(value*))
    
    inline def setMaxResults(value: MaxResult): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setServerCriteria(value: ServerCriteria): Self = StObject.set(x, "serverCriteria", value.asInstanceOf[js.Any])
    
    inline def setServerCriteriaUndefined: Self = StObject.set(x, "serverCriteria", js.undefined)
    
    inline def setSort(value: SortOrder): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
