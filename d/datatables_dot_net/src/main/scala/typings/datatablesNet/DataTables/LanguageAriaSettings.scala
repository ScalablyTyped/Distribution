package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageAriaSettings extends js.Object {
  var paginate: js.UndefOr[LanguagePaginateSettings] = js.native
  var sortAscending: String = js.native
  var sortDescending: String = js.native
}

object LanguageAriaSettings {
  @scala.inline
  def apply(sortAscending: String, sortDescending: String): LanguageAriaSettings = {
    val __obj = js.Dynamic.literal(sortAscending = sortAscending.asInstanceOf[js.Any], sortDescending = sortDescending.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageAriaSettings]
  }
  @scala.inline
  implicit class LanguageAriaSettingsOps[Self <: LanguageAriaSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSortAscending(value: String): Self = this.set("sortAscending", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortDescending(value: String): Self = this.set("sortDescending", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaginate(value: LanguagePaginateSettings): Self = this.set("paginate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaginate: Self = this.set("paginate", js.undefined)
  }
  
}

