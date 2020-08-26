package typings.baseui.menuMod

import typings.baseui.anon.EmptyState
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuProps extends BaseMenuPropsT {
  var overrides: js.UndefOr[EmptyState] = js.native
  var size: js.UndefOr[default_ | compact] = js.native
}

object MenuProps {
  @scala.inline
  def apply(): MenuProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuProps]
  }
  @scala.inline
  implicit class MenuPropsOps[Self <: MenuProps] (val x: Self) extends AnyVal {
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
    def setOverrides(value: EmptyState): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    @scala.inline
    def setSize(value: default_ | compact): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

