package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalSecondaryIndexDescription extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the index.
    */
  var IndexArn: js.UndefOr[String] = js.native
  /**
    * Represents the name of the local secondary index.
    */
  var IndexName: js.UndefOr[typings.awsSdk.dynamodbMod.IndexName] = js.native
  /**
    * The total size of the specified index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
    */
  var IndexSizeBytes: js.UndefOr[Long] = js.native
  /**
    * The number of items in the specified index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
    */
  var ItemCount: js.UndefOr[Long] = js.native
  /**
    * The complete key schema for the local secondary index, consisting of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
    */
  var KeySchema: js.UndefOr[typings.awsSdk.dynamodbMod.KeySchema] = js.native
  /**
    * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
    */
  var Projection: js.UndefOr[typings.awsSdk.dynamodbMod.Projection] = js.native
}

object LocalSecondaryIndexDescription {
  @scala.inline
  def apply(
    IndexArn: String = null,
    IndexName: IndexName = null,
    IndexSizeBytes: js.UndefOr[Long] = js.undefined,
    ItemCount: js.UndefOr[Long] = js.undefined,
    KeySchema: KeySchema = null,
    Projection: Projection = null
  ): LocalSecondaryIndexDescription = {
    val __obj = js.Dynamic.literal()
    if (IndexArn != null) __obj.updateDynamic("IndexArn")(IndexArn.asInstanceOf[js.Any])
    if (IndexName != null) __obj.updateDynamic("IndexName")(IndexName.asInstanceOf[js.Any])
    if (!js.isUndefined(IndexSizeBytes)) __obj.updateDynamic("IndexSizeBytes")(IndexSizeBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ItemCount)) __obj.updateDynamic("ItemCount")(ItemCount.get.asInstanceOf[js.Any])
    if (KeySchema != null) __obj.updateDynamic("KeySchema")(KeySchema.asInstanceOf[js.Any])
    if (Projection != null) __obj.updateDynamic("Projection")(Projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalSecondaryIndexDescription]
  }
}

