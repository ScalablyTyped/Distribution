package typings.chrome.chrome.cast.media

import typings.chrome.chrome.cast.Image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MovieMediaMetadata extends StObject {
  
  var images: js.Array[Image]
  
  var metadataType: MetadataType
  
  var releaseDate: String
  
  /** @deprecated Use releaseDate instead. */
  var releaseYear: Double
  
  var studio: String
  
  var subtitle: String
  
  var title: String
  
  /** @deprecated Use metadataType instead. */
  var `type`: MetadataType
}
object MovieMediaMetadata {
  
  inline def apply(
    images: js.Array[Image],
    metadataType: MetadataType,
    releaseDate: String,
    releaseYear: Double,
    studio: String,
    subtitle: String,
    title: String,
    `type`: MetadataType
  ): MovieMediaMetadata = {
    val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any], metadataType = metadataType.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], releaseYear = releaseYear.asInstanceOf[js.Any], studio = studio.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MovieMediaMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MovieMediaMetadata] (val x: Self) extends AnyVal {
    
    inline def setImages(value: js.Array[Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def setMetadataType(value: MetadataType): Self = StObject.set(x, "metadataType", value.asInstanceOf[js.Any])
    
    inline def setReleaseDate(value: String): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
    
    inline def setReleaseYear(value: Double): Self = StObject.set(x, "releaseYear", value.asInstanceOf[js.Any])
    
    inline def setStudio(value: String): Self = StObject.set(x, "studio", value.asInstanceOf[js.Any])
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: MetadataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
