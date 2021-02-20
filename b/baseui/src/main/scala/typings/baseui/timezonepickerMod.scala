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
import scala.scalajs.js.`|`
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
  
  @js.native
  trait Timezone extends StObject {
    
    var id: String = js.native
    
    var label: String = js.native
    
    var offset: Double = js.native
  }
  object Timezone {
    
    @scala.inline
    def apply(id: String, label: String, offset: Double): Timezone = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Timezone]
    }
    
    @scala.inline
    implicit class TimezoneMutableBuilder[Self <: Timezone] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TimezoneOverrides extends StObject {
    
    var Select: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
  }
  object TimezoneOverrides {
    
    @scala.inline
    def apply(): TimezoneOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimezoneOverrides]
    }
    
    @scala.inline
    implicit class TimezoneOverridesMutableBuilder[Self <: TimezoneOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelect(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "Select", js.undefined)
    }
  }
  
  @js.native
  trait TimezonePickerProps extends StObject {
    
    var date: js.UndefOr[Date] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var error: js.UndefOr[Boolean] = js.native
    
    var mapLabels: js.UndefOr[js.Function1[/* args */ Option, ReactNode]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ Timezone, _]] = js.native
    
    var overrides: js.UndefOr[TimezoneOverrides] = js.native
    
    var positive: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[mini | default_ | compact | large_] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object TimezonePickerProps {
    
    @scala.inline
    def apply(): TimezonePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimezonePickerProps]
    }
    
    @scala.inline
    implicit class TimezonePickerPropsMutableBuilder[Self <: TimezonePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setMapLabels(value: /* args */ Option => ReactNode): Self = StObject.set(x, "mapLabels", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMapLabelsUndefined: Self = StObject.set(x, "mapLabels", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ Timezone => _): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOverrides(value: TimezoneOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
      
      @scala.inline
      def setSize(value: mini | default_ | compact | large_): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait TimezonePickerState extends StObject {
    
    var timezones: js.Array[Option] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object TimezonePickerState {
    
    @scala.inline
    def apply(timezones: js.Array[Option]): TimezonePickerState = {
      val __obj = js.Dynamic.literal(timezones = timezones.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimezonePickerState]
    }
    
    @scala.inline
    implicit class TimezonePickerStateMutableBuilder[Self <: TimezonePickerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimezones(value: js.Array[Option]): Self = StObject.set(x, "timezones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezonesVarargs(value: Option*): Self = StObject.set(x, "timezones", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
