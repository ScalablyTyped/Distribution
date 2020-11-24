package typings.chromeApps.chrome.wallpaper

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WallpaperDetails extends js.Object {
  
  /** The jpeg or png encoded wallpaper image. */
  var data: js.UndefOr[ArrayBuffer] = js.native
  
  /** The file name of the saved wallpaper. */
  var filename: String = js.native
  
  /**
    * The supported wallpaper layouts.
    * @see WallpaperLayout
    */
  var layout: WallpaperLayout | WallpaperLayoutType = js.native
  
  /** True if a 128x60 thumbnail should be generated. */
  var thumbnail: js.UndefOr[Boolean] = js.native
  
  /** The URL of the wallpaper to be set. */
  var url: js.UndefOr[String] = js.native
}
object WallpaperDetails {
  
  @scala.inline
  def apply(filename: String, layout: WallpaperLayout | WallpaperLayoutType): WallpaperDetails = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[WallpaperDetails]
  }
  
  @scala.inline
  implicit class WallpaperDetailsOps[Self <: WallpaperDetails] (val x: Self) extends AnyVal {
    
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout(value: WallpaperLayout | WallpaperLayoutType): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: ArrayBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setThumbnail(value: Boolean): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnail: Self = this.set("thumbnail", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
