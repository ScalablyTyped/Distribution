package typings.chrome.chrome.cast.media

import typings.chrome.chrome.cast.Image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MovieMediaMetadata extends StObject {
  
  var images: js.Array[Image] = js.native
  
  var metadataType: MetadataType = js.native
  
  var releaseDate: String = js.native
  
  /** @deprecated. Use releaseDate instead. */
  var releaseYear: Double = js.native
  
  var studio: String = js.native
  
  var subtitle: String = js.native
  
  var title: String = js.native
  
  /** @deprecated. Use metadataType instead. */
  var `type`: MetadataType = js.native
}
object MovieMediaMetadata {
  
  @scala.inline
  def apply(
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
  implicit class MovieMediaMetadataMutableBuilder[Self <: MovieMediaMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImages(value: js.Array[Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    @scala.inline
    def setMetadataType(value: MetadataType): Self = StObject.set(x, "metadataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseDate(value: String): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseYear(value: Double): Self = StObject.set(x, "releaseYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudio(value: String): Self = StObject.set(x, "studio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MetadataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
