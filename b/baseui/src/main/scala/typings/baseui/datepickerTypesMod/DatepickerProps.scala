package typings.baseui.datepickerTypesMod

import typings.baseui.anon.`10`
import typings.baseui.anon.`2`
import typings.baseui.inputTypesMod.Size
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.baseui.datepickerStatefulContainerMod.InputProps because Already inherited */ trait DatepickerProps[T]
  extends StObject
     with CalendarProps[T] {
  
  var `aria-describedby`: js.UndefOr[String | Null] = js.undefined
  
  var `aria-label`: js.UndefOr[String] = js.undefined
  
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  
  var clearable: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var displayValueAtRangeIndex: js.UndefOr[Double] = js.undefined
  
  var endDateLabel: js.UndefOr[String] = js.undefined
  
  /** Renders UI in 'error' state. */
  var error: js.UndefOr[Boolean] = js.undefined
  
  var formatDisplayValue: js.UndefOr[
    js.Function2[
      /* date */ js.UndefOr[T | Null | (js.Array[js.UndefOr[T | Null]])], 
      /* formatString */ String, 
      String
    ]
  ] = js.undefined
  
  var formatString: js.UndefOr[String] = js.undefined
  
  var mask: js.UndefOr[String | Null] = js.undefined
  
  /** Where to mount the popover */
  var mountNode: js.UndefOr[HTMLElement] = js.undefined
  
  /** When single picker, fn is always called. When range picker, fn is called when start and end date are selected. */
  @JSName("onChange")
  var onChange_DatepickerProps: js.UndefOr[js.Function1[/* a */ `10`[T], Any]] = js.undefined
  
  /** Called when calendar is closed */
  var onClose: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** Called when calendar is opened */
  var onOpen: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** When single picker, fn is always called. When range picker, fn is called when either start or end date changes. */
  var onRangeChange: js.UndefOr[js.Function1[/* a */ `2`[T], Any]] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var positive: js.UndefOr[Boolean] = js.undefined
  
  /** Determines whether startDate and endDate should be updated independently of eachother */
  var rangedCalendarBehavior: js.UndefOr[RangedCalendarBehavior] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  /** Determines if startDate and endDate should be separated into two input fields. Ignored if `range` is not true. */
  var separateRangeInputs: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[Size] = js.undefined
  
  var startDateLabel: js.UndefOr[String] = js.undefined
}
object DatepickerProps {
  
  inline def apply[T](): DatepickerProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatepickerProps[T]]
  }
  
  extension [Self <: DatepickerProps[?], T](x: Self & DatepickerProps[T]) {
    
    inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `setAria-describedbyNull`: Self = StObject.set(x, "aria-describedby", null)
    
    inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
    
    inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    inline def setClearable(value: Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
    
    inline def setClearableUndefined: Self = StObject.set(x, "clearable", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDisplayValueAtRangeIndex(value: Double): Self = StObject.set(x, "displayValueAtRangeIndex", value.asInstanceOf[js.Any])
    
    inline def setDisplayValueAtRangeIndexUndefined: Self = StObject.set(x, "displayValueAtRangeIndex", js.undefined)
    
    inline def setEndDateLabel(value: String): Self = StObject.set(x, "endDateLabel", value.asInstanceOf[js.Any])
    
    inline def setEndDateLabelUndefined: Self = StObject.set(x, "endDateLabel", js.undefined)
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFormatDisplayValue(
      value: (/* date */ js.UndefOr[T | Null | (js.Array[js.UndefOr[T | Null]])], /* formatString */ String) => String
    ): Self = StObject.set(x, "formatDisplayValue", js.Any.fromFunction2(value))
    
    inline def setFormatDisplayValueUndefined: Self = StObject.set(x, "formatDisplayValue", js.undefined)
    
    inline def setFormatString(value: String): Self = StObject.set(x, "formatString", value.asInstanceOf[js.Any])
    
    inline def setFormatStringUndefined: Self = StObject.set(x, "formatString", js.undefined)
    
    inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskNull: Self = StObject.set(x, "mask", null)
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setMountNode(value: HTMLElement): Self = StObject.set(x, "mountNode", value.asInstanceOf[js.Any])
    
    inline def setMountNodeUndefined: Self = StObject.set(x, "mountNode", js.undefined)
    
    inline def setOnChange(value: /* a */ `10`[T] => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClose(value: () => Any): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnOpen(value: () => Any): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
    
    inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    
    inline def setOnRangeChange(value: /* a */ `2`[T] => Any): Self = StObject.set(x, "onRangeChange", js.Any.fromFunction1(value))
    
    inline def setOnRangeChangeUndefined: Self = StObject.set(x, "onRangeChange", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
    
    inline def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
    
    inline def setRangedCalendarBehavior(value: RangedCalendarBehavior): Self = StObject.set(x, "rangedCalendarBehavior", value.asInstanceOf[js.Any])
    
    inline def setRangedCalendarBehaviorNull: Self = StObject.set(x, "rangedCalendarBehavior", null)
    
    inline def setRangedCalendarBehaviorUndefined: Self = StObject.set(x, "rangedCalendarBehavior", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setSeparateRangeInputs(value: Boolean): Self = StObject.set(x, "separateRangeInputs", value.asInstanceOf[js.Any])
    
    inline def setSeparateRangeInputsUndefined: Self = StObject.set(x, "separateRangeInputs", js.undefined)
    
    inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStartDateLabel(value: String): Self = StObject.set(x, "startDateLabel", value.asInstanceOf[js.Any])
    
    inline def setStartDateLabelUndefined: Self = StObject.set(x, "startDateLabel", js.undefined)
  }
}
