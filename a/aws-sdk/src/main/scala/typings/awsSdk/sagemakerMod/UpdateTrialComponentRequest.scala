package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTrialComponentRequest extends StObject {
  
  /**
    * The name of the component as displayed. The name doesn't need to be unique. If DisplayName isn't specified, TrialComponentName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  /**
    * When the component ended.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Replaces all of the component's input artifacts with the specified artifacts.
    */
  var InputArtifacts: js.UndefOr[TrialComponentArtifacts] = js.undefined
  
  /**
    * The input artifacts to remove from the component.
    */
  var InputArtifactsToRemove: js.UndefOr[ListTrialComponentKey256] = js.undefined
  
  /**
    * Replaces all of the component's output artifacts with the specified artifacts.
    */
  var OutputArtifacts: js.UndefOr[TrialComponentArtifacts] = js.undefined
  
  /**
    * The output artifacts to remove from the component.
    */
  var OutputArtifactsToRemove: js.UndefOr[ListTrialComponentKey256] = js.undefined
  
  /**
    * Replaces all of the component's hyperparameters with the specified hyperparameters.
    */
  var Parameters: js.UndefOr[TrialComponentParameters] = js.undefined
  
  /**
    * The hyperparameters to remove from the component.
    */
  var ParametersToRemove: js.UndefOr[ListTrialComponentKey256] = js.undefined
  
  /**
    * When the component started.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The new status of the component.
    */
  var Status: js.UndefOr[TrialComponentStatus] = js.undefined
  
  /**
    * The name of the component to update.
    */
  var TrialComponentName: ExperimentEntityName
}
object UpdateTrialComponentRequest {
  
  inline def apply(TrialComponentName: ExperimentEntityName): UpdateTrialComponentRequest = {
    val __obj = js.Dynamic.literal(TrialComponentName = TrialComponentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrialComponentRequest]
  }
  
  extension [Self <: UpdateTrialComponentRequest](x: Self) {
    
    inline def setDisplayName(value: ExperimentEntityName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setInputArtifacts(value: TrialComponentArtifacts): Self = StObject.set(x, "InputArtifacts", value.asInstanceOf[js.Any])
    
    inline def setInputArtifactsToRemove(value: ListTrialComponentKey256): Self = StObject.set(x, "InputArtifactsToRemove", value.asInstanceOf[js.Any])
    
    inline def setInputArtifactsToRemoveUndefined: Self = StObject.set(x, "InputArtifactsToRemove", js.undefined)
    
    inline def setInputArtifactsToRemoveVarargs(value: TrialComponentKey256*): Self = StObject.set(x, "InputArtifactsToRemove", js.Array(value*))
    
    inline def setInputArtifactsUndefined: Self = StObject.set(x, "InputArtifacts", js.undefined)
    
    inline def setOutputArtifacts(value: TrialComponentArtifacts): Self = StObject.set(x, "OutputArtifacts", value.asInstanceOf[js.Any])
    
    inline def setOutputArtifactsToRemove(value: ListTrialComponentKey256): Self = StObject.set(x, "OutputArtifactsToRemove", value.asInstanceOf[js.Any])
    
    inline def setOutputArtifactsToRemoveUndefined: Self = StObject.set(x, "OutputArtifactsToRemove", js.undefined)
    
    inline def setOutputArtifactsToRemoveVarargs(value: TrialComponentKey256*): Self = StObject.set(x, "OutputArtifactsToRemove", js.Array(value*))
    
    inline def setOutputArtifactsUndefined: Self = StObject.set(x, "OutputArtifacts", js.undefined)
    
    inline def setParameters(value: TrialComponentParameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersToRemove(value: ListTrialComponentKey256): Self = StObject.set(x, "ParametersToRemove", value.asInstanceOf[js.Any])
    
    inline def setParametersToRemoveUndefined: Self = StObject.set(x, "ParametersToRemove", js.undefined)
    
    inline def setParametersToRemoveVarargs(value: TrialComponentKey256*): Self = StObject.set(x, "ParametersToRemove", js.Array(value*))
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setStatus(value: TrialComponentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTrialComponentName(value: ExperimentEntityName): Self = StObject.set(x, "TrialComponentName", value.asInstanceOf[js.Any])
  }
}
