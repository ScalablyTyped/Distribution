package typings.chromecastCafSender.cast.framework

import typings.chrome.chrome.cast.media.PlayerState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavedPlayerState extends StObject {
  
  var currentTime: Double
  
  var isPaused: Boolean
  
  var mediaInfo: PlayerState | Null
}
object SavedPlayerState {
  
  inline def apply(currentTime: Double, isPaused: Boolean): SavedPlayerState = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], isPaused = isPaused.asInstanceOf[js.Any], mediaInfo = null)
    __obj.asInstanceOf[SavedPlayerState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SavedPlayerState] (val x: Self) extends AnyVal {
    
    inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    inline def setIsPaused(value: Boolean): Self = StObject.set(x, "isPaused", value.asInstanceOf[js.Any])
    
    inline def setMediaInfo(value: PlayerState): Self = StObject.set(x, "mediaInfo", value.asInstanceOf[js.Any])
    
    inline def setMediaInfoNull: Self = StObject.set(x, "mediaInfo", null)
  }
}
