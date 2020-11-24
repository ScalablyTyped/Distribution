package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionType extends js.Object {
  
  /**
    * The configuration properties for the action type.
    */
  var actionConfigurationProperties: js.UndefOr[ActionConfigurationPropertyList] = js.native
  
  /**
    * Represents information about an action type.
    */
  var id: ActionTypeId = js.native
  
  /**
    * The details of the input artifact for the action, such as its commit ID.
    */
  var inputArtifactDetails: ArtifactDetails = js.native
  
  /**
    * The details of the output artifact of the action, such as its commit ID.
    */
  var outputArtifactDetails: ArtifactDetails = js.native
  
  /**
    * The settings for the action type.
    */
  var settings: js.UndefOr[ActionTypeSettings] = js.native
}
object ActionType {
  
  @scala.inline
  def apply(id: ActionTypeId, inputArtifactDetails: ArtifactDetails, outputArtifactDetails: ArtifactDetails): ActionType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], inputArtifactDetails = inputArtifactDetails.asInstanceOf[js.Any], outputArtifactDetails = outputArtifactDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionType]
  }
  
  @scala.inline
  implicit class ActionTypeOps[Self <: ActionType] (val x: Self) extends AnyVal {
    
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
    def setId(value: ActionTypeId): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputArtifactDetails(value: ArtifactDetails): Self = this.set("inputArtifactDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputArtifactDetails(value: ArtifactDetails): Self = this.set("outputArtifactDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionConfigurationPropertiesVarargs(value: ActionConfigurationProperty*): Self = this.set("actionConfigurationProperties", js.Array(value :_*))
    
    @scala.inline
    def setActionConfigurationProperties(value: ActionConfigurationPropertyList): Self = this.set("actionConfigurationProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionConfigurationProperties: Self = this.set("actionConfigurationProperties", js.undefined)
    
    @scala.inline
    def setSettings(value: ActionTypeSettings): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
  }
}
