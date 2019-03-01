package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.dialog.date()
trait DialogDateConfig extends js.Object {
  var dateType: chaynsLib.chaynsNs.dialogNs.dateType
  var maxDate: js.UndefOr[stdLib.Date] = js.undefined
  var minDate: js.UndefOr[stdLib.Date] = js.undefined
  var preSelect: js.UndefOr[stdLib.Date] = js.undefined
}

object DialogDateConfig {
  @scala.inline
  def apply(
    dateType: chaynsLib.chaynsNs.dialogNs.dateType,
    maxDate: stdLib.Date = null,
    minDate: stdLib.Date = null,
    preSelect: stdLib.Date = null
  ): DialogDateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dateType")(dateType)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (preSelect != null) __obj.updateDynamic("preSelect")(preSelect)
    __obj.asInstanceOf[DialogDateConfig]
  }
}

