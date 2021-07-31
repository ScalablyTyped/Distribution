package typings.cathoQuantum

import typings.cathoQuantum.anon.BaseFontSizeColors
import typings.cathoQuantum.anon.From
import typings.cathoQuantum.anon.LabelValue
import typings.cathoQuantum.cathoQuantumBooleans.`false`
import typings.cathoQuantum.cathoQuantumStrings.auto
import typings.cathoQuantum.cathoQuantumStrings.inverted
import typings.cathoQuantum.cathoQuantumStrings.normal
import typings.cathoQuantum.cathoQuantumStrings.off
import typings.cathoQuantum.cathoQuantumStrings.on
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.Component
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeSliderMod {
  
  @JSImport("@catho/quantum/RangeSlider", JSImport.Default)
  @js.native
  class default ()
    extends Component[RangeSliderProps, js.Object, js.Any]
  
  type RangeSlider = Component[RangeSliderProps, js.Object, js.Any]
  
  trait RangeSliderProps extends StObject {
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var defaultValue: js.UndefOr[Double | From] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var marks: js.UndefOr[js.Array[LabelValue]] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    var onChangeCommitted: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
    
    var theme: js.UndefOr[BaseFontSizeColors] = js.undefined
    
    var tipFormatter: js.UndefOr[
        js.Function2[/* value */ js.UndefOr[Double], /* index */ js.UndefOr[Double], String]
      ] = js.undefined
    
    var track: js.UndefOr[normal | `false` | inverted] = js.undefined
    
    var value: js.UndefOr[Double | From] = js.undefined
    
    var valueLabelDisplay: js.UndefOr[auto | on | off] = js.undefined
  }
  object RangeSliderProps {
    
    @scala.inline
    def apply(): RangeSliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeSliderProps]
    }
    
    @scala.inline
    implicit class RangeSliderPropsMutableBuilder[Self <: RangeSliderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Double | From): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setMarks(value: js.Array[LabelValue]): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
      
      @scala.inline
      def setMarksVarargs(value: LabelValue*): Self = StObject.set(x, "marks", js.Array(value :_*))
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeCommitted(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChangeCommitted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeCommittedUndefined: Self = StObject.set(x, "onChangeCommitted", js.undefined)
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setTheme(value: BaseFontSizeColors): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTipFormatter(value: (/* value */ js.UndefOr[Double], /* index */ js.UndefOr[Double]) => String): Self = StObject.set(x, "tipFormatter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTipFormatterUndefined: Self = StObject.set(x, "tipFormatter", js.undefined)
      
      @scala.inline
      def setTrack(value: normal | `false` | inverted): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
      
      @scala.inline
      def setValue(value: Double | From): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueLabelDisplay(value: auto | on | off): Self = StObject.set(x, "valueLabelDisplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueLabelDisplayUndefined: Self = StObject.set(x, "valueLabelDisplay", js.undefined)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
