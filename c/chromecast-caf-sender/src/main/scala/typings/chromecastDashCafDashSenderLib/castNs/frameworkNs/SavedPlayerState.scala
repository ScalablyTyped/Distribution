package typings
package chromecastDashCafDashSenderLib.castNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedPlayerState extends js.Object {
  var currentTime: scala.Double
  var isPaused: scala.Boolean
  var mediaInfo: chromeLib.chromeNs.castNs.mediaNs.PlayerState | scala.Null
}

object SavedPlayerState {
  @scala.inline
  def apply(
    currentTime: scala.Double,
    isPaused: scala.Boolean,
    mediaInfo: chromeLib.chromeNs.castNs.mediaNs.PlayerState = null
  ): SavedPlayerState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currentTime")(currentTime)
    __obj.updateDynamic("isPaused")(isPaused)
    if (mediaInfo != null) __obj.updateDynamic("mediaInfo")(mediaInfo)
    __obj.asInstanceOf[SavedPlayerState]
  }
}

