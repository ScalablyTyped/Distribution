package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoMLCandidate extends StObject {
  
  /**
    * The candidate name.
    */
  var CandidateName: typings.awsSdk.sagemakerMod.CandidateName
  
  /**
    * The candidate's status.
    */
  var CandidateStatus: typings.awsSdk.sagemakerMod.CandidateStatus
  
  /**
    * The candidate's steps.
    */
  var CandidateSteps: typings.awsSdk.sagemakerMod.CandidateSteps
  
  /**
    * The creation time.
    */
  var CreationTime: Timestamp
  
  /**
    * The end time.
    */
  var EndTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The failure reason.
    */
  var FailureReason: js.UndefOr[AutoMLFailureReason] = js.undefined
  
  var FinalAutoMLJobObjectiveMetric: js.UndefOr[typings.awsSdk.sagemakerMod.FinalAutoMLJobObjectiveMetric] = js.undefined
  
  /**
    * The inference containers.
    */
  var InferenceContainers: js.UndefOr[AutoMLContainerDefinitions] = js.undefined
  
  /**
    * The last modified time.
    */
  var LastModifiedTime: Timestamp
  
  /**
    * The objective status.
    */
  var ObjectiveStatus: typings.awsSdk.sagemakerMod.ObjectiveStatus
}
object AutoMLCandidate {
  
  inline def apply(
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
  
  extension [Self <: AutoMLCandidate](x: Self) {
    
    inline def setCandidateName(value: CandidateName): Self = StObject.set(x, "CandidateName", value.asInstanceOf[js.Any])
    
    inline def setCandidateStatus(value: CandidateStatus): Self = StObject.set(x, "CandidateStatus", value.asInstanceOf[js.Any])
    
    inline def setCandidateSteps(value: CandidateSteps): Self = StObject.set(x, "CandidateSteps", value.asInstanceOf[js.Any])
    
    inline def setCandidateStepsVarargs(value: AutoMLCandidateStep*): Self = StObject.set(x, "CandidateSteps", js.Array(value :_*))
    
    inline def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setEndTime(value: Timestamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setFailureReason(value: AutoMLFailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setFinalAutoMLJobObjectiveMetric(value: FinalAutoMLJobObjectiveMetric): Self = StObject.set(x, "FinalAutoMLJobObjectiveMetric", value.asInstanceOf[js.Any])
    
    inline def setFinalAutoMLJobObjectiveMetricUndefined: Self = StObject.set(x, "FinalAutoMLJobObjectiveMetric", js.undefined)
    
    inline def setInferenceContainers(value: AutoMLContainerDefinitions): Self = StObject.set(x, "InferenceContainers", value.asInstanceOf[js.Any])
    
    inline def setInferenceContainersUndefined: Self = StObject.set(x, "InferenceContainers", js.undefined)
    
    inline def setInferenceContainersVarargs(value: AutoMLContainerDefinition*): Self = StObject.set(x, "InferenceContainers", js.Array(value :_*))
    
    inline def setLastModifiedTime(value: Timestamp): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setObjectiveStatus(value: ObjectiveStatus): Self = StObject.set(x, "ObjectiveStatus", value.asInstanceOf[js.Any])
  }
}
