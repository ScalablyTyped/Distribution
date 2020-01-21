package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteClusterSecurityGroupMessage extends js.Object {
  /**
    * The name of the cluster security group to be deleted.
    */
  var ClusterSecurityGroupName: String = js.native
}

object DeleteClusterSecurityGroupMessage {
  @scala.inline
  def apply(ClusterSecurityGroupName: String): DeleteClusterSecurityGroupMessage = {
    val __obj = js.Dynamic.literal(ClusterSecurityGroupName = ClusterSecurityGroupName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteClusterSecurityGroupMessage]
  }
}

