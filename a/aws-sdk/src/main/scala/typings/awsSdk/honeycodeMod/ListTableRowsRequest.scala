package typings.awsSdk.honeycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTableRowsRequest extends StObject {
  
  /**
    * The maximum number of rows to return in each page of the results.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    *  This parameter is optional. If a nextToken is not specified, the API returns the first page of data.   Pagination tokens expire after 1 hour. If you use a token that was returned more than an hour back, the API will throw ValidationException. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    *  This parameter is optional. If one or more row ids are specified in this list, then only the specified row ids are returned in the result. If no row ids are specified here, then all the rows in the table are returned. 
    */
  var rowIds: js.UndefOr[RowIdList] = js.undefined
  
  /**
    * The ID of the table whose rows are being retrieved.  If a table with the specified id could not be found, this API throws ResourceNotFoundException. 
    */
  var tableId: ResourceId
  
  /**
    * The ID of the workbook that contains the table whose rows are being retrieved.  If a workbook with the specified id could not be found, this API throws ResourceNotFoundException. 
    */
  var workbookId: ResourceId
}
object ListTableRowsRequest {
  
  inline def apply(tableId: ResourceId, workbookId: ResourceId): ListTableRowsRequest = {
    val __obj = js.Dynamic.literal(tableId = tableId.asInstanceOf[js.Any], workbookId = workbookId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTableRowsRequest]
  }
  
  extension [Self <: ListTableRowsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRowIds(value: RowIdList): Self = StObject.set(x, "rowIds", value.asInstanceOf[js.Any])
    
    inline def setRowIdsUndefined: Self = StObject.set(x, "rowIds", js.undefined)
    
    inline def setRowIdsVarargs(value: RowId*): Self = StObject.set(x, "rowIds", js.Array(value*))
    
    inline def setTableId(value: ResourceId): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setWorkbookId(value: ResourceId): Self = StObject.set(x, "workbookId", value.asInstanceOf[js.Any])
  }
}
