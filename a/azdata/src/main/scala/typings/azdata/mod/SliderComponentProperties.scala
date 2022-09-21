package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderComponentProperties
  extends StObject
     with ComponentProperties {
  
  /**
    * The maximum value of the slider. Default value is 100.
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum value of the slider. Default value is 1.
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether to show the tick marks on the slider. Default is false.
    */
  var showTicks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The value between each "tick" of the slider. Default is 1.
    */
  var step: js.UndefOr[Double] = js.undefined
  
  /**
    * The value selected on the slider. Default initial value is the minimum value.
    */
  var value: js.UndefOr[Double] = js.undefined
}
object SliderComponentProperties {
  
  inline def apply(): SliderComponentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderComponentProperties]
  }
  
  extension [Self <: SliderComponentProperties](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setShowTicks(value: Boolean): Self = StObject.set(x, "showTicks", value.asInstanceOf[js.Any])
    
    inline def setShowTicksUndefined: Self = StObject.set(x, "showTicks", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
