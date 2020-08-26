package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBSecurityGroupMembership extends js.Object {
  /**
    * The name of the DB security group.
    */
  var DBSecurityGroupName: js.UndefOr[String] = js.native
  /**
    * The status of the DB security group.
    */
  var Status: js.UndefOr[String] = js.native
}

object DBSecurityGroupMembership {
  @scala.inline
  def apply(): DBSecurityGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBSecurityGroupMembership]
  }
  @scala.inline
  implicit class DBSecurityGroupMembershipOps[Self <: DBSecurityGroupMembership] (val x: Self) extends AnyVal {
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
    def setDBSecurityGroupName(value: String): Self = this.set("DBSecurityGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBSecurityGroupName: Self = this.set("DBSecurityGroupName", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

