package typings.chrome.chrome.cast.media

import typings.chrome.chrome.cast.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.MusicTrackMediaMetadata")
@js.native
/**
  * @constructor
  * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.MusicTrackMediaMetadata
  */
class MusicTrackMediaMetadata () extends js.Object {
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

