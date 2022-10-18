package typings.baseui

import typings.baseui.helpersOverridesMod.Override
import typings.baseui.inputTypesMod.Size
import typings.baseui.selectTypesMod.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timezonepickerTypesMod {
  
  trait Timezone extends StObject {
    
    var id: String
    
    var label: String
    
    /**
      * The difference, in minutes, between a UTC date, and a date in the indicated time zone.
      * Positive values indicate hours behind UTC, negative values indicate hours ahead.
      * This aligns with Date.getTimezoneOffset()
      */
    var offset: Double
  }
  object Timezone {
    
    inline def apply(id: String, label: String, offset: Double): Timezone = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Timezone]
    }
    
    extension [Self <: Timezone](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimezonePickerOverrides extends StObject {
    
    var Select: js.UndefOr[Override[Any]] = js.undefined
  }
  object TimezonePickerOverrides {
    
    inline def apply(): TimezonePickerOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimezonePickerOverrides]
    }
    
    extension [Self <: TimezonePickerOverrides](x: Self) {
      
      inline def setSelect(value: Override[Any]): Self = StObject.set(x, "Select", value.asInstanceOf[js.Any])
      
      inline def setSelectUndefined: Self = StObject.set(x, "Select", js.undefined)
    }
  }
  
  trait TimezonePickerProps extends StObject {
    
    var additionalTimezones: js.UndefOr[js.Array[Timezone]] = js.undefined
    
    /**
      * If not provided, defaults to new Date(). Important to note that the timezone picker only
      * displays options related to the provided date. Take Pacific Time for example. On March 9th,
      * Pacific Time equates to the more specific Pacific Standard Time. On March 10th, it operates on
      * Pacific Daylight Time. The timezone picker will never display PST and PDT together. If you need
      * exact specificity, provide a date. Otherwise it will default to the relevant timezone at render.
      */
    var date: js.UndefOr[js.Date] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var includeAbbreviations: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Customize the option's label. Useful for translations and optionally mapping from
      * 'America/Los_Angeles' to 'Pacific Time'.
      */
    var mapLabels: js.UndefOr[js.Function1[/* option */ Option, String]] = js.undefined
    
    /** Callback for when the timezone selection changes. */
    var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Timezone | Null], Any]] = js.undefined
    
    var overrides: js.UndefOr[TimezonePickerOverrides] = js.undefined
    
    var positive: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
    
    /**
      * Optional value that can be provided to fully control the component. If not provided,
      * TimezonePicker will manage state internally.
      */
    var value: js.UndefOr[String | Null] = js.undefined
  }
  object TimezonePickerProps {
    
    inline def apply(): TimezonePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimezonePickerProps]
    }
    
    extension [Self <: TimezonePickerProps](x: Self) {
      
      inline def setAdditionalTimezones(value: js.Array[Timezone]): Self = StObject.set(x, "additionalTimezones", value.asInstanceOf[js.Any])
      
      inline def setAdditionalTimezonesUndefined: Self = StObject.set(x, "additionalTimezones", js.undefined)
      
      inline def setAdditionalTimezonesVarargs(value: Timezone*): Self = StObject.set(x, "additionalTimezones", js.Array(value*))
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setIncludeAbbreviations(value: Boolean): Self = StObject.set(x, "includeAbbreviations", value.asInstanceOf[js.Any])
      
      inline def setIncludeAbbreviationsUndefined: Self = StObject.set(x, "includeAbbreviations", js.undefined)
      
      inline def setMapLabels(value: /* option */ Option => String): Self = StObject.set(x, "mapLabels", js.Any.fromFunction1(value))
      
      inline def setMapLabelsUndefined: Self = StObject.set(x, "mapLabels", js.undefined)
      
      inline def setOnChange(value: /* value */ js.UndefOr[Timezone | Null] => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOverrides(value: TimezonePickerOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      inline def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait TimezonePickerState extends StObject {
    
    /** List of timezones from the IANA database. */
    var timezones: js.Array[Timezone]
    
    /** Value provided to the select component. */
    var value: js.UndefOr[String | Null] = js.undefined
  }
  object TimezonePickerState {
    
    inline def apply(timezones: js.Array[Timezone]): TimezonePickerState = {
      val __obj = js.Dynamic.literal(timezones = timezones.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimezonePickerState]
    }
    
    extension [Self <: TimezonePickerState](x: Self) {
      
      inline def setTimezones(value: js.Array[Timezone]): Self = StObject.set(x, "timezones", value.asInstanceOf[js.Any])
      
      inline def setTimezonesVarargs(value: Timezone*): Self = StObject.set(x, "timezones", js.Array(value*))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
