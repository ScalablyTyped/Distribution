package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Utils.mod.PriorityString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConverterPriority extends js.Object {
  var converterPriority: js.UndefOr[PriorityString] = js.undefined
  var model: String | Value
  var view: String | Key
}

object ConverterPriority {
  @scala.inline
  def apply(model: String | Value, view: String | Key, converterPriority: PriorityString = null): ConverterPriority = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    if (converterPriority != null) __obj.updateDynamic("converterPriority")(converterPriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConverterPriority]
  }
}

