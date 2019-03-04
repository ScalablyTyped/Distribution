package typings
package d3DashGeoLib.d3DashGeoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedFeatureCollection[FeatureType /* <: ExtendedFeature[GeoGeometryObjects | scala.Null, geojsonLib.geojsonMod.GeoJsonProperties] */]
  extends geojsonLib.geojsonMod.GeoJsonObject {
  var features: js.Array[FeatureType]
}

object ExtendedFeatureCollection {
  @scala.inline
  def apply[FeatureType /* <: ExtendedFeature[GeoGeometryObjects | scala.Null, geojsonLib.geojsonMod.GeoJsonProperties] */](
    features: js.Array[FeatureType],
    `type`: geojsonLib.geojsonMod.GeoJsonTypes,
    bbox: geojsonLib.geojsonMod.BBox = null
  ): ExtendedFeatureCollection[FeatureType] = {
    val __obj = js.Dynamic.literal(features = features)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedFeatureCollection[FeatureType]]
  }
}

