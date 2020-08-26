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
  def apply(): ClusterSecurityGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterSecurityGroupMembership]
  }
  @scala.inline
  implicit class ClusterSecurityGroupMembershipOps[Self <: ClusterSecurityGroupMembership] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClusterSecurityGroupName(value: String): Self = this.set("ClusterSecurityGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterSecurityGroupName: Self = this.set("ClusterSecurityGroupName", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

