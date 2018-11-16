package typings
package chromeDashAppsLib.chromeNs.wallpaperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WallpaperLayout extends js.Object

@JSGlobal("chrome.wallpaper.WallpaperLayout")
@js.native
object WallpaperLayout extends js.Object {
  @js.native
  sealed trait CENTER
    extends chromeDashAppsLib.chromeNs.wallpaperNs.WallpaperLayout
  
  @js.native
  sealed trait CENTER_CROPPED
    extends chromeDashAppsLib.chromeNs.wallpaperNs.WallpaperLayout
  
  @js.native
  sealed trait STRETCH
    extends chromeDashAppsLib.chromeNs.wallpaperNs.WallpaperLayout
  
  /* "CENTER" */ val CENTER: CENTER with java.lang.String = js.native
  /* "CENTER_CROPPED" */ val CENTER_CROPPED: CENTER_CROPPED with java.lang.String = js.native
  /* "STRETCH" */ val STRETCH: STRETCH with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[chromeDashAppsLib.chromeNs.wallpaperNs.WallpaperLayout with java.lang.String] = js.native
}

