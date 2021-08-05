package typings.cesium.anon

import typings.cesium.mod.JulianDate
import typings.cesium.mod.ModelAnimationLoop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delay extends StObject {
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var loop: js.UndefOr[ModelAnimationLoop] = js.undefined
  
  var name: String
  
  var removeOnStop: js.UndefOr[Boolean] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var speedup: js.UndefOr[Double] = js.undefined
  
  var startTime: js.UndefOr[JulianDate] = js.undefined
  
  var stopTime: js.UndefOr[JulianDate] = js.undefined
}
object Delay {
  
  inline def apply(name: String): Delay = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delay]
  }
  
  extension [Self <: Delay](x: Self) {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setLoop(value: ModelAnimationLoop): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRemoveOnStop(value: Boolean): Self = StObject.set(x, "removeOnStop", value.asInstanceOf[js.Any])
    
    inline def setRemoveOnStopUndefined: Self = StObject.set(x, "removeOnStop", js.undefined)
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setSpeedup(value: Double): Self = StObject.set(x, "speedup", value.asInstanceOf[js.Any])
    
    inline def setSpeedupUndefined: Self = StObject.set(x, "speedup", js.undefined)
    
    inline def setStartTime(value: JulianDate): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStopTime(value: JulianDate): Self = StObject.set(x, "stopTime", value.asInstanceOf[js.Any])
    
    inline def setStopTimeUndefined: Self = StObject.set(x, "stopTime", js.undefined)
  }
}
