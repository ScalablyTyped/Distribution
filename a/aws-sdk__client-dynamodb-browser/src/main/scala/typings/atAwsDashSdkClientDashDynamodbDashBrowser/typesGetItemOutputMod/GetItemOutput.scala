package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesGetItemOutputMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreAttributeValueMod._UnmarshalledAttributeValue
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreConsumedCapacityMod._UnmarshalledConsumedCapacity
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetItemOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The capacity units consumed by the <code>GetItem</code> operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. <code>ConsumedCapacity</code> is only returned if the <code>ReturnConsumedCapacity</code> parameter was specified. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var ConsumedCapacity: js.UndefOr[_UnmarshalledConsumedCapacity] = js.undefined
  /**
    * <p>A map of attribute names to <code>AttributeValue</code> objects, as specified by <code>ProjectionExpression</code>.</p>
    */
  var Item: js.UndefOr[StringDictionary[_UnmarshalledAttributeValue]] = js.undefined
}

object GetItemOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    ConsumedCapacity: _UnmarshalledConsumedCapacity = null,
    Item: StringDictionary[_UnmarshalledAttributeValue] = null
  ): GetItemOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (ConsumedCapacity != null) __obj.updateDynamic("ConsumedCapacity")(ConsumedCapacity.asInstanceOf[js.Any])
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetItemOutput]
  }
}

