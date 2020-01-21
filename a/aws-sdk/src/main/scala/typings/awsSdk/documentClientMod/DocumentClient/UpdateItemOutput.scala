package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateItemOutput extends js.Object {
  /**
    * A map of attribute values as they appear before or after the UpdateItem operation, as determined by the ReturnValues parameter. The Attributes map is only present if ReturnValues was specified as something other than NONE in the request. Each element represents one attribute.
    */
  var Attributes: js.UndefOr[AttributeMap] = js.native
  /**
    * The capacity units consumed by the UpdateItem operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Provisioned Throughput in the Amazon DynamoDB Developer Guide.
    */
  var ConsumedCapacity: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ConsumedCapacity] = js.native
  /**
    * Information about item collections, if any, that were affected by the UpdateItem operation. ItemCollectionMetrics is only returned if the ReturnItemCollectionMetrics parameter was specified. If the table does not have any local secondary indexes, this information is not returned in the response. Each ItemCollectionMetrics element consists of:    ItemCollectionKey - The partition key value of the item collection. This is the same as the partition key value of the item itself.    SizeEstimateRangeGB - An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size limit. The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.  
    */
  var ItemCollectionMetrics: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ItemCollectionMetrics] = js.native
}

object UpdateItemOutput {
  @scala.inline
  def apply(
    Attributes: AttributeMap = null,
    ConsumedCapacity: ConsumedCapacity = null,
    ItemCollectionMetrics: ItemCollectionMetrics = null
  ): UpdateItemOutput = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (ConsumedCapacity != null) __obj.updateDynamic("ConsumedCapacity")(ConsumedCapacity.asInstanceOf[js.Any])
    if (ItemCollectionMetrics != null) __obj.updateDynamic("ItemCollectionMetrics")(ItemCollectionMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateItemOutput]
  }
}

