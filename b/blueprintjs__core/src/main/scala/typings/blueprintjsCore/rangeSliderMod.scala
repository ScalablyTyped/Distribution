package typings.blueprintjsCore

import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.multiSliderMod.ISliderBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeSliderMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/slider/rangeSlider", "RangeSlider")
  @js.native
  class RangeSlider protected ()
    extends AbstractPureComponent2[IRangeSliderProps, js.Object, js.Object] {
    def this(props: IRangeSliderProps) = this()
    def this(props: IRangeSliderProps, context: js.Any) = this()
  }
  /* static members */
  object RangeSlider {
    
    @JSImport("@blueprintjs/core/lib/esm/components/slider/rangeSlider", "RangeSlider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/slider/rangeSlider", "RangeSlider.defaultProps")
    @js.native
    def defaultProps: IRangeSliderProps = js.native
    @scala.inline
    def defaultProps_=(x: IRangeSliderProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/slider/rangeSlider", "RangeSlider.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IRangeSliderProps extends ISliderBaseProps {
    
    /** Callback invoked when the range value changes. */
    var onChange: js.UndefOr[js.Function1[/* value */ NumberRange, Unit]] = js.native
    
    /** Callback invoked when a handle is released. */
    var onRelease: js.UndefOr[js.Function1[/* value */ NumberRange, Unit]] = js.native
    
    /**
      * Range value of slider. Handles will be rendered at each position in the range.
      * @default [0, 10]
      */
    var value: js.UndefOr[NumberRange] = js.native
  }
  object IRangeSliderProps {
    
    @scala.inline
    def apply(): IRangeSliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRangeSliderProps]
    }
    
    @scala.inline
    implicit class IRangeSliderPropsMutableBuilder[Self <: IRangeSliderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnChange(value: /* value */ NumberRange => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnRelease(value: /* value */ NumberRange => Unit): Self = StObject.set(x, "onRelease", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnReleaseUndefined: Self = StObject.set(x, "onRelease", js.undefined)
      
      @scala.inline
      def setValue(value: NumberRange): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type NumberRange = js.Tuple2[Double, Double]
}
