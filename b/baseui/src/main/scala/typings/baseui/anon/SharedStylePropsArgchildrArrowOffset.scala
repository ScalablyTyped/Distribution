package typings.baseui.anon

import typings.baseui.baseuiStrings.auto
import typings.baseui.baseuiStrings.bottom
import typings.baseui.baseuiStrings.bottomLeft
import typings.baseui.baseuiStrings.bottomRight
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.leftBottom
import typings.baseui.baseuiStrings.leftTop
import typings.baseui.baseuiStrings.right
import typings.baseui.baseuiStrings.rightBottom
import typings.baseui.baseuiStrings.rightTop
import typings.baseui.baseuiStrings.top
import typings.baseui.baseuiStrings.topLeft
import typings.baseui.baseuiStrings.topRight
import typings.baseui.popoverMod.Offset
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/popover.SharedStylePropsArg & {  children ? :react.react.ReactNode} */
trait SharedStylePropsArgchildrArrowOffset extends js.Object {
  @JSName("$arrowOffset")
  var $arrowOffset: js.UndefOr[Offset] = js.undefined
  @JSName("$isAnimating")
  var $isAnimating: js.UndefOr[Boolean] = js.undefined
  @JSName("$isOpen")
  var $isOpen: js.UndefOr[Boolean] = js.undefined
  @JSName("$placement")
  var $placement: js.UndefOr[
    topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
  ] = js.undefined
  @JSName("$popoverOffset")
  var $popoverOffset: js.UndefOr[Offset] = js.undefined
  @JSName("$showArrow")
  var $showArrow: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
}

object SharedStylePropsArgchildrArrowOffset {
  @scala.inline
  def apply(
    $arrowOffset: Offset = null,
    $isAnimating: js.UndefOr[Boolean] = js.undefined,
    $isOpen: js.UndefOr[Boolean] = js.undefined,
    $placement: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top = null,
    $popoverOffset: Offset = null,
    $showArrow: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null
  ): SharedStylePropsArgchildrArrowOffset = {
    val __obj = js.Dynamic.literal()
    if ($arrowOffset != null) __obj.updateDynamic("$arrowOffset")($arrowOffset.asInstanceOf[js.Any])
    if (!js.isUndefined($isAnimating)) __obj.updateDynamic("$isAnimating")($isAnimating.get.asInstanceOf[js.Any])
    if (!js.isUndefined($isOpen)) __obj.updateDynamic("$isOpen")($isOpen.get.asInstanceOf[js.Any])
    if ($placement != null) __obj.updateDynamic("$placement")($placement.asInstanceOf[js.Any])
    if ($popoverOffset != null) __obj.updateDynamic("$popoverOffset")($popoverOffset.asInstanceOf[js.Any])
    if (!js.isUndefined($showArrow)) __obj.updateDynamic("$showArrow")($showArrow.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedStylePropsArgchildrArrowOffset]
  }
}

