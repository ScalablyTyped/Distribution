package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebootNodeRequest extends js.Object {
  /**
    * The name of the DAX cluster containing the node to be rebooted.
    */
  var ClusterName: String = js.native
  /**
    * The system-assigned ID of the node to be rebooted.
    */
  var NodeId: String = js.native
}

object RebootNodeRequest {
  @scala.inline
  def apply(ClusterName: String, NodeId: String): RebootNodeRequest = {
    val __obj = js.Dynamic.literal(ClusterName = ClusterName.asInstanceOf[js.Any], NodeId = NodeId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RebootNodeRequest]
  }
}

