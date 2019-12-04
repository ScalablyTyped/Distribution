package typings.chromecastDashCafDashSender.cast.framework

import typings.chrome.chrome.cast.media.Media
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("cast.framework.MediaSessionEventData")
@js.native
class MediaSessionEventData protected () extends EventData {
  def this(mediaSession: Media) = this()
  var mediaSession: Media = js.native
}

