package typings.baseui.popoverTypesMod

import typings.baseui.layerTypesMod.TetherPlacement
import typings.react.mod.FocusEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.FocusOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasePopoverProps extends StObject {
  
  /** Controls how this popover behaves for screen readers and other assistive devices.
    * See the A11Y section at the bottom of this document for more details.
    */
  var accessibilityType: js.UndefOr[AccessibilityType] = js.undefined
  
  /** How long should be fade out animation in ms, default 0ms */
  var animateOutTime: js.UndefOr[Double] = js.undefined
  
  /** If true, focus will shift to the first interactive element within the popover.
    * If false, the popover container itself will receive focus.
    * Moving focus into a newly opened popover is important for accessibility purposes, so please be careful!
    */
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  var `data-baseweb`: js.UndefOr[String] = js.undefined
  
  /** If true, focus will be locked to elements within the popover.
    */
  var focusLock: js.UndefOr[Boolean] = js.undefined
  
  /** Pass FocusOptions for focusing (used as `HtmlElement.focus(focusOptions)`) */
  var focusOptions: js.UndefOr[FocusOptions] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  /** If true, popover element will not avoid element boundaries. */
  var ignoreBoundary: js.UndefOr[Boolean] = js.undefined
  
  /** Where to mount the popover */
  var mountNode: js.UndefOr[HTMLElement] = js.undefined
  
  /** Handler for blur events on trigger element. */
  var onBlur: js.UndefOr[js.Function1[/* e */ FocusEvent[Element, Element], Any]] = js.undefined
  
  /** Handler for click events on trigger element. */
  var onClick: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Element, Event], Any]] = js.undefined
  
  /** Handler for 'Esc' keypress events */
  var onFocus: js.UndefOr[js.Function1[/* e */ FocusEvent[Element, Element], Any]] = js.undefined
  
  /** Handler for mouseenter events on trigger element. */
  var onMouseEnter: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Any]] = js.undefined
  
  /** Number of milliseconds to wait before showing the popover after mouse enters the trigger element (for triggerType `hover`). */
  var onMouseEnterDelay: js.UndefOr[Double] = js.undefined
  
  /** Handler for mouseleave events on trigger element. */
  var onMouseLeave: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Any]] = js.undefined
  
  /** Number of milliseconds to wait before showing the popover after mouse leaves the trigger element (for triggerType `hover`). */
  var onMouseLeaveDelay: js.UndefOr[Double] = js.undefined
  
  var overrides: js.UndefOr[PopoverOverrides] = js.undefined
  
  /** How to position the popover relative to the target. */
  var placement: TetherPlacement
  
  /** Margin of the popover */
  var popoverMargin: js.UndefOr[Double] = js.undefined
  
  /** Popper options override
    * https://github.com/popperjs/popper.js/blob/v1.x/docs/_includes/popper-documentation.md
    */
  var popperOptions: js.UndefOr[Any] = js.undefined
  
  /** Renders all popover content for SEO purposes regardless of popover isOpen state */
  var renderAll: js.UndefOr[Boolean] = js.undefined
  
  /** If true, focus will shift back to the original element that triggered the popover
    * Be careful with elements that open the popover on focus (e.g. input) this will cause the popover to reopen on close!
    */
  var returnFocus: js.UndefOr[
    Boolean | FocusOptions | (js.Function1[/* returnTo */ Element, Boolean | FocusOptions])
  ] = js.undefined
  
  /** Whether or not to show the arrow pointing from the popover to the trigger. */
  var showArrow: js.UndefOr[Boolean] = js.undefined
  
  /** Whether to toggle the popover when trigger is clicked or hovered. */
  var triggerType: TriggerType
}
object BasePopoverProps {
  
