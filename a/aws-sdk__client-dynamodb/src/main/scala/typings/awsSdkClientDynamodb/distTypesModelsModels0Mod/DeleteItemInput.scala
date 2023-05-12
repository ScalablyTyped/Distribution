package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteItemInput extends StObject {
  
  /**
    * <p>A condition that must be satisfied in order for a conditional <code>DeleteItem</code>
    *             to succeed.</p>
    *          <p>An expression can contain any of the following:</p>
    *          <ul>
    *             <li>
    *                <p>Functions: <code>attribute_exists | attribute_not_exists | attribute_type |
    *                         contains | begins_with | size</code>
    *                </p>
    *                <p>These function names are case-sensitive.</p>
    *             </li>
    *             <li>
    *                <p>Comparison operators: <code>= | <> |
    *             < | > | <= | >= |
    *             BETWEEN | IN </code>
    *                </p>
    *             </li>
    *             <li>
    *                <p> Logical operators: <code>AND | OR | NOT</code>
    *                </p>
    *             </li>
    *          </ul>
    *          <p>For more information about condition expressions, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html">Condition Expressions</a> in the <i>Amazon DynamoDB Developer
    *                 Guide</i>.</p>
    */
  var ConditionExpression: js.UndefOr[String] = js.undefined
  
  /**
    * <p>This is a legacy parameter. Use <code>ConditionExpression</code> instead. For more
    *             information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html">ConditionalOperator</a> in the <i>Amazon DynamoDB Developer
    *                 Guide</i>.</p>
    */
  var ConditionalOperator: js.UndefOr[
    typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConditionalOperator | String
  ] = js.undefined
  
  /**
    * <p>This is a legacy parameter. Use <code>ConditionExpression</code> instead. For more
    *             information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.Expected.html">Expected</a> in the <i>Amazon DynamoDB Developer
    *             Guide</i>.</p>
    */
  var Expected: js.UndefOr[Record[String, ExpectedAttributeValue]] = js.undefined
  
  /**
    * <p>One or more substitution tokens for attribute names in an expression. The following
    *             are some use cases for using <code>ExpressionAttributeNames</code>:</p>
    *          <ul>
    *             <li>
    *                <p>To access an attribute whose name conflicts with a DynamoDB reserved
    *                     word.</p>
    *             </li>
    *             <li>
    *                <p>To create a placeholder for repeating occurrences of an attribute name in an
    *                     expression.</p>
    *             </li>
    *             <li>
    *                <p>To prevent special characters in an attribute name from being misinterpreted
    *                     in an expression.</p>
    *             </li>
    *          </ul>
    *          <p>Use the <b>#</b> character in an expression to dereference
    *             an attribute name. For example, consider the following attribute name:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>Percentile</code>
    *                </p>
    *             </li>
    *          </ul>
    *          <p>The name of this attribute conflicts with a reserved word, so it cannot be used
    *             directly in an expression. (For the complete list of reserved words, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved Words</a> in the <i>Amazon DynamoDB Developer
    *             Guide</i>). To work around this, you could specify the following for
    *                 <code>ExpressionAttributeNames</code>:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>\{"#P":"Percentile"\}</code>
    *                </p>
    *             </li>
    *          </ul>
    *          <p>You could then use this substitution in an expression, as in this example:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>#P = :val</code>
    *                </p>
    *             </li>
    *          </ul>
    *          <note>
    *             <p>Tokens that begin with the <b>:</b> character are
    *                     <i>expression attribute values</i>, which are placeholders for the
    *                 actual value at runtime.</p>
    *          </note>
    *          <p>For more information on expression attribute names, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Specifying Item Attributes</a> in the <i>Amazon DynamoDB Developer
    *                 Guide</i>.</p>
    */
  var ExpressionAttributeNames: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * <p>One or more values that can be substituted in an expression.</p>
    *          <p>Use the <b>:</b> (colon) character in an expression to
    *             dereference an attribute value. For example, suppose that you wanted to check whether
    *             the value of the <i>ProductStatus</i> attribute was one of the following: </p>
    *          <p>
    *             <code>Available | Backordered | Discontinued</code>
    *          </p>
    *          <p>You would first need to specify <code>ExpressionAttributeValues</code> as
    *             follows:</p>
    *          <p>
    *             <code>\{ ":avail":\{"S":"Available"\}, ":back":\{"S":"Backordered"\},
    *                 ":disc":\{"S":"Discontinued"\} \}</code>
    *          </p>
    *          <p>You could then use these values in an expression, such as this:</p>
    *          <p>
    *             <code>ProductStatus IN (:avail, :back, :disc)</code>
    *          </p>
    *          <p>For more information on expression attribute values, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html">Condition Expressions</a> in the <i>Amazon DynamoDB Developer
    *                 Guide</i>.</p>
    */
  var ExpressionAttributeValues: js.UndefOr[Record[String, AttributeValue]] = js.undefined
  
  /**
    * <p>A map of attribute names to <code>AttributeValue</code> objects, representing the
    *             primary key of the item to delete.</p>
    *          <p>For the primary key, you must provide all of the key attributes. For example, with a
    *             simple primary key, you only need to provide a value for the partition key. For a
    *             composite primary key, you must provide values for both the partition key and the sort
    *             key.</p>
    */
  var Key: js.UndefOr[Record[String, AttributeValue]] = js.undefined
  
  /**
    * <p>Determines the level of detail about either provisioned or on-demand throughput
    *             consumption that is returned in the response:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>INDEXES</code> - The response includes the aggregate
    *                         <code>ConsumedCapacity</code> for the operation, together with
    *                         <code>ConsumedCapacity</code> for each table and secondary index that was
    *                     accessed.</p>
    *                <p>Note that some operations, such as <code>GetItem</code> and
    *                         <code>BatchGetItem</code>, do not access any indexes at all. In these cases,
    *                     specifying <code>INDEXES</code> will only return <code>ConsumedCapacity</code>
    *                     information for table(s).</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>TOTAL</code> - The response includes only the aggregate
    *                         <code>ConsumedCapacity</code> for the operation.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>NONE</code> - No <code>ConsumedCapacity</code> details are included in the
    *                     response.</p>
    *             </li>
    *          </ul>
    */
  var ReturnConsumedCapacity: js.UndefOr[
    typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnConsumedCapacity | String
  ] = js.undefined
  
  /**
    * <p>Determines whether item collection metrics are returned. If set to <code>SIZE</code>,
    *             the response includes statistics about item collections, if any, that were modified
    *             during the operation are returned in the response. If set to <code>NONE</code> (the
    *             default), no statistics are returned.</p>
    */
  var ReturnItemCollectionMetrics: js.UndefOr[
    typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnItemCollectionMetrics | String
  ] = js.undefined
  
  /**
    * <p>Use <code>ReturnValues</code> if you want to get the item attributes as they appeared
    *             before they were deleted. For <code>DeleteItem</code>, the valid values are:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>NONE</code> - If <code>ReturnValues</code> is not specified, or if its
    *                     value is <code>NONE</code>, then nothing is returned. (This setting is the
    *                     default for <code>ReturnValues</code>.)</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>ALL_OLD</code> - The content of the old item is returned.</p>
    *             </li>
    *          </ul>
    *          <p>There is no additional cost associated with requesting a return value aside from the
    *             small network and processing overhead of receiving a larger response. No read capacity
    *             units are consumed.</p>
    *          <note>
    *             <p>The <code>ReturnValues</code> parameter is used by several DynamoDB operations;
    *                 however, <code>DeleteItem</code> does not recognize any values other than
    *                     <code>NONE</code> or <code>ALL_OLD</code>.</p>
    *          </note>
    */
  var ReturnValues: js.UndefOr[ReturnValue | String] = js.undefined
  
  /**
    * <p>The name of the table from which to delete the item.</p>
    */
  var TableName: js.UndefOr[String] = js.undefined
}
object DeleteItemInput {
  
