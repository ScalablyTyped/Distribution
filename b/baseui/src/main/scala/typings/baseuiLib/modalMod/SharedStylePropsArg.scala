package typings
package baseuiLib.modalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedStylePropsArg extends js.Object {
  @JSName("$animate")
  var $animate: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("$closeable")
  var $closeable: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("$isOpen")
  var $isOpen: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("$isVisible")
  var $isVisible: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("$role")
  var $role: js.UndefOr[baseuiLib.baseuiLibStrings.dialog | baseuiLib.baseuiLibStrings.alertdialog] = js.undefined
  @JSName("$size")
  var $size: js.UndefOr[
    baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.full | baseuiLib.baseuiLibStrings.auto
  ] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object SharedStylePropsArg {
  @scala.inline
  def apply(
    $animate: js.UndefOr[scala.Boolean] = js.undefined,
    $closeable: js.UndefOr[scala.Boolean] = js.undefined,
    $isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    $isVisible: js.UndefOr[scala.Boolean] = js.undefined,
    $role: baseuiLib.baseuiLibStrings.dialog | baseuiLib.baseuiLibStrings.alertdialog = null,
    $size: baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.full | baseuiLib.baseuiLibStrings.auto = null,
    children: reactLib.reactMod.ReactNode = null
  ): SharedStylePropsArg = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($animate)) __obj.updateDynamic("$animate")($animate)
    if (!js.isUndefined($closeable)) __obj.updateDynamic("$closeable")($closeable)
    if (!js.isUndefined($isOpen)) __obj.updateDynamic("$isOpen")($isOpen)
    if (!js.isUndefined($isVisible)) __obj.updateDynamic("$isVisible")($isVisible)
    if ($role != null) __obj.updateDynamic("$role")($role.asInstanceOf[js.Any])
    if ($size != null) __obj.updateDynamic("$size")($size.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedStylePropsArg]
  }
}

