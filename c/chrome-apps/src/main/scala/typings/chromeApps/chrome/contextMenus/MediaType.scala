package typings.chromeApps.chrome.contextMenus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.image
  - typings.chromeApps.chromeAppsStrings.video
  - typings.chromeApps.chromeAppsStrings.audio
*/
trait MediaType extends js.Object

object MediaType {
  @scala.inline
  def audio: typings.chromeApps.chromeAppsStrings.audio = this.cast("audio")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def image: typings.chromeApps.chromeAppsStrings.image = this.cast("image")
  @scala.inline
  def video: typings.chromeApps.chromeAppsStrings.video = this.cast("video")
}