  inline def apply(): DeleteItemInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteItemInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteItemInput] (val x: Self) extends AnyVal {
    
    inline def setConditionExpression(value: String): Self = StObject.set(x, "ConditionExpression", value.asInstanceOf[js.Any])
    
    inline def setConditionExpressionUndefined: Self = StObject.set(x, "ConditionExpression", js.undefined)
    
    inline def setConditionalOperator(value: ConditionalOperator | String): Self = StObject.set(x, "ConditionalOperator", value.asInstanceOf[js.Any])
    
    inline def setConditionalOperatorUndefined: Self = StObject.set(x, "ConditionalOperator", js.undefined)
    
    inline def setExpected(value: Record[String, ExpectedAttributeValue]): Self = StObject.set(x, "Expected", value.asInstanceOf[js.Any])
    
    inline def setExpectedUndefined: Self = StObject.set(x, "Expected", js.undefined)
    
    inline def setExpressionAttributeNames(value: Record[String, String]): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
    
    inline def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
    
    inline def setExpressionAttributeValues(value: Record[String, AttributeValue]): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
    
    inline def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
    
    inline def setKey(value: Record[String, AttributeValue]): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity | String): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
    
    inline def setReturnItemCollectionMetrics(value: ReturnItemCollectionMetrics | String): Self = StObject.set(x, "ReturnItemCollectionMetrics", value.asInstanceOf[js.Any])
    
    inline def setReturnItemCollectionMetricsUndefined: Self = StObject.set(x, "ReturnItemCollectionMetrics", js.undefined)
    
    inline def setReturnValues(value: ReturnValue | String): Self = StObject.set(x, "ReturnValues", value.asInstanceOf[js.Any])
    
    inline def setReturnValuesUndefined: Self = StObject.set(x, "ReturnValues", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
