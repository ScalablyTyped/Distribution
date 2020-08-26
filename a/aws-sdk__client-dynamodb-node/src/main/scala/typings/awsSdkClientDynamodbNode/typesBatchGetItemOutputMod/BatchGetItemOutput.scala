package typings.awsSdkClientDynamodbNode.typesBatchGetItemOutputMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesAttributeValueMod.UnmarshalledAttributeValue
import typings.awsSdkClientDynamodbNode.typesConsumedCapacityMod.UnmarshalledConsumedCapacity
import typings.awsSdkClientDynamodbNode.typesKeysAndAttributesMod.UnmarshalledKeysAndAttributes
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetItemOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The read capacity units consumed by the entire <code>BatchGetItem</code> operation.</p> <p>Each element consists of:</p> <ul> <li> <p> <code>TableName</code> - The table that consumed the provisioned throughput.</p> </li> <li> <p> <code>CapacityUnits</code> - The total number of capacity units consumed.</p> </li> </ul>
    */
  var ConsumedCapacity: js.UndefOr[js.Array[UnmarshalledConsumedCapacity]] = js.native
  /**
    * <p>A map of table name to a list of items. Each object in <code>Responses</code> consists of a table name, along with a map of attribute data consisting of the data type and attribute value.</p>
    */
  var Responses: js.UndefOr[StringDictionary[js.Array[StringDictionary[UnmarshalledAttributeValue]]]] = js.native
  /**
    * <p>A map of tables and their respective keys that were not processed with the current response. The <code>UnprocessedKeys</code> value is in the same form as <code>RequestItems</code>, so the value can be provided directly to a subsequent <code>BatchGetItem</code> operation. For more information, see <code>RequestItems</code> in the Request Parameters section.</p> <p>Each element consists of:</p> <ul> <li> <p> <code>Keys</code> - An array of primary key attribute values that define specific items in the table.</p> </li> <li> <p> <code>ProjectionExpression</code> - One or more attributes to be retrieved from the table or index. By default, all attributes are returned. If a requested attribute is not found, it does not appear in the result.</p> </li> <li> <p> <code>ConsistentRead</code> - The consistency of a read operation. If set to <code>true</code>, then a strongly consistent read is used; otherwise, an eventually consistent read is used.</p> </li> </ul> <p>If there are no unprocessed keys remaining, the response contains an empty <code>UnprocessedKeys</code> map.</p>
    */
  var UnprocessedKeys: js.UndefOr[StringDictionary[UnmarshalledKeysAndAttributes]] = js.native
}

object BatchGetItemOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): BatchGetItemOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetItemOutput]
  }
  @scala.inline
  implicit class BatchGetItemOutputOps[Self <: BatchGetItemOutput] (val x: Self) extends AnyVal {
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
    def setConsumedCapacityVarargs(value: UnmarshalledConsumedCapacity*): Self = this.set("ConsumedCapacity", js.Array(value :_*))
    @scala.inline
    def setConsumedCapacity(value: js.Array[UnmarshalledConsumedCapacity]): Self = this.set("ConsumedCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsumedCapacity: Self = this.set("ConsumedCapacity", js.undefined)
    @scala.inline
    def setResponses(value: StringDictionary[js.Array[StringDictionary[UnmarshalledAttributeValue]]]): Self = this.set("Responses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponses: Self = this.set("Responses", js.undefined)
    @scala.inline
    def setUnprocessedKeys(value: StringDictionary[UnmarshalledKeysAndAttributes]): Self = this.set("UnprocessedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnprocessedKeys: Self = this.set("UnprocessedKeys", js.undefined)
  }
  
}

