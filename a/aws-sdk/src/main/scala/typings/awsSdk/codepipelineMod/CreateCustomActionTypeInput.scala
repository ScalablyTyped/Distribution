package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomActionTypeInput extends StObject {
  
  /**
    * The category of the custom action, such as a build action or a test action.
    */
  var category: ActionCategory
  
  /**
    * The configuration properties for the custom action.  You can refer to a name in the configuration properties of the custom action within the URL templates by following the format of {Config:name}, as long as the configuration property is both required and not secret. For more information, see Create a Custom Action for a Pipeline. 
    */
  var configurationProperties: js.UndefOr[ActionConfigurationPropertyList] = js.undefined
  
  /**
    * The details of the input artifact for the action, such as its commit ID.
    */
  var inputArtifactDetails: ArtifactDetails
  
  /**
    * The details of the output artifact of the action, such as its commit ID.
    */
  var outputArtifactDetails: ArtifactDetails
  
  /**
    * The provider of the service used in the custom action, such as AWS CodeDeploy.
    */
  var provider: ActionProvider
  
  /**
    * URLs that provide users information about this custom action.
    */
  var settings: js.UndefOr[ActionTypeSettings] = js.undefined
  
  /**
    * The tags for the custom action.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The version identifier of the custom action.
    */
  var version: Version
}
object CreateCustomActionTypeInput {
  
  inline def apply(
    category: ActionCategory,
    inputArtifactDetails: ArtifactDetails,
    outputArtifactDetails: ArtifactDetails,
    provider: ActionProvider,
    version: Version
  ): CreateCustomActionTypeInput = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], inputArtifactDetails = inputArtifactDetails.asInstanceOf[js.Any], outputArtifactDetails = outputArtifactDetails.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomActionTypeInput]
  }
  
  extension [Self <: CreateCustomActionTypeInput](x: Self) {
    
    inline def setCategory(value: ActionCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setConfigurationProperties(value: ActionConfigurationPropertyList): Self = StObject.set(x, "configurationProperties", value.asInstanceOf[js.Any])
    
    inline def setConfigurationPropertiesUndefined: Self = StObject.set(x, "configurationProperties", js.undefined)
    
    inline def setConfigurationPropertiesVarargs(value: ActionConfigurationProperty*): Self = StObject.set(x, "configurationProperties", js.Array(value :_*))
    
    inline def setInputArtifactDetails(value: ArtifactDetails): Self = StObject.set(x, "inputArtifactDetails", value.asInstanceOf[js.Any])
    
    inline def setOutputArtifactDetails(value: ArtifactDetails): Self = StObject.set(x, "outputArtifactDetails", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: ActionProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: ActionTypeSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
