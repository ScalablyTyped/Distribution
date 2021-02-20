package typings.chrome.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait WallpaperDetails extends StObject {
    
    /** Optional. The jpeg or png encoded wallpaper image. */
    var data: js.UndefOr[js.Any] = js.native
    
    /** The file name of the saved wallpaper. */
    var filename: String = js.native
    
    /**
      * The supported wallpaper layouts.
      * One of: "STRETCH", "CENTER", or "CENTER_CROPPED"
      */
    var layout: String = js.native
    
    /** Optional. True if a 128x60 thumbnail should be generated. */
    var thumbnail: js.UndefOr[Boolean] = js.native
    
    /** Optional. The URL of the wallpaper to be set. */
    var url: js.UndefOr[String] = js.native
  }
  object WallpaperDetails {
    
    @scala.inline
    def apply(filename: String, layout: String): WallpaperDetails = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
      __obj.asInstanceOf[WallpaperDetails]
    }
    
    @scala.inline
    implicit class WallpaperDetailsMutableBuilder[Self <: WallpaperDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnail(value: Boolean): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
