package typings.awsSdkClientDynamodbNode.typesQueryOutputMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesAttributeValueMod.UnmarshalledAttributeValue
import typings.awsSdkClientDynamodbNode.typesConsumedCapacityMod.UnmarshalledConsumedCapacity
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The capacity units consumed by the <code>Query</code> operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. <code>ConsumedCapacity</code> is only returned if the <code>ReturnConsumedCapacity</code> parameter was specified For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var ConsumedCapacity: js.UndefOr[UnmarshalledConsumedCapacity] = js.undefined
  /**
    * <p>The number of items in the response.</p> <p>If you used a <code>QueryFilter</code> in the request, then <code>Count</code> is the number of items returned after the filter was applied, and <code>ScannedCount</code> is the number of matching items before the filter was applied.</p> <p>If you did not use a filter in the request, then <code>Count</code> and <code>ScannedCount</code> are the same.</p>
    */
  var Count: js.UndefOr[Double] = js.undefined
  /**
    * <p>An array of item attributes that match the query criteria. Each element in this array consists of an attribute name and the value for that attribute.</p>
    */
  var Items: js.UndefOr[js.Array[StringDictionary[UnmarshalledAttributeValue]]] = js.undefined
  /**
    * <p>The primary key of the item where the operation stopped, inclusive of the previous result set. Use this value to start a new operation, excluding this value in the new request.</p> <p>If <code>LastEvaluatedKey</code> is empty, then the "last page" of results has been processed and there is no more data to be retrieved.</p> <p>If <code>LastEvaluatedKey</code> is not empty, it does not necessarily mean that there is more data in the result set. The only way to know when you have reached the end of the result set is when <code>LastEvaluatedKey</code> is empty.</p>
    */
  var LastEvaluatedKey: js.UndefOr[StringDictionary[UnmarshalledAttributeValue]] = js.undefined
  /**
    * <p>The number of items evaluated, before any <code>QueryFilter</code> is applied. A high <code>ScannedCount</code> value with few, or no, <code>Count</code> results indicates an inefficient <code>Query</code> operation. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count">Count and ScannedCount</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p> <p>If you did not use a filter in the request, then <code>ScannedCount</code> is the same as <code>Count</code>.</p>
    */
  var ScannedCount: js.UndefOr[Double] = js.undefined
}

object QueryOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    ConsumedCapacity: UnmarshalledConsumedCapacity = null,
    Count: js.UndefOr[Double] = js.undefined,
    Items: js.Array[StringDictionary[UnmarshalledAttributeValue]] = null,
    LastEvaluatedKey: StringDictionary[UnmarshalledAttributeValue] = null,
    ScannedCount: js.UndefOr[Double] = js.undefined
  ): QueryOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (ConsumedCapacity != null) __obj.updateDynamic("ConsumedCapacity")(ConsumedCapacity.asInstanceOf[js.Any])
    if (!js.isUndefined(Count)) __obj.updateDynamic("Count")(Count.get.asInstanceOf[js.Any])
    if (Items != null) __obj.updateDynamic("Items")(Items.asInstanceOf[js.Any])
    if (LastEvaluatedKey != null) __obj.updateDynamic("LastEvaluatedKey")(LastEvaluatedKey.asInstanceOf[js.Any])
    if (!js.isUndefined(ScannedCount)) __obj.updateDynamic("ScannedCount")(ScannedCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOutput]
  }
}

