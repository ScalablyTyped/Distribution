package typings
package baseuiLib.modalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps extends js.Object {
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  var autofocus: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var closeable: js.UndefOr[scala.Boolean] = js.undefined
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  var mountNode: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* args */ baseuiLib.Anon_Backdrop, _]] = js.undefined
  var overrides: js.UndefOr[ModalOverrides] = js.undefined
  var role: js.UndefOr[baseuiLib.baseuiLibStrings.dialog | baseuiLib.baseuiLibStrings.alertdialog] = js.undefined
  var size: js.UndefOr[
    baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.full | baseuiLib.baseuiLibStrings.auto
  ] = js.undefined
}

object ModalProps {
  @scala.inline
  def apply(
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    autofocus: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
    closeable: js.UndefOr[scala.Boolean] = js.undefined,
    isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    mountNode: stdLib.HTMLElement = null,
    onClose: /* args */ baseuiLib.Anon_Backdrop => _ = null,
    overrides: ModalOverrides = null,
    role: baseuiLib.baseuiLibStrings.dialog | baseuiLib.baseuiLibStrings.alertdialog = null,
    size: baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.full | baseuiLib.baseuiLibStrings.auto = null
  ): ModalProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(closeable)) __obj.updateDynamic("closeable")(closeable)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode)
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProps]
  }
}

