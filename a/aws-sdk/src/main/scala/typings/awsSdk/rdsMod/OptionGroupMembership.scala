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
  def apply(OptionGroupName: String = null, Status: String = null): OptionGroupMembership = {
    val __obj = js.Dynamic.literal()
    if (OptionGroupName != null) __obj.updateDynamic("OptionGroupName")(OptionGroupName.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionGroupMembership]
  }
}

