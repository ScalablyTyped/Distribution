package typings.chrome.chrome.cast.media

import typings.chrome.chrome.cast.Image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MusicTrackMediaMetadata extends StObject {
  
  var albumArtist: String
  
  var albumName: String
  
  var artist: String
  
  /** @deprecated. Use artist instead. */
  var artistName: String
  
  var composer: String
  
  var discNumber: Double
  
  var images: js.Array[Image]
  
  var metadataType: MetadataType
  
  var releaseDate: String
  
  /** @deprecated. Use releaseDate instead. */
  var releaseYear: Double
  
  var songName: String
  
  var title: String
  
  var trackNumber: Double
  
  /** @deprecated. Use metadataType instead. */
  var `type`: MetadataType
}
object MusicTrackMediaMetadata {
  
  inline def apply(
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
  
  extension [Self <: MusicTrackMediaMetadata](x: Self) {
    
    inline def setAlbumArtist(value: String): Self = StObject.set(x, "albumArtist", value.asInstanceOf[js.Any])
    
    inline def setAlbumName(value: String): Self = StObject.set(x, "albumName", value.asInstanceOf[js.Any])
    
    inline def setArtist(value: String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
    
    inline def setArtistName(value: String): Self = StObject.set(x, "artistName", value.asInstanceOf[js.Any])
    
    inline def setComposer(value: String): Self = StObject.set(x, "composer", value.asInstanceOf[js.Any])
    
    inline def setDiscNumber(value: Double): Self = StObject.set(x, "discNumber", value.asInstanceOf[js.Any])
    
    inline def setImages(value: js.Array[Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def setMetadataType(value: MetadataType): Self = StObject.set(x, "metadataType", value.asInstanceOf[js.Any])
    
    inline def setReleaseDate(value: String): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
    
    inline def setReleaseYear(value: Double): Self = StObject.set(x, "releaseYear", value.asInstanceOf[js.Any])
    
    inline def setSongName(value: String): Self = StObject.set(x, "songName", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTrackNumber(value: Double): Self = StObject.set(x, "trackNumber", value.asInstanceOf[js.Any])
    
    inline def setType(value: MetadataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
