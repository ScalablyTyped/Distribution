package typings
package atCkeditorCkeditor5DashEngineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConverterPriorityModelViewFunction extends js.Object {
  var converterPriority: js.UndefOr[atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod.PriorityString] = js.undefined
  var model: java.lang.String | js.Function
  var view: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.MatcherPattern
}

object Anon_ConverterPriorityModelViewFunction {
  @scala.inline
  def apply(
    model: java.lang.String | js.Function,
    view: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.MatcherPattern,
    converterPriority: atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod.PriorityString = null
  ): Anon_ConverterPriorityModelViewFunction = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    if (converterPriority != null) __obj.updateDynamic("converterPriority")(converterPriority)
    __obj.asInstanceOf[Anon_ConverterPriorityModelViewFunction]
  }
}

