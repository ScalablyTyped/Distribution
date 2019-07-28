package typings.datatablesDotNet.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageAriaLegacy extends js.Object {
  var sSortAscending: js.UndefOr[String] = js.undefined
  var sSortDescending: js.UndefOr[String] = js.undefined
}

object LanguageAriaLegacy {
  @scala.inline
  def apply(sSortAscending: String = null, sSortDescending: String = null): LanguageAriaLegacy = {
    val __obj = js.Dynamic.literal()
    if (sSortAscending != null) __obj.updateDynamic("sSortAscending")(sSortAscending)
    if (sSortDescending != null) __obj.updateDynamic("sSortDescending")(sSortDescending)
    __obj.asInstanceOf[LanguageAriaLegacy]
  }
}

