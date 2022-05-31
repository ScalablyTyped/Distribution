package typings.d3SimpleSlider

import typings.d3SimpleSlider.mod.Slider
import typings.d3SimpleSlider.mod.SliderDomain
import typings.d3SimpleSlider.mod.SliderScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object d3 {
    
    @JSGlobal("d3")
    @js.native
    val ^ : js.Any = js.native
    
    inline def sliderBottom[Domain /* <: SliderDomain */](scale: SliderScale[Domain]): Slider[Domain] = ^.asInstanceOf[js.Dynamic].applyDynamic("sliderBottom")(scale.asInstanceOf[js.Any]).asInstanceOf[Slider[Domain]]
    
    inline def sliderLeft[Domain /* <: SliderDomain */](scale: SliderScale[Domain]): Slider[Domain] = ^.asInstanceOf[js.Dynamic].applyDynamic("sliderLeft")(scale.asInstanceOf[js.Any]).asInstanceOf[Slider[Domain]]
    
    inline def sliderRight[Domain /* <: SliderDomain */](scale: SliderScale[Domain]): Slider[Domain] = ^.asInstanceOf[js.Dynamic].applyDynamic("sliderRight")(scale.asInstanceOf[js.Any]).asInstanceOf[Slider[Domain]]
    
    inline def sliderTop[Domain /* <: SliderDomain */](scale: SliderScale[Domain]): Slider[Domain] = ^.asInstanceOf[js.Dynamic].applyDynamic("sliderTop")(scale.asInstanceOf[js.Any]).asInstanceOf[Slider[Domain]]
  }
}
