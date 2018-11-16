package typings
package chromeLib.chromeNs.castNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.GenericMediaMetadata")
@js.native
class GenericMediaMetadata () extends js.Object {
  var images: js.Array[chromeLib.chromeNs.castNs.Image] = js.native
  var metadataType: MetadataType = js.native
  var releaseDate: java.lang.String = js.native
  /** @deprecated. Use releaseDate instead. */
  var releaseYear: scala.Double = js.native
  var subtitle: java.lang.String = js.native
  var title: java.lang.String = js.native
  /** @deprecated. Use metadataType instead. */
  var `type`: MetadataType = js.native
}

