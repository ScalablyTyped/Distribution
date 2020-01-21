package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGlobalSecondaryIndexAction extends js.Object {
  /**
    * The name of the global secondary index to be created.
    */
  var IndexName: typings.awsSdk.documentClientMod.DocumentClient.IndexName = js.native
  /**
    * The key schema for the global secondary index.
    */
  var KeySchema: typings.awsSdk.documentClientMod.DocumentClient.KeySchema = js.native
  /**
    * Represents attributes that are copied (projected) from the table into an index. These are in addition to the primary key attributes and index key attributes, which are automatically projected.
    */
  var Projection: typings.awsSdk.documentClientMod.DocumentClient.Projection = js.native
  /**
    * Represents the provisioned throughput settings for the specified global secondary index. For current minimum and maximum provisioned throughput values, see Limits in the Amazon DynamoDB Developer Guide.
    */
  var ProvisionedThroughput: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ProvisionedThroughput] = js.native
}

object CreateGlobalSecondaryIndexAction {
  @scala.inline
  def apply(
    IndexName: IndexName,
    KeySchema: KeySchema,
    Projection: Projection,
    ProvisionedThroughput: ProvisionedThroughput = null
  ): CreateGlobalSecondaryIndexAction = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], Projection = Projection.asInstanceOf[js.Any])
    if (ProvisionedThroughput != null) __obj.updateDynamic("ProvisionedThroughput")(ProvisionedThroughput.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGlobalSecondaryIndexAction]
  }
}

