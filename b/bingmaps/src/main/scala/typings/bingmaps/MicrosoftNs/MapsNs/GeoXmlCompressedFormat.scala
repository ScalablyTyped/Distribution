package typings.bingmaps.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GeoXmlCompressedFormat extends js.Object

@JSGlobal("Microsoft.Maps.GeoXmlCompressedFormat")
@js.native
object GeoXmlCompressedFormat extends js.Object {
  /** XML data compressed into an ArrayBuffer. */
  @js.native
  sealed trait arrayBuffer extends GeoXmlCompressedFormat
  
  /** XML data compressed into a Base64 Data URI. */
  @js.native
  sealed trait base64 extends GeoXmlCompressedFormat
  
  /** XML data compressed into a Blob. */
  @js.native
  sealed trait blob extends GeoXmlCompressedFormat
  
  /* 2 */ val arrayBuffer: typings.bingmaps.MicrosoftNs.MapsNs.GeoXmlCompressedFormat.arrayBuffer with Double = js.native
  /* 0 */ val base64: typings.bingmaps.MicrosoftNs.MapsNs.GeoXmlCompressedFormat.base64 with Double = js.native
  /* 1 */ val blob: typings.bingmaps.MicrosoftNs.MapsNs.GeoXmlCompressedFormat.blob with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GeoXmlCompressedFormat with Double] = js.native
}

