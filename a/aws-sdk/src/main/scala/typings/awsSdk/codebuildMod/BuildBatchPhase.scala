package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBatchPhase extends StObject {
  
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
  implicit class BuildBatchPhaseMutableBuilder[Self <: BuildBatchPhase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContexts(value: PhaseContexts): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    @scala.inline
    def setContextsVarargs(value: PhaseContext*): Self = StObject.set(x, "contexts", js.Array(value :_*))
    
    @scala.inline
    def setDurationInSeconds(value: WrapperLong): Self = StObject.set(x, "durationInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationInSecondsUndefined: Self = StObject.set(x, "durationInSeconds", js.undefined)
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setPhaseStatus(value: StatusType): Self = StObject.set(x, "phaseStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhaseStatusUndefined: Self = StObject.set(x, "phaseStatus", js.undefined)
    
    @scala.inline
    def setPhaseType(value: BuildBatchPhaseType): Self = StObject.set(x, "phaseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhaseTypeUndefined: Self = StObject.set(x, "phaseType", js.undefined)
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
