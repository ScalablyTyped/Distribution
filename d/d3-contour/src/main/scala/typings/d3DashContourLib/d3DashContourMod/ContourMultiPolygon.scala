package typings
package d3DashContourLib.d3DashContourMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContourMultiPolygon
  extends geojsonLib.geojsonMod.MultiPolygon {
  /**
    * Threshold value of the contour.
    */
  var value: scala.Double
}

object ContourMultiPolygon {
  @scala.inline
  def apply(
    coordinates: js.Array[js.Array[js.Array[geojsonLib.geojsonMod.Position]]],
    `type`: geojsonLib.geojsonMod.GeoJsonTypes,
    type_MultiPolygon: geojsonLib.geojsonLibStrings.MultiPolygon,
    value: scala.Double,
    bbox: geojsonLib.geojsonMod.BBox = null
  ): ContourMultiPolygon = {
    val __obj = js.Dynamic.literal(coordinates = coordinates, value = value)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(type_MultiPolygon)
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContourMultiPolygon]
  }
}

