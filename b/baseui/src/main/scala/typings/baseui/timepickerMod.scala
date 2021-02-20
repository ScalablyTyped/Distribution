package typings.baseui

import typings.baseui.baseuiStrings.`12`
import typings.baseui.baseuiStrings.`24`
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import typings.baseui.selectMod.Option
import typings.react.mod.Component
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timepickerMod {
  
  @JSImport("baseui/timepicker", "TimePicker")
  @js.native
  class TimePicker protected ()
    extends Component[TimePickerProps, TimePickerState, js.Any] {
    def this(props: TimePickerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TimePickerProps, context: js.Any) = this()
    
    def buildSelectedOption(value: Date, format: String): js.Object = js.native
    
    def buildSteps(): js.Array[Double] = js.native
    
    def handleChange(steps: Double): Unit = js.native
  }
  
  @js.native
  trait TimePickerOverrides extends StObject {
    
    var Select: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
  }
  object TimePickerOverrides {
    
    @scala.inline
    def apply(): TimePickerOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimePickerOverrides]
    }
    
    @scala.inline
    implicit class TimePickerOverridesMutableBuilder[Self <: TimePickerOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelect(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "Select", js.undefined)
    }
  }
  
  @js.native
  trait TimePickerProps extends StObject {
    
    var creatable: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var error: js.UndefOr[Boolean] = js.native
    
    var format: js.UndefOr[`12` | `24`] = js.native
    
    var nullable: js.UndefOr[Boolean] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* args */ Date, _]] = js.native
    
    var overrides: js.UndefOr[TimePickerOverrides] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var positive: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[mini | default_ | compact | large_] = js.native
    
    var step: js.UndefOr[Double] = js.native
    
    var value: js.UndefOr[Date | Null] = js.native
  }
  object TimePickerProps {
    
    @scala.inline
    def apply(): TimePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimePickerProps]
    }
    
    @scala.inline
    implicit class TimePickerPropsMutableBuilder[Self <: TimePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreatable(value: Boolean): Self = StObject.set(x, "creatable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatableUndefined: Self = StObject.set(x, "creatable", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFormat(value: `12` | `24`): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* args */ Date => _): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOverrides(value: TimePickerOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
      
      @scala.inline
      def setSize(value: mini | default_ | compact | large_): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setValue(value: Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait TimePickerState extends StObject {
    
    var steps: js.Array[Double] = js.native
    
    var value: js.UndefOr[Option] = js.native
  }
  object TimePickerState {
    
    @scala.inline
    def apply(steps: js.Array[Double]): TimePickerState = {
      val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimePickerState]
    }
    
    @scala.inline
    implicit class TimePickerStateMutableBuilder[Self <: TimePickerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSteps(value: js.Array[Double]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsVarargs(value: Double*): Self = StObject.set(x, "steps", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: Option): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
