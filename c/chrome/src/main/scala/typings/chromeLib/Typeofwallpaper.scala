package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofwallpaper extends js.Object {
  def setWallpaper(
    details: chromeLib.chromeNs.wallpaperNs.WallpaperDetails,
    callback: js.Function1[/* thumbnail */ js.Any, scala.Unit]
  ): scala.Unit
}

object Typeofwallpaper {
  @scala.inline
  def apply(
    setWallpaper: (chromeLib.chromeNs.wallpaperNs.WallpaperDetails, js.Function1[/* thumbnail */ js.Any, scala.Unit]) => scala.Unit
  ): Typeofwallpaper = {
    val __obj = js.Dynamic.literal(setWallpaper = js.Any.fromFunction2(setWallpaper))
  
    __obj.asInstanceOf[Typeofwallpaper]
  }
}

