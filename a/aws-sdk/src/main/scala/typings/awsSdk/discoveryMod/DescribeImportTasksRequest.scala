package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeImportTasksRequest extends StObject {
  
  /**
    * An array of name-value pairs that you provide to filter the results for the DescribeImportTask request to a specific subset of results. Currently, wildcard values aren't supported for filters.
    */
  var filters: js.UndefOr[DescribeImportTasksFilterList] = js.undefined
  
  /**
    * The maximum number of results that you want this request to return, up to 100.
    */
  var maxResults: js.UndefOr[DescribeImportTasksMaxResults] = js.undefined
  
  /**
    * The token to request a specific page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeImportTasksRequest {
  
  inline def apply(): DescribeImportTasksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImportTasksRequest]
  }
  
  extension [Self <: DescribeImportTasksRequest](x: Self) {
    
    inline def setFilters(value: DescribeImportTasksFilterList): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: ImportTaskFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    inline def setMaxResults(value: DescribeImportTasksMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
