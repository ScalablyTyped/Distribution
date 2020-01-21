package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deployment extends js.Object {
  /**
    * The app ID.
    */
  var AppId: js.UndefOr[String] = js.native
  /**
    * Used to specify a stack or deployment command.
    */
  var Command: js.UndefOr[DeploymentCommand] = js.native
  /**
    * A user-defined comment.
    */
  var Comment: js.UndefOr[String] = js.native
  /**
    * Date when the deployment completed.
    */
  var CompletedAt: js.UndefOr[DateTime] = js.native
  /**
    * Date when the deployment was created.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.native
  /**
    * A string that contains user-defined custom JSON. It can be used to override the corresponding default stack configuration attribute values for stack or to pass data to recipes. The string should be in the following format:  "{\"key1\": \"value1\", \"key2\": \"value2\",...}"  For more information on custom JSON, see Use Custom JSON to Modify the Stack Configuration Attributes.
    */
  var CustomJson: js.UndefOr[String] = js.native
  /**
    * The deployment ID.
    */
  var DeploymentId: js.UndefOr[String] = js.native
  /**
    * The deployment duration.
    */
  var Duration: js.UndefOr[Integer] = js.native
  /**
    * The user's IAM ARN.
    */
  var IamUserArn: js.UndefOr[String] = js.native
  /**
    * The IDs of the target instances.
    */
  var InstanceIds: js.UndefOr[Strings] = js.native
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.native
  /**
    * The deployment status:   running   successful   failed  
    */
  var Status: js.UndefOr[String] = js.native
}

object Deployment {
  @scala.inline
  def apply(
    AppId: String = null,
    Command: DeploymentCommand = null,
    Comment: String = null,
    CompletedAt: DateTime = null,
    CreatedAt: DateTime = null,
    CustomJson: String = null,
    DeploymentId: String = null,
    Duration: Int | scala.Double = null,
    IamUserArn: String = null,
    InstanceIds: Strings = null,
    StackId: String = null,
    Status: String = null
  ): Deployment = {
    val __obj = js.Dynamic.literal()
    if (AppId != null) __obj.updateDynamic("AppId")(AppId.asInstanceOf[js.Any])
    if (Command != null) __obj.updateDynamic("Command")(Command.asInstanceOf[js.Any])
    if (Comment != null) __obj.updateDynamic("Comment")(Comment.asInstanceOf[js.Any])
    if (CompletedAt != null) __obj.updateDynamic("CompletedAt")(CompletedAt.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (CustomJson != null) __obj.updateDynamic("CustomJson")(CustomJson.asInstanceOf[js.Any])
    if (DeploymentId != null) __obj.updateDynamic("DeploymentId")(DeploymentId.asInstanceOf[js.Any])
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (IamUserArn != null) __obj.updateDynamic("IamUserArn")(IamUserArn.asInstanceOf[js.Any])
    if (InstanceIds != null) __obj.updateDynamic("InstanceIds")(InstanceIds.asInstanceOf[js.Any])
    if (StackId != null) __obj.updateDynamic("StackId")(StackId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deployment]
  }
}

