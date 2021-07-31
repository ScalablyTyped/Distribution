package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateItemOutput extends StObject {
  
  /**
    * A map of attribute values as they appear before or after the UpdateItem operation, as determined by the ReturnValues parameter. The Attributes map is only present if ReturnValues was specified as something other than NONE in the request. Each element represents one attribute.
    */
  var Attributes: js.UndefOr[AttributeMap] = js.undefined
  
  /**
    * The capacity units consumed by the UpdateItem operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Provisioned Throughput in the Amazon DynamoDB Developer Guide.
    */
  var ConsumedCapacity: js.UndefOr[typings.awsSdk.dynamodbMod.ConsumedCapacity] = js.undefined
  
  /**
    * Information about item collections, if any, that were affected by the UpdateItem operation. ItemCollectionMetrics is only returned if the ReturnItemCollectionMetrics parameter was specified. If the table does not have any local secondary indexes, this information is not returned in the response. Each ItemCollectionMetrics element consists of:    ItemCollectionKey - The partition key value of the item collection. This is the same as the partition key value of the item itself.    SizeEstimateRangeGB - An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size limit. The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.  
    */
  var ItemCollectionMetrics: js.UndefOr[typings.awsSdk.dynamodbMod.ItemCollectionMetrics] = js.undefined
}
object UpdateItemOutput {
  
  @scala.inline
  def apply(): UpdateItemOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateItemOutput]
  }
  
  @scala.inline
  implicit class UpdateItemOutputMutableBuilder[Self <: UpdateItemOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: AttributeMap): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setConsumedCapacity(value: ConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
    
    @scala.inline
    def setItemCollectionMetrics(value: ItemCollectionMetrics): Self = StObject.set(x, "ItemCollectionMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemCollectionMetricsUndefined: Self = StObject.set(x, "ItemCollectionMetrics", js.undefined)
  }
}
