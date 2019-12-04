package typings.baseui.popoverMod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedStylePropsArg extends js.Object {
  @JSName("$arrowOffset")
  var $arrowOffset: js.UndefOr[Offset] = js.undefined
  @JSName("$isAnimating")
  var $isAnimating: js.UndefOr[Boolean] = js.undefined
  @JSName("$isOpen")
  var $isOpen: js.UndefOr[Boolean] = js.undefined
  @JSName("$placement")
  var $placement: js.UndefOr[
    rightTop | auto | leftBottom | bottomRight | leftTop | bottom | left | topRight | bottomLeft | rightBottom | topLeft | top | right
  ] = js.undefined
  @JSName("$popoverOffset")
  var $popoverOffset: js.UndefOr[Offset] = js.undefined
  @JSName("$showArrow")
  var $showArrow: js.UndefOr[Boolean] = js.undefined
}

object SharedStylePropsArg {
  @scala.inline
  def apply(
    $arrowOffset: Offset = null,
    $isAnimating: js.UndefOr[Boolean] = js.undefined,
    $isOpen: js.UndefOr[Boolean] = js.undefined,
    $placement: rightTop | auto | leftBottom | bottomRight | leftTop | bottom | left | topRight | bottomLeft | rightBottom | topLeft | top | right = null,
    $popoverOffset: Offset = null,
    $showArrow: js.UndefOr[Boolean] = js.undefined
  ): SharedStylePropsArg = {
    val __obj = js.Dynamic.literal()
    if ($arrowOffset != null) __obj.updateDynamic("$arrowOffset")($arrowOffset.asInstanceOf[js.Any])
    if (!js.isUndefined($isAnimating)) __obj.updateDynamic("$isAnimating")($isAnimating.asInstanceOf[js.Any])
    if (!js.isUndefined($isOpen)) __obj.updateDynamic("$isOpen")($isOpen.asInstanceOf[js.Any])
    if ($placement != null) __obj.updateDynamic("$placement")($placement.asInstanceOf[js.Any])
    if ($popoverOffset != null) __obj.updateDynamic("$popoverOffset")($popoverOffset.asInstanceOf[js.Any])
    if (!js.isUndefined($showArrow)) __obj.updateDynamic("$showArrow")($showArrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedStylePropsArg]
  }
}

