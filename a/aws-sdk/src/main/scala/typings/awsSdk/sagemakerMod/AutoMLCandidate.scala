package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoMLCandidate extends js.Object {
  
  /**
    * The candidate name.
    */
  var CandidateName: typings.awsSdk.sagemakerMod.CandidateName = js.native
  
  /**
    * The candidate's status.
    */
  var CandidateStatus: typings.awsSdk.sagemakerMod.CandidateStatus = js.native
  
  /**
    * The candidate's steps.
    */
  var CandidateSteps: typings.awsSdk.sagemakerMod.CandidateSteps = js.native
  
  /**
    * The creation time.
    */
  var CreationTime: Timestamp = js.native
  
  /**
    * The end time.
    */
  var EndTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The failure reason.
    */
  var FailureReason: js.UndefOr[AutoMLFailureReason] = js.native
  
  var FinalAutoMLJobObjectiveMetric: js.UndefOr[typings.awsSdk.sagemakerMod.FinalAutoMLJobObjectiveMetric] = js.native
  
  /**
    * The inference containers.
    */
  var InferenceContainers: js.UndefOr[AutoMLContainerDefinitions] = js.native
  
  /**
    * The last modified time.
    */
  var LastModifiedTime: Timestamp = js.native
  
  /**
    * The objective status.
    */
  var ObjectiveStatus: typings.awsSdk.sagemakerMod.ObjectiveStatus = js.native
}
object AutoMLCandidate {
  
  @scala.inline
  def apply(
    CandidateName: CandidateName,
    CandidateStatus: CandidateStatus,
    CandidateSteps: CandidateSteps,
    CreationTime: Timestamp,
    LastModifiedTime: Timestamp,
    ObjectiveStatus: ObjectiveStatus
  ): AutoMLCandidate = {
    val __obj = js.Dynamic.literal(CandidateName = CandidateName.asInstanceOf[js.Any], CandidateStatus = CandidateStatus.asInstanceOf[js.Any], CandidateSteps = CandidateSteps.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], ObjectiveStatus = ObjectiveStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLCandidate]
  }
  
  @scala.inline
  implicit class AutoMLCandidateOps[Self <: AutoMLCandidate] (val x: Self) extends AnyVal {
    
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
    def setCandidateName(value: CandidateName): Self = this.set("CandidateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidateStatus(value: CandidateStatus): Self = this.set("CandidateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidateStepsVarargs(value: AutoMLCandidateStep*): Self = this.set("CandidateSteps", js.Array(value :_*))
    
    @scala.inline
    def setCandidateSteps(value: CandidateSteps): Self = this.set("CandidateSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTime(value: Timestamp): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectiveStatus(value: ObjectiveStatus): Self = this.set("ObjectiveStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    
    @scala.inline
    def setFailureReason(value: AutoMLFailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    
    @scala.inline
    def setFinalAutoMLJobObjectiveMetric(value: FinalAutoMLJobObjectiveMetric): Self = this.set("FinalAutoMLJobObjectiveMetric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalAutoMLJobObjectiveMetric: Self = this.set("FinalAutoMLJobObjectiveMetric", js.undefined)
    
    @scala.inline
    def setInferenceContainersVarargs(value: AutoMLContainerDefinition*): Self = this.set("InferenceContainers", js.Array(value :_*))
    
    @scala.inline
    def setInferenceContainers(value: AutoMLContainerDefinitions): Self = this.set("InferenceContainers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInferenceContainers: Self = this.set("InferenceContainers", js.undefined)
  }
}
