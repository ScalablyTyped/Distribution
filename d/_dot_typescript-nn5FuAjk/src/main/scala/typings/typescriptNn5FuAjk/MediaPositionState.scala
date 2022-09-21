package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaPositionState extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var playbackRate: js.UndefOr[Double] = js.undefined
  
  var position: js.UndefOr[Double] = js.undefined
}
object MediaPositionState {
  
  inline def apply(): MediaPositionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaPositionState]
  }
  
  extension [Self <: MediaPositionState](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
    
    inline def setPlaybackRateUndefined: Self = StObject.set(x, "playbackRate", js.undefined)
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
