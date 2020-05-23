package typings.chrome.anon

import typings.chrome.chrome.wallpaper.WallpaperDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofwallpaper extends js.Object {
  def setWallpaper(details: WallpaperDetails, callback: js.Function1[/* thumbnail */ js.Any, Unit]): Unit
}

object Typeofwallpaper {
  @scala.inline
  def apply(setWallpaper: (WallpaperDetails, js.Function1[/* thumbnail */ js.Any, Unit]) => Unit): Typeofwallpaper = {
    val __obj = js.Dynamic.literal(setWallpaper = js.Any.fromFunction2(setWallpaper))
    __obj.asInstanceOf[Typeofwallpaper]
  }
}

