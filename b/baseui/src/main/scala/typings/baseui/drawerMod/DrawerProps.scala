package typings.baseui.drawerMod

import typings.baseui.anon.CloseSource
import typings.baseui.baseuiStrings.auto
import typings.baseui.baseuiStrings.bottom
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.full
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.right
import typings.baseui.baseuiStrings.top
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerProps extends js.Object {
  var anchor: js.UndefOr[left | right | top | bottom | String] = js.native
  var animate: js.UndefOr[Boolean] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var closeable: js.UndefOr[Boolean] = js.native
  var isOpen: js.UndefOr[Boolean] = js.native
  var mountNode: js.UndefOr[HTMLElement] = js.native
  var onBackdropClick: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], _]] = js.native
  var onClose: js.UndefOr[js.Function1[/* args */ CloseSource, _]] = js.native
  var onEscapeKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent[HTMLElement], _]] = js.native
  var overrides: js.UndefOr[DrawerOverrides] = js.native
  var renderAll: js.UndefOr[Boolean] = js.native
  var showBackdrop: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[default_ | full | auto | String] = js.native
}

object DrawerProps {
  @scala.inline
  def apply(): DrawerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawerProps]
  }
  @scala.inline
  implicit class DrawerPropsOps[Self <: DrawerProps] (val x: Self) extends AnyVal {
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
    def setAnchor(value: left | right | top | bottom | String): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
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
    def setOnBackdropClick(value: /* event */ MouseEvent[HTMLElement, NativeMouseEvent] => _): Self = this.set("onBackdropClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBackdropClick: Self = this.set("onBackdropClick", js.undefined)
    @scala.inline
    def setOnClose(value: /* args */ CloseSource => _): Self = this.set("onClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnEscapeKeyDown(value: /* event */ KeyboardEvent[HTMLElement] => _): Self = this.set("onEscapeKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEscapeKeyDown: Self = this.set("onEscapeKeyDown", js.undefined)
    @scala.inline
    def setOverrides(value: DrawerOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    @scala.inline
    def setRenderAll(value: Boolean): Self = this.set("renderAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderAll: Self = this.set("renderAll", js.undefined)
    @scala.inline
    def setShowBackdrop(value: Boolean): Self = this.set("showBackdrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowBackdrop: Self = this.set("showBackdrop", js.undefined)
    @scala.inline
    def setSize(value: default_ | full | auto | String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

