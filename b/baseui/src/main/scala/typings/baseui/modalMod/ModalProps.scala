package typings.baseui.modalMod

import typings.baseui.anon.CloseSource
import typings.baseui.baseuiStrings.alertdialog
import typings.baseui.baseuiStrings.auto
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.dialog
import typings.baseui.baseuiStrings.full
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalProps extends js.Object {
  var animate: js.UndefOr[Boolean] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var autofocus: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var closeable: js.UndefOr[Boolean] = js.native
  var isOpen: js.UndefOr[Boolean] = js.native
  var mountNode: js.UndefOr[HTMLElement] = js.native
  var onClose: js.UndefOr[js.Function1[/* args */ CloseSource, _]] = js.native
  var overrides: js.UndefOr[ModalOverrides] = js.native
  var role: js.UndefOr[dialog | alertdialog] = js.native
  var size: js.UndefOr[default_ | full | auto] = js.native
  var unstable_ModalBackdropScroll: js.UndefOr[Boolean] = js.native
}

object ModalProps {
  @scala.inline
  def apply(): ModalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalProps]
  }
  @scala.inline
  implicit class ModalPropsOps[Self <: ModalProps] (val x: Self) extends AnyVal {
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
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setCloseable(value: Boolean): Self = this.set("closeable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseable: Self = this.set("closeable", js.undefined)
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    @scala.inline
    def setMountNode(value: HTMLElement): Self = this.set("mountNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMountNode: Self = this.set("mountNode", js.undefined)
    @scala.inline
    def setOnClose(value: /* args */ CloseSource => _): Self = this.set("onClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOverrides(value: ModalOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    @scala.inline
    def setRole(value: dialog | alertdialog): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setSize(value: default_ | full | auto): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setUnstable_ModalBackdropScroll(value: Boolean): Self = this.set("unstable_ModalBackdropScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnstable_ModalBackdropScroll: Self = this.set("unstable_ModalBackdropScroll", js.undefined)
  }
  
}

