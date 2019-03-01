package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageAriaSettings extends js.Object {
  var paginate: js.UndefOr[LanguagePaginateSettings] = js.undefined
  var sortAscending: java.lang.String
  var sortDescending: java.lang.String
}

object LanguageAriaSettings {
  @scala.inline
  def apply(
    sortAscending: java.lang.String,
    sortDescending: java.lang.String,
    paginate: LanguagePaginateSettings = null
  ): LanguageAriaSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sortAscending")(sortAscending)
    __obj.updateDynamic("sortDescending")(sortDescending)
    if (paginate != null) __obj.updateDynamic("paginate")(paginate)
    __obj.asInstanceOf[LanguageAriaSettings]
  }
}

