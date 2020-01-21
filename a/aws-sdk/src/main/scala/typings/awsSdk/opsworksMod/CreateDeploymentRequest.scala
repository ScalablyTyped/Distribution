package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    Command: DeploymentCommand,
    StackId: String,
    AppId: String = null,
    Comment: String = null,
    CustomJson: String = null,
    InstanceIds: Strings = null,
    LayerIds: Strings = null
  ): CreateDeploymentRequest = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
    if (AppId != null) __obj.updateDynamic("AppId")(AppId.asInstanceOf[js.Any])
    if (Comment != null) __obj.updateDynamic("Comment")(Comment.asInstanceOf[js.Any])
    if (CustomJson != null) __obj.updateDynamic("CustomJson")(CustomJson.asInstanceOf[js.Any])
    if (InstanceIds != null) __obj.updateDynamic("InstanceIds")(InstanceIds.asInstanceOf[js.Any])
    if (LayerIds != null) __obj.updateDynamic("LayerIds")(LayerIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentRequest]
  }
}

