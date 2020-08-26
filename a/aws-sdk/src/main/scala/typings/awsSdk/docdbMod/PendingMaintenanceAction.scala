package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PendingMaintenanceAction extends js.Object {
  /**
    * The type of pending maintenance action that is available for the resource.
    */
  var Action: js.UndefOr[String] = js.native
  /**
    * The date of the maintenance window when the action is applied. The maintenance action is applied to the resource during its first maintenance window after this date. If this date is specified, any next-maintenance opt-in requests are ignored.
    */
  var AutoAppliedAfterDate: js.UndefOr[TStamp] = js.native
  /**
    * The effective date when the pending maintenance action is applied to the resource.
    */
  var CurrentApplyDate: js.UndefOr[TStamp] = js.native
  /**
    * A description providing more detail about the maintenance action.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The date when the maintenance action is automatically applied. The maintenance action is applied to the resource on this date regardless of the maintenance window for the resource. If this date is specified, any immediate opt-in requests are ignored.
    */
  var ForcedApplyDate: js.UndefOr[TStamp] = js.native
  /**
    * Indicates the type of opt-in request that has been received for the resource.
    */
  var OptInStatus: js.UndefOr[String] = js.native
}

object PendingMaintenanceAction {
  @scala.inline
  def apply(): PendingMaintenanceAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingMaintenanceAction]
  }
  @scala.inline
  implicit class PendingMaintenanceActionOps[Self <: PendingMaintenanceAction] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("Action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("Action", js.undefined)
    @scala.inline
    def setAutoAppliedAfterDate(value: TStamp): Self = this.set("AutoAppliedAfterDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoAppliedAfterDate: Self = this.set("AutoAppliedAfterDate", js.undefined)
    @scala.inline
    def setCurrentApplyDate(value: TStamp): Self = this.set("CurrentApplyDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentApplyDate: Self = this.set("CurrentApplyDate", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setForcedApplyDate(value: TStamp): Self = this.set("ForcedApplyDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForcedApplyDate: Self = this.set("ForcedApplyDate", js.undefined)
    @scala.inline
    def setOptInStatus(value: String): Self = this.set("OptInStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptInStatus: Self = this.set("OptInStatus", js.undefined)
  }
  
}

