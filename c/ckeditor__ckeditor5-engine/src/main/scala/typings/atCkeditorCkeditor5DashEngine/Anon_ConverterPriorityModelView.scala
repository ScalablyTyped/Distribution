package typings.atCkeditorCkeditor5DashEngine

import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.MatcherPattern
import typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.PriorityString
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConverterPriorityModelView extends js.Object {
  var converterPriority: js.UndefOr[PriorityString] = js.undefined
  var model: String | Element | js.Function
  var view: MatcherPattern
}

object Anon_ConverterPriorityModelView {
  @scala.inline
  def apply(
    model: String | Element | js.Function,
    view: MatcherPattern,
    converterPriority: PriorityString = null
  ): Anon_ConverterPriorityModelView = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    if (converterPriority != null) __obj.updateDynamic("converterPriority")(converterPriority)
    __obj.asInstanceOf[Anon_ConverterPriorityModelView]
  }
}

