package typings
package chromeLib.chromeNs.wallpaperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.wallpaper")
@js.native
object ^ extends js.Object {
  def setWallpaper(
    details: chromeLib.chromeNs.wallpaperNs.WallpaperDetails,
    callback: js.Function1[/* thumbnail */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

