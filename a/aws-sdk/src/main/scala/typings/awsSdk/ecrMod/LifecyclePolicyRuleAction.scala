package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecyclePolicyRuleAction extends js.Object {
  /**
    * The type of action to be taken.
    */
  var `type`: js.UndefOr[ImageActionType] = js.native
}

object LifecyclePolicyRuleAction {
  @scala.inline
  def apply(`type`: ImageActionType = null): LifecyclePolicyRuleAction = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicyRuleAction]
  }
}

