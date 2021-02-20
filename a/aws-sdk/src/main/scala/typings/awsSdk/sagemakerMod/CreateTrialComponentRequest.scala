package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTrialComponentRequest extends StObject {
  
  /**
    * The name of the component as displayed. The name doesn't need to be unique. If DisplayName isn't specified, TrialComponentName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.native
  
  /**
    * When the component ended.
    */
  var EndTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The input artifacts for the component. Examples of input artifacts are datasets, algorithms, hyperparameters, source code, and instance types.
    */
  var InputArtifacts: js.UndefOr[TrialComponentArtifacts] = js.native
  
  /**
    * The output artifacts for the component. Examples of output artifacts are metrics, snapshots, logs, and images.
    */
  var OutputArtifacts: js.UndefOr[TrialComponentArtifacts] = js.native
  
  /**
    * The hyperparameters for the component.
    */
  var Parameters: js.UndefOr[TrialComponentParameters] = js.native
  
  /**
    * When the component started.
    */
  var StartTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The status of the component. States include:   InProgress   Completed   Failed  
    */
  var Status: js.UndefOr[TrialComponentStatus] = js.native
  
  /**
    * A list of tags to associate with the component. You can use Search API to search on the tags.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The name of the component. The name must be unique in your AWS account and is not case-sensitive.
    */
  var TrialComponentName: ExperimentEntityName = js.native
}
object CreateTrialComponentRequest {
  
  @scala.inline
  def apply(TrialComponentName: ExperimentEntityName): CreateTrialComponentRequest = {
    val __obj = js.Dynamic.literal(TrialComponentName = TrialComponentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrialComponentRequest]
  }
  
  @scala.inline
  implicit class CreateTrialComponentRequestMutableBuilder[Self <: CreateTrialComponentRequest] (val x: Self) extends AnyVal {
    
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
    def setInputArtifactsUndefined: Self = StObject.set(x, "InputArtifacts", js.undefined)
    
    @scala.inline
    def setOutputArtifacts(value: TrialComponentArtifacts): Self = StObject.set(x, "OutputArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputArtifactsUndefined: Self = StObject.set(x, "OutputArtifacts", js.undefined)
    
    @scala.inline
    def setParameters(value: TrialComponentParameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
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
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTrialComponentName(value: ExperimentEntityName): Self = StObject.set(x, "TrialComponentName", value.asInstanceOf[js.Any])
  }
}
