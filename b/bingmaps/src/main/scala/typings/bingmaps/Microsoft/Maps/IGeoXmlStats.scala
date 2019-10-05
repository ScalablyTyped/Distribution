package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeoXmlStats extends js.Object {
  /** The number of characters in the XML feed. */
  var fileSize: Double
  /** Number of Ground Overlays in the XML feed. */
  var numGroundOverlays: Double
  /** Number of Microsoft.Maps.Location objects in the XML feed. */
  var numLocations: Double
  /** The number of network links in the XML feed. */
  var numNetworkLinks: Double
  /** Number of Microsoft.Maps.Polygons objects in the XML feed. */
  var numPolygons: Double
  /** Number of Microsoft.Maps.Polylines objects in the XML feed. */
  var numPolylines: Double
  /** Number of Microsoft.Maps.Pushpins objects in the XML feed. */
  var numPushpins: Double
  /** Number of Screen Overlays in the XML feed. */
  var numScreenOverlays: Double
  /** The amount of time in ms it took to process the XML feed. */
  var processingTime: Double
}

object IGeoXmlStats {
  @scala.inline
  def apply(
    fileSize: Double,
    numGroundOverlays: Double,
    numLocations: Double,
    numNetworkLinks: Double,
    numPolygons: Double,
    numPolylines: Double,
    numPushpins: Double,
    numScreenOverlays: Double,
    processingTime: Double
  ): IGeoXmlStats = {
    val __obj = js.Dynamic.literal(fileSize = fileSize, numGroundOverlays = numGroundOverlays, numLocations = numLocations, numNetworkLinks = numNetworkLinks, numPolygons = numPolygons, numPolylines = numPolylines, numPushpins = numPushpins, numScreenOverlays = numScreenOverlays, processingTime = processingTime)
  
    __obj.asInstanceOf[IGeoXmlStats]
  }
}

