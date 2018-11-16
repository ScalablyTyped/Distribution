package typings
package chromeLib.chromeNs.castNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.PhotoMediaMetadata")
@js.native
class PhotoMediaMetadata () extends js.Object {
  var artist: java.lang.String = js.native
  var creationDateTime: java.lang.String = js.native
  var height: scala.Double = js.native
  var images: js.Array[chromeLib.chromeNs.castNs.Image] = js.native
  var latitude: scala.Double = js.native
  var location: java.lang.String = js.native
  var longitude: scala.Double = js.native
  var metadataType: MetadataType = js.native
  var title: java.lang.String = js.native
  /** @deprecated. Use metadataType instead. */
  var `type`: MetadataType = js.native
  var width: scala.Double = js.native
}

