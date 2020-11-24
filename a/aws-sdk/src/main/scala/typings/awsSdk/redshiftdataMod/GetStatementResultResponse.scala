package typings.awsSdk.redshiftdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStatementResultResponse extends js.Object {
  
  /**
    * The properties (metadata) of a column. 
    */
  var ColumnMetadata: js.UndefOr[ColumnMetadataList] = js.native
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned NextToken value in the next NextToken parameter and retrying the command. If the NextToken field is empty, all response records have been retrieved for the request. 
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The results of the SQL statement.
    */
  var Records: SqlRecords = js.native
  
  /**
    * The total number of rows in the result set returned from a query. You can use this number to estimate the number of calls to the GetStatementResult operation needed to page through the results. 
    */
  var TotalNumRows: js.UndefOr[Long] = js.native
}
object GetStatementResultResponse {
  
  @scala.inline
  def apply(Records: SqlRecords): GetStatementResultResponse = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStatementResultResponse]
  }
  
  @scala.inline
  implicit class GetStatementResultResponseOps[Self <: GetStatementResultResponse] (val x: Self) extends AnyVal {
    
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
    def setRecordsVarargs(value: FieldList*): Self = this.set("Records", js.Array(value :_*))
    
    @scala.inline
    def setRecords(value: SqlRecords): Self = this.set("Records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnMetadataVarargs(value: ColumnMetadata*): Self = this.set("ColumnMetadata", js.Array(value :_*))
    
    @scala.inline
    def setColumnMetadata(value: ColumnMetadataList): Self = this.set("ColumnMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnMetadata: Self = this.set("ColumnMetadata", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setTotalNumRows(value: Long): Self = this.set("TotalNumRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalNumRows: Self = this.set("TotalNumRows", js.undefined)
  }
}
