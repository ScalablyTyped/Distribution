package typings.chrome.global.chrome

import typings.chrome.chrome.wallpaper.WallpaperDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Wallpaper
////////////////////
/**
  * Use the chrome.wallpaper API to change the ChromeOS wallpaper.
  * Permissions:  "wallpaper"
  * Important: This API works only on Chrome OS.
  * @since Chrome 43.
  */
object wallpaper {
  
  @JSGlobal("chrome.wallpaper.setWallpaper")
  @js.native
  def setWallpaper(details: WallpaperDetails, callback: js.Function1[/* thumbnail */ js.Any, Unit]): Unit = js.native
}
