package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.startInteractionIdentification()
trait InteractionIdentificationConfig extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var callback: Any
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var duration: Double
  
  var foregroundColor: String
  
  var resetOnInteraction: js.UndefOr[Boolean] = js.undefined
}
object InteractionIdentificationConfig {
  
  inline def apply(callback: Any, duration: Double, foregroundColor: String): InteractionIdentificationConfig = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], foregroundColor = foregroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionIdentificationConfig]
  }
  
  extension [Self <: InteractionIdentificationConfig](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setCallback(value: Any): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setForegroundColor(value: String): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
    
    inline def setResetOnInteraction(value: Boolean): Self = StObject.set(x, "resetOnInteraction", value.asInstanceOf[js.Any])
    
    inline def setResetOnInteractionUndefined: Self = StObject.set(x, "resetOnInteraction", js.undefined)
  }
}
