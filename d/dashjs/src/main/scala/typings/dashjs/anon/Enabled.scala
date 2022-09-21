package typings.dashjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enabled extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var latencyThreshold: js.UndefOr[Double] = js.undefined
  
  var maxDrift: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
  
  var playbackBufferMin: js.UndefOr[Double] = js.undefined
  
  var playbackRate: js.UndefOr[Double] = js.undefined
}
object Enabled {
  
  inline def apply(): Enabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enabled]
  }
  
  extension [Self <: Enabled](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setLatencyThreshold(value: Double): Self = StObject.set(x, "latencyThreshold", value.asInstanceOf[js.Any])
    
    inline def setLatencyThresholdUndefined: Self = StObject.set(x, "latencyThreshold", js.undefined)
    
    inline def setMaxDrift(value: Double): Self = StObject.set(x, "maxDrift", value.asInstanceOf[js.Any])
    
    inline def setMaxDriftUndefined: Self = StObject.set(x, "maxDrift", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setPlaybackBufferMin(value: Double): Self = StObject.set(x, "playbackBufferMin", value.asInstanceOf[js.Any])
    
    inline def setPlaybackBufferMinUndefined: Self = StObject.set(x, "playbackBufferMin", js.undefined)
    
    inline def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
    
    inline def setPlaybackRateUndefined: Self = StObject.set(x, "playbackRate", js.undefined)
  }
}
