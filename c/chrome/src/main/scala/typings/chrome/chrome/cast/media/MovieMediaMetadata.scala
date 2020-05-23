package typings.chrome.chrome.cast.media

import typings.chrome.chrome.cast.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MovieMediaMetadata extends js.Object {
  var images: js.Array[Image]
  var metadataType: MetadataType
  var releaseDate: String
  /** @deprecated. Use releaseDate instead. */
  var releaseYear: Double
  var studio: String
  var subtitle: String
  var title: String
  /** @deprecated. Use metadataType instead. */
  var `type`: MetadataType
}

object MovieMediaMetadata {
  @scala.inline
  def apply(
    images: js.Array[Image],
    metadataType: MetadataType,
    releaseDate: String,
    releaseYear: Double,
    studio: String,
    subtitle: String,
    title: String,
    `type`: MetadataType
  ): MovieMediaMetadata = {
    val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any], metadataType = metadataType.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], releaseYear = releaseYear.asInstanceOf[js.Any], studio = studio.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MovieMediaMetadata]
  }
}

