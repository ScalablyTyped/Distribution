package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeoXmlFormat extends StObject
@JSGlobal("Microsoft.Maps.GeoXmlFormat")
@js.native
object GeoXmlFormat extends StObject {
  
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
