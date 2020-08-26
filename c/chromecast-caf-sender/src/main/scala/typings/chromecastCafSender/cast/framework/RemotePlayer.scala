package typings.chromecastCafSender.cast.framework

import typings.chrome.chrome.cast.media.LiveSeekableRange
import typings.chrome.chrome.cast.media.MediaInfo
import typings.chrome.chrome.cast.media.PlayerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemotePlayer extends js.Object {
  var canControlVolume: Boolean = js.native
  var canPause: Boolean = js.native
  var canSeek: Boolean = js.native
  var controller: RemotePlayerController | Null = js.native
  var currentTime: Double = js.native
  var displayName: String = js.native
  var displayStatus: String = js.native
  var duration: Double = js.native
  var imageUrl: String | Null = js.native
  var isConnected: Boolean = js.native
  var isMediaLoaded: Boolean = js.native
  var isMuted: Boolean = js.native
  var isPaused: Boolean = js.native
  var liveSeekableRange: js.UndefOr[LiveSeekableRange] = js.native
  var mediaInfo: js.UndefOr[MediaInfo] = js.native
  var playerState: PlayerState | Null = js.native
  var savedPlayerState: SavedPlayerState | Null = js.native
  var statusText: String = js.native
  var title: String = js.native
  var volumeLevel: Double = js.native
}

object RemotePlayer {
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal(canControlVolume = canControlVolume.asInstanceOf[js.Any], canPause = canPause.asInstanceOf[js.Any], canSeek = canSeek.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], displayStatus = displayStatus.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], isConnected = isConnected.asInstanceOf[js.Any], isMediaLoaded = isMediaLoaded.asInstanceOf[js.Any], isMuted = isMuted.asInstanceOf[js.Any], isPaused = isPaused.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], volumeLevel = volumeLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemotePlayer]
  }
  @scala.inline
  implicit class RemotePlayerOps[Self <: RemotePlayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCanControlVolume(value: Boolean): Self = this.set("canControlVolume", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanPause(value: Boolean): Self = this.set("canPause", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanSeek(value: Boolean): Self = this.set("canSeek", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentTime(value: Double): Self = this.set("currentTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayStatus(value: String): Self = this.set("displayStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsConnected(value: Boolean): Self = this.set("isConnected", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMediaLoaded(value: Boolean): Self = this.set("isMediaLoaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMuted(value: Boolean): Self = this.set("isMuted", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPaused(value: Boolean): Self = this.set("isPaused", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusText(value: String): Self = this.set("statusText", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolumeLevel(value: Double): Self = this.set("volumeLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setController(value: RemotePlayerController): Self = this.set("controller", value.asInstanceOf[js.Any])
    @scala.inline
    def setControllerNull: Self = this.set("controller", null)
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageUrlNull: Self = this.set("imageUrl", null)
    @scala.inline
    def setLiveSeekableRange(value: LiveSeekableRange): Self = this.set("liveSeekableRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiveSeekableRange: Self = this.set("liveSeekableRange", js.undefined)
    @scala.inline
    def setMediaInfo(value: MediaInfo): Self = this.set("mediaInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaInfo: Self = this.set("mediaInfo", js.undefined)
    @scala.inline
    def setPlayerState(value: PlayerState): Self = this.set("playerState", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlayerStateNull: Self = this.set("playerState", null)
    @scala.inline
    def setSavedPlayerState(value: SavedPlayerState): Self = this.set("savedPlayerState", value.asInstanceOf[js.Any])
    @scala.inline
    def setSavedPlayerStateNull: Self = this.set("savedPlayerState", null)
  }
  
}

