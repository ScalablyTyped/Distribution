package typings.chrome.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Wallpaper
////////////////////
/**
  * Use the chrome.wallpaper API to change the ChromeOS wallpaper.
  * Permissions:  "wallpaper"
  * Important: This API works only on Chrome OS.
  * @since Chrome 43.
  */
object wallpaper {
  
  trait WallpaperDetails extends StObject {
    
    /** Optional. The jpeg or png encoded wallpaper image. */
    var data: js.UndefOr[js.Any] = js.undefined
    
    /** The file name of the saved wallpaper. */
    var filename: String
    
    /**
      * The supported wallpaper layouts.
      * One of: "STRETCH", "CENTER", or "CENTER_CROPPED"
      */
    var layout: String
    
    /** Optional. True if a 128x60 thumbnail should be generated. */
    var thumbnail: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. The URL of the wallpaper to be set. */
    var url: js.UndefOr[String] = js.undefined
  }
  object WallpaperDetails {
    
    inline def apply(filename: String, layout: String): WallpaperDetails = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
      __obj.asInstanceOf[WallpaperDetails]
    }
    
    extension [Self <: WallpaperDetails](x: Self) {
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setThumbnail(value: Boolean): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
