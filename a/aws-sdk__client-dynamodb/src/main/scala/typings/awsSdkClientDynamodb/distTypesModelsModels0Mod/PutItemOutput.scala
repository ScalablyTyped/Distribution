package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutItemOutput extends StObject {
  
  /**
    * <p>The attribute values as they appeared before the <code>PutItem</code> operation, but
    *             only if <code>ReturnValues</code> is specified as <code>ALL_OLD</code> in the request.
    *             Each element consists of an attribute name and an attribute value.</p>
    */
  var Attributes: js.UndefOr[Record[String, AttributeValue]] = js.undefined
  
  /**
    * <p>The capacity units consumed by the <code>PutItem</code> operation. The data returned
    *             includes the total provisioned throughput consumed, along with statistics for the table
    *             and any indexes involved in the operation. <code>ConsumedCapacity</code> is only
    *             returned if the <code>ReturnConsumedCapacity</code> parameter was specified. For more
    *             information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer
    *                 Guide</i>.</p>
    */
  var ConsumedCapacity: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConsumedCapacity] = js.undefined
  
  /**
    * <p>Information about item collections, if any, that were affected by the
    *                 <code>PutItem</code> operation. <code>ItemCollectionMetrics</code> is only returned
    *             if the <code>ReturnItemCollectionMetrics</code> parameter was specified. If the table
    *             does not have any local secondary indexes, this information is not returned in the
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
object PutItemOutput {
  
  inline def apply(): PutItemOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutItemOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutItemOutput] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Record[String, AttributeValue]): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setConsumedCapacity(value: ConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
    
    inline def setItemCollectionMetrics(value: ItemCollectionMetrics): Self = StObject.set(x, "ItemCollectionMetrics", value.asInstanceOf[js.Any])
    
    inline def setItemCollectionMetricsUndefined: Self = StObject.set(x, "ItemCollectionMetrics", js.undefined)
  }
}
