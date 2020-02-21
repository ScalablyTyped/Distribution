package typings.cathoQuantum.tabbedViewMod

import typings.cathoQuantum.AnonBaseFontSizeBreakpointsComponents
import typings.cathoQuantum.cathoQuantumStrings.neutral
import typings.cathoQuantum.cathoQuantumStrings.primary
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabbedViewProps extends js.Object {
  var activeTab: js.UndefOr[String] = js.undefined
  var children: js.Array[ReactNode] | ReactNode
  var fluid: js.UndefOr[Boolean] = js.undefined
  var skin: js.UndefOr[neutral | primary] = js.undefined
  var theme: js.UndefOr[AnonBaseFontSizeBreakpointsComponents] = js.undefined
}

object TabbedViewProps {
  @scala.inline
  def apply(
    activeTab: String = null,
    children: js.Array[ReactNode] | ReactNode = null,
    fluid: js.UndefOr[Boolean] = js.undefined,
    skin: neutral | primary = null,
    theme: AnonBaseFontSizeBreakpointsComponents = null
  ): TabbedViewProps = {
    val __obj = js.Dynamic.literal()
    if (activeTab != null) __obj.updateDynamic("activeTab")(activeTab.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabbedViewProps]
  }
}

