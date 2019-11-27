package typings.chromecastDashCafDashSender.cast.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedPlayerState extends js.Object {
  var currentTime: Double
  var isPaused: Boolean
  var mediaInfo: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify chrome.cast.media.PlayerState */ js.Any) | Null
}

object SavedPlayerState {
  @scala.inline
  def apply(
    currentTime: Double,
    isPaused: Boolean,
    mediaInfo: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify chrome.cast.media.PlayerState */ js.Any = null
  ): SavedPlayerState = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], isPaused = isPaused.asInstanceOf[js.Any])
    if (mediaInfo != null) __obj.updateDynamic("mediaInfo")(mediaInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedPlayerState]
  }
}

