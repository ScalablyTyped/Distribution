package typings.atCkeditorCkeditor5DashEngine

import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.view.MatcherPattern
import typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.PriorityString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConverterPriorityModelViewFunction extends js.Object {
  var converterPriority: js.UndefOr[PriorityString] = js.undefined
  var model: String | js.Function
  var view: MatcherPattern
}

object Anon_ConverterPriorityModelViewFunction {
  @scala.inline
  def apply(model: String | js.Function, view: MatcherPattern, converterPriority: PriorityString = null): Anon_ConverterPriorityModelViewFunction = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    if (converterPriority != null) __obj.updateDynamic("converterPriority")(converterPriority)
    __obj.asInstanceOf[Anon_ConverterPriorityModelViewFunction]
  }
}

