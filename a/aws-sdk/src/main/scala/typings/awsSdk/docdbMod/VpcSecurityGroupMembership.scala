package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcSecurityGroupMembership extends js.Object {
  /**
    * The status of the VPC security group.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The name of the VPC security group.
    */
  var VpcSecurityGroupId: js.UndefOr[String] = js.native
}

object VpcSecurityGroupMembership {
  @scala.inline
  def apply(): VpcSecurityGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcSecurityGroupMembership]
  }
  @scala.inline
  implicit class VpcSecurityGroupMembershipOps[Self <: VpcSecurityGroupMembership] (val x: Self) extends AnyVal {
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
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setVpcSecurityGroupId(value: String): Self = this.set("VpcSecurityGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcSecurityGroupId: Self = this.set("VpcSecurityGroupId", js.undefined)
  }
  
}