  inline def apply(placement: TetherPlacement, triggerType: TriggerType): BasePopoverProps = {
    val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePopoverProps]
  }
  
  extension [Self <: BasePopoverProps](x: Self) {
    
    inline def setAccessibilityType(value: AccessibilityType): Self = StObject.set(x, "accessibilityType", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityTypeUndefined: Self = StObject.set(x, "accessibilityType", js.undefined)
    
    inline def setAnimateOutTime(value: Double): Self = StObject.set(x, "animateOutTime", value.asInstanceOf[js.Any])
    
    inline def setAnimateOutTimeUndefined: Self = StObject.set(x, "animateOutTime", js.undefined)
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def `setData-baseweb`(value: String): Self = StObject.set(x, "data-baseweb", value.asInstanceOf[js.Any])
    
    inline def `setData-basewebUndefined`: Self = StObject.set(x, "data-baseweb", js.undefined)
    
    inline def setFocusLock(value: Boolean): Self = StObject.set(x, "focusLock", value.asInstanceOf[js.Any])
    
    inline def setFocusLockUndefined: Self = StObject.set(x, "focusLock", js.undefined)
    
    inline def setFocusOptions(value: FocusOptions): Self = StObject.set(x, "focusOptions", value.asInstanceOf[js.Any])
    
    inline def setFocusOptionsUndefined: Self = StObject.set(x, "focusOptions", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIgnoreBoundary(value: Boolean): Self = StObject.set(x, "ignoreBoundary", value.asInstanceOf[js.Any])
    
    inline def setIgnoreBoundaryUndefined: Self = StObject.set(x, "ignoreBoundary", js.undefined)
    
    inline def setMountNode(value: HTMLElement): Self = StObject.set(x, "mountNode", value.asInstanceOf[js.Any])
    
    inline def setMountNodeUndefined: Self = StObject.set(x, "mountNode", js.undefined)
    
    inline def setOnBlur(value: /* e */ FocusEvent[Element, Element] => Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnClick(value: /* e */ SyntheticEvent[Element, Event] => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnFocus(value: /* e */ FocusEvent[Element, Element] => Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnMouseEnter(value: /* e */ MouseEvent[Element, NativeMouseEvent] => Any): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    inline def setOnMouseEnterDelay(value: Double): Self = StObject.set(x, "onMouseEnterDelay", value.asInstanceOf[js.Any])
    
    inline def setOnMouseEnterDelayUndefined: Self = StObject.set(x, "onMouseEnterDelay", js.undefined)
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: /* e */ MouseEvent[Element, NativeMouseEvent] => Any): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    inline def setOnMouseLeaveDelay(value: Double): Self = StObject.set(x, "onMouseLeaveDelay", value.asInstanceOf[js.Any])
    
    inline def setOnMouseLeaveDelayUndefined: Self = StObject.set(x, "onMouseLeaveDelay", js.undefined)
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOverrides(value: PopoverOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setPlacement(value: TetherPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPopoverMargin(value: Double): Self = StObject.set(x, "popoverMargin", value.asInstanceOf[js.Any])
    
    inline def setPopoverMarginUndefined: Self = StObject.set(x, "popoverMargin", js.undefined)
    
    inline def setPopperOptions(value: Any): Self = StObject.set(x, "popperOptions", value.asInstanceOf[js.Any])
    
    inline def setPopperOptionsUndefined: Self = StObject.set(x, "popperOptions", js.undefined)
    
    inline def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
    
    inline def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
    
    inline def setReturnFocus(value: Boolean | FocusOptions | (js.Function1[/* returnTo */ Element, Boolean | FocusOptions])): Self = StObject.set(x, "returnFocus", value.asInstanceOf[js.Any])
    
    inline def setReturnFocusFunction1(value: /* returnTo */ Element => Boolean | FocusOptions): Self = StObject.set(x, "returnFocus", js.Any.fromFunction1(value))
    
    inline def setReturnFocusUndefined: Self = StObject.set(x, "returnFocus", js.undefined)
    
    inline def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
    
    inline def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
    
    inline def setTriggerType(value: TriggerType): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
  }
}
