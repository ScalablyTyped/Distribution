package typings.baseui.popoverMod

import typings.baseui.baseuiStrings.auto
import typings.baseui.baseuiStrings.bottom
import typings.baseui.baseuiStrings.bottomLeft
import typings.baseui.baseuiStrings.bottomRight
import typings.baseui.baseuiStrings.click
import typings.baseui.baseuiStrings.hover
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.leftBottom
import typings.baseui.baseuiStrings.leftTop
import typings.baseui.baseuiStrings.menu
import typings.baseui.baseuiStrings.none
import typings.baseui.baseuiStrings.right
import typings.baseui.baseuiStrings.rightBottom
import typings.baseui.baseuiStrings.rightTop
import typings.baseui.baseuiStrings.tooltip
import typings.baseui.baseuiStrings.top
import typings.baseui.baseuiStrings.topLeft
import typings.baseui.baseuiStrings.topRight
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasePopoverProps extends js.Object {
  
  var accessibilityType: js.UndefOr[none | menu | tooltip] = js.native
  
  var animateOutTime: js.UndefOr[Double] = js.native
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var `data-baseweb`: js.UndefOr[String] = js.native
  
  var focusLock: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var ignoreBoundary: js.UndefOr[Boolean] = js.native
  
  var mountNode: js.UndefOr[HTMLElement] = js.native
  
  var onMouseEnterDelay: js.UndefOr[Double] = js.native
  
  var onMouseLeaveDelay: js.UndefOr[Double] = js.native
  
  var overrides: js.UndefOr[PopoverOverrides] = js.native
  
  var placement: js.UndefOr[
    topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
  ] = js.native
  
  var popoverMargin: js.UndefOr[Double] = js.native
  
  var popperOptions: js.UndefOr[js.Any] = js.native
  
  var renderAll: js.UndefOr[Boolean] = js.native
  
  var returnFocus: js.UndefOr[Boolean] = js.native
  
  var showArrow: js.UndefOr[Boolean] = js.native
  
  var triggerType: js.UndefOr[click | hover] = js.native
}
object BasePopoverProps {
  
  @scala.inline
  def apply(): BasePopoverProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasePopoverProps]
  }
  
  @scala.inline
  implicit class BasePopoverPropsOps[Self <: BasePopoverProps] (val x: Self) extends AnyVal {
    
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
    def setAccessibilityType(value: none | menu | tooltip): Self = this.set("accessibilityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityType: Self = this.set("accessibilityType", js.undefined)
    
    @scala.inline
    def setAnimateOutTime(value: Double): Self = this.set("animateOutTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimateOutTime: Self = this.set("animateOutTime", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def `setData-baseweb`(value: String): Self = this.set("data-baseweb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteData-baseweb`: Self = this.set("data-baseweb", js.undefined)
    
    @scala.inline
    def setFocusLock(value: Boolean): Self = this.set("focusLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusLock: Self = this.set("focusLock", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIgnoreBoundary(value: Boolean): Self = this.set("ignoreBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreBoundary: Self = this.set("ignoreBoundary", js.undefined)
    
    @scala.inline
    def setMountNode(value: HTMLElement): Self = this.set("mountNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMountNode: Self = this.set("mountNode", js.undefined)
    
    @scala.inline
    def setOnMouseEnterDelay(value: Double): Self = this.set("onMouseEnterDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseEnterDelay: Self = this.set("onMouseEnterDelay", js.undefined)
    
    @scala.inline
    def setOnMouseLeaveDelay(value: Double): Self = this.set("onMouseLeaveDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseLeaveDelay: Self = this.set("onMouseLeaveDelay", js.undefined)
    
    @scala.inline
    def setOverrides(value: PopoverOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    
    @scala.inline
    def setPlacement(
      value: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
    ): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setPopoverMargin(value: Double): Self = this.set("popoverMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopoverMargin: Self = this.set("popoverMargin", js.undefined)
    
    @scala.inline
    def setPopperOptions(value: js.Any): Self = this.set("popperOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopperOptions: Self = this.set("popperOptions", js.undefined)
    
    @scala.inline
    def setRenderAll(value: Boolean): Self = this.set("renderAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderAll: Self = this.set("renderAll", js.undefined)
    
    @scala.inline
    def setReturnFocus(value: Boolean): Self = this.set("returnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnFocus: Self = this.set("returnFocus", js.undefined)
    
    @scala.inline
    def setShowArrow(value: Boolean): Self = this.set("showArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowArrow: Self = this.set("showArrow", js.undefined)
    
    @scala.inline
    def setTriggerType(value: click | hover): Self = this.set("triggerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerType: Self = this.set("triggerType", js.undefined)
  }
}
