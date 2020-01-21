package typings.chromeApps.chrome.wallpaper

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WallpaperLayout with String] = js.native
  /* "CENTER" */ @js.native
  object CENTER extends TopLevel[CENTER with String]
  
  /* "CENTER_CROPPED" */ @js.native
  object CENTER_CROPPED extends TopLevel[CENTER_CROPPED with String]
  
  /* "STRETCH" */ @js.native
  object STRETCH extends TopLevel[STRETCH with String]
  
}

