package typings.awsSdkClientDynamodbBrowser.typesGlobalSecondaryIndexDescriptionMod

import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ACTIVE
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.CREATING
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DELETING
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.UPDATING
import typings.awsSdkClientDynamodbBrowser.typesKeySchemaElementMod.UnmarshalledKeySchemaElement
import typings.awsSdkClientDynamodbBrowser.typesProjectionMod.UnmarshalledProjection
import typings.awsSdkClientDynamodbBrowser.typesProvisionedThroughputDescriptionMod.UnmarshalledProvisionedThroughputDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledGlobalSecondaryIndexDescription extends GlobalSecondaryIndexDescription {
  /**
    * <p>The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:</p> <ul> <li> <p> <code>HASH</code> - partition key</p> </li> <li> <p> <code>RANGE</code> - sort key</p> </li> </ul> <note> <p>The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.</p> <p>The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.</p> </note>
    */
  @JSName("KeySchema")
  var KeySchema_UnmarshalledGlobalSecondaryIndexDescription: js.UndefOr[js.Array[UnmarshalledKeySchemaElement]] = js.undefined
  /**
    * <p>Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. </p>
    */
  @JSName("Projection")
  var Projection_UnmarshalledGlobalSecondaryIndexDescription: js.UndefOr[UnmarshalledProjection] = js.undefined
  /**
    * <p>Represents the provisioned throughput settings for the specified global secondary index.</p> <p>For current minimum and maximum provisioned throughput values, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  @JSName("ProvisionedThroughput")
  var ProvisionedThroughput_UnmarshalledGlobalSecondaryIndexDescription: js.UndefOr[UnmarshalledProvisionedThroughputDescription] = js.undefined
}

object UnmarshalledGlobalSecondaryIndexDescription {
  @scala.inline
  def apply(
    Backfilling: js.UndefOr[Boolean] = js.undefined,
    IndexArn: String = null,
    IndexName: String = null,
    IndexSizeBytes: Int | Double = null,
    IndexStatus: CREATING | UPDATING | DELETING | ACTIVE | String = null,
    ItemCount: Int | Double = null,
    KeySchema: js.Array[UnmarshalledKeySchemaElement] = null,
    Projection: UnmarshalledProjection = null,
    ProvisionedThroughput: UnmarshalledProvisionedThroughputDescription = null
  ): UnmarshalledGlobalSecondaryIndexDescription = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Backfilling)) __obj.updateDynamic("Backfilling")(Backfilling.asInstanceOf[js.Any])
    if (IndexArn != null) __obj.updateDynamic("IndexArn")(IndexArn.asInstanceOf[js.Any])
    if (IndexName != null) __obj.updateDynamic("IndexName")(IndexName.asInstanceOf[js.Any])
    if (IndexSizeBytes != null) __obj.updateDynamic("IndexSizeBytes")(IndexSizeBytes.asInstanceOf[js.Any])
    if (IndexStatus != null) __obj.updateDynamic("IndexStatus")(IndexStatus.asInstanceOf[js.Any])
    if (ItemCount != null) __obj.updateDynamic("ItemCount")(ItemCount.asInstanceOf[js.Any])
    if (KeySchema != null) __obj.updateDynamic("KeySchema")(KeySchema.asInstanceOf[js.Any])
    if (Projection != null) __obj.updateDynamic("Projection")(Projection.asInstanceOf[js.Any])
    if (ProvisionedThroughput != null) __obj.updateDynamic("ProvisionedThroughput")(ProvisionedThroughput.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledGlobalSecondaryIndexDescription]
  }
}

