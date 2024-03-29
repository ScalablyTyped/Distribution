package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetItemInput extends StObject {
  
  /**
    * <p>A map of one or more table names and, for each table, a map that describes one or more
    *             items to retrieve from that table. Each table name can be used only once per
    *                 <code>BatchGetItem</code> request.</p>
    *          <p>Each element in the map of items to retrieve consists of the following:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>ConsistentRead</code> - If <code>true</code>, a strongly consistent read
    *                     is used; if <code>false</code> (the default), an eventually consistent read is
    *                     used.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>ExpressionAttributeNames</code> - One or more substitution tokens for
    *                     attribute names in the <code>ProjectionExpression</code> parameter. The
    *                     following are some use cases for using
    *                     <code>ExpressionAttributeNames</code>:</p>
    *                <ul>
    *                   <li>
    *                      <p>To access an attribute whose name conflicts with a DynamoDB reserved
    *                             word.</p>
    *                   </li>
    *                   <li>
    *                      <p>To create a placeholder for repeating occurrences of an attribute name
    *                             in an expression.</p>
    *                   </li>
    *                   <li>
    *                      <p>To prevent special characters in an attribute name from being
    *                             misinterpreted in an expression.</p>
    *                   </li>
    *                </ul>
    *                <p>Use the <b>#</b> character in an expression to
    *                     dereference an attribute name. For example, consider the following attribute
    *                     name:</p>
    *                <ul>
    *                   <li>
    *                      <p>
    *                         <code>Percentile</code>
    *                      </p>
    *                   </li>
    *                </ul>
    *                <p>The name of this attribute conflicts with a reserved word, so it cannot be
    *                     used directly in an expression. (For the complete list of reserved words, see
    *                         <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved
    *                         Words</a> in the <i>Amazon DynamoDB Developer Guide</i>).
    *                     To work around this, you could specify the following for
    *                         <code>ExpressionAttributeNames</code>:</p>
    *                <ul>
    *                   <li>
    *                      <p>
    *                         <code>\{"#P":"Percentile"\}</code>
    *                      </p>
    *                   </li>
    *                </ul>
    *                <p>You could then use this substitution in an expression, as in this
    *                     example:</p>
    *                <ul>
    *                   <li>
    *                      <p>
    *                         <code>#P = :val</code>
    *                      </p>
    *                   </li>
    *                </ul>
    *                <note>
    *                   <p>Tokens that begin with the <b>:</b> character
    *                         are <i>expression attribute values</i>, which are placeholders
    *                         for the actual value at runtime.</p>
    *                </note>
    *                <p>For more information about expression attribute names, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing Item Attributes</a> in the <i>Amazon DynamoDB
    *                         Developer Guide</i>.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>Keys</code> - An array of primary key attribute values that define
    *                     specific items in the table. For each primary key, you must provide
    *                         <i>all</i> of the key attributes. For example, with a simple
    *                     primary key, you only need to provide the partition key value. For a composite
    *                     key, you must provide <i>both</i> the partition key value and the
    *                     sort key value.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>ProjectionExpression</code> - A string that identifies one or more
    *                     attributes to retrieve from the table. These attributes can include scalars,
    *                     sets, or elements of a JSON document. The attributes in the expression must be
    *                     separated by commas.</p>
    *                <p>If no attribute names are specified, then all attributes are returned. If any
    *                     of the requested attributes are not found, they do not appear in the
    *                     result.</p>
    *                <p>For more information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing Item Attributes</a> in the <i>Amazon DynamoDB
    *                         Developer Guide</i>.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>AttributesToGet</code> - This is a legacy parameter. Use
    *                         <code>ProjectionExpression</code> instead. For more information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html">AttributesToGet</a> in the <i>Amazon DynamoDB Developer
    *                         Guide</i>. </p>
    *             </li>
    *          </ul>
    */
  var RequestItems: js.UndefOr[Record[String, KeysAndAttributes]] = js.undefined
  
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
}
object BatchGetItemInput {
  
  inline def apply(): BatchGetItemInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetItemInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetItemInput] (val x: Self) extends AnyVal {
    
    inline def setRequestItems(value: Record[String, KeysAndAttributes]): Self = StObject.set(x, "RequestItems", value.asInstanceOf[js.Any])
    
    inline def setRequestItemsUndefined: Self = StObject.set(x, "RequestItems", js.undefined)
    
    inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity | String): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
  }
}
