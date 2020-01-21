package typings.chromeApps.chrome.wallpaper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.STRETCH
  - typings.chromeApps.chromeAppsStrings.CENTER
  - typings.chromeApps.chromeAppsStrings.CENTER_CROPPED
*/
trait WallpaperLayoutType extends js.Object

object WallpaperLayoutType {
  @scala.inline
  def CENTER: typings.chromeApps.chromeAppsStrings.CENTER = this.cast("CENTER")
  @scala.inline
  def CENTER_CROPPED: typings.chromeApps.chromeAppsStrings.CENTER_CROPPED = this.cast("CENTER_CROPPED")
  @scala.inline
  def STRETCH: typings.chromeApps.chromeAppsStrings.STRETCH = this.cast("STRETCH")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

