package typings.awsSdk.redshiftdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStatementResultResponse extends StObject {
  
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
  implicit class GetStatementResultResponseMutableBuilder[Self <: GetStatementResultResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnMetadata(value: ColumnMetadataList): Self = StObject.set(x, "ColumnMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnMetadataUndefined: Self = StObject.set(x, "ColumnMetadata", js.undefined)
    
    @scala.inline
    def setColumnMetadataVarargs(value: ColumnMetadata*): Self = StObject.set(x, "ColumnMetadata", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRecords(value: SqlRecords): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsVarargs(value: FieldList*): Self = StObject.set(x, "Records", js.Array(value :_*))
    
    @scala.inline
    def setTotalNumRows(value: Long): Self = StObject.set(x, "TotalNumRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalNumRowsUndefined: Self = StObject.set(x, "TotalNumRows", js.undefined)
  }
}
