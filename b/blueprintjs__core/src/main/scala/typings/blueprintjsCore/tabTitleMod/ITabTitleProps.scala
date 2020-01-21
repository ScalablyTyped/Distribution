package typings.blueprintjsCore.tabTitleMod

import typings.blueprintjsCore.tabMod.ITabProps
import typings.blueprintjsCore.tabMod.TabId
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITabTitleProps extends ITabProps {
  /** ID of the parent `Tabs` to which this tab belongs. Used to generate ID for ARIA attributes. */
  var parentId: TabId
  /** Whether the tab is currently selected. */
  var selected: Boolean
  /** Handler invoked when this tab is clicked. */
  def onClick(id: TabId, event: MouseEvent[HTMLElement, NativeMouseEvent]): Unit
}

object ITabTitleProps {
  @scala.inline
  def apply(
    id: TabId,
    onClick: (TabId, MouseEvent[HTMLElement, NativeMouseEvent]) => Unit,
    parentId: TabId,
    selected: Boolean,
    children: ReactNode = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    panel: Element = null,
    panelClassName: String = null,
    title: ReactNode = null
  ): ITabTitleProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onClick = js.Any.fromFunction2(onClick), parentId = parentId.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    if (panelClassName != null) __obj.updateDynamic("panelClassName")(panelClassName.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITabTitleProps]
  }
}

