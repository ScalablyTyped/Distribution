package typings.chrome.anon

import typings.chrome.chrome.wallpaper.WallpaperDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofwallpaper extends js.Object {
  
  def setWallpaper(details: WallpaperDetails, callback: js.Function1[/* thumbnail */ js.Any, Unit]): Unit = js.native
}
object Typeofwallpaper {
  
  @scala.inline
  def apply(setWallpaper: (WallpaperDetails, js.Function1[/* thumbnail */ js.Any, Unit]) => Unit): Typeofwallpaper = {
    val __obj = js.Dynamic.literal(setWallpaper = js.Any.fromFunction2(setWallpaper))
    __obj.asInstanceOf[Typeofwallpaper]
  }
  
  @scala.inline
  implicit class TypeofwallpaperOps[Self <: Typeofwallpaper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSetWallpaper(value: (WallpaperDetails, js.Function1[/* thumbnail */ js.Any, Unit]) => Unit): Self = this.set("setWallpaper", js.Any.fromFunction2(value))
  }
}
