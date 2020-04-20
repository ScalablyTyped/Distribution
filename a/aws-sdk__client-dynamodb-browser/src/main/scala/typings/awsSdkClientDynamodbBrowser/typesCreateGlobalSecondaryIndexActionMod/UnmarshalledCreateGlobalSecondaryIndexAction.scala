package typings.awsSdkClientDynamodbBrowser.typesCreateGlobalSecondaryIndexActionMod

import typings.awsSdkClientDynamodbBrowser.typesKeySchemaElementMod.UnmarshalledKeySchemaElement
import typings.awsSdkClientDynamodbBrowser.typesProjectionMod.UnmarshalledProjection
import typings.awsSdkClientDynamodbBrowser.typesProvisionedThroughputMod.UnmarshalledProvisionedThroughput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledCreateGlobalSecondaryIndexAction extends CreateGlobalSecondaryIndexAction {
  /**
    * <p>The key schema for the global secondary index.</p>
    */
  @JSName("KeySchema")
  var KeySchema_UnmarshalledCreateGlobalSecondaryIndexAction: js.Array[UnmarshalledKeySchemaElement]
  /**
    * <p>Represents attributes that are copied (projected) from the table into an index. These are in addition to the primary key attributes and index key attributes, which are automatically projected.</p>
    */
  @JSName("Projection")
  var Projection_UnmarshalledCreateGlobalSecondaryIndexAction: UnmarshalledProjection
  /**
    * <p>Represents the provisioned throughput settings for the specified global secondary index.</p> <p>For current minimum and maximum provisioned throughput values, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  @JSName("ProvisionedThroughput")
  var ProvisionedThroughput_UnmarshalledCreateGlobalSecondaryIndexAction: UnmarshalledProvisionedThroughput
}

object UnmarshalledCreateGlobalSecondaryIndexAction {
  @scala.inline
  def apply(
    IndexName: String,
    KeySchema: js.Array[UnmarshalledKeySchemaElement],
    Projection: UnmarshalledProjection,
    ProvisionedThroughput: UnmarshalledProvisionedThroughput
  ): UnmarshalledCreateGlobalSecondaryIndexAction = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], Projection = Projection.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledCreateGlobalSecondaryIndexAction]
  }
}

