package typings.bootstrapSlider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  /**
    * This class is actually not used when using the jQuery version of bootstrap-slider
    * The method documentation is still here thouh.
    * When using jQuery, slider methods like setValue(3, true) have to be called like $slider.slider('setValue', 3, true)
    */
  @js.native
  class Slider protected ()
    extends typings.bootstrapSlider.Slider {
    def this(selector: String, opts: SliderOptions) = this()
  }
}
