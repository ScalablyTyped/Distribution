package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.easeOutCubic
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.linear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseGaugeAnimation extends StObject {
  
  /**
    * Determines how long animation runs.
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the animation easing mode.
    */
  var easing: js.UndefOr[easeOutCubic | linear] = js.undefined
  
  /**
    * Indicates whether or not animation is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object BaseGaugeAnimation {
  
  inline def apply(): BaseGaugeAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseGaugeAnimation]
  }
  
  extension [Self <: BaseGaugeAnimation](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: easeOutCubic | linear): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
