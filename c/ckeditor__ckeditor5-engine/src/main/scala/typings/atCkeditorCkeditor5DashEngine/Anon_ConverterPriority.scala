package typings.atCkeditorCkeditor5DashEngine

import typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.PriorityString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConverterPriority extends js.Object {
  var converterPriority: js.UndefOr[PriorityString] = js.undefined
  var model: String | Anon_KeyValue
  var view: String | Anon_Key
}

object Anon_ConverterPriority {
  @scala.inline
  def apply(model: String | Anon_KeyValue, view: String | Anon_Key, converterPriority: PriorityString = null): Anon_ConverterPriority = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    if (converterPriority != null) __obj.updateDynamic("converterPriority")(converterPriority)
    __obj.asInstanceOf[Anon_ConverterPriority]
  }
}

