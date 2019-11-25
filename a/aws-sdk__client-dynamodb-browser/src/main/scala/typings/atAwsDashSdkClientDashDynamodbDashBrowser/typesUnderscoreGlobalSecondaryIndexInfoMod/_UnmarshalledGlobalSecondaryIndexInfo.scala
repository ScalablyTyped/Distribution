package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreGlobalSecondaryIndexInfoMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreKeySchemaElementMod._UnmarshalledKeySchemaElement
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreProjectionMod._UnmarshalledProjection
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreProvisionedThroughputMod._UnmarshalledProvisionedThroughput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledGlobalSecondaryIndexInfo extends _GlobalSecondaryIndexInfo {
  /**
    * <p>The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:</p> <ul> <li> <p> <code>HASH</code> - partition key</p> </li> <li> <p> <code>RANGE</code> - sort key</p> </li> </ul> <note> <p>The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.</p> <p>The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.</p> </note>
    */
  @JSName("KeySchema")
  var KeySchema__UnmarshalledGlobalSecondaryIndexInfo: js.UndefOr[js.Array[_UnmarshalledKeySchemaElement]] = js.undefined
  /**
    * <p>Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. </p>
    */
  @JSName("Projection")
  var Projection__UnmarshalledGlobalSecondaryIndexInfo: js.UndefOr[_UnmarshalledProjection] = js.undefined
  /**
    * <p>Represents the provisioned throughput settings for the specified global secondary index. </p>
    */
  @JSName("ProvisionedThroughput")
  var ProvisionedThroughput__UnmarshalledGlobalSecondaryIndexInfo: js.UndefOr[_UnmarshalledProvisionedThroughput] = js.undefined
}

object _UnmarshalledGlobalSecondaryIndexInfo {
  @scala.inline
  def apply(
    IndexName: String = null,
    KeySchema: js.Array[_UnmarshalledKeySchemaElement] = null,
    Projection: _UnmarshalledProjection = null,
    ProvisionedThroughput: _UnmarshalledProvisionedThroughput = null
  ): _UnmarshalledGlobalSecondaryIndexInfo = {
    val __obj = js.Dynamic.literal()
    if (IndexName != null) __obj.updateDynamic("IndexName")(IndexName.asInstanceOf[js.Any])
    if (KeySchema != null) __obj.updateDynamic("KeySchema")(KeySchema.asInstanceOf[js.Any])
    if (Projection != null) __obj.updateDynamic("Projection")(Projection.asInstanceOf[js.Any])
    if (ProvisionedThroughput != null) __obj.updateDynamic("ProvisionedThroughput")(ProvisionedThroughput.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledGlobalSecondaryIndexInfo]
  }
}

