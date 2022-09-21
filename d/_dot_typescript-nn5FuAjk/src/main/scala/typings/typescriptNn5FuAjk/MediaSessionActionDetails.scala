package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaSessionActionDetails extends StObject {
  
  var action: MediaSessionAction
  
  var fastSeek: js.UndefOr[scala.Boolean | Null] = js.undefined
  
  var seekOffset: js.UndefOr[Double | Null] = js.undefined
  
  var seekTime: js.UndefOr[Double | Null] = js.undefined
}
object MediaSessionActionDetails {
  
  inline def apply(action: MediaSessionAction): MediaSessionActionDetails = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSessionActionDetails]
  }
  
  extension [Self <: MediaSessionActionDetails](x: Self) {
    
    inline def setAction(value: MediaSessionAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setFastSeek(value: scala.Boolean): Self = StObject.set(x, "fastSeek", value.asInstanceOf[js.Any])
    
    inline def setFastSeekNull: Self = StObject.set(x, "fastSeek", null)
    
    inline def setFastSeekUndefined: Self = StObject.set(x, "fastSeek", js.undefined)
    
    inline def setSeekOffset(value: Double): Self = StObject.set(x, "seekOffset", value.asInstanceOf[js.Any])
    
    inline def setSeekOffsetNull: Self = StObject.set(x, "seekOffset", null)
    
    inline def setSeekOffsetUndefined: Self = StObject.set(x, "seekOffset", js.undefined)
    
    inline def setSeekTime(value: Double): Self = StObject.set(x, "seekTime", value.asInstanceOf[js.Any])
    
    inline def setSeekTimeNull: Self = StObject.set(x, "seekTime", null)
    
    inline def setSeekTimeUndefined: Self = StObject.set(x, "seekTime", js.undefined)
  }
}
