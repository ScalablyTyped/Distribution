package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterSecurityGroupMembership extends js.Object {
  /**
    * The name of the cluster security group.
    */
  var ClusterSecurityGroupName: js.UndefOr[String] = js.native
  /**
    * The status of the cluster security group.
    */
  var Status: js.UndefOr[String] = js.native
}

object ClusterSecurityGroupMembership {
  @scala.inline
  def apply(ClusterSecurityGroupName: String = null, Status: String = null): ClusterSecurityGroupMembership = {
    val __obj = js.Dynamic.literal()
    if (ClusterSecurityGroupName != null) __obj.updateDynamic("ClusterSecurityGroupName")(ClusterSecurityGroupName.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterSecurityGroupMembership]
  }
}

