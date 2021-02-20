package typings.chrome.anon

import typings.chrome.chrome.wallpaper.WallpaperDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofwallpaper extends StObject {
  
  def setWallpaper(details: WallpaperDetails, callback: js.Function1[/* thumbnail */ js.Any, Unit]): Unit = js.native
}
object Typeofwallpaper {
  
  @scala.inline
  def apply(setWallpaper: (WallpaperDetails, js.Function1[/* thumbnail */ js.Any, Unit]) => Unit): Typeofwallpaper = {
    val __obj = js.Dynamic.literal(setWallpaper = js.Any.fromFunction2(setWallpaper))
    __obj.asInstanceOf[Typeofwallpaper]
  }
  
  @scala.inline
  implicit class TypeofwallpaperMutableBuilder[Self <: Typeofwallpaper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetWallpaper(value: (WallpaperDetails, js.Function1[/* thumbnail */ js.Any, Unit]) => Unit): Self = StObject.set(x, "setWallpaper", js.Any.fromFunction2(value))
  }
}
