package typings.carbonComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<carbon-components.carbon-components/components/slider/slider.SliderOptions> */
trait PartialSliderOptions extends StObject {
  
  var classDisabled: js.UndefOr[String] = js.undefined
  
  var classThumbClicked: js.UndefOr[String] = js.undefined
  
  var eventAfterSliderValueChange: js.UndefOr[String] = js.undefined
  
  var eventBeforeSliderValueChange: js.UndefOr[String] = js.undefined
  
  var selectorFilledTrack: js.UndefOr[String] = js.undefined
  
  var selectorInit: js.UndefOr[String] = js.undefined
  
  var selectorInput: js.UndefOr[String] = js.undefined
  
  var selectorThumb: js.UndefOr[String] = js.undefined
  
  var selectorTrack: js.UndefOr[String] = js.undefined
  
  var stepMultiplier: js.UndefOr[Double] = js.undefined
}
object PartialSliderOptions {
  
  inline def apply(): PartialSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSliderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialSliderOptions] (val x: Self) extends AnyVal {
    
    inline def setClassDisabled(value: String): Self = StObject.set(x, "classDisabled", value.asInstanceOf[js.Any])
    
    inline def setClassDisabledUndefined: Self = StObject.set(x, "classDisabled", js.undefined)
    
    inline def setClassThumbClicked(value: String): Self = StObject.set(x, "classThumbClicked", value.asInstanceOf[js.Any])
    
    inline def setClassThumbClickedUndefined: Self = StObject.set(x, "classThumbClicked", js.undefined)
    
    inline def setEventAfterSliderValueChange(value: String): Self = StObject.set(x, "eventAfterSliderValueChange", value.asInstanceOf[js.Any])
    
    inline def setEventAfterSliderValueChangeUndefined: Self = StObject.set(x, "eventAfterSliderValueChange", js.undefined)
    
    inline def setEventBeforeSliderValueChange(value: String): Self = StObject.set(x, "eventBeforeSliderValueChange", value.asInstanceOf[js.Any])
    
    inline def setEventBeforeSliderValueChangeUndefined: Self = StObject.set(x, "eventBeforeSliderValueChange", js.undefined)
    
    inline def setSelectorFilledTrack(value: String): Self = StObject.set(x, "selectorFilledTrack", value.asInstanceOf[js.Any])
    
    inline def setSelectorFilledTrackUndefined: Self = StObject.set(x, "selectorFilledTrack", js.undefined)
    
    inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
    
    inline def setSelectorInitUndefined: Self = StObject.set(x, "selectorInit", js.undefined)
    
    inline def setSelectorInput(value: String): Self = StObject.set(x, "selectorInput", value.asInstanceOf[js.Any])
    
    inline def setSelectorInputUndefined: Self = StObject.set(x, "selectorInput", js.undefined)
    
    inline def setSelectorThumb(value: String): Self = StObject.set(x, "selectorThumb", value.asInstanceOf[js.Any])
    
    inline def setSelectorThumbUndefined: Self = StObject.set(x, "selectorThumb", js.undefined)
    
    inline def setSelectorTrack(value: String): Self = StObject.set(x, "selectorTrack", value.asInstanceOf[js.Any])
    
    inline def setSelectorTrackUndefined: Self = StObject.set(x, "selectorTrack", js.undefined)
    
    inline def setStepMultiplier(value: Double): Self = StObject.set(x, "stepMultiplier", value.asInstanceOf[js.Any])
    
    inline def setStepMultiplierUndefined: Self = StObject.set(x, "stepMultiplier", js.undefined)
  }
}
