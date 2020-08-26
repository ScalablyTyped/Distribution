package typings.awsSdkClientDynamodbNode.typesLocalSecondaryIndexDescriptionMod

import typings.awsSdkClientDynamodbNode.typesKeySchemaElementMod.KeySchemaElement
import typings.awsSdkClientDynamodbNode.typesProjectionMod.Projection
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalSecondaryIndexDescription extends js.Object {
  /**
    * <p>The Amazon Resource Name (ARN) that uniquely identifies the index.</p>
    */
  var IndexArn: js.UndefOr[String] = js.native
  /**
    * <p>Represents the name of the local secondary index.</p>
    */
  var IndexName: js.UndefOr[String] = js.native
  /**
    * <p>The total size of the specified index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.</p>
    */
  var IndexSizeBytes: js.UndefOr[Double] = js.native
  /**
    * <p>The number of items in the specified index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.</p>
    */
  var ItemCount: js.UndefOr[Double] = js.native
  /**
    * <p>The complete key schema for the local secondary index, consisting of one or more pairs of attribute names and key types:</p> <ul> <li> <p> <code>HASH</code> - partition key</p> </li> <li> <p> <code>RANGE</code> - sort key</p> </li> </ul> <note> <p>The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.</p> <p>The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.</p> </note>
    */
  var KeySchema: js.UndefOr[js.Array[KeySchemaElement] | Iterable[KeySchemaElement]] = js.native
  /**
    * <p>Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. </p>
    */
  var Projection: js.UndefOr[typings.awsSdkClientDynamodbNode.typesProjectionMod.Projection] = js.native
}

object LocalSecondaryIndexDescription {
  @scala.inline
  def apply(): LocalSecondaryIndexDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalSecondaryIndexDescription]
  }
  @scala.inline
  implicit class LocalSecondaryIndexDescriptionOps[Self <: LocalSecondaryIndexDescription] (val x: Self) extends AnyVal {
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
    def setIndexArn(value: String): Self = this.set("IndexArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexArn: Self = this.set("IndexArn", js.undefined)
    @scala.inline
    def setIndexName(value: String): Self = this.set("IndexName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexName: Self = this.set("IndexName", js.undefined)
    @scala.inline
    def setIndexSizeBytes(value: Double): Self = this.set("IndexSizeBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexSizeBytes: Self = this.set("IndexSizeBytes", js.undefined)
    @scala.inline
    def setItemCount(value: Double): Self = this.set("ItemCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemCount: Self = this.set("ItemCount", js.undefined)
    @scala.inline
    def setKeySchemaVarargs(value: KeySchemaElement*): Self = this.set("KeySchema", js.Array(value :_*))
    @scala.inline
    def setKeySchema(value: js.Array[KeySchemaElement] | Iterable[KeySchemaElement]): Self = this.set("KeySchema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeySchema: Self = this.set("KeySchema", js.undefined)
    @scala.inline
    def setProjection(value: Projection): Self = this.set("Projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("Projection", js.undefined)
  }
  
}

