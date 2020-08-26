package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalSecondaryIndex extends js.Object {
  /**
    * The name of the global secondary index. The name must be unique among all other indexes on this table.
    */
  var IndexName: typings.awsSdk.documentClientMod.DocumentClient.IndexName = js.native
  /**
    * The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
    */
  var KeySchema: typings.awsSdk.documentClientMod.DocumentClient.KeySchema = js.native
  /**
    * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
    */
  var Projection: typings.awsSdk.documentClientMod.DocumentClient.Projection = js.native
  /**
    * Represents the provisioned throughput settings for the specified global secondary index. For current minimum and maximum provisioned throughput values, see Limits in the Amazon DynamoDB Developer Guide.
    */
  var ProvisionedThroughput: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ProvisionedThroughput] = js.native
}

object GlobalSecondaryIndex {
  @scala.inline
  def apply(IndexName: IndexName, KeySchema: KeySchema, Projection: Projection): GlobalSecondaryIndex = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], Projection = Projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalSecondaryIndex]
  }
  @scala.inline
  implicit class GlobalSecondaryIndexOps[Self <: GlobalSecondaryIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIndexName(value: IndexName): Self = this.set("IndexName", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeySchemaVarargs(value: KeySchemaElement*): Self = this.set("KeySchema", js.Array(value :_*))
    @scala.inline
    def setKeySchema(value: KeySchema): Self = this.set("KeySchema", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjection(value: Projection): Self = this.set("Projection", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvisionedThroughput(value: ProvisionedThroughput): Self = this.set("ProvisionedThroughput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisionedThroughput: Self = this.set("ProvisionedThroughput", js.undefined)
  }
  
}

