package typings.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TputsOptions extends IOptions {
  var debug: js.UndefOr[Boolean] = js.native
  var extended: js.UndefOr[Boolean] = js.native
  var termcap: js.UndefOr[String] = js.native
  var termcapFile: js.UndefOr[String] = js.native
  var terminal: js.UndefOr[String] = js.native
  var terminfoFile: js.UndefOr[String] = js.native
  var terminfoPrefix: js.UndefOr[String] = js.native
}

object TputsOptions {
  @scala.inline
  def apply(): TputsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TputsOptions]
  }
  @scala.inline
  implicit class TputsOptionsOps[Self <: TputsOptions] (val x: Self) extends AnyVal {
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setExtended(value: Boolean): Self = this.set("extended", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtended: Self = this.set("extended", js.undefined)
    @scala.inline
    def setTermcap(value: String): Self = this.set("termcap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTermcap: Self = this.set("termcap", js.undefined)
    @scala.inline
    def setTermcapFile(value: String): Self = this.set("termcapFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTermcapFile: Self = this.set("termcapFile", js.undefined)
    @scala.inline
    def setTerminal(value: String): Self = this.set("terminal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerminal: Self = this.set("terminal", js.undefined)
    @scala.inline
    def setTerminfoFile(value: String): Self = this.set("terminfoFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerminfoFile: Self = this.set("terminfoFile", js.undefined)
    @scala.inline
    def setTerminfoPrefix(value: String): Self = this.set("terminfoPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerminfoPrefix: Self = this.set("terminfoPrefix", js.undefined)
  }
  
}

