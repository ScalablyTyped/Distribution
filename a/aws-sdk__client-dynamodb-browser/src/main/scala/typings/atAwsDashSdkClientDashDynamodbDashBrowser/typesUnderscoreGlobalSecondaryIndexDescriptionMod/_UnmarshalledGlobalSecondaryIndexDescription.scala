package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreGlobalSecondaryIndexDescriptionMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.ACTIVE
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.CREATING
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.DELETING
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.UPDATING
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreKeySchemaElementMod._UnmarshalledKeySchemaElement
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreProjectionMod._UnmarshalledProjection
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreProvisionedThroughputDescriptionMod._UnmarshalledProvisionedThroughputDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledGlobalSecondaryIndexDescription extends _GlobalSecondaryIndexDescription {
  /**
    * <p>The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:</p> <ul> <li> <p> <code>HASH</code> - partition key</p> </li> <li> <p> <code>RANGE</code> - sort key</p> </li> </ul> <note> <p>The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.</p> <p>The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.</p> </note>
    */
  @JSName("KeySchema")
  var KeySchema__UnmarshalledGlobalSecondaryIndexDescription: js.UndefOr[js.Array[_UnmarshalledKeySchemaElement]] = js.undefined
  /**
    * <p>Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. </p>
    */
  @JSName("Projection")
  var Projection__UnmarshalledGlobalSecondaryIndexDescription: js.UndefOr[_UnmarshalledProjection] = js.undefined
  /**
    * <p>Represents the provisioned throughput settings for the specified global secondary index.</p> <p>For current minimum and maximum provisioned throughput values, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  @JSName("ProvisionedThroughput")
  var ProvisionedThroughput__UnmarshalledGlobalSecondaryIndexDescription: js.UndefOr[_UnmarshalledProvisionedThroughputDescription] = js.undefined
}

object _UnmarshalledGlobalSecondaryIndexDescription {
  @scala.inline
  def apply(
    Backfilling: js.UndefOr[Boolean] = js.undefined,
    IndexArn: String = null,
    IndexName: String = null,
    IndexSizeBytes: Int | Double = null,
    IndexStatus: CREATING | UPDATING | DELETING | ACTIVE | String = null,
    ItemCount: Int | Double = null,
    KeySchema: js.Array[_UnmarshalledKeySchemaElement] = null,
    Projection: _UnmarshalledProjection = null,
    ProvisionedThroughput: _UnmarshalledProvisionedThroughputDescription = null
  ): _UnmarshalledGlobalSecondaryIndexDescription = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Backfilling)) __obj.updateDynamic("Backfilling")(Backfilling)
    if (IndexArn != null) __obj.updateDynamic("IndexArn")(IndexArn)
    if (IndexName != null) __obj.updateDynamic("IndexName")(IndexName)
    if (IndexSizeBytes != null) __obj.updateDynamic("IndexSizeBytes")(IndexSizeBytes.asInstanceOf[js.Any])
    if (IndexStatus != null) __obj.updateDynamic("IndexStatus")(IndexStatus.asInstanceOf[js.Any])
    if (ItemCount != null) __obj.updateDynamic("ItemCount")(ItemCount.asInstanceOf[js.Any])
    if (KeySchema != null) __obj.updateDynamic("KeySchema")(KeySchema)
    if (Projection != null) __obj.updateDynamic("Projection")(Projection)
    if (ProvisionedThroughput != null) __obj.updateDynamic("ProvisionedThroughput")(ProvisionedThroughput)
    __obj.asInstanceOf[_UnmarshalledGlobalSecondaryIndexDescription]
  }
}

