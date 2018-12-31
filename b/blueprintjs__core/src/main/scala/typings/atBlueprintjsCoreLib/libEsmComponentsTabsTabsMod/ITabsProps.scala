package typings
package atBlueprintjsCoreLib.libEsmComponentsTabsTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITabsProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
    * Whether the selected tab indicator should animate its movement.
    * @default true
    */
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Initial selected tab `id`, for uncontrolled usage.
    * Note that this prop refers only to `<Tab>` children; other types of elements are ignored.
    * @default first tab
    */
  var defaultSelectedTabId: js.UndefOr[atBlueprintjsCoreLib.libEsmComponentsTabsTabMod.TabId] = js.undefined
  /**
    * Unique identifier for this `Tabs` container. This will be combined with the `id` of each
    * `Tab` child to generate ARIA accessibility attributes. IDs are required and should be
    * unique on the page to support server-side rendering.
    */
  var id: atBlueprintjsCoreLib.libEsmComponentsTabsTabMod.TabId
  /**
    * If set to `true`, the tab titles will display with larger styling.
    * This will apply large styles only to the tabs at this level, not to nested tabs.
    * @default false
    */
  var large: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A callback function that is invoked when a tab in the tab list is clicked.
    */
  var onChange: js.UndefOr[
    js.Function3[
      /* newTabId */ atBlueprintjsCoreLib.libEsmComponentsTabsTabMod.TabId, 
      /* prevTabId */ atBlueprintjsCoreLib.libEsmComponentsTabsTabMod.TabId, 
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Whether inactive tab panels should be removed from the DOM and unmounted in React.
    * This can be a performance enhancement when rendering many complex panels, but requires
    * careful support for unmounting and remounting.
    * @default false
    */
  var renderActiveTabPanelOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Selected tab `id`, for controlled usage.
    * Providing this prop will put the component in controlled mode.
    * Unknown ids will result in empty selection (no errors).
    */
  var selectedTabId: js.UndefOr[atBlueprintjsCoreLib.libEsmComponentsTabsTabMod.TabId] = js.undefined
  /**
    * Whether to show tabs stacked vertically on the left side.
    * @default false
    */
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
}

