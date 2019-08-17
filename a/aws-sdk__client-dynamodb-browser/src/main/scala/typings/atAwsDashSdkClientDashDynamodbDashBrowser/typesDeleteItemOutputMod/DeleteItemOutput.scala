package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDeleteItemOutputMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreAttributeValueMod._UnmarshalledAttributeValue
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreConsumedCapacityMod._UnmarshalledConsumedCapacity
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreItemCollectionMetricsMod._UnmarshalledItemCollectionMetrics
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteItemOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>A map of attribute names to <code>AttributeValue</code> objects, representing the item as it appeared before the <code>DeleteItem</code> operation. This map appears in the response only if <code>ReturnValues</code> was specified as <code>ALL_OLD</code> in the request.</p>
    */
  var Attributes: js.UndefOr[StringDictionary[_UnmarshalledAttributeValue]] = js.undefined
  /**
    * <p>The capacity units consumed by the <code>DeleteItem</code> operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. <code>ConsumedCapacity</code> is only returned if the <code>ReturnConsumedCapacity</code> parameter was specified. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var ConsumedCapacity: js.UndefOr[_UnmarshalledConsumedCapacity] = js.undefined
  /**
    * <p>Information about item collections, if any, that were affected by the <code>DeleteItem</code> operation. <code>ItemCollectionMetrics</code> is only returned if the <code>ReturnItemCollectionMetrics</code> parameter was specified. If the table does not have any local secondary indexes, this information is not returned in the response.</p> <p>Each <code>ItemCollectionMetrics</code> element consists of:</p> <ul> <li> <p> <code>ItemCollectionKey</code> - The partition key value of the item collection. This is the same as the partition key value of the item itself.</p> </li> <li> <p> <code>SizeEstimateRangeGB</code> - An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size limit.</p> <p>The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.</p> </li> </ul>
    */
  var ItemCollectionMetrics: js.UndefOr[_UnmarshalledItemCollectionMetrics] = js.undefined
}

object DeleteItemOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Attributes: StringDictionary[_UnmarshalledAttributeValue] = null,
    ConsumedCapacity: _UnmarshalledConsumedCapacity = null,
    ItemCollectionMetrics: _UnmarshalledItemCollectionMetrics = null
  ): DeleteItemOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (ConsumedCapacity != null) __obj.updateDynamic("ConsumedCapacity")(ConsumedCapacity)
    if (ItemCollectionMetrics != null) __obj.updateDynamic("ItemCollectionMetrics")(ItemCollectionMetrics)
    __obj.asInstanceOf[DeleteItemOutput]
  }
}

