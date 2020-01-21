package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTriggerResponse extends js.Object {
  /**
    * The requested trigger definition.
    */
  var Trigger: js.UndefOr[typings.awsSdk.glueMod.Trigger] = js.native
}

object GetTriggerResponse {
  @scala.inline
  def apply(Trigger: Trigger = null): GetTriggerResponse = {
    val __obj = js.Dynamic.literal()
    if (Trigger != null) __obj.updateDynamic("Trigger")(Trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTriggerResponse]
  }
}

