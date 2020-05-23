package typings.chrome.chrome.cast.media

import typings.chrome.chrome.cast.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TvShowMediaMetadata extends js.Object {
  var episode: Double
  /** @deprecated. Use episode instead. */
  var episodeNumber: Double
  /** @deprecated. Use title instead. */
  var episodeTitle: String
  var images: js.Array[Image]
  var metadataType: MetadataType
  var originalAirdate: String
  /** @deprecated. Use originalAirdate instead. */
  var releaseYear: Double
  var season: Double
  /** @deprecated. Use season instead. */
  var seasonNumber: Double
  var seriesTitle: String
  var title: String
  /** @deprecated. Use metadataType instead. */
  var `type`: MetadataType
}

object TvShowMediaMetadata {
  @scala.inline
  def apply(
    episode: Double,
    episodeNumber: Double,
    episodeTitle: String,
    images: js.Array[Image],
    metadataType: MetadataType,
    originalAirdate: String,
    releaseYear: Double,
    season: Double,
    seasonNumber: Double,
    seriesTitle: String,
    title: String,
    `type`: MetadataType
  ): TvShowMediaMetadata = {
    val __obj = js.Dynamic.literal(episode = episode.asInstanceOf[js.Any], episodeNumber = episodeNumber.asInstanceOf[js.Any], episodeTitle = episodeTitle.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], metadataType = metadataType.asInstanceOf[js.Any], originalAirdate = originalAirdate.asInstanceOf[js.Any], releaseYear = releaseYear.asInstanceOf[js.Any], season = season.asInstanceOf[js.Any], seasonNumber = seasonNumber.asInstanceOf[js.Any], seriesTitle = seriesTitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TvShowMediaMetadata]
  }
}

