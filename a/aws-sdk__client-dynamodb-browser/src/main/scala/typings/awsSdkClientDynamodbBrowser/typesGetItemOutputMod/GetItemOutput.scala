package typings.awsSdkClientDynamodbBrowser.typesGetItemOutputMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesAttributeValueMod.UnmarshalledAttributeValue
import typings.awsSdkClientDynamodbBrowser.typesConsumedCapacityMod.UnmarshalledConsumedCapacity
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetItemOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The capacity units consumed by the <code>GetItem</code> operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. <code>ConsumedCapacity</code> is only returned if the <code>ReturnConsumedCapacity</code> parameter was specified. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var ConsumedCapacity: js.UndefOr[UnmarshalledConsumedCapacity] = js.native
  /**
    * <p>A map of attribute names to <code>AttributeValue</code> objects, as specified by <code>ProjectionExpression</code>.</p>
    */
  var Item: js.UndefOr[StringDictionary[UnmarshalledAttributeValue]] = js.native
}

object GetItemOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetItemOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetItemOutput]
  }
  @scala.inline
  implicit class GetItemOutputOps[Self <: GetItemOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsumedCapacity(value: UnmarshalledConsumedCapacity): Self = this.set("ConsumedCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsumedCapacity: Self = this.set("ConsumedCapacity", js.undefined)
    @scala.inline
    def setItem(value: StringDictionary[UnmarshalledAttributeValue]): Self = this.set("Item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("Item", js.undefined)
  }
  
}

