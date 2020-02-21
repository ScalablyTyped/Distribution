package typings.cathoQuantum.tooltipMod

import typings.cathoQuantum.AnonBaseFontSizeColorsSpacing
import typings.cathoQuantum.cathoQuantumStrings.bottom
import typings.cathoQuantum.cathoQuantumStrings.left
import typings.cathoQuantum.cathoQuantumStrings.right
import typings.cathoQuantum.cathoQuantumStrings.top
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps extends js.Object {
  var children: js.Array[ReactNode] | ReactNode
  var placement: js.UndefOr[top | right | bottom | left] = js.undefined
  var text: String
  var theme: js.UndefOr[AnonBaseFontSizeColorsSpacing] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object TooltipProps {
  @scala.inline
  def apply(
    text: String,
    children: js.Array[ReactNode] | ReactNode = null,
    placement: top | right | bottom | left = null,
    theme: AnonBaseFontSizeColorsSpacing = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): TooltipProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
}

