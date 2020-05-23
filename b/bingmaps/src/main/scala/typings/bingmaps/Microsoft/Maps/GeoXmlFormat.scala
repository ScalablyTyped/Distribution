package typings.bingmaps.Microsoft.Maps

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
  
}

