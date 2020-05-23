package typings.chrome.global.chrome

import typings.chrome.chrome.wallpaper.WallpaperDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// Wallpaper
////////////////////
/**
  * Use the chrome.wallpaper API to change the ChromeOS wallpaper.
  * Permissions:  "wallpaper"
  * Important: This API works only on Chrome OS.
  * @since Chrome 43.
  */
@JSGlobal("chrome.wallpaper")
@js.native
object wallpaper extends js.Object {
  def setWallpaper(details: WallpaperDetails, callback: js.Function1[/* thumbnail */ js.Any, Unit]): Unit = js.native
}

