package typings.chromecastCafSender.cast.framework

import typings.chrome.chrome.cast.media.LiveSeekableRange
import typings.chrome.chrome.cast.media.MediaInfo
import typings.chrome.chrome.cast.media.PlayerState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemotePlayer extends StObject {
  
  var canControlVolume: Boolean
  
  var canPause: Boolean
  
  var canSeek: Boolean
  
  var controller: RemotePlayerController | Null
  
  var currentTime: Double
  
  var displayName: String
  
  var displayStatus: String
  
  var duration: Double
  
  var imageUrl: String | Null
  
  var isConnected: Boolean
  
  var isMediaLoaded: Boolean
  
  var isMuted: Boolean
  
  var isPaused: Boolean
  
  var liveSeekableRange: js.UndefOr[LiveSeekableRange] = js.undefined
  
  var mediaInfo: js.UndefOr[MediaInfo] = js.undefined
  
  var playerState: PlayerState | Null
  
  var savedPlayerState: SavedPlayerState | Null
  
  var statusText: String
  
  var title: String
  
  var volumeLevel: Double
}
object RemotePlayer {
  
  inline def apply(
    canControlVolume: Boolean,
    canPause: Boolean,
    canSeek: Boolean,
    currentTime: Double,
    displayName: String,
    displayStatus: String,
    duration: Double,
    isConnected: Boolean,
    isMediaLoaded: Boolean,
    isMuted: Boolean,
    isPaused: Boolean,
    statusText: String,
    title: String,
    volumeLevel: Double
  ): RemotePlayer = {
    val __obj = js.Dynamic.literal(canControlVolume = canControlVolume.asInstanceOf[js.Any], canPause = canPause.asInstanceOf[js.Any], canSeek = canSeek.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], displayStatus = displayStatus.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], isConnected = isConnected.asInstanceOf[js.Any], isMediaLoaded = isMediaLoaded.asInstanceOf[js.Any], isMuted = isMuted.asInstanceOf[js.Any], isPaused = isPaused.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], volumeLevel = volumeLevel.asInstanceOf[js.Any], controller = null, imageUrl = null, playerState = null, savedPlayerState = null)
    __obj.asInstanceOf[RemotePlayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemotePlayer] (val x: Self) extends AnyVal {
    
    inline def setCanControlVolume(value: Boolean): Self = StObject.set(x, "canControlVolume", value.asInstanceOf[js.Any])
    
    inline def setCanPause(value: Boolean): Self = StObject.set(x, "canPause", value.asInstanceOf[js.Any])
    
    inline def setCanSeek(value: Boolean): Self = StObject.set(x, "canSeek", value.asInstanceOf[js.Any])
    
    inline def setController(value: RemotePlayerController): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerNull: Self = StObject.set(x, "controller", null)
    
    inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayStatus(value: String): Self = StObject.set(x, "displayStatus", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlNull: Self = StObject.set(x, "imageUrl", null)
    
    inline def setIsConnected(value: Boolean): Self = StObject.set(x, "isConnected", value.asInstanceOf[js.Any])
    
    inline def setIsMediaLoaded(value: Boolean): Self = StObject.set(x, "isMediaLoaded", value.asInstanceOf[js.Any])
    
    inline def setIsMuted(value: Boolean): Self = StObject.set(x, "isMuted", value.asInstanceOf[js.Any])
    
    inline def setIsPaused(value: Boolean): Self = StObject.set(x, "isPaused", value.asInstanceOf[js.Any])
    
    inline def setLiveSeekableRange(value: LiveSeekableRange): Self = StObject.set(x, "liveSeekableRange", value.asInstanceOf[js.Any])
    
    inline def setLiveSeekableRangeUndefined: Self = StObject.set(x, "liveSeekableRange", js.undefined)
    
    inline def setMediaInfo(value: MediaInfo): Self = StObject.set(x, "mediaInfo", value.asInstanceOf[js.Any])
    
    inline def setMediaInfoUndefined: Self = StObject.set(x, "mediaInfo", js.undefined)
    
    inline def setPlayerState(value: PlayerState): Self = StObject.set(x, "playerState", value.asInstanceOf[js.Any])
    
    inline def setPlayerStateNull: Self = StObject.set(x, "playerState", null)
    
    inline def setSavedPlayerState(value: SavedPlayerState): Self = StObject.set(x, "savedPlayerState", value.asInstanceOf[js.Any])
    
    inline def setSavedPlayerStateNull: Self = StObject.set(x, "savedPlayerState", null)
    
    inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setVolumeLevel(value: Double): Self = StObject.set(x, "volumeLevel", value.asInstanceOf[js.Any])
  }
}
