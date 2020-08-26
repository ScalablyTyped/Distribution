package typings.colorSupport.mod

import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorSupportOptions extends js.Object {
  var alwaysReturn: js.UndefOr[Boolean] = js.native
  var env: js.UndefOr[ProcessEnv] = js.native
  var ignoreCI: js.UndefOr[Boolean] = js.native
  var ignoreDumb: js.UndefOr[Boolean] = js.native
  var ignoreTTY: js.UndefOr[Boolean] = js.native
  var level: js.UndefOr[ColorSupportLevel] = js.native
  var stream: js.UndefOr[WriteStream] = js.native
  var term: js.UndefOr[String] = js.native
}

object ColorSupportOptions {
  @scala.inline
  def apply(): ColorSupportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorSupportOptions]
  }
  @scala.inline
  implicit class ColorSupportOptionsOps[Self <: ColorSupportOptions] (val x: Self) extends AnyVal {
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
    def setAlwaysReturn(value: Boolean): Self = this.set("alwaysReturn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysReturn: Self = this.set("alwaysReturn", js.undefined)
    @scala.inline
    def setEnv(value: ProcessEnv): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setIgnoreCI(value: Boolean): Self = this.set("ignoreCI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreCI: Self = this.set("ignoreCI", js.undefined)
    @scala.inline
    def setIgnoreDumb(value: Boolean): Self = this.set("ignoreDumb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreDumb: Self = this.set("ignoreDumb", js.undefined)
    @scala.inline
    def setIgnoreTTY(value: Boolean): Self = this.set("ignoreTTY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreTTY: Self = this.set("ignoreTTY", js.undefined)
    @scala.inline
    def setLevel(value: ColorSupportLevel): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setStream(value: WriteStream): Self = this.set("stream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
    @scala.inline
    def setTerm(value: String): Self = this.set("term", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerm: Self = this.set("term", js.undefined)
  }
  
}

