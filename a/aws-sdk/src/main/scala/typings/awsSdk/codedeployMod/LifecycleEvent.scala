package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecycleEvent extends js.Object {
  /**
    * Diagnostic information about the deployment lifecycle event.
    */
  var diagnostics: js.UndefOr[Diagnostics] = js.native
  /**
    * A timestamp that indicates when the deployment lifecycle event ended.
    */
  var endTime: js.UndefOr[Timestamp] = js.native
  /**
    * The deployment lifecycle event name, such as ApplicationStop, BeforeInstall, AfterInstall, ApplicationStart, or ValidateService.
    */
  var lifecycleEventName: js.UndefOr[LifecycleEventName] = js.native
  /**
    * A timestamp that indicates when the deployment lifecycle event started.
    */
  var startTime: js.UndefOr[Timestamp] = js.native
  /**
    * The deployment lifecycle event status:   Pending: The deployment lifecycle event is pending.   InProgress: The deployment lifecycle event is in progress.   Succeeded: The deployment lifecycle event ran successfully.   Failed: The deployment lifecycle event has failed.   Skipped: The deployment lifecycle event has been skipped.   Unknown: The deployment lifecycle event is unknown.  
    */
  var status: js.UndefOr[LifecycleEventStatus] = js.native
}

object LifecycleEvent {
  @scala.inline
  def apply(): LifecycleEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleEvent]
  }
  @scala.inline
  implicit class LifecycleEventOps[Self <: LifecycleEvent] (val x: Self) extends AnyVal {
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
    def setDiagnostics(value: Diagnostics): Self = this.set("diagnostics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagnostics: Self = this.set("diagnostics", js.undefined)
    @scala.inline
    def setEndTime(value: Timestamp): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setLifecycleEventName(value: LifecycleEventName): Self = this.set("lifecycleEventName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifecycleEventName: Self = this.set("lifecycleEventName", js.undefined)
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setStatus(value: LifecycleEventStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

