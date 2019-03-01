package typings
package atBlueprintjsCoreLib.libEsmComponentsTabsTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITabsState extends js.Object {
  var indicatorWrapperStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var selectedTabId: js.UndefOr[atBlueprintjsCoreLib.libEsmComponentsTabsTabMod.TabId] = js.undefined
}

object ITabsState {
  @scala.inline
  def apply(
    indicatorWrapperStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    selectedTabId: atBlueprintjsCoreLib.libEsmComponentsTabsTabMod.TabId = null
  ): ITabsState = {
    val __obj = js.Dynamic.literal()
    if (indicatorWrapperStyle != null) __obj.updateDynamic("indicatorWrapperStyle")(indicatorWrapperStyle)
    if (selectedTabId != null) __obj.updateDynamic("selectedTabId")(selectedTabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITabsState]
  }
}

