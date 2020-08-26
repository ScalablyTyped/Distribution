package typings.browserBunyan.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<browser-bunyan.browser-bunyan.BrowserBunyan.ConsoleFormattedStreamStyle> */
@js.native
trait PartialConsoleFormattedStDef extends js.Object {
  var `def`: js.UndefOr[String] = js.native
  var levels: js.UndefOr[PartialConsoleFormattedSt] = js.native
  var msg: js.UndefOr[String] = js.native
  var src: js.UndefOr[String] = js.native
}

object PartialConsoleFormattedStDef {
  @scala.inline
  def apply(): PartialConsoleFormattedStDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConsoleFormattedStDef]
  }
  @scala.inline
  implicit class PartialConsoleFormattedStDefOps[Self <: PartialConsoleFormattedStDef] (val x: Self) extends AnyVal {
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
    def setDef(value: String): Self = this.set("def", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDef: Self = this.set("def", js.undefined)
    @scala.inline
    def setLevels(value: PartialConsoleFormattedSt): Self = this.set("levels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevels: Self = this.set("levels", js.undefined)
    @scala.inline
    def setMsg(value: String): Self = this.set("msg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsg: Self = this.set("msg", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
  }
  
}

