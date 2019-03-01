package typings
package atCkeditorCkeditor5DashEngineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConverterPriorityModel extends js.Object {
  var converterPriority: js.UndefOr[atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod.PriorityString] = js.undefined
  var model: java.lang.String | Anon_KeyValue
  var view: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.MatcherPattern
}

object Anon_ConverterPriorityModel {
  @scala.inline
  def apply(
    model: java.lang.String | Anon_KeyValue,
    view: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.MatcherPattern,
    converterPriority: atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod.PriorityString = null
  ): Anon_ConverterPriorityModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (converterPriority != null) __obj.updateDynamic("converterPriority")(converterPriority)
    __obj.asInstanceOf[Anon_ConverterPriorityModel]
  }
}

