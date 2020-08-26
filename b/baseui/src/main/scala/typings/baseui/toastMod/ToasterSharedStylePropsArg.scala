package typings.baseui.toastMod

import typings.baseui.baseuiStrings.bottom
import typings.baseui.baseuiStrings.bottomLeft
import typings.baseui.baseuiStrings.bottomRight
import typings.baseui.baseuiStrings.top
import typings.baseui.baseuiStrings.topLeft
import typings.baseui.baseuiStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToasterSharedStylePropsArg extends js.Object {
  @JSName("$placement")
  var $placement: js.UndefOr[topLeft | topRight | bottomLeft | bottomRight | bottom | top] = js.native
}

object ToasterSharedStylePropsArg {
  @scala.inline
  def apply(): ToasterSharedStylePropsArg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToasterSharedStylePropsArg]
  }
  @scala.inline
  implicit class ToasterSharedStylePropsArgOps[Self <: ToasterSharedStylePropsArg] (val x: Self) extends AnyVal {
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
    def set$placement(value: topLeft | topRight | bottomLeft | bottomRight | bottom | top): Self = this.set("$placement", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$placement: Self = this.set("$placement", js.undefined)
  }
  
}

