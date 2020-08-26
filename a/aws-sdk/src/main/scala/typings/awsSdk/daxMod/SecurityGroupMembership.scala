package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityGroupMembership extends js.Object {
  /**
    * The unique ID for this security group.
    */
  var SecurityGroupIdentifier: js.UndefOr[String] = js.native
  /**
    * The status of this security group.
    */
  var Status: js.UndefOr[String] = js.native
}

object SecurityGroupMembership {
  @scala.inline
  def apply(): SecurityGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGroupMembership]
  }
  @scala.inline
  implicit class SecurityGroupMembershipOps[Self <: SecurityGroupMembership] (val x: Self) extends AnyVal {
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
    def setSecurityGroupIdentifier(value: String): Self = this.set("SecurityGroupIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroupIdentifier: Self = this.set("SecurityGroupIdentifier", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

