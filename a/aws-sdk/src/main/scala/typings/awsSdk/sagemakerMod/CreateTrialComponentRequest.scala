package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTrialComponentRequest extends StObject {
  
  /**
    * The name of the component as displayed. The name doesn't need to be unique. If DisplayName isn't specified, TrialComponentName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  /**
    * When the component ended.
    */
  var EndTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The input artifacts for the component. Examples of input artifacts are datasets, algorithms, hyperparameters, source code, and instance types.
    */
  var InputArtifacts: js.UndefOr[TrialComponentArtifacts] = js.undefined
  
  /**
    * The output artifacts for the component. Examples of output artifacts are metrics, snapshots, logs, and images.
    */
  var OutputArtifacts: js.UndefOr[TrialComponentArtifacts] = js.undefined
  
  /**
    * The hyperparameters for the component.
    */
  var Parameters: js.UndefOr[TrialComponentParameters] = js.undefined
  
  /**
    * When the component started.
    */
  var StartTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The status of the component. States include:   InProgress   Completed   Failed  
    */
  var Status: js.UndefOr[TrialComponentStatus] = js.undefined
  
  /**
    * A list of tags to associate with the component. You can use Search API to search on the tags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The name of the component. The name must be unique in your AWS account and is not case-sensitive.
    */
  var TrialComponentName: ExperimentEntityName
}
object CreateTrialComponentRequest {
  
  inline def apply(TrialComponentName: ExperimentEntityName): CreateTrialComponentRequest = {
    val __obj = js.Dynamic.literal(TrialComponentName = TrialComponentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrialComponentRequest]
  }
  
  extension [Self <: CreateTrialComponentRequest](x: Self) {
    
    inline def setDisplayName(value: ExperimentEntityName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setEndTime(value: Timestamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setInputArtifacts(value: TrialComponentArtifacts): Self = StObject.set(x, "InputArtifacts", value.asInstanceOf[js.Any])
    
    inline def setInputArtifactsUndefined: Self = StObject.set(x, "InputArtifacts", js.undefined)
    
    inline def setOutputArtifacts(value: TrialComponentArtifacts): Self = StObject.set(x, "OutputArtifacts", value.asInstanceOf[js.Any])
    
    inline def setOutputArtifactsUndefined: Self = StObject.set(x, "OutputArtifacts", js.undefined)
    
    inline def setParameters(value: TrialComponentParameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setStartTime(value: Timestamp): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setStatus(value: TrialComponentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    inline def setTrialComponentName(value: ExperimentEntityName): Self = StObject.set(x, "TrialComponentName", value.asInstanceOf[js.Any])
  }
}
