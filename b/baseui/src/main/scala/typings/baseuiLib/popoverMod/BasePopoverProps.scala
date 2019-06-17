package typings
package baseuiLib.popoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasePopoverProps extends js.Object {
  var accessibilityType: js.UndefOr[
    baseuiLib.baseuiLibStrings.none | baseuiLib.baseuiLibStrings.menu | baseuiLib.baseuiLibStrings.tooltip
  ] = js.undefined
  var animateOutTime: js.UndefOr[scala.Double] = js.undefined
  var `data-baseweb`: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var ignoreBoundary: js.UndefOr[scala.Boolean] = js.undefined
  var mountNode: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var onMouseEnterDelay: js.UndefOr[scala.Double] = js.undefined
  var onMouseLeaveDelay: js.UndefOr[scala.Double] = js.undefined
  var overrides: js.UndefOr[Overrides] = js.undefined
  var placement: js.UndefOr[
    baseuiLib.baseuiLibStrings.rightTop | baseuiLib.baseuiLibStrings.auto | baseuiLib.baseuiLibStrings.leftBottom | baseuiLib.baseuiLibStrings.bottomRight | baseuiLib.baseuiLibStrings.leftTop | baseuiLib.baseuiLibStrings.bottom | baseuiLib.baseuiLibStrings.left | baseuiLib.baseuiLibStrings.topRight | baseuiLib.baseuiLibStrings.bottomLeft | baseuiLib.baseuiLibStrings.rightBottom | baseuiLib.baseuiLibStrings.topLeft | baseuiLib.baseuiLibStrings.top | baseuiLib.baseuiLibStrings.right
  ] = js.undefined
  var showArrow: js.UndefOr[scala.Boolean] = js.undefined
  var triggerType: js.UndefOr[baseuiLib.baseuiLibStrings.click | baseuiLib.baseuiLibStrings.hover] = js.undefined
}

object BasePopoverProps {
  @scala.inline
  def apply(
    accessibilityType: baseuiLib.baseuiLibStrings.none | baseuiLib.baseuiLibStrings.menu | baseuiLib.baseuiLibStrings.tooltip = null,
    animateOutTime: scala.Int | scala.Double = null,
    `data-baseweb`: java.lang.String = null,
    id: java.lang.String = null,
    ignoreBoundary: js.UndefOr[scala.Boolean] = js.undefined,
    mountNode: stdLib.HTMLElement = null,
    onMouseEnterDelay: scala.Int | scala.Double = null,
    onMouseLeaveDelay: scala.Int | scala.Double = null,
    overrides: Overrides = null,
    placement: baseuiLib.baseuiLibStrings.rightTop | baseuiLib.baseuiLibStrings.auto | baseuiLib.baseuiLibStrings.leftBottom | baseuiLib.baseuiLibStrings.bottomRight | baseuiLib.baseuiLibStrings.leftTop | baseuiLib.baseuiLibStrings.bottom | baseuiLib.baseuiLibStrings.left | baseuiLib.baseuiLibStrings.topRight | baseuiLib.baseuiLibStrings.bottomLeft | baseuiLib.baseuiLibStrings.rightBottom | baseuiLib.baseuiLibStrings.topLeft | baseuiLib.baseuiLibStrings.top | baseuiLib.baseuiLibStrings.right = null,
    showArrow: js.UndefOr[scala.Boolean] = js.undefined,
    triggerType: baseuiLib.baseuiLibStrings.click | baseuiLib.baseuiLibStrings.hover = null
  ): BasePopoverProps = {
    val __obj = js.Dynamic.literal()
    if (accessibilityType != null) __obj.updateDynamic("accessibilityType")(accessibilityType.asInstanceOf[js.Any])
    if (animateOutTime != null) __obj.updateDynamic("animateOutTime")(animateOutTime.asInstanceOf[js.Any])
    if (`data-baseweb` != null) __obj.updateDynamic("data-baseweb")(`data-baseweb`)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(ignoreBoundary)) __obj.updateDynamic("ignoreBoundary")(ignoreBoundary)
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode)
    if (onMouseEnterDelay != null) __obj.updateDynamic("onMouseEnterDelay")(onMouseEnterDelay.asInstanceOf[js.Any])
    if (onMouseLeaveDelay != null) __obj.updateDynamic("onMouseLeaveDelay")(onMouseLeaveDelay.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow)
    if (triggerType != null) __obj.updateDynamic("triggerType")(triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePopoverProps]
  }
}

