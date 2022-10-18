package typings.awsSdk.clientsTimestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryResponse extends StObject {
  
  /**
    *  The column data types of the returned result set. 
    */
  var ColumnInfo: ColumnInfoList
  
  /**
    *  A pagination token that can be used again on a Query call to get the next set of results. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    *  A unique ID for the given query. 
    */
  var QueryId: typings.awsSdk.clientsTimestreamqueryMod.QueryId
  
  /**
    * Information about the status of the query, including progress and bytes scanned.
    */
  var QueryStatus: js.UndefOr[typings.awsSdk.clientsTimestreamqueryMod.QueryStatus] = js.undefined
  
  /**
    *  The result set rows returned by the query. 
    */
  var Rows: RowList
}
object QueryResponse {
  
  inline def apply(ColumnInfo: ColumnInfoList, QueryId: QueryId, Rows: RowList): QueryResponse = {
    val __obj = js.Dynamic.literal(ColumnInfo = ColumnInfo.asInstanceOf[js.Any], QueryId = QueryId.asInstanceOf[js.Any], Rows = Rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResponse]
  }
  
  extension [Self <: QueryResponse](x: Self) {
    
    inline def setColumnInfo(value: ColumnInfoList): Self = StObject.set(x, "ColumnInfo", value.asInstanceOf[js.Any])
    
    inline def setColumnInfoVarargs(value: ColumnInfo*): Self = StObject.set(x, "ColumnInfo", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setQueryId(value: QueryId): Self = StObject.set(x, "QueryId", value.asInstanceOf[js.Any])
    
    inline def setQueryStatus(value: QueryStatus): Self = StObject.set(x, "QueryStatus", value.asInstanceOf[js.Any])
    
    inline def setQueryStatusUndefined: Self = StObject.set(x, "QueryStatus", js.undefined)
    
    inline def setRows(value: RowList): Self = StObject.set(x, "Rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: Row*): Self = StObject.set(x, "Rows", js.Array(value*))
  }
}
