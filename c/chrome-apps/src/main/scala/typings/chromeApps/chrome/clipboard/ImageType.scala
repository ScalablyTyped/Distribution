package typings.chromeApps.chrome.clipboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Image type */
/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.png
  - typings.chromeApps.chromeAppsStrings.jpeg
*/
trait ImageType extends js.Object

object ImageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def jpeg: typings.chromeApps.chromeAppsStrings.jpeg = this.cast("jpeg")
  @scala.inline
  def png: typings.chromeApps.chromeAppsStrings.png = this.cast("png")
}

