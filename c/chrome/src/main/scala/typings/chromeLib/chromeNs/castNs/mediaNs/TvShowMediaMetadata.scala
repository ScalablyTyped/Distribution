package typings
package chromeLib.chromeNs.castNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.TvShowMediaMetadata")
@js.native
class TvShowMediaMetadata () extends js.Object {
  var episode: scala.Double = js.native
  /** @deprecated. Use episode instead. */
  var episodeNumber: scala.Double = js.native
  /** @deprecated. Use title instead. */
  var episodeTitle: java.lang.String = js.native
  var images: js.Array[chromeLib.chromeNs.castNs.Image] = js.native
  var metadataType: MetadataType = js.native
  var originalAirdate: java.lang.String = js.native
  /** @deprecated. Use originalAirdate instead. */
  var releaseYear: scala.Double = js.native
  var season: scala.Double = js.native
  /** @deprecated. Use season instead. */
  var seasonNumber: scala.Double = js.native
  var seriesTitle: java.lang.String = js.native
  var title: java.lang.String = js.native
  /** @deprecated. Use metadataType instead. */
  var `type`: MetadataType = js.native
}

