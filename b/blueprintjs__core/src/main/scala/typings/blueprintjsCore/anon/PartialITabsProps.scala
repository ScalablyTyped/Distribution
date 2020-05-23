package typings.blueprintjsCore.anon

import typings.blueprintjsCore.tabMod.TabId
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/tabs/tabs.ITabsProps> */
trait PartialITabsProps extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var defaultSelectedTabId: js.UndefOr[TabId] = js.undefined
  var id: js.UndefOr[TabId] = js.undefined
  var large: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[
      /* newTabId */ TabId, 
      /* prevTabId */ TabId, 
      /* event */ MouseEvent[HTMLElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  var renderActiveTabPanelOnly: js.UndefOr[Boolean] = js.undefined
  var selectedTabId: js.UndefOr[TabId] = js.undefined
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object PartialITabsProps {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    defaultSelectedTabId: TabId = null,
    id: TabId = null,
    large: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* newTabId */ TabId, /* prevTabId */ TabId, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    renderActiveTabPanelOnly: js.UndefOr[Boolean] = js.undefined,
    selectedTabId: TabId = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): PartialITabsProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultSelectedTabId != null) __obj.updateDynamic("defaultSelectedTabId")(defaultSelectedTabId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (!js.isUndefined(renderActiveTabPanelOnly)) __obj.updateDynamic("renderActiveTabPanelOnly")(renderActiveTabPanelOnly.get.asInstanceOf[js.Any])
    if (selectedTabId != null) __obj.updateDynamic("selectedTabId")(selectedTabId.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialITabsProps]
  }
}

