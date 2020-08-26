package typings.awsSdkClientDynamodbNode.typesGlobalSecondaryIndexMod

import typings.awsSdkClientDynamodbNode.typesKeySchemaElementMod.KeySchemaElement
import typings.awsSdkClientDynamodbNode.typesProjectionMod.Projection
import typings.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.ProvisionedThroughput
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalSecondaryIndex extends js.Object {
  /**
    * <p>The name of the global secondary index. The name must be unique among all other indexes on this table.</p>
    */
  var IndexName: String = js.native
  /**
    * <p>The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:</p> <ul> <li> <p> <code>HASH</code> - partition key</p> </li> <li> <p> <code>RANGE</code> - sort key</p> </li> </ul> <note> <p>The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.</p> <p>The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.</p> </note>
    */
  var KeySchema: js.Array[KeySchemaElement] | Iterable[KeySchemaElement] = js.native
  /**
    * <p>Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. </p>
    */
  var Projection: typings.awsSdkClientDynamodbNode.typesProjectionMod.Projection = js.native
  /**
    * <p>Represents the provisioned throughput settings for the specified global secondary index.</p> <p>For current minimum and maximum provisioned throughput values, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var ProvisionedThroughput: typings.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.ProvisionedThroughput = js.native
}

object GlobalSecondaryIndex {
  @scala.inline
  def apply(
    IndexName: String,
    KeySchema: js.Array[KeySchemaElement] | Iterable[KeySchemaElement],
    Projection: Projection,
    ProvisionedThroughput: ProvisionedThroughput
  ): GlobalSecondaryIndex = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], Projection = Projection.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalSecondaryIndex]
  }
  @scala.inline
  implicit class GlobalSecondaryIndexOps[Self <: GlobalSecondaryIndex] (val x: Self) extends AnyVal {
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
    def setIndexName(value: String): Self = this.set("IndexName", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeySchemaVarargs(value: KeySchemaElement*): Self = this.set("KeySchema", js.Array(value :_*))
    @scala.inline
    def setKeySchema(value: js.Array[KeySchemaElement] | Iterable[KeySchemaElement]): Self = this.set("KeySchema", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjection(value: Projection): Self = this.set("Projection", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvisionedThroughput(value: ProvisionedThroughput): Self = this.set("ProvisionedThroughput", value.asInstanceOf[js.Any])
  }
  
}

