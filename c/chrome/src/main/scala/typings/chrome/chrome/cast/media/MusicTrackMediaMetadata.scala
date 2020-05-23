package typings.chrome.chrome.cast.media

import typings.chrome.chrome.cast.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MusicTrackMediaMetadata extends js.Object {
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
}

