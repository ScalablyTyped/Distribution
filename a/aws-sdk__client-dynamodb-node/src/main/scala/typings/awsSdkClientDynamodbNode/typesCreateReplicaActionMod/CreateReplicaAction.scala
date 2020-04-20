package typings.awsSdkClientDynamodbNode.typesCreateReplicaActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateReplicaAction extends js.Object {
  /**
    * <p>The region of the replica to be added.</p>
    */
  var RegionName: String
}

object CreateReplicaAction {
  @scala.inline
  def apply(RegionName: String): CreateReplicaAction = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReplicaAction]
  }
}

