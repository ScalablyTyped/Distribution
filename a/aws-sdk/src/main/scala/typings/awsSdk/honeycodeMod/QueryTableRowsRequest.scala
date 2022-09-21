package typings.awsSdk.honeycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryTableRowsRequest extends StObject {
  
  /**
    * An object that represents a filter formula along with the id of the context row under which the filter function needs to evaluate.
    */
  var filterFormula: Filter
  
  /**
    * The maximum number of rows to return in each page of the results.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    *  This parameter is optional. If a nextToken is not specified, the API returns the first page of data.   Pagination tokens expire after 1 hour. If you use a token that was returned more than an hour back, the API will throw ValidationException. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The ID of the table whose rows are being queried.  If a table with the specified id could not be found, this API throws ResourceNotFoundException. 
    */
  var tableId: ResourceId
  
  /**
    * The ID of the workbook whose table rows are being queried.  If a workbook with the specified id could not be found, this API throws ResourceNotFoundException. 
    */
  var workbookId: ResourceId
}
object QueryTableRowsRequest {
  
  inline def apply(filterFormula: Filter, tableId: ResourceId, workbookId: ResourceId): QueryTableRowsRequest = {
    val __obj = js.Dynamic.literal(filterFormula = filterFormula.asInstanceOf[js.Any], tableId = tableId.asInstanceOf[js.Any], workbookId = workbookId.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryTableRowsRequest]
  }
  
  extension [Self <: QueryTableRowsRequest](x: Self) {
    
    inline def setFilterFormula(value: Filter): Self = StObject.set(x, "filterFormula", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTableId(value: ResourceId): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setWorkbookId(value: ResourceId): Self = StObject.set(x, "workbookId", value.asInstanceOf[js.Any])
  }
}
