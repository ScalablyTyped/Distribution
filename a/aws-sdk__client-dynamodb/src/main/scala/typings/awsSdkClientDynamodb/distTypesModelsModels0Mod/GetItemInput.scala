package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetItemInput extends StObject {
  
  /**
    * <p>This is a legacy parameter. Use <code>ProjectionExpression</code> instead. For more
    *             information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html">AttributesToGet</a> in the <i>Amazon DynamoDB Developer
    *             Guide</i>.</p>
    */
  var AttributesToGet: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * <p>Determines the read consistency model: If set to <code>true</code>, then the operation
    *             uses strongly consistent reads; otherwise, the operation uses eventually consistent
    *             reads.</p>
    */
  var ConsistentRead: js.UndefOr[Boolean] = js.undefined
  
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
    * <p>A map of attribute names to <code>AttributeValue</code> objects, representing the
    *             primary key of the item to retrieve.</p>
    *          <p>For the primary key, you must provide all of the attributes. For example, with a
    *             simple primary key, you only need to provide a value for the partition key. For a
    *             composite primary key, you must provide values for both the partition key and the sort
    *             key.</p>
    */
  var Key: js.UndefOr[Record[String, AttributeValue]] = js.undefined
  
  /**
    * <p>A string that identifies one or more attributes to retrieve from the table. These
    *             attributes can include scalars, sets, or elements of a JSON document. The attributes in
    *             the expression must be separated by commas.</p>
    *          <p>If no attribute names are specified, then all attributes are returned. If any of the
    *             requested attributes are not found, they do not appear in the result.</p>
    *          <p>For more information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Specifying Item Attributes</a> in the <i>Amazon DynamoDB Developer
    *                 Guide</i>.</p>
    */
  var ProjectionExpression: js.UndefOr[String] = js.undefined
  
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
    * <p>The name of the table containing the requested item.</p>
    */
  var TableName: js.UndefOr[String] = js.undefined
}
object GetItemInput {
  
  inline def apply(): GetItemInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetItemInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetItemInput] (val x: Self) extends AnyVal {
    
    inline def setAttributesToGet(value: js.Array[String]): Self = StObject.set(x, "AttributesToGet", value.asInstanceOf[js.Any])
    
    inline def setAttributesToGetUndefined: Self = StObject.set(x, "AttributesToGet", js.undefined)
    
    inline def setAttributesToGetVarargs(value: String*): Self = StObject.set(x, "AttributesToGet", js.Array(value*))
    
    inline def setConsistentRead(value: Boolean): Self = StObject.set(x, "ConsistentRead", value.asInstanceOf[js.Any])
    
    inline def setConsistentReadUndefined: Self = StObject.set(x, "ConsistentRead", js.undefined)
    
    inline def setExpressionAttributeNames(value: Record[String, String]): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
    
    inline def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
    
    inline def setKey(value: Record[String, AttributeValue]): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setProjectionExpression(value: String): Self = StObject.set(x, "ProjectionExpression", value.asInstanceOf[js.Any])
    
    inline def setProjectionExpressionUndefined: Self = StObject.set(x, "ProjectionExpression", js.undefined)
    
    inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity | String): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
