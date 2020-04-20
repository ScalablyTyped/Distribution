package typings.awsSdkClientDynamodbNode.typesUpdateGlobalSecondaryIndexActionMod

import typings.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.UnmarshalledProvisionedThroughput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledUpdateGlobalSecondaryIndexAction extends UpdateGlobalSecondaryIndexAction {
  /**
    * <p>Represents the provisioned throughput settings for the specified global secondary index.</p> <p>For current minimum and maximum provisioned throughput values, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  @JSName("ProvisionedThroughput")
  var ProvisionedThroughput_UnmarshalledUpdateGlobalSecondaryIndexAction: UnmarshalledProvisionedThroughput
}

object UnmarshalledUpdateGlobalSecondaryIndexAction {
  @scala.inline
  def apply(IndexName: String, ProvisionedThroughput: UnmarshalledProvisionedThroughput): UnmarshalledUpdateGlobalSecondaryIndexAction = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledUpdateGlobalSecondaryIndexAction]
  }
}

