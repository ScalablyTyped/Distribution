package typings.chromecastCafSender.cast.framework

import typings.chrome.chrome.cast.media.MediaInfo
import typings.chrome.chrome.cast.media.PlayerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("cast.framework.RemotePlayer")
@js.native
class RemotePlayer () extends js.Object {
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
  var mediaInfo: js.UndefOr[MediaInfo] = js.native
  var playerState: PlayerState | Null = js.native
  var savedPlayerState: SavedPlayerState | Null = js.native
  var statusText: String = js.native
  var title: String = js.native
  var volumeLevel: Double = js.native
}

