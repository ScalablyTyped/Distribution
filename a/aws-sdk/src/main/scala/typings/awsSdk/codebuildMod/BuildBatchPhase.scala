package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildBatchPhase extends js.Object {
  /**
    * Additional information about the batch build phase. Especially to help troubleshoot a failed btach build.
    */
  var contexts: js.UndefOr[PhaseContexts] = js.native
  /**
    * How long, in seconds, between the starting and ending times of the batch build's phase.
    */
  var durationInSeconds: js.UndefOr[WrapperLong] = js.native
  /**
    * When the batch build phase ended, expressed in Unix time format.
    */
  var endTime: js.UndefOr[Timestamp] = js.native
  /**
    * The current status of the batch build phase. Valid values include:  FAILED  The build phase failed.  FAULT  The build phase faulted.  IN_PROGRESS  The build phase is still in progress.  QUEUED  The build has been submitted and is queued behind other submitted builds.  STOPPED  The build phase stopped.  SUCCEEDED  The build phase succeeded.  TIMED_OUT  The build phase timed out.  
    */
  var phaseStatus: js.UndefOr[StatusType] = js.native
  /**
    * The name of the batch build phase. Valid values include:  COMBINE_ARTIFACTS  Build output artifacts are being combined and uploaded to the output location.  DOWNLOAD_BATCHSPEC  The batch build specification is being downloaded.  FAILED  One or more of the builds failed.  IN_PROGRESS  The batch build is in progress.  STOPPED  The batch build was stopped.  SUBMITTED  The btach build has been submitted.  SUCCEEDED  The batch build succeeded.  
    */
  var phaseType: js.UndefOr[BuildBatchPhaseType] = js.native
  /**
    * When the batch build phase started, expressed in Unix time format.
    */
  var startTime: js.UndefOr[Timestamp] = js.native
}

object BuildBatchPhase {
  @scala.inline
  def apply(): BuildBatchPhase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBatchPhase]
  }
  @scala.inline
  implicit class BuildBatchPhaseOps[Self <: BuildBatchPhase] (val x: Self) extends AnyVal {
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
    def setContextsVarargs(value: PhaseContext*): Self = this.set("contexts", js.Array(value :_*))
    @scala.inline
    def setContexts(value: PhaseContexts): Self = this.set("contexts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContexts: Self = this.set("contexts", js.undefined)
    @scala.inline
    def setDurationInSeconds(value: WrapperLong): Self = this.set("durationInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationInSeconds: Self = this.set("durationInSeconds", js.undefined)
    @scala.inline
    def setEndTime(value: Timestamp): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setPhaseStatus(value: StatusType): Self = this.set("phaseStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhaseStatus: Self = this.set("phaseStatus", js.undefined)
    @scala.inline
    def setPhaseType(value: BuildBatchPhaseType): Self = this.set("phaseType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhaseType: Self = this.set("phaseType", js.undefined)
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
  
}

