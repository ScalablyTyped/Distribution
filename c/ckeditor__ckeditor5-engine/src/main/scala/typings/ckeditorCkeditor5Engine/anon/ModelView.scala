package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.mod.view.MatcherPattern
import typings.ckeditorCkeditor5Utils.mod.PriorityString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelView extends js.Object {
  var converterPriority: js.UndefOr[PriorityString] = js.undefined
  var model: String | js.Function
  var view: MatcherPattern
}

object ModelView {
  @scala.inline
  def apply(model: String | js.Function, view: MatcherPattern, converterPriority: PriorityString = null): ModelView = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    if (converterPriority != null) __obj.updateDynamic("converterPriority")(converterPriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelView]
  }
}

