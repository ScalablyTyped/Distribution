package typings.bootstrapSlider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * This class is actually not used when using the jQuery version of bootstrap-slider
    * The method documentation is still here thouh.
    * When using jQuery, slider methods like setValue(3, true) have to be called like $slider.slider('setValue', 3, true)
    */
  @JSGlobal("Slider")
  @js.native
  class Slider protected ()
    extends StObject
       with typings.bootstrapSlider.Slider {
    def this(selector: String, opts: SliderOptions) = this()
  }
}
