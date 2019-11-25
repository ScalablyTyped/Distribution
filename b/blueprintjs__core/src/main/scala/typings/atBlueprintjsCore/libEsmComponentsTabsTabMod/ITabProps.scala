package typings.atBlueprintjsCore.libEsmComponentsTabsTabMod

import typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps
import typings.react.reactMod.ReactNode
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @blueprintjs/core.@blueprintjs/core/lib/esm/common/props.HTMLDivProps, 'id' | 'title' | 'onClick'> ]: @blueprintjs/core.@blueprintjs/core/lib/esm/common/props.HTMLDivProps[P]} */ trait ITabProps extends IProps {
  /**
    * Content of tab title, rendered in a list above the active panel.
    * Can also be set via the `title` prop.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  /**
    * Whether the tab is disabled.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Unique identifier used to control which tab is selected
    * and to generate ARIA attributes for accessibility.
    */
  var id: TabId
  /**
    * Panel content, rendered by the parent `Tabs` when this tab is active.
    * If omitted, no panel will be rendered for this tab.
    */
  var panel: js.UndefOr[Element] = js.undefined
  /**
    * Space-delimited string of class names applied to tab panel container.
    */
  var panelClassName: js.UndefOr[String] = js.undefined
  /**
    * Content of tab title element, rendered in a list above the active panel.
    * Can also be set via React `children`.
    */
  var title: js.UndefOr[ReactNode] = js.undefined
}

object ITabProps {
  @scala.inline
  def apply(
    id: TabId,
    children: ReactNode = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    panel: Element = null,
    panelClassName: String = null,
    title: ReactNode = null
  ): ITabProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    if (panelClassName != null) __obj.updateDynamic("panelClassName")(panelClassName.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITabProps]
  }
}

