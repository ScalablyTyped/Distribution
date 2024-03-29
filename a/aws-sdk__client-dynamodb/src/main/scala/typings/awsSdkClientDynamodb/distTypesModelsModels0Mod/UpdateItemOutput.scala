package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateItemOutput extends StObject {
  
  /**
    * <p>A map of attribute values as they appear before or after the <code>UpdateItem</code>
    *             operation, as determined by the <code>ReturnValues</code> parameter.</p>
    *          <p>The <code>Attributes</code> map is only present if the update was successful and <code>ReturnValues</code> was
    *             specified as something other than <code>NONE</code> in the request. Each element
    *             represents one attribute.</p>
    */
  var Attributes: js.UndefOr[Record[String, AttributeValue]] = js.undefined
  
  /**
    * <p>The capacity units consumed by the <code>UpdateItem</code> operation. The data
    *             returned includes the total provisioned throughput consumed, along with statistics for
    *             the table and any indexes involved in the operation. <code>ConsumedCapacity</code> is
    *             only returned if the <code>ReturnConsumedCapacity</code> parameter was specified. For
    *             more information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughput.html#ItemSizeCalculations.Reads">Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer
    *                 Guide</i>.</p>
    */
  var ConsumedCapacity: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConsumedCapacity] = js.undefined
  
  /**
    * <p>Information about item collections, if any, that were affected by the
    *                 <code>UpdateItem</code> operation. <code>ItemCollectionMetrics</code> is only
    *             returned if the <code>ReturnItemCollectionMetrics</code> parameter was specified. If the
    *             table does not have any local secondary indexes, this information is not returned in the
    *             response.</p>
    *          <p>Each <code>ItemCollectionMetrics</code> element consists of:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>ItemCollectionKey</code> - The partition key value of the item collection.
    *                     This is the same as the partition key value of the item itself.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>SizeEstimateRangeGB</code> - An estimate of item collection size, in
    *                     gigabytes. This value is a two-element array containing a lower bound and an
    *                     upper bound for the estimate. The estimate includes the size of all the items in
    *                     the table, plus the size of all attributes projected into all of the local
    *                     secondary indexes on that table. Use this estimate to measure whether a local
    *                     secondary index is approaching its size limit.</p>
    *                <p>The estimate is subject to change over time; therefore, do not rely on the
    *                     precision or accuracy of the estimate.</p>
    *             </li>
    *          </ul>
    */
  var ItemCollectionMetrics: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ItemCollectionMetrics] = js.undefined
}
object UpdateItemOutput {
  
  inline def apply(): UpdateItemOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateItemOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateItemOutput] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Record[String, AttributeValue]): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setConsumedCapacity(value: ConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
    
    inline def setItemCollectionMetrics(value: ItemCollectionMetrics): Self = StObject.set(x, "ItemCollectionMetrics", value.asInstanceOf[js.Any])
    
    inline def setItemCollectionMetricsUndefined: Self = StObject.set(x, "ItemCollectionMetrics", js.undefined)
  }
}
