package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GeoXmlFormat extends js.Object

@JSGlobal("Microsoft.Maps.GeoXmlFormat")
@js.native
object GeoXmlFormat extends js.Object {
  /** A GeoRSS XML file using ATOM format. */
  @js.native
  sealed trait geoRss
    extends bingmapsLib.MicrosoftNs.MapsNs.GeoXmlFormat
  
  /** A GPX XML file format. */
  @js.native
  sealed trait gpx
    extends bingmapsLib.MicrosoftNs.MapsNs.GeoXmlFormat
  
  /** A KML XML file format. */
  @js.native
  sealed trait kml
    extends bingmapsLib.MicrosoftNs.MapsNs.GeoXmlFormat
  
  val geoRss: geoRss with java.lang.String = js.native
  val gpx: gpx with java.lang.String = js.native
  val kml: kml with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.GeoXmlFormat with java.lang.String] = js.native
}

