package typings
package bingmapsLib.MicrosoftNs.MapsNs

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
  sealed trait arrayBuffer
    extends bingmapsLib.MicrosoftNs.MapsNs.GeoXmlCompressedFormat
  
  /** XML data compressed into a Base64 Data URI. */
  @js.native
  sealed trait base64
    extends bingmapsLib.MicrosoftNs.MapsNs.GeoXmlCompressedFormat
  
  /** XML data compressed into a Blob. */
  @js.native
  sealed trait blob
    extends bingmapsLib.MicrosoftNs.MapsNs.GeoXmlCompressedFormat
  
  /* 2 */ val arrayBuffer: arrayBuffer with scala.Double = js.native
  /* 0 */ val base64: base64 with scala.Double = js.native
  /* 1 */ val blob: blob with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.GeoXmlCompressedFormat with scala.Double] = js.native
}

