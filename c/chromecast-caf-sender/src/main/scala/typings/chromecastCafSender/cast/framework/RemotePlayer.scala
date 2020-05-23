package typings.chromecastCafSender.cast.framework

import typings.chrome.chrome.cast.media.LiveSeekableRange
import typings.chrome.chrome.cast.media.MediaInfo
import typings.chrome.chrome.cast.media.PlayerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemotePlayer extends js.Object {
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
    volumeLevel: Double,
    controller: RemotePlayerController = null,
    imageUrl: String = null,
    liveSeekableRange: LiveSeekableRange = null,
    mediaInfo: MediaInfo = null,
    playerState: PlayerState = null,
    savedPlayerState: SavedPlayerState = null
  ): RemotePlayer = {
    val __obj = js.Dynamic.literal(canControlVolume = canControlVolume.asInstanceOf[js.Any], canPause = canPause.asInstanceOf[js.Any], canSeek = canSeek.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], displayStatus = displayStatus.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], isConnected = isConnected.asInstanceOf[js.Any], isMediaLoaded = isMediaLoaded.asInstanceOf[js.Any], isMuted = isMuted.asInstanceOf[js.Any], isPaused = isPaused.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], volumeLevel = volumeLevel.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], playerState = playerState.asInstanceOf[js.Any], savedPlayerState = savedPlayerState.asInstanceOf[js.Any])
    if (liveSeekableRange != null) __obj.updateDynamic("liveSeekableRange")(liveSeekableRange.asInstanceOf[js.Any])
    if (mediaInfo != null) __obj.updateDynamic("mediaInfo")(mediaInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemotePlayer]
  }
}

