package typings.awsSdk.fisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateExperimentTemplateTargetInput extends StObject {
  
  /**
    * The filters to apply to identify target resources using specific attributes.
    */
  var filters: js.UndefOr[ExperimentTemplateTargetFilterInputList] = js.undefined
  
  /**
    * The resource type parameters.
    */
  var parameters: js.UndefOr[ExperimentTemplateTargetParameterMap] = js.undefined
  
  /**
    * The Amazon Resource Names (ARNs) of the targets.
    */
  var resourceArns: js.UndefOr[ResourceArnList] = js.undefined
  
  /**
    * The tags for the target resources.
    */
  var resourceTags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The resource type. The resource type must be supported for the specified action.
    */
  var resourceType: TargetResourceTypeId
  
  /**
    * Scopes the identified resources to a specific count or percentage.
    */
  var selectionMode: ExperimentTemplateTargetSelectionMode
}
object UpdateExperimentTemplateTargetInput {
  
  inline def apply(resourceType: TargetResourceTypeId, selectionMode: ExperimentTemplateTargetSelectionMode): UpdateExperimentTemplateTargetInput = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateExperimentTemplateTargetInput]
  }
  
  extension [Self <: UpdateExperimentTemplateTargetInput](x: Self) {
    
    inline def setFilters(value: ExperimentTemplateTargetFilterInputList): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: ExperimentTemplateTargetInputFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setParameters(value: ExperimentTemplateTargetParameterMap): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setResourceArns(value: ResourceArnList): Self = StObject.set(x, "resourceArns", value.asInstanceOf[js.Any])
    
    inline def setResourceArnsUndefined: Self = StObject.set(x, "resourceArns", js.undefined)
    
    inline def setResourceArnsVarargs(value: ResourceArn*): Self = StObject.set(x, "resourceArns", js.Array(value*))
    
    inline def setResourceTags(value: TagMap): Self = StObject.set(x, "resourceTags", value.asInstanceOf[js.Any])
    
    inline def setResourceTagsUndefined: Self = StObject.set(x, "resourceTags", js.undefined)
    
    inline def setResourceType(value: TargetResourceTypeId): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSelectionMode(value: ExperimentTemplateTargetSelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
  }
}
