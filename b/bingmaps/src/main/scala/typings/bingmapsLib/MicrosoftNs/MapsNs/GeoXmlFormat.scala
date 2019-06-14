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
  
  /* 2 */ val geoRss: geoRss with scala.Double = js.native
  /* 1 */ val gpx: gpx with scala.Double = js.native
  /* 0 */ val kml: kml with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.GeoXmlFormat with scala.Double] = js.native
}

