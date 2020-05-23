package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildPhase extends js.Object {
  /**
    * Additional information about a build phase, especially to help troubleshoot a failed build.
    */
  var contexts: js.UndefOr[PhaseContexts] = js.native
  /**
    * How long, in seconds, between the starting and ending times of the build's phase.
    */
  var durationInSeconds: js.UndefOr[WrapperLong] = js.native
  /**
    * When the build phase ended, expressed in Unix time format.
    */
  var endTime: js.UndefOr[Timestamp] = js.native
  /**
    * The current status of the build phase. Valid values include:    FAILED: The build phase failed.    FAULT: The build phase faulted.    IN_PROGRESS: The build phase is still in progress.    QUEUED: The build has been submitted and is queued behind other submitted builds.    STOPPED: The build phase stopped.    SUCCEEDED: The build phase succeeded.    TIMED_OUT: The build phase timed out.  
    */
  var phaseStatus: js.UndefOr[StatusType] = js.native
  /**
    * The name of the build phase. Valid values include:    BUILD: Core build activities typically occur in this build phase.    COMPLETED: The build has been completed.    DOWNLOAD_SOURCE: Source code is being downloaded in this build phase.    FINALIZING: The build process is completing in this build phase.    INSTALL: Installation activities typically occur in this build phase.    POST_BUILD: Post-build activities typically occur in this build phase.    PRE_BUILD: Pre-build activities typically occur in this build phase.    PROVISIONING: The build environment is being set up.    QUEUED: The build has been submitted and is queued behind other submitted builds.    SUBMITTED: The build has been submitted.    UPLOAD_ARTIFACTS: Build output artifacts are being uploaded to the output location.  
    */
  var phaseType: js.UndefOr[BuildPhaseType] = js.native
  /**
    * When the build phase started, expressed in Unix time format.
    */
  var startTime: js.UndefOr[Timestamp] = js.native
}

object BuildPhase {
  @scala.inline
  def apply(
    contexts: PhaseContexts = null,
    durationInSeconds: js.UndefOr[WrapperLong] = js.undefined,
    endTime: Timestamp = null,
    phaseStatus: StatusType = null,
    phaseType: BuildPhaseType = null,
    startTime: Timestamp = null
  ): BuildPhase = {
    val __obj = js.Dynamic.literal()
    if (contexts != null) __obj.updateDynamic("contexts")(contexts.asInstanceOf[js.Any])
    if (!js.isUndefined(durationInSeconds)) __obj.updateDynamic("durationInSeconds")(durationInSeconds.get.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (phaseStatus != null) __obj.updateDynamic("phaseStatus")(phaseStatus.asInstanceOf[js.Any])
    if (phaseType != null) __obj.updateDynamic("phaseType")(phaseType.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildPhase]
  }
}

