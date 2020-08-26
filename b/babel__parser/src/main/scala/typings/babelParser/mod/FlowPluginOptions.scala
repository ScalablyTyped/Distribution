package typings.babelParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowPluginOptions extends js.Object {
  var all: js.UndefOr[Boolean] = js.native
}

object FlowPluginOptions {
  @scala.inline
  def apply(): FlowPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowPluginOptions]
  }
  @scala.inline
  implicit class FlowPluginOptionsOps[Self <: FlowPluginOptions] (val x: Self) extends AnyVal {
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
    def setAll(value: Boolean): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
  }
  
}

