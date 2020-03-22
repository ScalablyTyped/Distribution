package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Utils.mod.PriorityString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConverterPriority extends js.Object {
  var converterPriority: js.UndefOr[PriorityString] = js.undefined
  var model: String | AnonValue
  var view: String | AnonKey
}

object AnonConverterPriority {
  @scala.inline
  def apply(model: String | AnonValue, view: String | AnonKey, converterPriority: PriorityString = null): AnonConverterPriority = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    if (converterPriority != null) __obj.updateDynamic("converterPriority")(converterPriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConverterPriority]
  }
}

