package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutItemInput extends StObject {
  
  /**
    * A condition that must be satisfied in order for a conditional PutItem operation to succeed. An expression can contain any of the following:   Functions: attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size  These function names are case-sensitive.   Comparison operators: = | &lt;&gt; | &lt; | &gt; | &lt;= | &gt;= | BETWEEN | IN      Logical operators: AND | OR | NOT    For more information on condition expressions, see Condition Expressions in the Amazon DynamoDB Developer Guide.
    */
  var ConditionExpression: js.UndefOr[typings.awsSdk.dynamodbMod.ConditionExpression] = js.undefined
  
  /**
    * This is a legacy parameter. Use ConditionExpression instead. For more information, see ConditionalOperator in the Amazon DynamoDB Developer Guide.
    */
  var ConditionalOperator: js.UndefOr[typings.awsSdk.dynamodbMod.ConditionalOperator] = js.undefined
  
  /**
    * This is a legacy parameter. Use ConditionExpression instead. For more information, see Expected in the Amazon DynamoDB Developer Guide.
    */
  var Expected: js.UndefOr[ExpectedAttributeMap] = js.undefined
  
  /**
    * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Specifying Item Attributes in the Amazon DynamoDB Developer Guide.
    */
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
  
  /**
    * One or more values that can be substituted in an expression. Use the : (colon) character in an expression to dereference an attribute value. For example, suppose that you wanted to check whether the value of the ProductStatus attribute was one of the following:   Available | Backordered | Discontinued  You would first need to specify ExpressionAttributeValues as follows:  { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }  You could then use these values in an expression, such as this:  ProductStatus IN (:avail, :back, :disc)  For more information on expression attribute values, see Condition Expressions in the Amazon DynamoDB Developer Guide.
    */
  var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined
  
  /**
    * A map of attribute name/value pairs, one for each attribute. Only the primary key attributes are required; you can optionally provide other attribute name-value pairs for the item. You must provide all of the attributes for the primary key. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide both values for both the partition key and the sort key. If you specify any attributes that are part of an index key, then the data types for those attributes must match those of the schema in the table's attribute definition. Empty String and Binary attribute values are allowed. Attribute values of type String and Binary must have a length greater than zero if the attribute is used as a key attribute for a table or index. For more information about primary keys, see Primary Key in the Amazon DynamoDB Developer Guide. Each element in the Item map is an AttributeValue object.
    */
  var Item: PutItemInputAttributeMap
  
  var ReturnConsumedCapacity: js.UndefOr[typings.awsSdk.dynamodbMod.ReturnConsumedCapacity] = js.undefined
  
  /**
    * Determines whether item collection metrics are returned. If set to SIZE, the response includes statistics about item collections, if any, that were modified during the operation are returned in the response. If set to NONE (the default), no statistics are returned.
    */
  var ReturnItemCollectionMetrics: js.UndefOr[typings.awsSdk.dynamodbMod.ReturnItemCollectionMetrics] = js.undefined
  
  /**
    * Use ReturnValues if you want to get the item attributes as they appeared before they were updated with the PutItem request. For PutItem, the valid values are:    NONE - If ReturnValues is not specified, or if its value is NONE, then nothing is returned. (This setting is the default for ReturnValues.)    ALL_OLD - If PutItem overwrote an attribute name-value pair, then the content of the old item is returned.    The ReturnValues parameter is used by several DynamoDB operations; however, PutItem does not recognize any values other than NONE or ALL_OLD. 
    */
  var ReturnValues: js.UndefOr[ReturnValue] = js.undefined
  
  /**
    * The name of the table to contain the item.
    */
  var TableName: typings.awsSdk.dynamodbMod.TableName
}
object PutItemInput {
  
  @scala.inline
  def apply(Item: PutItemInputAttributeMap, TableName: TableName): PutItemInput = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutItemInput]
  }
  
  @scala.inline
  implicit class PutItemInputMutableBuilder[Self <: PutItemInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConditionExpression(value: ConditionExpression): Self = StObject.set(x, "ConditionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionExpressionUndefined: Self = StObject.set(x, "ConditionExpression", js.undefined)
    
    @scala.inline
    def setConditionalOperator(value: ConditionalOperator): Self = StObject.set(x, "ConditionalOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionalOperatorUndefined: Self = StObject.set(x, "ConditionalOperator", js.undefined)
    
    @scala.inline
    def setExpected(value: ExpectedAttributeMap): Self = StObject.set(x, "Expected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedUndefined: Self = StObject.set(x, "Expected", js.undefined)
    
    @scala.inline
    def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
    
    @scala.inline
    def setExpressionAttributeValues(value: ExpressionAttributeValueMap): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
    
    @scala.inline
    def setItem(value: PutItemInputAttributeMap): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
    
    @scala.inline
    def setReturnItemCollectionMetrics(value: ReturnItemCollectionMetrics): Self = StObject.set(x, "ReturnItemCollectionMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnItemCollectionMetricsUndefined: Self = StObject.set(x, "ReturnItemCollectionMetrics", js.undefined)
    
    @scala.inline
    def setReturnValues(value: ReturnValue): Self = StObject.set(x, "ReturnValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValuesUndefined: Self = StObject.set(x, "ReturnValues", js.undefined)
    
    @scala.inline
    def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
