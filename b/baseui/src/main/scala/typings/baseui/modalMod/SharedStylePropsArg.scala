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

trait SharedStylePropsArg extends js.Object {
  @JSName("$animate")
  var $animate: js.UndefOr[Boolean] = js.undefined
  @JSName("$closeable")
  var $closeable: js.UndefOr[Boolean] = js.undefined
  @JSName("$isOpen")
  var $isOpen: js.UndefOr[Boolean] = js.undefined
  @JSName("$isVisible")
  var $isVisible: js.UndefOr[Boolean] = js.undefined
  @JSName("$role")
  var $role: js.UndefOr[dialog | alertdialog] = js.undefined
  @JSName("$size")
  var $size: js.UndefOr[default_ | full | auto] = js.undefined
  @JSName("$unstable_ModalBackdropScroll")
  var $unstable_ModalBackdropScroll: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
}

object SharedStylePropsArg {
  @scala.inline
  def apply(
    $animate: js.UndefOr[Boolean] = js.undefined,
    $closeable: js.UndefOr[Boolean] = js.undefined,
    $isOpen: js.UndefOr[Boolean] = js.undefined,
    $isVisible: js.UndefOr[Boolean] = js.undefined,
    $role: dialog | alertdialog = null,
    $size: default_ | full | auto = null,
    $unstable_ModalBackdropScroll: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null
  ): SharedStylePropsArg = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($animate)) __obj.updateDynamic("$animate")($animate.get.asInstanceOf[js.Any])
    if (!js.isUndefined($closeable)) __obj.updateDynamic("$closeable")($closeable.get.asInstanceOf[js.Any])
    if (!js.isUndefined($isOpen)) __obj.updateDynamic("$isOpen")($isOpen.get.asInstanceOf[js.Any])
    if (!js.isUndefined($isVisible)) __obj.updateDynamic("$isVisible")($isVisible.get.asInstanceOf[js.Any])
    if ($role != null) __obj.updateDynamic("$role")($role.asInstanceOf[js.Any])
    if ($size != null) __obj.updateDynamic("$size")($size.asInstanceOf[js.Any])
    if (!js.isUndefined($unstable_ModalBackdropScroll)) __obj.updateDynamic("$unstable_ModalBackdropScroll")($unstable_ModalBackdropScroll.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedStylePropsArg]
  }
}

