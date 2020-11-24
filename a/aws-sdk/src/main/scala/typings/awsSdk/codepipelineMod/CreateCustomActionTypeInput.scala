package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCustomActionTypeInput extends js.Object {
  
  /**
    * The category of the custom action, such as a build action or a test action.
    */
  var category: ActionCategory = js.native
  
  /**
    * The configuration properties for the custom action.  You can refer to a name in the configuration properties of the custom action within the URL templates by following the format of {Config:name}, as long as the configuration property is both required and not secret. For more information, see Create a Custom Action for a Pipeline. 
    */
  var configurationProperties: js.UndefOr[ActionConfigurationPropertyList] = js.native
  
  /**
    * The details of the input artifact for the action, such as its commit ID.
    */
  var inputArtifactDetails: ArtifactDetails = js.native
  
  /**
    * The details of the output artifact of the action, such as its commit ID.
    */
  var outputArtifactDetails: ArtifactDetails = js.native
  
  /**
    * The provider of the service used in the custom action, such as AWS CodeDeploy.
    */
  var provider: ActionProvider = js.native
  
  /**
    * URLs that provide users information about this custom action.
    */
  var settings: js.UndefOr[ActionTypeSettings] = js.native
  
  /**
    * The tags for the custom action.
    */
  var tags: js.UndefOr[TagList] = js.native
  
  /**
    * The version identifier of the custom action.
    */
  var version: Version = js.native
}
object CreateCustomActionTypeInput {
  
  @scala.inline
  def apply(
    category: ActionCategory,
    inputArtifactDetails: ArtifactDetails,
    outputArtifactDetails: ArtifactDetails,
    provider: ActionProvider,
    version: Version
  ): CreateCustomActionTypeInput = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], inputArtifactDetails = inputArtifactDetails.asInstanceOf[js.Any], outputArtifactDetails = outputArtifactDetails.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomActionTypeInput]
  }
  
  @scala.inline
  implicit class CreateCustomActionTypeInputOps[Self <: CreateCustomActionTypeInput] (val x: Self) extends AnyVal {
    
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
    def setCategory(value: ActionCategory): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputArtifactDetails(value: ArtifactDetails): Self = this.set("inputArtifactDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputArtifactDetails(value: ArtifactDetails): Self = this.set("outputArtifactDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: ActionProvider): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Version): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationPropertiesVarargs(value: ActionConfigurationProperty*): Self = this.set("configurationProperties", js.Array(value :_*))
    
    @scala.inline
    def setConfigurationProperties(value: ActionConfigurationPropertyList): Self = this.set("configurationProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationProperties: Self = this.set("configurationProperties", js.undefined)
    
    @scala.inline
    def setSettings(value: ActionTypeSettings): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
