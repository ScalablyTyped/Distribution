package typings.d3DashContour.d3DashContourMod

import typings.geojson.geojsonMod.BBox
import typings.geojson.geojsonMod.GeoJsonTypes
import typings.geojson.geojsonMod.MultiPolygon
import typings.geojson.geojsonMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContourMultiPolygon extends MultiPolygon {
  /**
    * Threshold value of the contour.
    */
  var value: Double
}

object ContourMultiPolygon {
  @scala.inline
  def apply(
    coordinates: js.Array[js.Array[js.Array[Position]]],
    `type`: GeoJsonTypes,
    type_MultiPolygon: typings.geojson.geojsonStrings.MultiPolygon,
    value: Double,
    bbox: BBox = null
  ): ContourMultiPolygon = {
    val __obj = js.Dynamic.literal(coordinates = coordinates, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.updateDynamic("type")(type_MultiPolygon)
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContourMultiPolygon]
  }
}

