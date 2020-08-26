package typings.chromecastCafSender.cast.framework

import typings.chrome.chrome.cast.media.PlayerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedPlayerState extends js.Object {
  var currentTime: Double = js.native
  var isPaused: Boolean = js.native
  var mediaInfo: PlayerState | Null = js.native
}

object SavedPlayerState {
  @scala.inline
  def apply(currentTime: Double, isPaused: Boolean): SavedPlayerState = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], isPaused = isPaused.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedPlayerState]
  }
  @scala.inline
  implicit class SavedPlayerStateOps[Self <: SavedPlayerState] (val x: Self) extends AnyVal {
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
    def setCurrentTime(value: Double): Self = this.set("currentTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPaused(value: Boolean): Self = this.set("isPaused", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaInfo(value: PlayerState): Self = this.set("mediaInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaInfoNull: Self = this.set("mediaInfo", null)
  }
  
}

