package typings.baseui.tableMod

import typings.baseui.anon.Content
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
  var children: ReactNode = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var onReset: js.UndefOr[js.Function0[_]] = js.native
  var onSelectAll: js.UndefOr[js.Function0[_]] = js.native
  var overrides: js.UndefOr[Content] = js.native
}

object FilterProps {
  @scala.inline
  def apply(): FilterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterProps]
  }
  @scala.inline
  implicit class FilterPropsOps[Self <: FilterProps] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setOnReset(value: () => _): Self = this.set("onReset", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnReset: Self = this.set("onReset", js.undefined)
    @scala.inline
    def setOnSelectAll(value: () => _): Self = this.set("onSelectAll", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnSelectAll: Self = this.set("onSelectAll", js.undefined)
    @scala.inline
    def setOverrides(value: Content): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
  }
  
}

