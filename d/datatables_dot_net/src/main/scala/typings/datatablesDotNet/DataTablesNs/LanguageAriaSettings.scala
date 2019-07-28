package typings.datatablesDotNet.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageAriaSettings extends js.Object {
  var paginate: js.UndefOr[LanguagePaginateSettings] = js.undefined
  var sortAscending: String
  var sortDescending: String
}

object LanguageAriaSettings {
  @scala.inline
  def apply(sortAscending: String, sortDescending: String, paginate: LanguagePaginateSettings = null): LanguageAriaSettings = {
    val __obj = js.Dynamic.literal(sortAscending = sortAscending, sortDescending = sortDescending)
    if (paginate != null) __obj.updateDynamic("paginate")(paginate)
    __obj.asInstanceOf[LanguageAriaSettings]
  }
}

