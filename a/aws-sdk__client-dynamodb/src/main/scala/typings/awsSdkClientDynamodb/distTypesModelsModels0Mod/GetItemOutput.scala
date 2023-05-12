package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetItemOutput extends StObject {
  
  /**
    * <p>The capacity units consumed by the <code>GetItem</code> operation. The data returned
    *             includes the total provisioned throughput consumed, along with statistics for the table
    *             and any indexes involved in the operation. <code>ConsumedCapacity</code> is only
    *             returned if the <code>ReturnConsumedCapacity</code> parameter was specified. For more
    *             information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughput.html#ItemSizeCalculations.Reads">Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer
    *                 Guide</i>.</p>
    */
  var ConsumedCapacity: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConsumedCapacity] = js.undefined
  
  /**
    * <p>A map of attribute names to <code>AttributeValue</code> objects, as specified by
    *                 <code>ProjectionExpression</code>.</p>
    */
  var Item: js.UndefOr[Record[String, AttributeValue]] = js.undefined
}
object GetItemOutput {
  
  inline def apply(): GetItemOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetItemOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetItemOutput] (val x: Self) extends AnyVal {
    
    inline def setConsumedCapacity(value: ConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
    
    inline def setItem(value: Record[String, AttributeValue]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
  }
}
