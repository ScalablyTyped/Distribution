package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreCreateGlobalSecondaryIndexActionMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreKeySchemaElementMod._UnmarshalledKeySchemaElement
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreProjectionMod._UnmarshalledProjection
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreProvisionedThroughputMod._UnmarshalledProvisionedThroughput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledCreateGlobalSecondaryIndexAction extends _CreateGlobalSecondaryIndexAction {
  /**
    * <p>The key schema for the global secondary index.</p>
    */
  @JSName("KeySchema")
  var KeySchema__UnmarshalledCreateGlobalSecondaryIndexAction: js.Array[_UnmarshalledKeySchemaElement]
  /**
    * <p>Represents attributes that are copied (projected) from the table into an index. These are in addition to the primary key attributes and index key attributes, which are automatically projected.</p>
    */
  @JSName("Projection")
  var Projection__UnmarshalledCreateGlobalSecondaryIndexAction: _UnmarshalledProjection
  /**
    * <p>Represents the provisioned throughput settings for the specified global secondary index.</p> <p>For current minimum and maximum provisioned throughput values, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  @JSName("ProvisionedThroughput")
  var ProvisionedThroughput__UnmarshalledCreateGlobalSecondaryIndexAction: _UnmarshalledProvisionedThroughput
}

object _UnmarshalledCreateGlobalSecondaryIndexAction {
  @scala.inline
  def apply(
    IndexName: String,
    KeySchema: js.Array[_UnmarshalledKeySchemaElement],
    Projection: _UnmarshalledProjection,
    ProvisionedThroughput: _UnmarshalledProvisionedThroughput
  ): _UnmarshalledCreateGlobalSecondaryIndexAction = {
    val __obj = js.Dynamic.literal(IndexName = IndexName, KeySchema = KeySchema, Projection = Projection, ProvisionedThroughput = ProvisionedThroughput)
  
    __obj.asInstanceOf[_UnmarshalledCreateGlobalSecondaryIndexAction]
  }
}

