package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveSeekableRange extends StObject {
  
  var end: js.UndefOr[Double] = js.undefined
  
  var isLiveDone: js.UndefOr[Boolean] = js.undefined
  
  var isMovingWindow: js.UndefOr[Boolean] = js.undefined
  
  var start: js.UndefOr[Double] = js.undefined
}
object LiveSeekableRange {
  
  inline def apply(): LiveSeekableRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveSeekableRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LiveSeekableRange] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setIsLiveDone(value: Boolean): Self = StObject.set(x, "isLiveDone", value.asInstanceOf[js.Any])
    
    inline def setIsLiveDoneUndefined: Self = StObject.set(x, "isLiveDone", js.undefined)
    
    inline def setIsMovingWindow(value: Boolean): Self = StObject.set(x, "isMovingWindow", value.asInstanceOf[js.Any])
    
    inline def setIsMovingWindowUndefined: Self = StObject.set(x, "isMovingWindow", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
