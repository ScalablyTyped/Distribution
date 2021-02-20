package typings.awsSdk.timestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryResponse extends StObject {
  
  /**
    *  The column data types of the returned result set. 
    */
  var ColumnInfo: ColumnInfoList = js.native
  
  /**
    *  A pagination token that can be used again on a Query call to get the next set of results. 
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    *  A unique ID for the given query. 
    */
  var QueryId: typings.awsSdk.timestreamqueryMod.QueryId = js.native
  
  /**
    *  The result set rows returned by the query. 
    */
  var Rows: RowList = js.native
}
object QueryResponse {
  
  @scala.inline
  def apply(ColumnInfo: ColumnInfoList, QueryId: QueryId, Rows: RowList): QueryResponse = {
    val __obj = js.Dynamic.literal(ColumnInfo = ColumnInfo.asInstanceOf[js.Any], QueryId = QueryId.asInstanceOf[js.Any], Rows = Rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResponse]
  }
  
  @scala.inline
  implicit class QueryResponseMutableBuilder[Self <: QueryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnInfo(value: ColumnInfoList): Self = StObject.set(x, "ColumnInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnInfoVarargs(value: ColumnInfo*): Self = StObject.set(x, "ColumnInfo", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setQueryId(value: QueryId): Self = StObject.set(x, "QueryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: RowList): Self = StObject.set(x, "Rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: Row*): Self = StObject.set(x, "Rows", js.Array(value :_*))
  }
}
