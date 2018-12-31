package typings
package chromeLib.chromeNs.castNs.mediaNs

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
  var albumArtist: java.lang.String = js.native
  var albumName: java.lang.String = js.native
  var artist: java.lang.String = js.native
  /** @deprecated. Use artist instead. */
  var artistName: java.lang.String = js.native
  var composer: java.lang.String = js.native
  var discNumber: scala.Double = js.native
  var images: js.Array[chromeLib.chromeNs.castNs.Image] = js.native
  var metadataType: MetadataType = js.native
  var releaseDate: java.lang.String = js.native
  /** @deprecated. Use releaseDate instead. */
  var releaseYear: scala.Double = js.native
  var songName: java.lang.String = js.native
  var title: java.lang.String = js.native
  var trackNumber: scala.Double = js.native
  /** @deprecated. Use metadataType instead. */
  var `type`: MetadataType = js.native
}

