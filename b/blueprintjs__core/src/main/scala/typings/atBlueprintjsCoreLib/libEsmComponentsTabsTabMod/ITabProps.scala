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
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
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
    * Content of tab title element, rendered in a list above the active panel.
    * Can also be set via React `children`.
    */
  var title: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

