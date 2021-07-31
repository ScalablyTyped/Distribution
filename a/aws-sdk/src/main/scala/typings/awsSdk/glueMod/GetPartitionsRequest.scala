package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPartitionsRequest extends StObject {
  
  /**
    * The ID of the Data Catalog where the partitions in question reside. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The name of the catalog database where the partitions reside.
    */
  var DatabaseName: NameString
  
  /**
    * An expression that filters the partitions to be returned. The expression uses SQL syntax similar to the SQL WHERE filter clause. The SQL statement parser JSQLParser parses the expression.   Operators: The following are the operators that you can use in the Expression API call:  =  Checks whether the values of the two operands are equal; if yes, then the condition becomes true. Example: Assume 'variable a' holds 10 and 'variable b' holds 20.  (a = b) is not true.  &lt; &gt;  Checks whether the values of two operands are equal; if the values are not equal, then the condition becomes true. Example: (a &lt; &gt; b) is true.  &gt;  Checks whether the value of the left operand is greater than the value of the right operand; if yes, then the condition becomes true. Example: (a &gt; b) is not true.  &lt;  Checks whether the value of the left operand is less than the value of the right operand; if yes, then the condition becomes true. Example: (a &lt; b) is true.  &gt;=  Checks whether the value of the left operand is greater than or equal to the value of the right operand; if yes, then the condition becomes true. Example: (a &gt;= b) is not true.  &lt;=  Checks whether the value of the left operand is less than or equal to the value of the right operand; if yes, then the condition becomes true. Example: (a &lt;= b) is true.  AND, OR, IN, BETWEEN, LIKE, NOT, IS NULL  Logical operators.    Supported Partition Key Types: The following are the supported partition keys.    string     date     timestamp     int     bigint     long     tinyint     smallint     decimal    If an invalid type is encountered, an exception is thrown.  The following list shows the valid operators on each type. When you define a crawler, the partitionKey type is created as a STRING, to be compatible with the catalog partitions.   Sample API Call: 
    */
  var Expression: js.UndefOr[PredicateString] = js.undefined
  
  /**
    * The maximum number of partitions to return in a single response.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * A continuation token, if this is not the first call to retrieve these partitions.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * The segment of the table's partitions to scan in this request.
    */
  var Segment: js.UndefOr[typings.awsSdk.glueMod.Segment] = js.undefined
  
  /**
    * The name of the partitions' table.
    */
  var TableName: NameString
}
object GetPartitionsRequest {
  
  @scala.inline
  def apply(DatabaseName: NameString, TableName: NameString): GetPartitionsRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPartitionsRequest]
  }
  
  @scala.inline
  implicit class GetPartitionsRequestMutableBuilder[Self <: GetPartitionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpression(value: PredicateString): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "Expression", js.undefined)
    
    @scala.inline
    def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSegment(value: Segment): Self = StObject.set(x, "Segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentUndefined: Self = StObject.set(x, "Segment", js.undefined)
    
    @scala.inline
    def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
