package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUsageStatisticsRequest extends StObject {
  
  /**
    * An array of objects, one for each condition to use to filter the query results. If the array contains more than one object, Amazon Macie uses an AND operator to join the conditions specified by the objects.
    */
  var filterBy: js.UndefOr[listOfUsageStatisticsFilter] = js.undefined
  
  /**
    * The maximum number of items to include in each page of the response.
    */
  var maxResults: js.UndefOr[integer] = js.undefined
  
  /**
    * The nextToken string that specifies which page of results to return in a paginated response.
    */
  var nextToken: js.UndefOr[string] = js.undefined
  
  /**
    * The criteria to use to sort the query results.
    */
  var sortBy: js.UndefOr[UsageStatisticsSortBy] = js.undefined
}
object GetUsageStatisticsRequest {
  
  inline def apply(): GetUsageStatisticsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUsageStatisticsRequest]
  }
  
  extension [Self <: GetUsageStatisticsRequest](x: Self) {
    
    inline def setFilterBy(value: listOfUsageStatisticsFilter): Self = StObject.set(x, "filterBy", value.asInstanceOf[js.Any])
    
    inline def setFilterByUndefined: Self = StObject.set(x, "filterBy", js.undefined)
    
    inline def setFilterByVarargs(value: UsageStatisticsFilter*): Self = StObject.set(x, "filterBy", js.Array(value :_*))
    
    inline def setMaxResults(value: integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSortBy(value: UsageStatisticsSortBy): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
  }
}
