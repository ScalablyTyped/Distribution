package typings.dateIoDateFns.anon

import typings.dateIoDateFns.dateFnsUtilsMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Formats extends js.Object {
  var formats: js.UndefOr[PartialDateIOFormatsstrin] = js.native
  var locale: js.UndefOr[Locale] = js.native
}

object Formats {
  @scala.inline
  def apply(): Formats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Formats]
  }
  @scala.inline
  implicit class FormatsOps[Self <: Formats] (val x: Self) extends AnyVal {
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
    def setFormats(value: PartialDateIOFormatsstrin): Self = this.set("formats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormats: Self = this.set("formats", js.undefined)
    @scala.inline
    def setLocale(value: Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
  }
  
}

