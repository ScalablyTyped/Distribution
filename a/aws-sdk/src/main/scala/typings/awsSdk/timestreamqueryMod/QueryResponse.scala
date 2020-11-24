package typings.awsSdk.timestreamqueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryResponse extends js.Object {
  
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
  implicit class QueryResponseOps[Self <: QueryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColumnInfoVarargs(value: ColumnInfo*): Self = this.set("ColumnInfo", js.Array(value :_*))
    
    @scala.inline
    def setColumnInfo(value: ColumnInfoList): Self = this.set("ColumnInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryId(value: QueryId): Self = this.set("QueryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: Row*): Self = this.set("Rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: RowList): Self = this.set("Rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
