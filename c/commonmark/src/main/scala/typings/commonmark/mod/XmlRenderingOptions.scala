package typings.commonmark.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlRenderingOptions extends js.Object {
  var sourcepos: js.UndefOr[Boolean] = js.native
  var time: js.UndefOr[Boolean] = js.native
}

object XmlRenderingOptions {
  @scala.inline
  def apply(): XmlRenderingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XmlRenderingOptions]
  }
  @scala.inline
  implicit class XmlRenderingOptionsOps[Self <: XmlRenderingOptions] (val x: Self) extends AnyVal {
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
    def setSourcepos(value: Boolean): Self = this.set("sourcepos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourcepos: Self = this.set("sourcepos", js.undefined)
    @scala.inline
    def setTime(value: Boolean): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
  
}

