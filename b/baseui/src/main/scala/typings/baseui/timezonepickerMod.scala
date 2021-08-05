package typings.baseui

import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import typings.baseui.selectMod.Option
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timezonepickerMod {
  
  @JSImport("baseui/timezonepicker", "TimezonePicker")
  @js.native
  class TimezonePicker protected ()
    extends Component[TimezonePickerProps, TimezonePickerState, js.Any] {
    def this(props: TimezonePickerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TimezonePickerProps, context: js.Any) = this()
    
    def buildTimezones(compareDate: Date): js.Array[String] = js.native
  }
  
  trait Timezone extends StObject {
    
    var id: String
    
    var label: String
    
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
  
  trait TimezoneOverrides extends StObject {
    
    var Select: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
  }
  object TimezoneOverrides {
    
    inline def apply(): TimezoneOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimezoneOverrides]
    }
    
    extension [Self <: TimezoneOverrides](x: Self) {
      
      inline def setSelect(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Select", value.asInstanceOf[js.Any])
      
      inline def setSelectUndefined: Self = StObject.set(x, "Select", js.undefined)
    }
  }
  
  trait TimezonePickerProps extends StObject {
    
    var date: js.UndefOr[Date] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var mapLabels: js.UndefOr[js.Function1[/* args */ Option, ReactNode]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ Timezone, js.Any]] = js.undefined
    
    var overrides: js.UndefOr[TimezoneOverrides] = js.undefined
    
    var positive: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[mini | default_ | compact | large_] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object TimezonePickerProps {
    
    inline def apply(): TimezonePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimezonePickerProps]
    }
    
    extension [Self <: TimezonePickerProps](x: Self) {
      
      inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setMapLabels(value: /* args */ Option => ReactNode): Self = StObject.set(x, "mapLabels", js.Any.fromFunction1(value))
      
      inline def setMapLabelsUndefined: Self = StObject.set(x, "mapLabels", js.undefined)
      
      inline def setOnChange(value: /* value */ Timezone => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOverrides(value: TimezoneOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      inline def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
      
      inline def setSize(value: mini | default_ | compact | large_): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait TimezonePickerState extends StObject {
    
    var timezones: js.Array[Option]
    
    var value: js.UndefOr[String] = js.undefined
  }
  object TimezonePickerState {
    
    inline def apply(timezones: js.Array[Option]): TimezonePickerState = {
      val __obj = js.Dynamic.literal(timezones = timezones.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimezonePickerState]
    }
    
    extension [Self <: TimezonePickerState](x: Self) {
      
      inline def setTimezones(value: js.Array[Option]): Self = StObject.set(x, "timezones", value.asInstanceOf[js.Any])
      
      inline def setTimezonesVarargs(value: Option*): Self = StObject.set(x, "timezones", js.Array(value :_*))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
