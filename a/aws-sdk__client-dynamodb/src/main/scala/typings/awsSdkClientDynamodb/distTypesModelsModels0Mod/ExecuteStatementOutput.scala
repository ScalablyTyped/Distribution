package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteStatementOutput extends StObject {
  
  /**
    * <p>The capacity units consumed by an operation. The data returned includes the total
    *             provisioned throughput consumed, along with statistics for the table and any indexes
    *             involved in the operation. <code>ConsumedCapacity</code> is only returned if the request
    *             asked for it. For more information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer
    *                 Guide</i>.</p>
    */
  var ConsumedCapacity: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConsumedCapacity] = js.undefined
  
  /**
    * <p>If a read operation was used, this property will contain the result of the read
    *             operation; a map of attribute names and their values. For the write operations this
    *             value will be empty.</p>
    */
  var Items: js.UndefOr[js.Array[Record[String, AttributeValue]]] = js.undefined
  
  /**
    * <p>The primary key of the item where the operation stopped, inclusive of the previous
    *             result set. Use this value to start a new operation, excluding this value in the new
    *             request. If <code>LastEvaluatedKey</code> is empty, then the "last page" of results has
    *             been processed and there is no more data to be retrieved. If
    *                 <code>LastEvaluatedKey</code> is not empty, it does not necessarily mean that there
    *             is more data in the result set. The only way to know when you have reached the end of
    *             the result set is when <code>LastEvaluatedKey</code> is empty. </p>
    */
  var LastEvaluatedKey: js.UndefOr[Record[String, AttributeValue]] = js.undefined
  
  /**
    * <p>If the response of a read request exceeds the response payload limit DynamoDB will set
    *             this value in the response. If set, you can use that this value in the subsequent
    *             request to get the remaining results.</p>
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ExecuteStatementOutput {
  
  inline def apply(): ExecuteStatementOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteStatementOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecuteStatementOutput] (val x: Self) extends AnyVal {
    
    inline def setConsumedCapacity(value: ConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
    
    inline def setItems(value: js.Array[Record[String, AttributeValue]]): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: (Record[String, AttributeValue])*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setLastEvaluatedKey(value: Record[String, AttributeValue]): Self = StObject.set(x, "LastEvaluatedKey", value.asInstanceOf[js.Any])
    
    inline def setLastEvaluatedKeyUndefined: Self = StObject.set(x, "LastEvaluatedKey", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
