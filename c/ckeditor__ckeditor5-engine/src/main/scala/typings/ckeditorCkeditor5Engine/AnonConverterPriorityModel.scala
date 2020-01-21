package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.mod.view.MatcherPattern
import typings.ckeditorCkeditor5Utils.mod.PriorityString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConverterPriorityModel extends js.Object {
  var converterPriority: js.UndefOr[PriorityString] = js.undefined
  var model: String | AnonKeyValue
  var view: MatcherPattern
}

object AnonConverterPriorityModel {
  @scala.inline
  def apply(model: String | AnonKeyValue, view: MatcherPattern, converterPriority: PriorityString = null): AnonConverterPriorityModel = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    if (converterPriority != null) __obj.updateDynamic("converterPriority")(converterPriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConverterPriorityModel]
  }
}

