package typings.baseui.modalMod

import typings.baseui.baseuiStrings.alertdialog
import typings.baseui.baseuiStrings.auto
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.dialog
import typings.baseui.baseuiStrings.full
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedStylePropsArg extends js.Object {
  @JSName("$animate")
  var $animate: js.UndefOr[Boolean] = js.native
  @JSName("$closeable")
  var $closeable: js.UndefOr[Boolean] = js.native
  @JSName("$isOpen")
  var $isOpen: js.UndefOr[Boolean] = js.native
  @JSName("$isVisible")
  var $isVisible: js.UndefOr[Boolean] = js.native
  @JSName("$role")
  var $role: js.UndefOr[dialog | alertdialog] = js.native
  @JSName("$size")
  var $size: js.UndefOr[default_ | full | auto] = js.native
  @JSName("$unstable_ModalBackdropScroll")
  var $unstable_ModalBackdropScroll: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[ReactNode] = js.native
}

object SharedStylePropsArg {
  @scala.inline
  def apply(): SharedStylePropsArg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedStylePropsArg]
  }
  @scala.inline
  implicit class SharedStylePropsArgOps[Self <: SharedStylePropsArg] (val x: Self) extends AnyVal {
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
    def set$animate(value: Boolean): Self = this.set("$animate", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$animate: Self = this.set("$animate", js.undefined)
    @scala.inline
    def set$closeable(value: Boolean): Self = this.set("$closeable", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$closeable: Self = this.set("$closeable", js.undefined)
    @scala.inline
    def set$isOpen(value: Boolean): Self = this.set("$isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$isOpen: Self = this.set("$isOpen", js.undefined)
    @scala.inline
    def set$isVisible(value: Boolean): Self = this.set("$isVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$isVisible: Self = this.set("$isVisible", js.undefined)
    @scala.inline
    def set$role(value: dialog | alertdialog): Self = this.set("$role", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$role: Self = this.set("$role", js.undefined)
    @scala.inline
    def set$size(value: default_ | full | auto): Self = this.set("$size", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$size: Self = this.set("$size", js.undefined)
    @scala.inline
    def set$unstable_ModalBackdropScroll(value: Boolean): Self = this.set("$unstable_ModalBackdropScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$unstable_ModalBackdropScroll: Self = this.set("$unstable_ModalBackdropScroll", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

