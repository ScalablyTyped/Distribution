package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTrialComponentRequest extends js.Object {
  
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
  implicit class UpdateTrialComponentRequestOps[Self <: UpdateTrialComponentRequest] (val x: Self) extends AnyVal {
    
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
    def setTrialComponentName(value: ExperimentEntityName): Self = this.set("TrialComponentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: ExperimentEntityName): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    
    @scala.inline
    def setInputArtifacts(value: TrialComponentArtifacts): Self = this.set("InputArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputArtifacts: Self = this.set("InputArtifacts", js.undefined)
    
    @scala.inline
    def setInputArtifactsToRemoveVarargs(value: TrialComponentKey256*): Self = this.set("InputArtifactsToRemove", js.Array(value :_*))
    
    @scala.inline
    def setInputArtifactsToRemove(value: ListTrialComponentKey256): Self = this.set("InputArtifactsToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputArtifactsToRemove: Self = this.set("InputArtifactsToRemove", js.undefined)
    
    @scala.inline
    def setOutputArtifacts(value: TrialComponentArtifacts): Self = this.set("OutputArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputArtifacts: Self = this.set("OutputArtifacts", js.undefined)
    
    @scala.inline
    def setOutputArtifactsToRemoveVarargs(value: TrialComponentKey256*): Self = this.set("OutputArtifactsToRemove", js.Array(value :_*))
    
    @scala.inline
    def setOutputArtifactsToRemove(value: ListTrialComponentKey256): Self = this.set("OutputArtifactsToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputArtifactsToRemove: Self = this.set("OutputArtifactsToRemove", js.undefined)
    
    @scala.inline
    def setParameters(value: TrialComponentParameters): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
    
    @scala.inline
    def setParametersToRemoveVarargs(value: TrialComponentKey256*): Self = this.set("ParametersToRemove", js.Array(value :_*))
    
    @scala.inline
    def setParametersToRemove(value: ListTrialComponentKey256): Self = this.set("ParametersToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParametersToRemove: Self = this.set("ParametersToRemove", js.undefined)
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    
    @scala.inline
    def setStatus(value: TrialComponentStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
