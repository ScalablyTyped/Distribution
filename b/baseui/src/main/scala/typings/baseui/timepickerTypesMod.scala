package typings.baseui

import typings.baseui.baseuiBooleans.`false`
import typings.baseui.baseuiInts.`900`
import typings.baseui.baseuiStrings.`12`
import typings.baseui.baseuiStrings.`24`
import typings.baseui.datepickerUtilsTypesMod.DateIOAdapter
import typings.baseui.helpersOverridesMod.Override
import typings.baseui.inputTypesMod.Size
import typings.baseui.selectTypesMod.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timepickerTypesMod {
  
  trait TimePickerDefaultProps extends StObject {
    
    var adapter: DateIOAdapter[js.Date]
    
    var creatable: `false`
    
    var format: `12`
    
    var ignoreMinMaxDateComponent: `false`
    
    var step: `900`
  }
  object TimePickerDefaultProps {
    
    inline def apply(adapter: DateIOAdapter[js.Date]): TimePickerDefaultProps = {
      val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], creatable = false, format = "12", ignoreMinMaxDateComponent = false, step = 900)
      __obj.asInstanceOf[TimePickerDefaultProps]
    }
    
    extension [Self <: TimePickerDefaultProps](x: Self) {
      
      inline def setAdapter(value: DateIOAdapter[js.Date]): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      
      inline def setCreatable(value: `false`): Self = StObject.set(x, "creatable", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: `12`): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setIgnoreMinMaxDateComponent(value: `false`): Self = StObject.set(x, "ignoreMinMaxDateComponent", value.asInstanceOf[js.Any])
      
      inline def setStep(value: `900`): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimePickerOverrides extends StObject {
    
    var Select: js.UndefOr[Override[Any]] = js.undefined
  }
  object TimePickerOverrides {
    
    inline def apply(): TimePickerOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimePickerOverrides]
    }
    
    extension [Self <: TimePickerOverrides](x: Self) {
      
      inline def setSelect(value: Override[Any]): Self = StObject.set(x, "Select", value.asInstanceOf[js.Any])
      
      inline def setSelectUndefined: Self = StObject.set(x, "Select", js.undefined)
    }
  }
  
  trait TimePickerProps[T] extends StObject {
    
    /** Render options in AM/PM format or 24 hour format. Defaults to 12 hour. */
    var adapter: DateIOAdapter[T]
    
    /** Set to true to allow times that aren't displayed in the options list to be entered manually. Defaults to false. */
    var creatable: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[`12` | `24`] = js.undefined
    
    /**
      * There are two strategies available for setting min/max times. If the min/max datetimes are
      * beyond the start/end times of the current value's date, Timepicker could either clamp the
      * min/max time of the start/end of the day or it can ignore the min/max date components and
      * only apply the time components. Each strategy has the potential to save developer time in
      * avoiding the need to perform conversion before providing min/max datetimes to the component.
      * By default the component will clamp the time window and setting this flag will ignore dates.
      */
    var ignoreMinMaxDateComponent: js.UndefOr[Boolean] = js.undefined
    
    var maxTime: js.UndefOr[T] = js.undefined
    
    var minTime: js.UndefOr[T] = js.undefined
    
    var nullable: js.UndefOr[Boolean] = js.undefined
    
    /** Callback for when time selection changes. */
    var onChange: js.UndefOr[js.Function1[/* a */ T | Null, Any]] = js.undefined
    
    var overrides: js.UndefOr[TimePickerOverrides] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var positive: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
    
    /** Amount of seconds between each option time. Defaults to 900 (15 minutes). */
    var step: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional value that can be provided to fully control the component. If not provided, TimePicker
      * will manage state internally and default to the closest step to new Date().
      */
    var value: js.UndefOr[T | Null] = js.undefined
  }
  object TimePickerProps {
    
    inline def apply[T](adapter: DateIOAdapter[T]): TimePickerProps[T] = {
      val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimePickerProps[T]]
    }
    
    extension [Self <: TimePickerProps[?], T](x: Self & TimePickerProps[T]) {
      
      inline def setAdapter(value: DateIOAdapter[T]): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      
      inline def setCreatable(value: Boolean): Self = StObject.set(x, "creatable", value.asInstanceOf[js.Any])
      
      inline def setCreatableUndefined: Self = StObject.set(x, "creatable", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFormat(value: `12` | `24`): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setIgnoreMinMaxDateComponent(value: Boolean): Self = StObject.set(x, "ignoreMinMaxDateComponent", value.asInstanceOf[js.Any])
      
      inline def setIgnoreMinMaxDateComponentUndefined: Self = StObject.set(x, "ignoreMinMaxDateComponent", js.undefined)
      
      inline def setMaxTime(value: T): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
      
      inline def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
      
      inline def setMinTime(value: T): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
      
      inline def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
      
      inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
      
      inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
      
      inline def setOnChange(value: /* a */ T | Null => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOverrides(value: TimePickerOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      inline def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait TimePickerState extends StObject {
    
    /** List of times (in seconds) displayed in the dropdown menu. */
    var steps: js.Array[Double]
    
    /** Internal value of the selected time as an integer since midnight (0) */
    var value: js.UndefOr[Option | Null] = js.undefined
  }
  object TimePickerState {
    
    inline def apply(steps: js.Array[Double]): TimePickerState = {
      val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimePickerState]
    }
    
    extension [Self <: TimePickerState](x: Self) {
      
      inline def setSteps(value: js.Array[Double]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsVarargs(value: Double*): Self = StObject.set(x, "steps", js.Array(value*))
      
      inline def setValue(value: Option): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
