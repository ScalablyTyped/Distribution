package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMitigationActionResponse extends js.Object {
  /**
    * The ARN for the new mitigation action.
    */
  var actionArn: js.UndefOr[MitigationActionArn] = js.native
  /**
    * A unique identifier for the mitigation action.
    */
  var actionId: js.UndefOr[MitigationActionId] = js.native
}

object UpdateMitigationActionResponse {
  @scala.inline
  def apply(actionArn: MitigationActionArn = null, actionId: MitigationActionId = null): UpdateMitigationActionResponse = {
    val __obj = js.Dynamic.literal()
    if (actionArn != null) __obj.updateDynamic("actionArn")(actionArn.asInstanceOf[js.Any])
    if (actionId != null) __obj.updateDynamic("actionId")(actionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMitigationActionResponse]
  }
}

