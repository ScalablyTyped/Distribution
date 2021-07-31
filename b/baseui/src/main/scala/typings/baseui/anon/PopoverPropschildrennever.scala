package typings.baseui.anon

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
import typings.baseui.popoverMod.PopoverOverrides
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/popover.PopoverProps & {  children :never} */
trait PopoverPropschildrennever extends StObject {
  
  var accessibilityType: js.UndefOr[none | menu | tooltip] = js.undefined
  
  var animateOutTime: js.UndefOr[Double] = js.undefined
  
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  var children: ReactNode
  
  var content: ReactNode | js.Function0[ReactNode]
  
  var `data-baseweb`: js.UndefOr[String] = js.undefined
  
  var focusLock: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var ignoreBoundary: js.UndefOr[Boolean] = js.undefined
  
  var isOpen: Boolean
  
  var mountNode: js.UndefOr[HTMLElement] = js.undefined
  
  var onBlur: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var onClick: js.UndefOr[js.Function1[/* e */ typings.std.Event, js.Any]] = js.undefined
  
  var onClickOutside: js.UndefOr[js.Function1[/* event */ MouseEvent, js.Any]] = js.undefined
  
  var onEsc: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var onFocus: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var onMouseEnter: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var onMouseEnterDelay: js.UndefOr[Double] = js.undefined
  
  var onMouseLeave: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var onMouseLeaveDelay: js.UndefOr[Double] = js.undefined
  
  var overrides: js.UndefOr[PopoverOverrides] = js.undefined
  
  var placement: js.UndefOr[
    topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
  ] = js.undefined
  
  var popoverMargin: js.UndefOr[Double] = js.undefined
  
  var popperOptions: js.UndefOr[js.Any] = js.undefined
  
  var renderAll: js.UndefOr[Boolean] = js.undefined
  
  var returnFocus: js.UndefOr[Boolean] = js.undefined
  
  var showArrow: js.UndefOr[Boolean] = js.undefined
  
  var triggerType: js.UndefOr[click | hover] = js.undefined
}
object PopoverPropschildrennever {
  
  @scala.inline
  def apply(isOpen: Boolean): PopoverPropschildrennever = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverPropschildrennever]
  }
  
  @scala.inline
  implicit class PopoverPropschildrenneverMutableBuilder[Self <: PopoverPropschildrennever] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityType(value: none | menu | tooltip): Self = StObject.set(x, "accessibilityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityTypeUndefined: Self = StObject.set(x, "accessibilityType", js.undefined)
    
    @scala.inline
    def setAnimateOutTime(value: Double): Self = StObject.set(x, "animateOutTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateOutTimeUndefined: Self = StObject.set(x, "animateOutTime", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setContent(value: ReactNode | js.Function0[ReactNode]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentFunction0(value: () => ReactNode): Self = StObject.set(x, "content", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def `setData-baseweb`(value: String): Self = StObject.set(x, "data-baseweb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setData-basewebUndefined`: Self = StObject.set(x, "data-baseweb", js.undefined)
    
    @scala.inline
    def setFocusLock(value: Boolean): Self = StObject.set(x, "focusLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusLockUndefined: Self = StObject.set(x, "focusLock", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIgnoreBoundary(value: Boolean): Self = StObject.set(x, "ignoreBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreBoundaryUndefined: Self = StObject.set(x, "ignoreBoundary", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountNode(value: HTMLElement): Self = StObject.set(x, "mountNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountNodeUndefined: Self = StObject.set(x, "mountNode", js.undefined)
    
    @scala.inline
    def setOnBlur(value: () => js.Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* e */ typings.std.Event => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickOutside(value: /* event */ MouseEvent => js.Any): Self = StObject.set(x, "onClickOutside", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnEsc(value: () => js.Any): Self = StObject.set(x, "onEsc", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnEscUndefined: Self = StObject.set(x, "onEsc", js.undefined)
    
    @scala.inline
    def setOnFocus(value: () => js.Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: () => js.Any): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMouseEnterDelay(value: Double): Self = StObject.set(x, "onMouseEnterDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseEnterDelayUndefined: Self = StObject.set(x, "onMouseEnterDelay", js.undefined)
    
    @scala.inline
    def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: () => js.Any): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMouseLeaveDelay(value: Double): Self = StObject.set(x, "onMouseLeaveDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseLeaveDelayUndefined: Self = StObject.set(x, "onMouseLeaveDelay", js.undefined)
    
    @scala.inline
    def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    @scala.inline
    def setOverrides(value: PopoverOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    @scala.inline
    def setPlacement(
      value: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
    ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    @scala.inline
    def setPopoverMargin(value: Double): Self = StObject.set(x, "popoverMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopoverMarginUndefined: Self = StObject.set(x, "popoverMargin", js.undefined)
    
    @scala.inline
    def setPopperOptions(value: js.Any): Self = StObject.set(x, "popperOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopperOptionsUndefined: Self = StObject.set(x, "popperOptions", js.undefined)
    
    @scala.inline
    def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
    
    @scala.inline
    def setReturnFocus(value: Boolean): Self = StObject.set(x, "returnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnFocusUndefined: Self = StObject.set(x, "returnFocus", js.undefined)
    
    @scala.inline
    def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
    
    @scala.inline
    def setTriggerType(value: click | hover): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerTypeUndefined: Self = StObject.set(x, "triggerType", js.undefined)
  }
}
