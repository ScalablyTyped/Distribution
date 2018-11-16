package typings
package chromecastDashCafDashSenderLib.castNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("cast.framework.RemotePlayer")
@js.native
class RemotePlayer () extends js.Object {
  var canControlVolume: scala.Boolean = js.native
  var canPause: scala.Boolean = js.native
  var canSeek: scala.Boolean = js.native
  var controller: RemotePlayerController | scala.Null = js.native
  var currentTime: scala.Double = js.native
  var displayName: java.lang.String = js.native
  var displayStatus: java.lang.String = js.native
  var duration: scala.Double = js.native
  var imageUrl: java.lang.String | scala.Null = js.native
  var isConnected: scala.Boolean = js.native
  var isMediaLoaded: scala.Boolean = js.native
  var isMuted: scala.Boolean = js.native
  var isPaused: scala.Boolean = js.native
  var mediaInfo: js.UndefOr[chromeLib.chromeNs.castNs.mediaNs.MediaInfo] = js.native
  var playerState: chromeLib.chromeNs.castNs.mediaNs.PlayerState | scala.Null = js.native
  var savedPlayerState: SavedPlayerState | scala.Null = js.native
  var statusText: java.lang.String = js.native
  var title: java.lang.String = js.native
  var volumeLevel: scala.Double = js.native
}

