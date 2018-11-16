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
  
  val arrayBuffer: arrayBuffer with java.lang.String = js.native
  val base64: base64 with java.lang.String = js.native
  val blob: blob with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.GeoXmlCompressedFormat with java.lang.String] = js.native
}

