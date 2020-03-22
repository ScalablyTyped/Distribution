package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionDescriptor extends js.Object {
  /**
  		 * Name of the clickable action. If not defined then no action will be shown
  		 */
  var actionTitle: js.UndefOr[String] = js.undefined
  /**
  		 * Data sent on callback being run.
  		 */
  var callbackData: js.UndefOr[js.Any] = js.undefined
  /**
  		 * User-visible label to display
  		 */
  var label: String
}

object ActionDescriptor {
  @scala.inline
  def apply(label: String, actionTitle: String = null, callbackData: js.Any = null): ActionDescriptor = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (actionTitle != null) __obj.updateDynamic("actionTitle")(actionTitle.asInstanceOf[js.Any])
    if (callbackData != null) __obj.updateDynamic("callbackData")(callbackData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionDescriptor]
  }
}

