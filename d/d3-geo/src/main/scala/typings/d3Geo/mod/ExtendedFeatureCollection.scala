package typings.d3Geo.mod

import typings.geojson.mod.GeoJsonObject
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.GeoJsonTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendedFeatureCollection[FeatureType /* <: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties] */] extends GeoJsonObject {
  var features: js.Array[FeatureType] = js.native
}

object ExtendedFeatureCollection {
  @scala.inline
  def apply[/* <: typings.d3Geo.mod.ExtendedFeature[
  typings.d3Geo.mod.GeoGeometryObjects | scala.Null, 
  typings.geojson.mod.GeoJsonProperties] */ FeatureType](features: js.Array[FeatureType], `type`: GeoJsonTypes): ExtendedFeatureCollection[FeatureType] = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedFeatureCollection[FeatureType]]
  }
  @scala.inline
  implicit class ExtendedFeatureCollectionOps[Self <: ExtendedFeatureCollection[_], /* <: typings.d3Geo.mod.ExtendedFeature[
  typings.d3Geo.mod.GeoGeometryObjects | scala.Null, 
  typings.geojson.mod.GeoJsonProperties] */ FeatureType] (val x: Self with ExtendedFeatureCollection[FeatureType]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFeaturesVarargs(value: FeatureType*): Self = this.set("features", js.Array(value :_*))
    @scala.inline
    def setFeatures(value: js.Array[FeatureType]): Self = this.set("features", value.asInstanceOf[js.Any])
  }
  
}

