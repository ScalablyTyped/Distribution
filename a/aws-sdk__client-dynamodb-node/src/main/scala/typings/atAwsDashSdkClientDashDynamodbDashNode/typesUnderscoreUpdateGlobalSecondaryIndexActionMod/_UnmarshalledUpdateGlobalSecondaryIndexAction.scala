package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreUpdateGlobalSecondaryIndexActionMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreProvisionedThroughputMod._UnmarshalledProvisionedThroughput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledUpdateGlobalSecondaryIndexAction extends _UpdateGlobalSecondaryIndexAction {
  /**
    * <p>Represents the provisioned throughput settings for the specified global secondary index.</p> <p>For current minimum and maximum provisioned throughput values, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  @JSName("ProvisionedThroughput")
  var ProvisionedThroughput__UnmarshalledUpdateGlobalSecondaryIndexAction: _UnmarshalledProvisionedThroughput
}

object _UnmarshalledUpdateGlobalSecondaryIndexAction {
  @scala.inline
  def apply(IndexName: String, ProvisionedThroughput: _UnmarshalledProvisionedThroughput): _UnmarshalledUpdateGlobalSecondaryIndexAction = {
    val __obj = js.Dynamic.literal(IndexName = IndexName, ProvisionedThroughput = ProvisionedThroughput)
  
    __obj.asInstanceOf[_UnmarshalledUpdateGlobalSecondaryIndexAction]
  }
}

