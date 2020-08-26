package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionGroupMembership extends js.Object {
  /**
    * The name of the option group that the instance belongs to.
    */
  var OptionGroupName: js.UndefOr[String] = js.native
  /**
    * The status of the DB instance's option group membership. Valid values are: in-sync, pending-apply, pending-removal, pending-maintenance-apply, pending-maintenance-removal, applying, removing, and failed. 
    */
  var Status: js.UndefOr[String] = js.native
}

object OptionGroupMembership {
  @scala.inline
  def apply(): OptionGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionGroupMembership]
  }
  @scala.inline
  implicit class OptionGroupMembershipOps[Self <: OptionGroupMembership] (val x: Self) extends AnyVal {
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
    def setOptionGroupName(value: String): Self = this.set("OptionGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionGroupName: Self = this.set("OptionGroupName", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

