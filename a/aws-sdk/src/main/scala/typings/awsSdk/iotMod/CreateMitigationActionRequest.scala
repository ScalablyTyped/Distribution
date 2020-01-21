package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMitigationActionRequest extends js.Object {
  /**
    * A friendly name for the action. Choose a friendly name that accurately describes the action (for example, EnableLoggingAction).
    */
  var actionName: MitigationActionName = js.native
  /**
    * Defines the type of action and the parameters for that action.
    */
  var actionParams: MitigationActionParams = js.native
  /**
    * The ARN of the IAM role that is used to apply the mitigation action.
    */
  var roleArn: RoleArn = js.native
  /**
    * Metadata that can be used to manage the mitigation action.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateMitigationActionRequest {
  @scala.inline
  def apply(
    actionName: MitigationActionName,
    actionParams: MitigationActionParams,
    roleArn: RoleArn,
    tags: TagList = null
  ): CreateMitigationActionRequest = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any], actionParams = actionParams.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMitigationActionRequest]
  }
}

