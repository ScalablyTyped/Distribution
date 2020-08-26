package typings.browserBunyan.mod.BrowserBunyan

import typings.browserBunyan.anon.PartialConsoleFormattedStDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsoleFormattedStreamOptions extends js.Object {
  var css: js.UndefOr[PartialConsoleFormattedStDef] = js.native
  var logByLevel: js.UndefOr[Boolean] = js.native
}

object ConsoleFormattedStreamOptions {
  @scala.inline
  def apply(): ConsoleFormattedStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsoleFormattedStreamOptions]
  }
  @scala.inline
  implicit class ConsoleFormattedStreamOptionsOps[Self <: ConsoleFormattedStreamOptions] (val x: Self) extends AnyVal {
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
    def setCss(value: PartialConsoleFormattedStDef): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    @scala.inline
    def setLogByLevel(value: Boolean): Self = this.set("logByLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogByLevel: Self = this.set("logByLevel", js.undefined)
  }
  
}

