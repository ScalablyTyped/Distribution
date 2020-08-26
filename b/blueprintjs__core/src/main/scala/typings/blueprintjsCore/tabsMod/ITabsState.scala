package typings.blueprintjsCore.tabsMod

import typings.blueprintjsCore.tabMod.TabId
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITabsState extends js.Object {
  var indicatorWrapperStyle: js.UndefOr[CSSProperties] = js.native
  var selectedTabId: js.UndefOr[TabId] = js.native
}

object ITabsState {
  @scala.inline
  def apply(): ITabsState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITabsState]
  }
  @scala.inline
  implicit class ITabsStateOps[Self <: ITabsState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIndicatorWrapperStyle(value: CSSProperties): Self = this.set("indicatorWrapperStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndicatorWrapperStyle: Self = this.set("indicatorWrapperStyle", js.undefined)
    @scala.inline
    def setSelectedTabId(value: TabId): Self = this.set("selectedTabId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedTabId: Self = this.set("selectedTabId", js.undefined)
  }
  
}

