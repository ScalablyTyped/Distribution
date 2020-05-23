package typings.chrome.chrome.cast.media

import typings.chrome.chrome.cast.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhotoMediaMetadata extends js.Object {
  var artist: String
  var creationDateTime: String
  var height: Double
  var images: js.Array[Image]
  var latitude: Double
  var location: String
  var longitude: Double
  var metadataType: MetadataType
  var title: String
  /** @deprecated. Use metadataType instead. */
  var `type`: MetadataType
  var width: Double
}

object PhotoMediaMetadata {
  @scala.inline
  def apply(
    artist: String,
    creationDateTime: String,
    height: Double,
    images: js.Array[Image],
    latitude: Double,
    location: String,
    longitude: Double,
    metadataType: MetadataType,
    title: String,
    `type`: MetadataType,
    width: Double
  ): PhotoMediaMetadata = {
    val __obj = js.Dynamic.literal(artist = artist.asInstanceOf[js.Any], creationDateTime = creationDateTime.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], metadataType = metadataType.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoMediaMetadata]
  }
}

