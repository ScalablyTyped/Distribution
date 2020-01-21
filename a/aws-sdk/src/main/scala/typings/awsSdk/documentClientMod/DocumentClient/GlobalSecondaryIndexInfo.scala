package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalSecondaryIndexInfo extends js.Object {
  /**
    * The name of the global secondary index.
    */
  var IndexName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.IndexName] = js.native
  /**
    * The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
    */
  var KeySchema: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.KeySchema] = js.native
  /**
    * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
    */
  var Projection: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.Projection] = js.native
  /**
    * Represents the provisioned throughput settings for the specified global secondary index. 
    */
  var ProvisionedThroughput: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ProvisionedThroughput] = js.native
}

object GlobalSecondaryIndexInfo {
  @scala.inline
  def apply(
    IndexName: IndexName = null,
    KeySchema: KeySchema = null,
    Projection: Projection = null,
    ProvisionedThroughput: ProvisionedThroughput = null
  ): GlobalSecondaryIndexInfo = {
    val __obj = js.Dynamic.literal()
    if (IndexName != null) __obj.updateDynamic("IndexName")(IndexName.asInstanceOf[js.Any])
    if (KeySchema != null) __obj.updateDynamic("KeySchema")(KeySchema.asInstanceOf[js.Any])
    if (Projection != null) __obj.updateDynamic("Projection")(Projection.asInstanceOf[js.Any])
    if (ProvisionedThroughput != null) __obj.updateDynamic("ProvisionedThroughput")(ProvisionedThroughput.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalSecondaryIndexInfo]
  }
}

