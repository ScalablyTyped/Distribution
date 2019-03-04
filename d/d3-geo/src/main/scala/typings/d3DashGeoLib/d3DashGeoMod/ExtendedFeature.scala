package typings
package d3DashGeoLib.d3DashGeoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedFeature[GeometryType /* <: GeoGeometryObjects | scala.Null */, Properties /* <: geojsonLib.geojsonMod.GeoJsonProperties */]
  extends geojsonLib.geojsonMod.GeoJsonObject {
  var geometry: GeometryType
  var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var properties: Properties
}

object ExtendedFeature {
  @scala.inline
  def apply[GeometryType /* <: GeoGeometryObjects | scala.Null */, Properties /* <: geojsonLib.geojsonMod.GeoJsonProperties */](
    geometry: GeometryType,
    properties: Properties,
    `type`: geojsonLib.geojsonMod.GeoJsonTypes,
    bbox: geojsonLib.geojsonMod.BBox = null,
    id: java.lang.String | scala.Double = null
  ): ExtendedFeature[GeometryType, Properties] = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedFeature[GeometryType, Properties]]
  }
}

