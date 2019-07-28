package typings.d3DashGeo.d3DashGeoMod

import typings.geojson.geojsonMod.BBox
import typings.geojson.geojsonMod.GeoJsonObject
import typings.geojson.geojsonMod.GeoJsonProperties
import typings.geojson.geojsonMod.GeoJsonTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedFeatureCollection[FeatureType /* <: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties] */] extends GeoJsonObject {
  var features: js.Array[FeatureType]
}

object ExtendedFeatureCollection {
  @scala.inline
  def apply[FeatureType /* <: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties] */](features: js.Array[FeatureType], `type`: GeoJsonTypes, bbox: BBox = null): ExtendedFeatureCollection[FeatureType] = {
    val __obj = js.Dynamic.literal(features = features)
    __obj.updateDynamic("type")(`type`)
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedFeatureCollection[FeatureType]]
  }
}

