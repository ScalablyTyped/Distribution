package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.TopLevel
import typings.bingmaps.Microsoft.Maps.GeoXmlFormat.geoRss
import typings.bingmaps.Microsoft.Maps.GeoXmlFormat.gpx
import typings.bingmaps.Microsoft.Maps.GeoXmlFormat.kml
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GeoXmlFormat with Double] = js.native
  /* 2 */ @js.native
  object geoRss extends TopLevel[geoRss with Double]
  
  /* 1 */ @js.native
  object gpx extends TopLevel[gpx with Double]
  
  /* 0 */ @js.native
  object kml extends TopLevel[kml with Double]
  
}

