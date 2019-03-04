package typings
package atCkeditorCkeditor5DashEngineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConverterPriority extends js.Object {
  var converterPriority: js.UndefOr[atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod.PriorityString] = js.undefined
  var model: java.lang.String | Anon_KeyValue
  var view: java.lang.String | Anon_Key
}

object Anon_ConverterPriority {
  @scala.inline
  def apply(
    model: java.lang.String | Anon_KeyValue,
    view: java.lang.String | Anon_Key,
    converterPriority: atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod.PriorityString = null
  ): Anon_ConverterPriority = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    if (converterPriority != null) __obj.updateDynamic("converterPriority")(converterPriority)
    __obj.asInstanceOf[Anon_ConverterPriority]
  }
}

