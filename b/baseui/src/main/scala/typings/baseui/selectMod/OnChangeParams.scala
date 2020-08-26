package typings.baseui.selectMod

import typings.baseui.baseuiStrings.clear
import typings.baseui.baseuiStrings.remove
import typings.baseui.baseuiStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnChangeParams extends js.Object {
  var option: js.UndefOr[Option] = js.native
  var `type`: js.UndefOr[select | remove | clear] = js.native
  var value: Value = js.native
}

object OnChangeParams {
  @scala.inline
  def apply(value: Value): OnChangeParams = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChangeParams]
  }
  @scala.inline
  implicit class OnChangeParamsOps[Self <: OnChangeParams] (val x: Self) extends AnyVal {
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
    def setValueVarargs(value: Option*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: Value): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setOption(value: Option): Self = this.set("option", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOption: Self = this.set("option", js.undefined)
    @scala.inline
    def setType(value: select | remove | clear): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

