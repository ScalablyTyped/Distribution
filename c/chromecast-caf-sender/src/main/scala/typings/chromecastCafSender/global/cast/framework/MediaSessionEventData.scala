package typings.chromecastCafSender.global.cast.framework

import typings.chrome.chrome.cast.media.Media
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("cast.framework.MediaSessionEventData")
@js.native
class MediaSessionEventData protected ()
  extends typings.chromecastCafSender.cast.framework.MediaSessionEventData {
  def this(mediaSession: Media) = this()
  /* CompleteClass */
  override var mediaSession: Media = js.native
  /* CompleteClass */
  override var `type`: String = js.native
}

