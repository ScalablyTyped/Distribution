package typings.chromecastCafSender.global.cast.framework

import typings.chrome.chrome.cast.media.PlayerState
import typings.chromecastCafSender.cast.framework.SavedPlayerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("cast.framework.RemotePlayer")
@js.native
class RemotePlayer ()
  extends typings.chromecastCafSender.cast.framework.RemotePlayer {
  /* CompleteClass */
  override var canControlVolume: Boolean = js.native
  /* CompleteClass */
  override var canPause: Boolean = js.native
  /* CompleteClass */
  override var canSeek: Boolean = js.native
  /* CompleteClass */
  override var controller: typings.chromecastCafSender.cast.framework.RemotePlayerController | Null = js.native
  /* CompleteClass */
  override var currentTime: Double = js.native
  /* CompleteClass */
  override var displayName: String = js.native
  /* CompleteClass */
  override var displayStatus: String = js.native
  /* CompleteClass */
  override var duration: Double = js.native
  /* CompleteClass */
  override var imageUrl: String | Null = js.native
  /* CompleteClass */
  override var isConnected: Boolean = js.native
  /* CompleteClass */
  override var isMediaLoaded: Boolean = js.native
  /* CompleteClass */
  override var isMuted: Boolean = js.native
  /* CompleteClass */
  override var isPaused: Boolean = js.native
  /* CompleteClass */
  override var playerState: PlayerState | Null = js.native
  /* CompleteClass */
  override var savedPlayerState: SavedPlayerState | Null = js.native
  /* CompleteClass */
  override var statusText: String = js.native
  /* CompleteClass */
  override var title: String = js.native
  /* CompleteClass */
  override var volumeLevel: Double = js.native
}

