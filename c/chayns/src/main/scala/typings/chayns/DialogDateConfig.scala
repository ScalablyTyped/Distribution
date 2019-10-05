package typings.chayns

import typings.chayns.chayns.dialog.dateType
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.dialog.date()
trait DialogDateConfig extends js.Object {
  var dateType: typings.chayns.chayns.dialog.dateType
  var maxDate: js.UndefOr[Date] = js.undefined
  var minDate: js.UndefOr[Date] = js.undefined
  var preSelect: js.UndefOr[Date] = js.undefined
}

object DialogDateConfig {
  @scala.inline
  def apply(dateType: dateType, maxDate: Date = null, minDate: Date = null, preSelect: Date = null): DialogDateConfig = {
    val __obj = js.Dynamic.literal(dateType = dateType)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (preSelect != null) __obj.updateDynamic("preSelect")(preSelect)
    __obj.asInstanceOf[DialogDateConfig]
  }
}

