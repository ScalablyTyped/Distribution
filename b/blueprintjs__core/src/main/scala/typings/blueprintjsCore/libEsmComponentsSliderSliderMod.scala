package typings.blueprintjsCore

import typings.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typings.blueprintjsCore.libEsmComponentsSliderHandlePropsMod.HandleHtmlProps
import typings.blueprintjsCore.libEsmComponentsSliderMultiSliderMod.ISliderBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsSliderSliderMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/slider/slider", "Slider")
  @js.native
  open class Slider protected ()
    extends AbstractPureComponent2[SliderProps, js.Object, js.Object] {
    def this(props: SliderProps) = this()
    def this(props: SliderProps, context: Any) = this()
  }
  /* static members */
  object Slider {
    
    @JSImport("@blueprintjs/core/lib/esm/components/slider/slider", "Slider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/slider/slider", "Slider.defaultProps")
    @js.native
    def defaultProps: SliderProps = js.native
    inline def defaultProps_=(x: SliderProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/slider/slider", "Slider.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait ISliderProps
    extends StObject
       with ISliderBaseProps {
    
    /** A limited subset of HTML props to apply to the slider Handle */
    var handleHtmlProps: js.UndefOr[HandleHtmlProps] = js.undefined
    
    /**
      * Initial value of the slider. This determines the other end of the
      * track fill: from `initialValue` to `value`.
      *
      * @default 0
      */
    var initialValue: js.UndefOr[Double] = js.undefined
    
    /** Callback invoked when the value changes. */
    var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    /** Callback invoked when the handle is released. */
    var onRelease: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    /**
      * Value of slider.
      *
      * @default 0
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object ISliderProps {
    
    inline def apply(): ISliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISliderProps]
    }
    
    extension [Self <: ISliderProps](x: Self) {
      
      inline def setHandleHtmlProps(value: HandleHtmlProps): Self = StObject.set(x, "handleHtmlProps", value.asInstanceOf[js.Any])
      
      inline def setHandleHtmlPropsUndefined: Self = StObject.set(x, "handleHtmlProps", js.undefined)
      
      inline def setInitialValue(value: Double): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      inline def setOnChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnRelease(value: /* value */ Double => Unit): Self = StObject.set(x, "onRelease", js.Any.fromFunction1(value))
      
      inline def setOnReleaseUndefined: Self = StObject.set(x, "onRelease", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type SliderProps = ISliderProps
}
