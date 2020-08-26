package typings.cordovaPluginGlobalization.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatLength extends js.Object {
  var formatLength: js.UndefOr[String] = js.native
   // "short" | "medium" | "long" | "full"
  var selector: js.UndefOr[String] = js.native
}

object FormatLength {
  @scala.inline
  def apply(): FormatLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatLength]
  }
  @scala.inline
  implicit class FormatLengthOps[Self <: FormatLength] (val x: Self) extends AnyVal {
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
    def setFormatLength(value: String): Self = this.set("formatLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatLength: Self = this.set("formatLength", js.undefined)
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
  }
  
}

