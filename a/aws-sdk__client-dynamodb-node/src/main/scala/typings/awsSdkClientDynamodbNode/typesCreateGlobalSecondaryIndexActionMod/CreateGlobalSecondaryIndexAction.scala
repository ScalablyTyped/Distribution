package typings.awsSdkClientDynamodbNode.typesCreateGlobalSecondaryIndexActionMod

import typings.awsSdkClientDynamodbNode.typesKeySchemaElementMod.KeySchemaElement
import typings.awsSdkClientDynamodbNode.typesProjectionMod.Projection
import typings.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.ProvisionedThroughput
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGlobalSecondaryIndexAction extends js.Object {
  /**
    * <p>The name of the global secondary index to be created.</p>
    */
  var IndexName: String
  /**
    * <p>The key schema for the global secondary index.</p>
    */
  var KeySchema: js.Array[KeySchemaElement] | Iterable[KeySchemaElement]
  /**
    * <p>Represents attributes that are copied (projected) from the table into an index. These are in addition to the primary key attributes and index key attributes, which are automatically projected.</p>
    */
  var Projection: typings.awsSdkClientDynamodbNode.typesProjectionMod.Projection
  /**
    * <p>Represents the provisioned throughput settings for the specified global secondary index.</p> <p>For current minimum and maximum provisioned throughput values, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var ProvisionedThroughput: typings.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.ProvisionedThroughput
}

object CreateGlobalSecondaryIndexAction {
  @scala.inline
  def apply(
    IndexName: String,
    KeySchema: js.Array[KeySchemaElement] | Iterable[KeySchemaElement],
    Projection: Projection,
    ProvisionedThroughput: ProvisionedThroughput
  ): CreateGlobalSecondaryIndexAction = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], Projection = Projection.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGlobalSecondaryIndexAction]
  }
}

