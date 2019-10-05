package typings.chromecastDashCafDashSender.cast.framework

import typings.chrome.chrome.cast.media.PlayerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedPlayerState extends js.Object {
  var currentTime: Double
  var isPaused: Boolean
  var mediaInfo: PlayerState | Null
}

object SavedPlayerState {
  @scala.inline
  def apply(currentTime: Double, isPaused: Boolean, mediaInfo: PlayerState = null): SavedPlayerState = {
    val __obj = js.Dynamic.literal(currentTime = currentTime, isPaused = isPaused)
    if (mediaInfo != null) __obj.updateDynamic("mediaInfo")(mediaInfo)
    __obj.asInstanceOf[SavedPlayerState]
  }
}

