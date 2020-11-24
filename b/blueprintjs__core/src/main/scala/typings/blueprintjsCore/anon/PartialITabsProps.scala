package typings.blueprintjsCore.anon

import typings.blueprintjsCore.tabMod.TabId
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/tabs/tabs.ITabsProps> */
@js.native
trait PartialITabsProps extends js.Object {
  
  var animate: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var defaultSelectedTabId: js.UndefOr[TabId] = js.native
  
  var id: js.UndefOr[TabId] = js.native
  
  var large: js.UndefOr[Boolean] = js.native
  
  var onChange: js.UndefOr[
    js.Function3[
      /* newTabId */ TabId, 
      /* prevTabId */ js.UndefOr[TabId], 
      /* event */ MouseEvent[HTMLElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.native
  
  var renderActiveTabPanelOnly: js.UndefOr[Boolean] = js.native
  
  var selectedTabId: js.UndefOr[TabId] = js.native
  
  var vertical: js.UndefOr[Boolean] = js.native
}
object PartialITabsProps {
  
  @scala.inline
  def apply(): PartialITabsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialITabsProps]
  }
  
  @scala.inline
  implicit class PartialITabsPropsOps[Self <: PartialITabsProps] (val x: Self) extends AnyVal {
    
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
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDefaultSelectedTabId(value: TabId): Self = this.set("defaultSelectedTabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSelectedTabId: Self = this.set("defaultSelectedTabId", js.undefined)
    
    @scala.inline
    def setId(value: TabId): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLarge(value: Boolean): Self = this.set("large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLarge: Self = this.set("large", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: (/* newTabId */ TabId, /* prevTabId */ js.UndefOr[TabId], /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setRenderActiveTabPanelOnly(value: Boolean): Self = this.set("renderActiveTabPanelOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderActiveTabPanelOnly: Self = this.set("renderActiveTabPanelOnly", js.undefined)
    
    @scala.inline
    def setSelectedTabId(value: TabId): Self = this.set("selectedTabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedTabId: Self = this.set("selectedTabId", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
}
