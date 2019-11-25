package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreUpdateGlobalSecondaryIndexActionMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreProvisionedThroughputMod._ProvisionedThroughput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UpdateGlobalSecondaryIndexAction extends js.Object {
  /**
    * <p>The name of the global secondary index to be updated.</p>
    */
  var IndexName: String
  /**
    * <p>Represents the provisioned throughput settings for the specified global secondary index.</p> <p>For current minimum and maximum provisioned throughput values, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var ProvisionedThroughput: _ProvisionedThroughput
}

object _UpdateGlobalSecondaryIndexAction {
  @scala.inline
  def apply(IndexName: String, ProvisionedThroughput: _ProvisionedThroughput): _UpdateGlobalSecondaryIndexAction = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_UpdateGlobalSecondaryIndexAction]
  }
}

