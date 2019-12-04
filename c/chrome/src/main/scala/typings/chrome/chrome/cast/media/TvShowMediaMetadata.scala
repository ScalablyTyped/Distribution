package typings.chrome.chrome.cast.media

import typings.chrome.chrome.cast.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.TvShowMediaMetadata")
@js.native
/**
  * @constructor
  * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.TvShowMediaMetadata
  */
class TvShowMediaMetadata () extends js.Object {
  var episode: Double = js.native
  /** @deprecated. Use episode instead. */
  var episodeNumber: Double = js.native
  /** @deprecated. Use title instead. */
  var episodeTitle: String = js.native
  var images: js.Array[Image] = js.native
  var metadataType: MetadataType = js.native
  var originalAirdate: String = js.native
  /** @deprecated. Use originalAirdate instead. */
  var releaseYear: Double = js.native
  var season: Double = js.native
  /** @deprecated. Use season instead. */
  var seasonNumber: Double = js.native
  var seriesTitle: String = js.native
  var title: String = js.native
  /** @deprecated. Use metadataType instead. */
  var `type`: MetadataType = js.native
}

