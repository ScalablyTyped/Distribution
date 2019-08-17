package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesBatchGetItemOutputMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreAttributeValueMod._UnmarshalledAttributeValue
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreConsumedCapacityMod._UnmarshalledConsumedCapacity
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreKeysAndAttributesMod._UnmarshalledKeysAndAttributes
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetItemOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The read capacity units consumed by the entire <code>BatchGetItem</code> operation.</p> <p>Each element consists of:</p> <ul> <li> <p> <code>TableName</code> - The table that consumed the provisioned throughput.</p> </li> <li> <p> <code>CapacityUnits</code> - The total number of capacity units consumed.</p> </li> </ul>
    */
  var ConsumedCapacity: js.UndefOr[js.Array[_UnmarshalledConsumedCapacity]] = js.undefined
  /**
    * <p>A map of table name to a list of items. Each object in <code>Responses</code> consists of a table name, along with a map of attribute data consisting of the data type and attribute value.</p>
    */
  var Responses: js.UndefOr[StringDictionary[js.Array[StringDictionary[_UnmarshalledAttributeValue]]]] = js.undefined
  /**
    * <p>A map of tables and their respective keys that were not processed with the current response. The <code>UnprocessedKeys</code> value is in the same form as <code>RequestItems</code>, so the value can be provided directly to a subsequent <code>BatchGetItem</code> operation. For more information, see <code>RequestItems</code> in the Request Parameters section.</p> <p>Each element consists of:</p> <ul> <li> <p> <code>Keys</code> - An array of primary key attribute values that define specific items in the table.</p> </li> <li> <p> <code>ProjectionExpression</code> - One or more attributes to be retrieved from the table or index. By default, all attributes are returned. If a requested attribute is not found, it does not appear in the result.</p> </li> <li> <p> <code>ConsistentRead</code> - The consistency of a read operation. If set to <code>true</code>, then a strongly consistent read is used; otherwise, an eventually consistent read is used.</p> </li> </ul> <p>If there are no unprocessed keys remaining, the response contains an empty <code>UnprocessedKeys</code> map.</p>
    */
  var UnprocessedKeys: js.UndefOr[StringDictionary[_UnmarshalledKeysAndAttributes]] = js.undefined
}

object BatchGetItemOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    ConsumedCapacity: js.Array[_UnmarshalledConsumedCapacity] = null,
    Responses: StringDictionary[js.Array[StringDictionary[_UnmarshalledAttributeValue]]] = null,
    UnprocessedKeys: StringDictionary[_UnmarshalledKeysAndAttributes] = null
  ): BatchGetItemOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (ConsumedCapacity != null) __obj.updateDynamic("ConsumedCapacity")(ConsumedCapacity)
    if (Responses != null) __obj.updateDynamic("Responses")(Responses)
    if (UnprocessedKeys != null) __obj.updateDynamic("UnprocessedKeys")(UnprocessedKeys)
    __obj.asInstanceOf[BatchGetItemOutput]
  }
}

