package typings.chromecastCafSender.cast.framework

import typings.chrome.chrome.cast.media.Media
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaSessionEventData extends EventData {
  var mediaSession: Media
}

object MediaSessionEventData {
  @scala.inline
  def apply(mediaSession: Media, `type`: String): MediaSessionEventData = {
    val __obj = js.Dynamic.literal(mediaSession = mediaSession.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSessionEventData]
  }
}

