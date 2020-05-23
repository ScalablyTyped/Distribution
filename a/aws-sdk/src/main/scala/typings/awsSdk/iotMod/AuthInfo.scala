package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthInfo extends js.Object {
  /**
    * The type of action for which the principal is being authorized.
    */
  var actionType: js.UndefOr[ActionType] = js.native
  /**
    * The resources for which the principal is being authorized to perform the specified action.
    */
  var resources: Resources = js.native
}

object AuthInfo {
  @scala.inline
  def apply(resources: Resources, actionType: ActionType = null): AuthInfo = {
    val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any])
    if (actionType != null) __obj.updateDynamic("actionType")(actionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthInfo]
  }
}

