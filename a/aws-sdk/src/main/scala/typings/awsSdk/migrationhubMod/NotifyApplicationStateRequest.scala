package typings.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifyApplicationStateRequest extends js.Object {
  /**
    * The configurationId in Application Discovery Service that uniquely identifies the grouped application.
    */
  var ApplicationId: typings.awsSdk.migrationhubMod.ApplicationId = js.native
  /**
    * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
    */
  var DryRun: js.UndefOr[typings.awsSdk.migrationhubMod.DryRun] = js.native
  /**
    * Status of the application - Not Started, In-Progress, Complete.
    */
  var Status: ApplicationStatus = js.native
  /**
    * The timestamp when the application state changed.
    */
  var UpdateDateTime: js.UndefOr[typings.awsSdk.migrationhubMod.UpdateDateTime] = js.native
}

object NotifyApplicationStateRequest {
  @scala.inline
  def apply(ApplicationId: ApplicationId, Status: ApplicationStatus): NotifyApplicationStateRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyApplicationStateRequest]
  }
  @scala.inline
  implicit class NotifyApplicationStateRequestOps[Self <: NotifyApplicationStateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplicationId(value: ApplicationId): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: ApplicationStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: DryRun): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setUpdateDateTime(value: UpdateDateTime): Self = this.set("UpdateDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateDateTime: Self = this.set("UpdateDateTime", js.undefined)
  }
  
}

