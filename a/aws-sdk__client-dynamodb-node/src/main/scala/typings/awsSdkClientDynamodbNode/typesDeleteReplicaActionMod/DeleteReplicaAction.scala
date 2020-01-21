package typings.awsSdkClientDynamodbNode.typesDeleteReplicaActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteReplicaAction extends js.Object {
  /**
    * <p>The region of the replica to be removed.</p>
    */
  var RegionName: String
}

object DeleteReplicaAction {
  @scala.inline
  def apply(RegionName: String): DeleteReplicaAction = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteReplicaAction]
  }
}

