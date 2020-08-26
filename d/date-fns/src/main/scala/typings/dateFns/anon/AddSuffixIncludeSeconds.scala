package typings.dateFns.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddSuffixIncludeSeconds extends js.Object {
  var addSuffix: js.UndefOr[Boolean] = js.native
  var includeSeconds: js.UndefOr[Boolean] = js.native
  var locale: js.UndefOr[typings.dateFns.Locale] = js.native
}

object AddSuffixIncludeSeconds {
  @scala.inline
  def apply(): AddSuffixIncludeSeconds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddSuffixIncludeSeconds]
  }
  @scala.inline
  implicit class AddSuffixIncludeSecondsOps[Self <: AddSuffixIncludeSeconds] (val x: Self) extends AnyVal {
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
    def setAddSuffix(value: Boolean): Self = this.set("addSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddSuffix: Self = this.set("addSuffix", js.undefined)
    @scala.inline
    def setIncludeSeconds(value: Boolean): Self = this.set("includeSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeSeconds: Self = this.set("includeSeconds", js.undefined)
    @scala.inline
    def setLocale(value: typings.dateFns.Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
  }
  
}

