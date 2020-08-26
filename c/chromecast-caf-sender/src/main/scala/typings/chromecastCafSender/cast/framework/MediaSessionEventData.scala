package typings.chromecastCafSender.cast.framework

import typings.chrome.chrome.cast.media.Media
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaSessionEventData extends EventData {
  var mediaSession: Media = js.native
}

object MediaSessionEventData {
  @scala.inline
  def apply(mediaSession: Media, `type`: String): MediaSessionEventData = {
    val __obj = js.Dynamic.literal(mediaSession = mediaSession.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSessionEventData]
  }
  @scala.inline
  implicit class MediaSessionEventDataOps[Self <: MediaSessionEventData] (val x: Self) extends AnyVal {
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
    def setMediaSession(value: Media): Self = this.set("mediaSession", value.asInstanceOf[js.Any])
  }
  
}

