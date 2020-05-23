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

trait ModalProps extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var autofocus: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var closeable: js.UndefOr[Boolean] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var mountNode: js.UndefOr[HTMLElement] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* args */ CloseSource, _]] = js.undefined
  var overrides: js.UndefOr[ModalOverrides] = js.undefined
  var role: js.UndefOr[dialog | alertdialog] = js.undefined
  var size: js.UndefOr[default_ | full | auto] = js.undefined
  var unstable_ModalBackdropScroll: js.UndefOr[Boolean] = js.undefined
}

object ModalProps {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autofocus: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    closeable: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    mountNode: HTMLElement = null,
    onClose: /* args */ CloseSource => _ = null,
    overrides: ModalOverrides = null,
    role: dialog | alertdialog = null,
    size: default_ | full | auto = null,
    unstable_ModalBackdropScroll: js.UndefOr[Boolean] = js.undefined
  ): ModalProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(closeable)) __obj.updateDynamic("closeable")(closeable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.get.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(unstable_ModalBackdropScroll)) __obj.updateDynamic("unstable_ModalBackdropScroll")(unstable_ModalBackdropScroll.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProps]
  }
}

