package typings.awsSdkClientDynamodbNode.typesGlobalSecondaryIndexMod

import typings.awsSdkClientDynamodbNode.typesKeySchemaElementMod.UnmarshalledKeySchemaElement
import typings.awsSdkClientDynamodbNode.typesProjectionMod.UnmarshalledProjection
import typings.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.UnmarshalledProvisionedThroughput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledGlobalSecondaryIndex extends GlobalSecondaryIndex {
  /**
    * <p>The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:</p> <ul> <li> <p> <code>HASH</code> - partition key</p> </li> <li> <p> <code>RANGE</code> - sort key</p> </li> </ul> <note> <p>The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.</p> <p>The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.</p> </note>
    */
  @JSName("KeySchema")
  var KeySchema_UnmarshalledGlobalSecondaryIndex: js.Array[UnmarshalledKeySchemaElement] = js.native
  /**
    * <p>Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. </p>
    */
  @JSName("Projection")
  var Projection_UnmarshalledGlobalSecondaryIndex: UnmarshalledProjection = js.native
  /**
    * <p>Represents the provisioned throughput settings for the specified global secondary index.</p> <p>For current minimum and maximum provisioned throughput values, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  @JSName("ProvisionedThroughput")
  var ProvisionedThroughput_UnmarshalledGlobalSecondaryIndex: UnmarshalledProvisionedThroughput = js.native
}

object UnmarshalledGlobalSecondaryIndex {
  @scala.inline
  def apply(
    IndexName: String,
    KeySchema: js.Array[UnmarshalledKeySchemaElement],
    Projection: UnmarshalledProjection,
    ProvisionedThroughput: UnmarshalledProvisionedThroughput
  ): UnmarshalledGlobalSecondaryIndex = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], Projection = Projection.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledGlobalSecondaryIndex]
  }
  @scala.inline
  implicit class UnmarshalledGlobalSecondaryIndexOps[Self <: UnmarshalledGlobalSecondaryIndex] (val x: Self) extends AnyVal {
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
    def setProjection(value: UnmarshalledProjection): Self = this.set("Projection", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvisionedThroughput(value: UnmarshalledProvisionedThroughput): Self = this.set("ProvisionedThroughput", value.asInstanceOf[js.Any])
  }
  
}

