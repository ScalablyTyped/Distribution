package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerNodeDetails extends js.Object {
  /**
    * The information of the trigger represented by the trigger node.
    */
  var Trigger: js.UndefOr[typings.awsSdk.glueMod.Trigger] = js.native
}

object TriggerNodeDetails {
  @scala.inline
  def apply(Trigger: Trigger = null): TriggerNodeDetails = {
    val __obj = js.Dynamic.literal()
    if (Trigger != null) __obj.updateDynamic("Trigger")(Trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNodeDetails]
  }
}

