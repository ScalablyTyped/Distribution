package typings.browserBunyan.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<browser-bunyan.browser-bunyan.BrowserBunyan.ConsoleFormattedStreamLevelStyle> */
@js.native
trait PartialConsoleFormattedSt extends js.Object {
  var debug: js.UndefOr[String] = js.native
  var error: js.UndefOr[String] = js.native
  var fatal: js.UndefOr[String] = js.native
  var info: js.UndefOr[String] = js.native
  var trace: js.UndefOr[String] = js.native
  var warn: js.UndefOr[String] = js.native
}

object PartialConsoleFormattedSt {
  @scala.inline
  def apply(): PartialConsoleFormattedSt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConsoleFormattedSt]
  }
  @scala.inline
  implicit class PartialConsoleFormattedStOps[Self <: PartialConsoleFormattedSt] (val x: Self) extends AnyVal {
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
    def setDebug(value: String): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setFatal(value: String): Self = this.set("fatal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFatal: Self = this.set("fatal", js.undefined)
    @scala.inline
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setTrace(value: String): Self = this.set("trace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrace: Self = this.set("trace", js.undefined)
    @scala.inline
    def setWarn(value: String): Self = this.set("warn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarn: Self = this.set("warn", js.undefined)
  }
  
}

