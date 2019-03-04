package typings
package atCkeditorCkeditor5DashEngineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConverterPriorityModelView extends js.Object {
  var converterPriority: js.UndefOr[atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod.PriorityString] = js.undefined
  var model: java.lang.String | stdLib.Element | js.Function
  var view: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.MatcherPattern
}

object Anon_ConverterPriorityModelView {
  @scala.inline
  def apply(
    model: java.lang.String | stdLib.Element | js.Function,
    view: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.MatcherPattern,
    converterPriority: atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod.PriorityString = null
  ): Anon_ConverterPriorityModelView = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    if (converterPriority != null) __obj.updateDynamic("converterPriority")(converterPriority)
    __obj.asInstanceOf[Anon_ConverterPriorityModelView]
  }
}

