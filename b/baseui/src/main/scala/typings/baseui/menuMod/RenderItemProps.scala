package typings.baseui.menuMod

import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderItemProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var isFocused: js.UndefOr[Boolean] = js.native
  var isHighlighted: js.UndefOr[Boolean] = js.native
  var ref: js.UndefOr[Ref[_]] = js.native
  var resetMenu: js.UndefOr[js.Function0[_]] = js.native
}

object RenderItemProps {
  @scala.inline
  def apply(): RenderItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderItemProps]
  }
  @scala.inline
  implicit class RenderItemPropsOps[Self <: RenderItemProps] (val x: Self) extends AnyVal {
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIsFocused(value: Boolean): Self = this.set("isFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFocused: Self = this.set("isFocused", js.undefined)
    @scala.inline
    def setIsHighlighted(value: Boolean): Self = this.set("isHighlighted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsHighlighted: Self = this.set("isHighlighted", js.undefined)
    @scala.inline
    def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: Ref[_]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    @scala.inline
    def setResetMenu(value: () => _): Self = this.set("resetMenu", js.Any.fromFunction0(value))
    @scala.inline
    def deleteResetMenu: Self = this.set("resetMenu", js.undefined)
  }
  
}

