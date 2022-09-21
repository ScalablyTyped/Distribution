package typings.awsSdk.honeycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryTableRowsResult extends StObject {
  
  /**
    *  The list of columns in the table whose row data is returned in the result. 
    */
  var columnIds: ResourceIds
  
  /**
    *  Provides the pagination token to load the next page if there are more results matching the request. If a pagination token is not present in the response, it means that all data matching the request has been loaded. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    *  The list of rows in the table that match the query filter. 
    */
  var rows: TableRows
  
  /**
    *  Indicates the cursor of the workbook at which the data returned by this request is read. Workbook cursor keeps increasing with every update and the increments are not sequential. 
    */
  var workbookCursor: WorkbookCursor
}
object QueryTableRowsResult {
  
  inline def apply(columnIds: ResourceIds, rows: TableRows, workbookCursor: WorkbookCursor): QueryTableRowsResult = {
    val __obj = js.Dynamic.literal(columnIds = columnIds.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], workbookCursor = workbookCursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryTableRowsResult]
  }
  
  extension [Self <: QueryTableRowsResult](x: Self) {
    
    inline def setColumnIds(value: ResourceIds): Self = StObject.set(x, "columnIds", value.asInstanceOf[js.Any])
    
    inline def setColumnIdsVarargs(value: ResourceId*): Self = StObject.set(x, "columnIds", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRows(value: TableRows): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: TableRow*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setWorkbookCursor(value: WorkbookCursor): Self = StObject.set(x, "workbookCursor", value.asInstanceOf[js.Any])
  }
}
