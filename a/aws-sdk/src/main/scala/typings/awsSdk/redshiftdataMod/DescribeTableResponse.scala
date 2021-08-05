package typings.awsSdk.redshiftdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTableResponse extends StObject {
  
  /**
    * A list of columns in the table. 
    */
  var ColumnList: js.UndefOr[typings.awsSdk.redshiftdataMod.ColumnList] = js.undefined
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned NextToken value in the next NextToken parameter and retrying the command. If the NextToken field is empty, all response records have been retrieved for the request. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The table name. 
    */
  var TableName: js.UndefOr[String] = js.undefined
}
object DescribeTableResponse {
  
  inline def apply(): DescribeTableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTableResponse]
  }
  
  extension [Self <: DescribeTableResponse](x: Self) {
    
    inline def setColumnList(value: ColumnList): Self = StObject.set(x, "ColumnList", value.asInstanceOf[js.Any])
    
    inline def setColumnListUndefined: Self = StObject.set(x, "ColumnList", js.undefined)
    
    inline def setColumnListVarargs(value: ColumnMetadata*): Self = StObject.set(x, "ColumnList", js.Array(value :_*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
