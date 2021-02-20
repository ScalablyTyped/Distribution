package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.startInteractionIdentification()
@js.native
trait InteractionIdentificationConfig extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var callback: js.Any = js.native
  
  var delay: js.UndefOr[Double] = js.native
  
  var duration: Double = js.native
  
  var foregroundColor: String = js.native
  
  var resetOnInteraction: js.UndefOr[Boolean] = js.native
}
object InteractionIdentificationConfig {
  
  @scala.inline
  def apply(callback: js.Any, duration: Double, foregroundColor: String): InteractionIdentificationConfig = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], foregroundColor = foregroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionIdentificationConfig]
  }
  
  @scala.inline
  implicit class InteractionIdentificationConfigMutableBuilder[Self <: InteractionIdentificationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setCallback(value: js.Any): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForegroundColor(value: String): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetOnInteraction(value: Boolean): Self = StObject.set(x, "resetOnInteraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetOnInteractionUndefined: Self = StObject.set(x, "resetOnInteraction", js.undefined)
  }
}
