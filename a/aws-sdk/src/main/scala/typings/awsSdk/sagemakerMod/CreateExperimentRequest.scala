package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateExperimentRequest extends StObject {
  
  /**
    * The description of the experiment.
    */
  var Description: js.UndefOr[ExperimentDescription] = js.undefined
  
  /**
    * The name of the experiment as displayed. The name doesn't need to be unique. If you don't specify DisplayName, the value in ExperimentName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  /**
    * The name of the experiment. The name must be unique in your AWS account and is not case-sensitive.
    */
  var ExperimentName: ExperimentEntityName
  
  /**
    * A list of tags to associate with the experiment. You can use Search API to search on the tags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateExperimentRequest {
  
  @scala.inline
  def apply(ExperimentName: ExperimentEntityName): CreateExperimentRequest = {
    val __obj = js.Dynamic.literal(ExperimentName = ExperimentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExperimentRequest]
  }
  
  @scala.inline
  implicit class CreateExperimentRequestMutableBuilder[Self <: CreateExperimentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: ExperimentDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: ExperimentEntityName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setExperimentName(value: ExperimentEntityName): Self = StObject.set(x, "ExperimentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
