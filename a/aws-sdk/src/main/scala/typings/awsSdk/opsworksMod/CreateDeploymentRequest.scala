package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDeploymentRequest extends js.Object {
  
  /**
    * The app ID. This parameter is required for app deployments, but not for other deployment commands.
    */
  var AppId: js.UndefOr[String] = js.native
  
  /**
    * A DeploymentCommand object that specifies the deployment command and any associated arguments.
    */
  var Command: DeploymentCommand = js.native
  
  /**
    * A user-defined comment.
    */
  var Comment: js.UndefOr[String] = js.native
  
  /**
    * A string that contains user-defined, custom JSON. You can use this parameter to override some corresponding default stack configuration JSON values. The string should be in the following format:  "{\"key1\": \"value1\", \"key2\": \"value2\",...}"  For more information about custom JSON, see Use Custom JSON to Modify the Stack Configuration Attributes and Overriding Attributes With Custom JSON.
    */
  var CustomJson: js.UndefOr[String] = js.native
  
  /**
    * The instance IDs for the deployment targets.
    */
  var InstanceIds: js.UndefOr[Strings] = js.native
  
  /**
    * The layer IDs for the deployment targets.
    */
  var LayerIds: js.UndefOr[Strings] = js.native
  
  /**
    * The stack ID.
    */
  var StackId: String = js.native
}
object CreateDeploymentRequest {
  
  @scala.inline
  def apply(Command: DeploymentCommand, StackId: String): CreateDeploymentRequest = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentRequest]
  }
  
  @scala.inline
  implicit class CreateDeploymentRequestOps[Self <: CreateDeploymentRequest] (val x: Self) extends AnyVal {
    
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
    def setCommand(value: DeploymentCommand): Self = this.set("Command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackId(value: String): Self = this.set("StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppId(value: String): Self = this.set("AppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppId: Self = this.set("AppId", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = this.set("Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("Comment", js.undefined)
    
    @scala.inline
    def setCustomJson(value: String): Self = this.set("CustomJson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomJson: Self = this.set("CustomJson", js.undefined)
    
    @scala.inline
    def setInstanceIdsVarargs(value: String*): Self = this.set("InstanceIds", js.Array(value :_*))
    
    @scala.inline
    def setInstanceIds(value: Strings): Self = this.set("InstanceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceIds: Self = this.set("InstanceIds", js.undefined)
    
    @scala.inline
    def setLayerIdsVarargs(value: String*): Self = this.set("LayerIds", js.Array(value :_*))
    
    @scala.inline
    def setLayerIds(value: Strings): Self = this.set("LayerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayerIds: Self = this.set("LayerIds", js.undefined)
  }
}
