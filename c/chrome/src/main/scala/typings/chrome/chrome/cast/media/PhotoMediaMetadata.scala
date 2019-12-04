package typings.chrome.chrome.cast.media

import typings.chrome.chrome.cast.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.PhotoMediaMetadata")
@js.native
/**
  * @constructor
  * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.PhotoMediaMetadata
  */
class PhotoMediaMetadata () extends js.Object {
  var artist: String = js.native
  var creationDateTime: String = js.native
  var height: Double = js.native
  var images: js.Array[Image] = js.native
  var latitude: Double = js.native
  var location: String = js.native
  var longitude: Double = js.native
  var metadataType: MetadataType = js.native
  var title: String = js.native
  /** @deprecated. Use metadataType instead. */
  var `type`: MetadataType = js.native
  var width: Double = js.native
}

