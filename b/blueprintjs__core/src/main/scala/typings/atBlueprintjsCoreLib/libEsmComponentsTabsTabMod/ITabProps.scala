package typings
package atBlueprintjsCoreLib.libEsmComponentsTabsTabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITabProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
    * Content of tab title, rendered in a list above the active panel.
    * Can also be set via the `title` prop.
    */
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /**
    * Whether the tab is disabled.
    * @default false
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Unique identifier used to control which tab is selected
    * and to generate ARIA attributes for accessibility.
    */
  var id: TabId
  /**
    * Panel content, rendered by the parent `Tabs` when this tab is active.
    * If omitted, no panel will be rendered for this tab.
    */
  var panel: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  /**
    * Space-delimited string of class names applied to tab panel container.
    */
  var panelClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Content of tab title element, rendered in a list above the active panel.
    * Can also be set via React `children`.
    */
  var title: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object ITabProps {
  @scala.inline
  def apply(
    id: TabId,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    panel: reactLib.reactMod.Global.JSXNs.Element = null,
    panelClassName: java.lang.String = null,
    title: reactLib.reactMod.ReactNode = null
  ): ITabProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (panel != null) __obj.updateDynamic("panel")(panel)
    if (panelClassName != null) __obj.updateDynamic("panelClassName")(panelClassName)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITabProps]
  }
}

