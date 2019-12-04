package typings.chrome.chrome.cast.media

import typings.chrome.chrome.cast.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.MovieMediaMetadata")
@js.native
/**
  * @constructor
  * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.MovieMediaMetadata
  */
class MovieMediaMetadata () extends js.Object {
  var images: js.Array[Image] = js.native
  var metadataType: MetadataType = js.native
  var releaseDate: String = js.native
  /** @deprecated. Use releaseDate instead. */
  var releaseYear: Double = js.native
  var studio: String = js.native
  var subtitle: String = js.native
  var title: String = js.native
  /** @deprecated. Use metadataType instead. */
  var `type`: MetadataType = js.native
}

