package typings.chrome.chrome.cast.media

import typings.chrome.chrome.cast.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MusicTrackMediaMetadata extends js.Object {
  
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
  implicit class MusicTrackMediaMetadataOps[Self <: MusicTrackMediaMetadata] (val x: Self) extends AnyVal {
    
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
    def setAlbumArtist(value: String): Self = this.set("albumArtist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlbumName(value: String): Self = this.set("albumName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtist(value: String): Self = this.set("artist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtistName(value: String): Self = this.set("artistName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComposer(value: String): Self = this.set("composer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscNumber(value: Double): Self = this.set("discNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesVarargs(value: Image*): Self = this.set("images", js.Array(value :_*))
    
    @scala.inline
    def setImages(value: js.Array[Image]): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataType(value: MetadataType): Self = this.set("metadataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseDate(value: String): Self = this.set("releaseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseYear(value: Double): Self = this.set("releaseYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSongName(value: String): Self = this.set("songName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackNumber(value: Double): Self = this.set("trackNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MetadataType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
