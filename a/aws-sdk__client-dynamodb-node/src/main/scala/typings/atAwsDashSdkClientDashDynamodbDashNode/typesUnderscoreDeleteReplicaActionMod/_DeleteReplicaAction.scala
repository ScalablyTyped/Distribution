package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreDeleteReplicaActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _DeleteReplicaAction extends js.Object {
  /**
    * <p>The region of the replica to be removed.</p>
    */
  var RegionName: String
}

object _DeleteReplicaAction {
  @scala.inline
  def apply(RegionName: String): _DeleteReplicaAction = {
    val __obj = js.Dynamic.literal(RegionName = RegionName)
  
    __obj.asInstanceOf[_DeleteReplicaAction]
  }
}

