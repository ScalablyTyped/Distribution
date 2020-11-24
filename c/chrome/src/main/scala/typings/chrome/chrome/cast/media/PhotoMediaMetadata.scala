package typings.chrome.chrome.cast.media

import typings.chrome.chrome.cast.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhotoMediaMetadata extends js.Object {
  
  var artist: String = js.native
  
  var creationDateTime: String = js.native
  
  var height: Double = js.native
  
  var images: js.Array[Image] = js.native
  
  var latitude: Double = js.native
  
  var location: String = js.native
  
  var longitude: Double = js.native
  
  var metadataType: MetadataType = js.native
  
  var title: String = js.native
  
  /** @deprecated. Use metadataType instead. */
  var `type`: MetadataType = js.native
  
  var width: Double = js.native
}
object PhotoMediaMetadata {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class PhotoMediaMetadataOps[Self <: PhotoMediaMetadata] (val x: Self) extends AnyVal {
    
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
    def setArtist(value: String): Self = this.set("artist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateTime(value: String): Self = this.set("creationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesVarargs(value: Image*): Self = this.set("images", js.Array(value :_*))
    
    @scala.inline
    def setImages(value: js.Array[Image]): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataType(value: MetadataType): Self = this.set("metadataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MetadataType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
