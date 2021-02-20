package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoMLCandidate extends StObject {
  
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
  implicit class AutoMLCandidateMutableBuilder[Self <: AutoMLCandidate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCandidateName(value: CandidateName): Self = StObject.set(x, "CandidateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidateStatus(value: CandidateStatus): Self = StObject.set(x, "CandidateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidateSteps(value: CandidateSteps): Self = StObject.set(x, "CandidateSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidateStepsVarargs(value: AutoMLCandidateStep*): Self = StObject.set(x, "CandidateSteps", js.Array(value :_*))
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setFailureReason(value: AutoMLFailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setFinalAutoMLJobObjectiveMetric(value: FinalAutoMLJobObjectiveMetric): Self = StObject.set(x, "FinalAutoMLJobObjectiveMetric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalAutoMLJobObjectiveMetricUndefined: Self = StObject.set(x, "FinalAutoMLJobObjectiveMetric", js.undefined)
    
    @scala.inline
    def setInferenceContainers(value: AutoMLContainerDefinitions): Self = StObject.set(x, "InferenceContainers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInferenceContainersUndefined: Self = StObject.set(x, "InferenceContainers", js.undefined)
    
    @scala.inline
    def setInferenceContainersVarargs(value: AutoMLContainerDefinition*): Self = StObject.set(x, "InferenceContainers", js.Array(value :_*))
    
    @scala.inline
    def setLastModifiedTime(value: Timestamp): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectiveStatus(value: ObjectiveStatus): Self = StObject.set(x, "ObjectiveStatus", value.asInstanceOf[js.Any])
  }
}
