package typings.chromeApps.chrome.wallpaper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
