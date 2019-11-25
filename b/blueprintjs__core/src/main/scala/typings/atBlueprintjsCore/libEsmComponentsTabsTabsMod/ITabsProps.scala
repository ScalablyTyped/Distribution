package typings.atBlueprintjsCore.libEsmComponentsTabsTabsMod

import typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps
import typings.atBlueprintjsCore.libEsmComponentsTabsTabMod.TabId
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITabsProps extends IProps {
  /**
    * Whether the selected tab indicator should animate its movement.
    * @default true
    */
  var animate: js.UndefOr[Boolean] = js.undefined
  /**
    * Initial selected tab `id`, for uncontrolled usage.
    * Note that this prop refers only to `<Tab>` children; other types of elements are ignored.
    * @default first tab
    */
  var defaultSelectedTabId: js.UndefOr[TabId] = js.undefined
  /**
    * Unique identifier for this `Tabs` container. This will be combined with the `id` of each
    * `Tab` child to generate ARIA accessibility attributes. IDs are required and should be
    * unique on the page to support server-side rendering.
    */
  var id: TabId
  /**
    * If set to `true`, the tab titles will display with larger styling.
    * This will apply large styles only to the tabs at this level, not to nested tabs.
    * @default false
    */
  var large: js.UndefOr[Boolean] = js.undefined
  /**
    * A callback function that is invoked when a tab in the tab list is clicked.
    */
  var onChange: js.UndefOr[
    js.Function3[
      /* newTabId */ TabId, 
      /* prevTabId */ TabId, 
      /* event */ MouseEvent[HTMLElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  /**
    * Whether inactive tab panels should be removed from the DOM and unmounted in React.
    * This can be a performance enhancement when rendering many complex panels, but requires
    * careful support for unmounting and remounting.
    * @default false
    */
  var renderActiveTabPanelOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Selected tab `id`, for controlled usage.
    * Providing this prop will put the component in controlled mode.
    * Unknown ids will result in empty selection (no errors).
    */
  var selectedTabId: js.UndefOr[TabId] = js.undefined
  /**
    * Whether to show tabs stacked vertically on the left side.
    * @default false
    */
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object ITabsProps {
  @scala.inline
  def apply(
    id: TabId,
    animate: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    defaultSelectedTabId: TabId = null,
    large: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* newTabId */ TabId, /* prevTabId */ TabId, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    renderActiveTabPanelOnly: js.UndefOr[Boolean] = js.undefined,
    selectedTabId: TabId = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): ITabsProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultSelectedTabId != null) __obj.updateDynamic("defaultSelectedTabId")(defaultSelectedTabId.asInstanceOf[js.Any])
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (!js.isUndefined(renderActiveTabPanelOnly)) __obj.updateDynamic("renderActiveTabPanelOnly")(renderActiveTabPanelOnly.asInstanceOf[js.Any])
    if (selectedTabId != null) __obj.updateDynamic("selectedTabId")(selectedTabId.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITabsProps]
  }
}

