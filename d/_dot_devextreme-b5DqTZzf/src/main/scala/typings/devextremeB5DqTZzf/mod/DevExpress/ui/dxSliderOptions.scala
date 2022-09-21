package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxSliderOptions
  extends StObject
     with dxSliderBaseOptions[dxSlider] {
  
  /**
    * The current slider value.
    */
  @JSName("value")
  var value_dxSliderOptions: js.UndefOr[Double] = js.undefined
}
object dxSliderOptions {
  
  inline def apply(): dxSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSliderOptions]
  }
  
  extension [Self <: dxSliderOptions](x: Self) {
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
