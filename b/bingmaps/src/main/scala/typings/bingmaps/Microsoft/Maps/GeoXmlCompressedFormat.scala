package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GeoXmlCompressedFormat with Double] = js.native
  /* 2 */ @js.native
  object arrayBuffer extends TopLevel[arrayBuffer with Double]
  
  /* 0 */ @js.native
  object base64 extends TopLevel[base64 with Double]
  
  /* 1 */ @js.native
  object blob extends TopLevel[blob with Double]
  
}

