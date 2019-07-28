package typings.chrome.chromeNs.castNs.mediaNs

import typings.chrome.chromeNs.castNs.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.GenericMediaMetadata")
@js.native
class GenericMediaMetadata () extends js.Object {
  var images: js.Array[Image] = js.native
  var metadataType: MetadataType = js.native
  var releaseDate: String = js.native
  /** @deprecated. Use releaseDate instead. */
  var releaseYear: Double = js.native
  var subtitle: String = js.native
  var title: String = js.native
  /** @deprecated. Use metadataType instead. */
  var `type`: MetadataType = js.native
}

