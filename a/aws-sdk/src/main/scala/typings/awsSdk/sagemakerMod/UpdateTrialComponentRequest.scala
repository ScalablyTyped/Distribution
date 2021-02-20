package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTrialComponentRequest extends StObject {
  
  /**
    * The name of the component as displayed. The name doesn't need to be unique. If DisplayName isn't specified, TrialComponentName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.native
  
  /**
    * When the component ended.
    */
  var EndTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * Replaces all of the component's input artifacts with the specified artifacts.
    */
  var InputArtifacts: js.UndefOr[TrialComponentArtifacts] = js.native
  
  /**
    * The input artifacts to remove from the component.
    */
  var InputArtifactsToRemove: js.UndefOr[ListTrialComponentKey256] = js.native
  
  /**
    * Replaces all of the component's output artifacts with the specified artifacts.
    */
  var OutputArtifacts: js.UndefOr[TrialComponentArtifacts] = js.native
  
  /**
    * The output artifacts to remove from the component.
    */
  var OutputArtifactsToRemove: js.UndefOr[ListTrialComponentKey256] = js.native
  
  /**
    * Replaces all of the component's hyperparameters with the specified hyperparameters.
    */
  var Parameters: js.UndefOr[TrialComponentParameters] = js.native
  
  /**
    * The hyperparameters to remove from the component.
    */
  var ParametersToRemove: js.UndefOr[ListTrialComponentKey256] = js.native
  
  /**
    * When the component started.
    */
  var StartTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The new status of the component.
    */
  var Status: js.UndefOr[TrialComponentStatus] = js.native
  
  /**
    * The name of the component to update.
    */
  var TrialComponentName: ExperimentEntityName = js.native
}
object UpdateTrialComponentRequest {
  
  @scala.inline
  def apply(TrialComponentName: ExperimentEntityName): UpdateTrialComponentRequest = {
    val __obj = js.Dynamic.literal(TrialComponentName = TrialComponentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrialComponentRequest]
  }
  
  @scala.inline
  implicit class UpdateTrialComponentRequestMutableBuilder[Self <: UpdateTrialComponentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: ExperimentEntityName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setInputArtifacts(value: TrialComponentArtifacts): Self = StObject.set(x, "InputArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputArtifactsToRemove(value: ListTrialComponentKey256): Self = StObject.set(x, "InputArtifactsToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputArtifactsToRemoveUndefined: Self = StObject.set(x, "InputArtifactsToRemove", js.undefined)
    
    @scala.inline
    def setInputArtifactsToRemoveVarargs(value: TrialComponentKey256*): Self = StObject.set(x, "InputArtifactsToRemove", js.Array(value :_*))
    
    @scala.inline
    def setInputArtifactsUndefined: Self = StObject.set(x, "InputArtifacts", js.undefined)
    
    @scala.inline
    def setOutputArtifacts(value: TrialComponentArtifacts): Self = StObject.set(x, "OutputArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputArtifactsToRemove(value: ListTrialComponentKey256): Self = StObject.set(x, "OutputArtifactsToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputArtifactsToRemoveUndefined: Self = StObject.set(x, "OutputArtifactsToRemove", js.undefined)
    
    @scala.inline
    def setOutputArtifactsToRemoveVarargs(value: TrialComponentKey256*): Self = StObject.set(x, "OutputArtifactsToRemove", js.Array(value :_*))
    
    @scala.inline
    def setOutputArtifactsUndefined: Self = StObject.set(x, "OutputArtifacts", js.undefined)
    
    @scala.inline
    def setParameters(value: TrialComponentParameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersToRemove(value: ListTrialComponentKey256): Self = StObject.set(x, "ParametersToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersToRemoveUndefined: Self = StObject.set(x, "ParametersToRemove", js.undefined)
    
    @scala.inline
    def setParametersToRemoveVarargs(value: TrialComponentKey256*): Self = StObject.set(x, "ParametersToRemove", js.Array(value :_*))
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setStatus(value: TrialComponentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTrialComponentName(value: ExperimentEntityName): Self = StObject.set(x, "TrialComponentName", value.asInstanceOf[js.Any])
  }
}
