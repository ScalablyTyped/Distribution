package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MitigationAction extends js.Object {
  /**
    * The set of parameters for this mitigation action. The parameters vary, depending on the kind of action you apply.
    */
  var actionParams: js.UndefOr[MitigationActionParams] = js.native
  /**
    * A unique identifier for the mitigation action.
    */
  var id: js.UndefOr[MitigationActionId] = js.native
  /**
    * A user-friendly name for the mitigation action.
    */
  var name: js.UndefOr[MitigationActionName] = js.native
  /**
    * The IAM role ARN used to apply this mitigation action.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}

object MitigationAction {
  @scala.inline
  def apply(
    actionParams: MitigationActionParams = null,
    id: MitigationActionId = null,
    name: MitigationActionName = null,
    roleArn: RoleArn = null
  ): MitigationAction = {
    val __obj = js.Dynamic.literal()
    if (actionParams != null) __obj.updateDynamic("actionParams")(actionParams.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[MitigationAction]
  }
}

