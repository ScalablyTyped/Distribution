package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFeatureRequest extends StObject {
  
  /**
    * The name of the variation to use as the default variation. The default variation is served to users who are not allocated to any ongoing launches or experiments of this feature. This variation must also be listed in the variations structure. If you omit defaultVariation, the first variation listed in the variations structure is used as the default variation.
    */
  var defaultVariation: js.UndefOr[VariationName] = js.undefined
  
  /**
    * An optional description of the feature.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * Specify users that should always be served a specific variation of a feature. Each user is specified by a key-value pair . For each key, specify a user by entering their user ID, account ID, or some other identifier. For the value, specify the name of the variation that they are to be served.
    */
  var entityOverrides: js.UndefOr[EntityOverrideMap] = js.undefined
  
  /**
    * Specify ALL_RULES to activate the traffic allocation specified by any ongoing launches or experiments. Specify DEFAULT_VARIATION to serve the default variation to all users instead.
    */
  var evaluationStrategy: js.UndefOr[FeatureEvaluationStrategy] = js.undefined
  
  /**
    * The name for the new feature.
    */
  var name: FeatureName
  
  /**
    * The name or ARN of the project that is to contain the new feature.
    */
  var project: ProjectRef
  
  /**
    * Assigns one or more tags (key-value pairs) to the feature. Tags can help you organize and categorize your resources. You can also use them to scope user permissions by granting a user permission to access or change only resources with certain tag values. Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of characters.  &lt;p&gt;You can associate as many as 50 tags with a feature.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * An array of structures that contain the configuration of the feature's different variations.
    */
  var variations: VariationConfigsList
}
object CreateFeatureRequest {
  
  inline def apply(name: FeatureName, project: ProjectRef, variations: VariationConfigsList): CreateFeatureRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], variations = variations.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFeatureRequest]
  }
  
  extension [Self <: CreateFeatureRequest](x: Self) {
    
    inline def setDefaultVariation(value: VariationName): Self = StObject.set(x, "defaultVariation", value.asInstanceOf[js.Any])
    
    inline def setDefaultVariationUndefined: Self = StObject.set(x, "defaultVariation", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEntityOverrides(value: EntityOverrideMap): Self = StObject.set(x, "entityOverrides", value.asInstanceOf[js.Any])
    
    inline def setEntityOverridesUndefined: Self = StObject.set(x, "entityOverrides", js.undefined)
    
    inline def setEvaluationStrategy(value: FeatureEvaluationStrategy): Self = StObject.set(x, "evaluationStrategy", value.asInstanceOf[js.Any])
    
    inline def setEvaluationStrategyUndefined: Self = StObject.set(x, "evaluationStrategy", js.undefined)
    
    inline def setName(value: FeatureName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProject(value: ProjectRef): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setVariations(value: VariationConfigsList): Self = StObject.set(x, "variations", value.asInstanceOf[js.Any])
    
    inline def setVariationsVarargs(value: VariationConfig*): Self = StObject.set(x, "variations", js.Array(value*))
  }
}
