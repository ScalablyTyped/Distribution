package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageAriaLegacy extends js.Object {
  var sSortAscending: js.UndefOr[String] = js.native
  var sSortDescending: js.UndefOr[String] = js.native
}

object LanguageAriaLegacy {
  @scala.inline
  def apply(): LanguageAriaLegacy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageAriaLegacy]
  }
  @scala.inline
  implicit class LanguageAriaLegacyOps[Self <: LanguageAriaLegacy] (val x: Self) extends AnyVal {
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
    def setSSortAscending(value: String): Self = this.set("sSortAscending", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSortAscending: Self = this.set("sSortAscending", js.undefined)
    @scala.inline
    def setSSortDescending(value: String): Self = this.set("sSortDescending", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSortDescending: Self = this.set("sSortDescending", js.undefined)
  }
  
}

