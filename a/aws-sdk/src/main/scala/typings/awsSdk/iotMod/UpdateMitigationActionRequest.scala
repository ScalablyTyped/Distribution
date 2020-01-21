package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMitigationActionRequest extends js.Object {
  /**
    * The friendly name for the mitigation action. You can't change the name by using UpdateMitigationAction. Instead, you must delete and re-create the mitigation action with the new name.
    */
  var actionName: MitigationActionName = js.native
  /**
    * Defines the type of action and the parameters for that action.
    */
  var actionParams: js.UndefOr[MitigationActionParams] = js.native
  /**
    * The ARN of the IAM role that is used to apply the mitigation action.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}

object UpdateMitigationActionRequest {
  @scala.inline
  def apply(
    actionName: MitigationActionName,
    actionParams: MitigationActionParams = null,
    roleArn: RoleArn = null
  ): UpdateMitigationActionRequest = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any])
    if (actionParams != null) __obj.updateDynamic("actionParams")(actionParams.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMitigationActionRequest]
  }
}

