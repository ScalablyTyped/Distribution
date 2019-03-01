package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeoXmlStats extends js.Object {
  /** The number of characters in the XML feed. */
  var fileSize: scala.Double
  /** Number of Ground Overlays in the XML feed. */
  var numGroundOverlays: scala.Double
  /** Number of Microsoft.Maps.Location objects in the XML feed. */
  var numLocations: scala.Double
  /** The number of network links in the XML feed. */
  var numNetworkLinks: scala.Double
  /** Number of Microsoft.Maps.Polygons objects in the XML feed. */
  var numPolygons: scala.Double
  /** Number of Microsoft.Maps.Polylines objects in the XML feed. */
  var numPolylines: scala.Double
  /** Number of Microsoft.Maps.Pushpins objects in the XML feed. */
  var numPushpins: scala.Double
  /** Number of Screen Overlays in the XML feed. */
  var numScreenOverlays: scala.Double
  /** The amount of time in ms it took to process the XML feed. */
  var processingTime: scala.Double
}

object IGeoXmlStats {
  @scala.inline
  def apply(
    fileSize: scala.Double,
    numGroundOverlays: scala.Double,
    numLocations: scala.Double,
    numNetworkLinks: scala.Double,
    numPolygons: scala.Double,
    numPolylines: scala.Double,
    numPushpins: scala.Double,
    numScreenOverlays: scala.Double,
    processingTime: scala.Double
  ): IGeoXmlStats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileSize")(fileSize)
    __obj.updateDynamic("numGroundOverlays")(numGroundOverlays)
    __obj.updateDynamic("numLocations")(numLocations)
    __obj.updateDynamic("numNetworkLinks")(numNetworkLinks)
    __obj.updateDynamic("numPolygons")(numPolygons)
    __obj.updateDynamic("numPolylines")(numPolylines)
    __obj.updateDynamic("numPushpins")(numPushpins)
    __obj.updateDynamic("numScreenOverlays")(numScreenOverlays)
    __obj.updateDynamic("processingTime")(processingTime)
    __obj.asInstanceOf[IGeoXmlStats]
  }
}

