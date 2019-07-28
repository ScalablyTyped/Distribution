package typings.bingmaps.MicrosoftNs.MapsNs

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
  sealed trait geoRss extends GeoXmlFormat
  
  /** A GPX XML file format. */
  @js.native
  sealed trait gpx extends GeoXmlFormat
  
  /** A KML XML file format. */
  @js.native
  sealed trait kml extends GeoXmlFormat
  
  /* 2 */ val geoRss: typings.bingmaps.MicrosoftNs.MapsNs.GeoXmlFormat.geoRss with Double = js.native
  /* 1 */ val gpx: typings.bingmaps.MicrosoftNs.MapsNs.GeoXmlFormat.gpx with Double = js.native
  /* 0 */ val kml: typings.bingmaps.MicrosoftNs.MapsNs.GeoXmlFormat.kml with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GeoXmlFormat with Double] = js.native
}

