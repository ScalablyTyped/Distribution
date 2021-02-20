package typings.chrome.chrome.cast.media

import typings.chrome.chrome.cast.Image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MusicTrackMediaMetadata extends StObject {
  
  var albumArtist: String = js.native
  
  var albumName: String = js.native
  
  var artist: String = js.native
  
  /** @deprecated. Use artist instead. */
  var artistName: String = js.native
  
  var composer: String = js.native
  
  var discNumber: Double = js.native
  
  var images: js.Array[Image] = js.native
  
  var metadataType: MetadataType = js.native
  
  var releaseDate: String = js.native
  
  /** @deprecated. Use releaseDate instead. */
  var releaseYear: Double = js.native
  
  var songName: String = js.native
  
  var title: String = js.native
  
  var trackNumber: Double = js.native
  
  /** @deprecated. Use metadataType instead. */
  var `type`: MetadataType = js.native
}
object MusicTrackMediaMetadata {
  
  @scala.inline
  def apply(
    albumArtist: String,
    albumName: String,
    artist: String,
    artistName: String,
    composer: String,
    discNumber: Double,
    images: js.Array[Image],
    metadataType: MetadataType,
    releaseDate: String,
    releaseYear: Double,
    songName: String,
    title: String,
    trackNumber: Double,
    `type`: MetadataType
  ): MusicTrackMediaMetadata = {
    val __obj = js.Dynamic.literal(albumArtist = albumArtist.asInstanceOf[js.Any], albumName = albumName.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], artistName = artistName.asInstanceOf[js.Any], composer = composer.asInstanceOf[js.Any], discNumber = discNumber.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], metadataType = metadataType.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], releaseYear = releaseYear.asInstanceOf[js.Any], songName = songName.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], trackNumber = trackNumber.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicTrackMediaMetadata]
  }
  
  @scala.inline
  implicit class MusicTrackMediaMetadataMutableBuilder[Self <: MusicTrackMediaMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlbumArtist(value: String): Self = StObject.set(x, "albumArtist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlbumName(value: String): Self = StObject.set(x, "albumName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtist(value: String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtistName(value: String): Self = StObject.set(x, "artistName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComposer(value: String): Self = StObject.set(x, "composer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscNumber(value: Double): Self = StObject.set(x, "discNumber", value.asInstanceOf[js.Any])
    
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
    def setSongName(value: String): Self = StObject.set(x, "songName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackNumber(value: Double): Self = StObject.set(x, "trackNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MetadataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
