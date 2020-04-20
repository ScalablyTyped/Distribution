package typings.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteClusterRequest extends js.Object {
  /**
    * The identifier (ID) of the cluster that you are deleting. To find the cluster ID, use DescribeClusters.
    */
  var ClusterId: typings.awsSdk.cloudhsmv2Mod.ClusterId = js.native
}

object DeleteClusterRequest {
  @scala.inline
  def apply(ClusterId: ClusterId): DeleteClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterRequest]
  }
}

