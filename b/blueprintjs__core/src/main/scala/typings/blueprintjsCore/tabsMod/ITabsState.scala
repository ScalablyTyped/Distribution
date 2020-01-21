package typings.blueprintjsCore.tabsMod

import typings.blueprintjsCore.tabMod.TabId
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITabsState extends js.Object {
  var indicatorWrapperStyle: js.UndefOr[CSSProperties] = js.undefined
  var selectedTabId: js.UndefOr[TabId] = js.undefined
}

object ITabsState {
  @scala.inline
  def apply(indicatorWrapperStyle: CSSProperties = null, selectedTabId: TabId = null): ITabsState = {
    val __obj = js.Dynamic.literal()
    if (indicatorWrapperStyle != null) __obj.updateDynamic("indicatorWrapperStyle")(indicatorWrapperStyle.asInstanceOf[js.Any])
    if (selectedTabId != null) __obj.updateDynamic("selectedTabId")(selectedTabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITabsState]
  }
}

