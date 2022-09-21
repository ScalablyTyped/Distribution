package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaMetadataInit extends StObject {
  
  var album: js.UndefOr[java.lang.String] = js.undefined
  
  var artist: js.UndefOr[java.lang.String] = js.undefined
  
  var artwork: js.UndefOr[Array[MediaImage]] = js.undefined
  
  var title: js.UndefOr[java.lang.String] = js.undefined
}
object MediaMetadataInit {
  
  inline def apply(): MediaMetadataInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaMetadataInit]
  }
  
  extension [Self <: MediaMetadataInit](x: Self) {
    
    inline def setAlbum(value: java.lang.String): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
    
    inline def setAlbumUndefined: Self = StObject.set(x, "album", js.undefined)
    
    inline def setArtist(value: java.lang.String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
    
    inline def setArtistUndefined: Self = StObject.set(x, "artist", js.undefined)
    
    inline def setArtwork(value: Array[MediaImage]): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
    
    inline def setArtworkUndefined: Self = StObject.set(x, "artwork", js.undefined)
    
    inline def setTitle(value: java.lang.String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
