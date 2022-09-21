package typings.chrome.anon

import typings.chrome.chrome.wallpaper.WallpaperDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofwallpaper extends StObject {
  
  def setWallpaper(
    details: WallpaperDetails,
    callback: js.Function1[/* thumbnail */ js.UndefOr[js.typedarray.ArrayBuffer], Unit]
  ): Unit
}
object Typeofwallpaper {
  
  inline def apply(
    setWallpaper: (WallpaperDetails, js.Function1[/* thumbnail */ js.UndefOr[js.typedarray.ArrayBuffer], Unit]) => Unit
  ): Typeofwallpaper = {
    val __obj = js.Dynamic.literal(setWallpaper = js.Any.fromFunction2(setWallpaper))
    __obj.asInstanceOf[Typeofwallpaper]
  }
  
  extension [Self <: Typeofwallpaper](x: Self) {
    
    inline def setSetWallpaper(
      value: (WallpaperDetails, js.Function1[/* thumbnail */ js.UndefOr[js.typedarray.ArrayBuffer], Unit]) => Unit
    ): Self = StObject.set(x, "setWallpaper", js.Any.fromFunction2(value))
  }
}
