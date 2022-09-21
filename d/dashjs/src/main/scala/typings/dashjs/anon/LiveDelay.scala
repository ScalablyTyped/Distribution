package typings.dashjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveDelay extends StObject {
  
  var liveDelay: js.UndefOr[Double] = js.undefined
  
  var liveDelayFragmentCount: js.UndefOr[Double] = js.undefined
  
  var useSuggestedPresentationDelay: js.UndefOr[Boolean] = js.undefined
}
object LiveDelay {
  
  inline def apply(): LiveDelay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveDelay]
  }
  
  extension [Self <: LiveDelay](x: Self) {
    
    inline def setLiveDelay(value: Double): Self = StObject.set(x, "liveDelay", value.asInstanceOf[js.Any])
    
    inline def setLiveDelayFragmentCount(value: Double): Self = StObject.set(x, "liveDelayFragmentCount", value.asInstanceOf[js.Any])
    
    inline def setLiveDelayFragmentCountUndefined: Self = StObject.set(x, "liveDelayFragmentCount", js.undefined)
    
    inline def setLiveDelayUndefined: Self = StObject.set(x, "liveDelay", js.undefined)
    
    inline def setUseSuggestedPresentationDelay(value: Boolean): Self = StObject.set(x, "useSuggestedPresentationDelay", value.asInstanceOf[js.Any])
    
    inline def setUseSuggestedPresentationDelayUndefined: Self = StObject.set(x, "useSuggestedPresentationDelay", js.undefined)
  }
}
