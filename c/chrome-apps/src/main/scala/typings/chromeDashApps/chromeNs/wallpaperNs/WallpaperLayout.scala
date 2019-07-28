package typings.chromeDashApps.chromeNs.wallpaperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WallpaperLayout extends js.Object

@JSGlobal("chrome.wallpaper.WallpaperLayout")
@js.native
object WallpaperLayout extends js.Object {
  @js.native
  sealed trait CENTER extends WallpaperLayout
  
  @js.native
  sealed trait CENTER_CROPPED extends WallpaperLayout
  
  @js.native
  sealed trait STRETCH extends WallpaperLayout
  
  /* "CENTER" */ val CENTER: typings.chromeDashApps.chromeNs.wallpaperNs.WallpaperLayout.CENTER with String = js.native
  /* "CENTER_CROPPED" */ val CENTER_CROPPED: typings.chromeDashApps.chromeNs.wallpaperNs.WallpaperLayout.CENTER_CROPPED with String = js.native
  /* "STRETCH" */ val STRETCH: typings.chromeDashApps.chromeNs.wallpaperNs.WallpaperLayout.STRETCH with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WallpaperLayout with String] = js.native
}

