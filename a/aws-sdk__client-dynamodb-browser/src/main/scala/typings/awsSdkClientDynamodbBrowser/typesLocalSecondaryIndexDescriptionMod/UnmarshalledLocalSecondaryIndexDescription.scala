package typings.awsSdkClientDynamodbBrowser.typesLocalSecondaryIndexDescriptionMod

import typings.awsSdkClientDynamodbBrowser.typesKeySchemaElementMod.UnmarshalledKeySchemaElement
import typings.awsSdkClientDynamodbBrowser.typesProjectionMod.UnmarshalledProjection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledLocalSecondaryIndexDescription extends LocalSecondaryIndexDescription {
  /**
    * <p>The complete key schema for the local secondary index, consisting of one or more pairs of attribute names and key types:</p> <ul> <li> <p> <code>HASH</code> - partition key</p> </li> <li> <p> <code>RANGE</code> - sort key</p> </li> </ul> <note> <p>The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.</p> <p>The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.</p> </note>
    */
  @JSName("KeySchema")
  var KeySchema_UnmarshalledLocalSecondaryIndexDescription: js.UndefOr[js.Array[UnmarshalledKeySchemaElement]] = js.native
  /**
    * <p>Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. </p>
    */
  @JSName("Projection")
  var Projection_UnmarshalledLocalSecondaryIndexDescription: js.UndefOr[UnmarshalledProjection] = js.native
}

object UnmarshalledLocalSecondaryIndexDescription {
  @scala.inline
  def apply(): UnmarshalledLocalSecondaryIndexDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledLocalSecondaryIndexDescription]
  }
  @scala.inline
  implicit class UnmarshalledLocalSecondaryIndexDescriptionOps[Self <: UnmarshalledLocalSecondaryIndexDescription] (val x: Self) extends AnyVal {
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
    def setKeySchemaVarargs(value: UnmarshalledKeySchemaElement*): Self = this.set("KeySchema", js.Array(value :_*))
    @scala.inline
    def setKeySchema(value: js.Array[UnmarshalledKeySchemaElement]): Self = this.set("KeySchema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeySchema: Self = this.set("KeySchema", js.undefined)
    @scala.inline
    def setProjection(value: UnmarshalledProjection): Self = this.set("Projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("Projection", js.undefined)
  }
  
}

