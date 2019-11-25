package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreLocalSecondaryIndexDescriptionMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreKeySchemaElementMod._KeySchemaElement
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreProjectionMod._Projection
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _LocalSecondaryIndexDescription extends js.Object {
  /**
    * <p>The Amazon Resource Name (ARN) that uniquely identifies the index.</p>
    */
  var IndexArn: js.UndefOr[String] = js.undefined
  /**
    * <p>Represents the name of the local secondary index.</p>
    */
  var IndexName: js.UndefOr[String] = js.undefined
  /**
    * <p>The total size of the specified index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.</p>
    */
  var IndexSizeBytes: js.UndefOr[Double] = js.undefined
  /**
    * <p>The number of items in the specified index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.</p>
    */
  var ItemCount: js.UndefOr[Double] = js.undefined
  /**
    * <p>The complete key schema for the local secondary index, consisting of one or more pairs of attribute names and key types:</p> <ul> <li> <p> <code>HASH</code> - partition key</p> </li> <li> <p> <code>RANGE</code> - sort key</p> </li> </ul> <note> <p>The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.</p> <p>The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.</p> </note>
    */
  var KeySchema: js.UndefOr[js.Array[_KeySchemaElement] | Iterable[_KeySchemaElement]] = js.undefined
  /**
    * <p>Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. </p>
    */
  var Projection: js.UndefOr[_Projection] = js.undefined
}

object _LocalSecondaryIndexDescription {
  @scala.inline
  def apply(
    IndexArn: String = null,
    IndexName: String = null,
    IndexSizeBytes: Int | Double = null,
    ItemCount: Int | Double = null,
    KeySchema: js.Array[_KeySchemaElement] | Iterable[_KeySchemaElement] = null,
    Projection: _Projection = null
  ): _LocalSecondaryIndexDescription = {
    val __obj = js.Dynamic.literal()
    if (IndexArn != null) __obj.updateDynamic("IndexArn")(IndexArn.asInstanceOf[js.Any])
    if (IndexName != null) __obj.updateDynamic("IndexName")(IndexName.asInstanceOf[js.Any])
    if (IndexSizeBytes != null) __obj.updateDynamic("IndexSizeBytes")(IndexSizeBytes.asInstanceOf[js.Any])
    if (ItemCount != null) __obj.updateDynamic("ItemCount")(ItemCount.asInstanceOf[js.Any])
    if (KeySchema != null) __obj.updateDynamic("KeySchema")(KeySchema.asInstanceOf[js.Any])
    if (Projection != null) __obj.updateDynamic("Projection")(Projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[_LocalSecondaryIndexDescription]
  }
}

