package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverrideAction extends js.Object {
  /**
    * Override the rule action setting to count.
    */
  var Count: js.UndefOr[CountAction] = js.native
  /**
    * Don't override the rule action setting.
    */
  var None: js.UndefOr[NoneAction] = js.native
}

object OverrideAction {
  @scala.inline
  def apply(Count: CountAction = null, None: NoneAction = null): OverrideAction = {
    val __obj = js.Dynamic.literal()
    if (Count != null) __obj.updateDynamic("Count")(Count.asInstanceOf[js.Any])
    if (None != null) __obj.updateDynamic("None")(None.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverrideAction]
  }
}

