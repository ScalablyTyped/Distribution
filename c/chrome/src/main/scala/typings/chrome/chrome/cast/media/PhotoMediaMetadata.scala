package typings.chrome.chrome.cast.media

import typings.chrome.chrome.cast.Image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhotoMediaMetadata extends StObject {
  
  var artist: String
  
  var creationDateTime: String
  
  var height: Double
  
  var images: js.Array[Image]
  
  var latitude: Double
  
  var location: String
  
  var longitude: Double
  
  var metadataType: MetadataType
  
  var title: String
  
  /** @deprecated. Use metadataType instead. */
  var `type`: MetadataType
  
  var width: Double
}
object PhotoMediaMetadata {
  
  inline def apply(
    artist: String,
    creationDateTime: String,
    height: Double,
    images: js.Array[Image],
    latitude: Double,
    location: String,
    longitude: Double,
    metadataType: MetadataType,
    title: String,
    `type`: MetadataType,
    width: Double
  ): PhotoMediaMetadata = {
    val __obj = js.Dynamic.literal(artist = artist.asInstanceOf[js.Any], creationDateTime = creationDateTime.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], metadataType = metadataType.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoMediaMetadata]
  }
  
  extension [Self <: PhotoMediaMetadata](x: Self) {
    
    inline def setArtist(value: String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTime(value: String): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setImages(value: js.Array[Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setMetadataType(value: MetadataType): Self = StObject.set(x, "metadataType", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: MetadataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
