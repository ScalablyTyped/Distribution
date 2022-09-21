package typings.blueprintjsCore

import typings.blueprintjsCore.anon.End
import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.multiSliderMod.ISliderBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeSliderMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/slider/rangeSlider", "RangeSlider")
  @js.native
  open class RangeSlider protected ()
    extends AbstractPureComponent2[RangeSliderProps, js.Object, js.Object] {
    def this(props: RangeSliderProps) = this()
    def this(props: RangeSliderProps, context: Any) = this()
  }
  /* static members */
  object RangeSlider {
    
    @JSImport("@blueprintjs/core/lib/esm/components/slider/rangeSlider", "RangeSlider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/slider/rangeSlider", "RangeSlider.defaultProps")
    @js.native
    def defaultProps: RangeSliderProps = js.native
    inline def defaultProps_=(x: RangeSliderProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/slider/rangeSlider", "RangeSlider.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait IRangeSliderProps
    extends StObject
       with ISliderBaseProps {
    
    /** HTML props to apply to the slider Handles */
    var handleHtmlProps: js.UndefOr[End] = js.undefined
    
    /** Callback invoked when the range value changes. */
    var onChange: js.UndefOr[js.Function1[/* value */ NumberRange, Unit]] = js.undefined
    
    /** Callback invoked when a handle is released. */
    var onRelease: js.UndefOr[js.Function1[/* value */ NumberRange, Unit]] = js.undefined
    
    /**
      * Range value of slider. Handles will be rendered at each position in the range.
      *
      * @default [0, 10]
      */
    var value: js.UndefOr[NumberRange] = js.undefined
  }
  object IRangeSliderProps {
    
    inline def apply(): IRangeSliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRangeSliderProps]
    }
    
    extension [Self <: IRangeSliderProps](x: Self) {
      
      inline def setHandleHtmlProps(value: End): Self = StObject.set(x, "handleHtmlProps", value.asInstanceOf[js.Any])
      
      inline def setHandleHtmlPropsUndefined: Self = StObject.set(x, "handleHtmlProps", js.undefined)
      
      inline def setOnChange(value: /* value */ NumberRange => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnRelease(value: /* value */ NumberRange => Unit): Self = StObject.set(x, "onRelease", js.Any.fromFunction1(value))
      
      inline def setOnReleaseUndefined: Self = StObject.set(x, "onRelease", js.undefined)
      
      inline def setValue(value: NumberRange): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type NumberRange = js.Tuple2[Double, Double]
  
  type RangeSliderProps = IRangeSliderProps
}
