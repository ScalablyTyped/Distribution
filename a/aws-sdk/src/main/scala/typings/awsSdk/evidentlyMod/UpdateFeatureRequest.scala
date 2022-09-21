package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFeatureRequest extends StObject {
  
  /**
    * To update variation configurations for this feature, or add new ones, specify this structure. In this array, include any variations that you want to add or update. If the array includes a variation name that already exists for this feature, it is updated. If it includes a new variation name, it is added as a new variation.
    */
  var addOrUpdateVariations: js.UndefOr[VariationConfigsList] = js.undefined
  
  /**
    * The name of the variation to use as the default variation. The default variation is served to users who are not allocated to any ongoing launches or experiments of this feature.
    */
  var defaultVariation: js.UndefOr[VariationName] = js.undefined
  
  /**
    * An optional description of the feature.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * Specified users that should always be served a specific variation of a feature. Each user is specified by a key-value pair . For each key, specify a user by entering their user ID, account ID, or some other identifier. For the value, specify the name of the variation that they are to be served.
    */
  var entityOverrides: js.UndefOr[EntityOverrideMap] = js.undefined
  
  /**
    * Specify ALL_RULES to activate the traffic allocation specified by any ongoing launches or experiments. Specify DEFAULT_VARIATION to serve the default variation to all users instead.
    */
  var evaluationStrategy: js.UndefOr[FeatureEvaluationStrategy] = js.undefined
  
  /**
    * The name of the feature to be updated.
    */
  var feature: FeatureName
  
  /**
    * The name or ARN of the project that contains the feature to be updated.
    */
  var project: ProjectRef
  
  /**
    * Removes a variation from the feature. If the variation you specify doesn't exist, then this makes no change and does not report an error. This operation fails if you try to remove a variation that is part of an ongoing launch or experiment.
    */
  var removeVariations: js.UndefOr[VariationNameList] = js.undefined
}
object UpdateFeatureRequest {
  
  inline def apply(feature: FeatureName, project: ProjectRef): UpdateFeatureRequest = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFeatureRequest]
  }
  
  extension [Self <: UpdateFeatureRequest](x: Self) {
    
    inline def setAddOrUpdateVariations(value: VariationConfigsList): Self = StObject.set(x, "addOrUpdateVariations", value.asInstanceOf[js.Any])
    
    inline def setAddOrUpdateVariationsUndefined: Self = StObject.set(x, "addOrUpdateVariations", js.undefined)
    
    inline def setAddOrUpdateVariationsVarargs(value: VariationConfig*): Self = StObject.set(x, "addOrUpdateVariations", js.Array(value*))
    
    inline def setDefaultVariation(value: VariationName): Self = StObject.set(x, "defaultVariation", value.asInstanceOf[js.Any])
    
    inline def setDefaultVariationUndefined: Self = StObject.set(x, "defaultVariation", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEntityOverrides(value: EntityOverrideMap): Self = StObject.set(x, "entityOverrides", value.asInstanceOf[js.Any])
    
    inline def setEntityOverridesUndefined: Self = StObject.set(x, "entityOverrides", js.undefined)
    
    inline def setEvaluationStrategy(value: FeatureEvaluationStrategy): Self = StObject.set(x, "evaluationStrategy", value.asInstanceOf[js.Any])
    
    inline def setEvaluationStrategyUndefined: Self = StObject.set(x, "evaluationStrategy", js.undefined)
    
    inline def setFeature(value: FeatureName): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setProject(value: ProjectRef): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setRemoveVariations(value: VariationNameList): Self = StObject.set(x, "removeVariations", value.asInstanceOf[js.Any])
    
    inline def setRemoveVariationsUndefined: Self = StObject.set(x, "removeVariations", js.undefined)
    
    inline def setRemoveVariationsVarargs(value: VariationName*): Self = StObject.set(x, "removeVariations", js.Array(value*))
  }
}
