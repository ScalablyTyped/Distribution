package typings
package baseuiLib.popoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedStylePropsArg extends js.Object {
  @JSName("$arrowOffset")
  var $arrowOffset: js.UndefOr[Offset] = js.undefined
  @JSName("$isAnimating")
  var $isAnimating: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("$isOpen")
  var $isOpen: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("$placement")
  var $placement: js.UndefOr[
    baseuiLib.baseuiLibStrings.rightTop | baseuiLib.baseuiLibStrings.auto | baseuiLib.baseuiLibStrings.leftBottom | baseuiLib.baseuiLibStrings.bottomRight | baseuiLib.baseuiLibStrings.leftTop | baseuiLib.baseuiLibStrings.bottom | baseuiLib.baseuiLibStrings.left | baseuiLib.baseuiLibStrings.topRight | baseuiLib.baseuiLibStrings.bottomLeft | baseuiLib.baseuiLibStrings.rightBottom | baseuiLib.baseuiLibStrings.topLeft | baseuiLib.baseuiLibStrings.top | baseuiLib.baseuiLibStrings.right
  ] = js.undefined
  @JSName("$popoverOffset")
  var $popoverOffset: js.UndefOr[Offset] = js.undefined
  @JSName("$showArrow")
  var $showArrow: js.UndefOr[scala.Boolean] = js.undefined
}

object SharedStylePropsArg {
  @scala.inline
  def apply(
    $arrowOffset: Offset = null,
    $isAnimating: js.UndefOr[scala.Boolean] = js.undefined,
    $isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    $placement: baseuiLib.baseuiLibStrings.rightTop | baseuiLib.baseuiLibStrings.auto | baseuiLib.baseuiLibStrings.leftBottom | baseuiLib.baseuiLibStrings.bottomRight | baseuiLib.baseuiLibStrings.leftTop | baseuiLib.baseuiLibStrings.bottom | baseuiLib.baseuiLibStrings.left | baseuiLib.baseuiLibStrings.topRight | baseuiLib.baseuiLibStrings.bottomLeft | baseuiLib.baseuiLibStrings.rightBottom | baseuiLib.baseuiLibStrings.topLeft | baseuiLib.baseuiLibStrings.top | baseuiLib.baseuiLibStrings.right = null,
    $popoverOffset: Offset = null,
    $showArrow: js.UndefOr[scala.Boolean] = js.undefined
  ): SharedStylePropsArg = {
    val __obj = js.Dynamic.literal()
    if ($arrowOffset != null) __obj.updateDynamic("$arrowOffset")($arrowOffset)
    if (!js.isUndefined($isAnimating)) __obj.updateDynamic("$isAnimating")($isAnimating)
    if (!js.isUndefined($isOpen)) __obj.updateDynamic("$isOpen")($isOpen)
    if ($placement != null) __obj.updateDynamic("$placement")($placement.asInstanceOf[js.Any])
    if ($popoverOffset != null) __obj.updateDynamic("$popoverOffset")($popoverOffset)
    if (!js.isUndefined($showArrow)) __obj.updateDynamic("$showArrow")($showArrow)
    __obj.asInstanceOf[SharedStylePropsArg]
  }
}

