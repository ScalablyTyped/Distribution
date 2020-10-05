package typings.d3Geo.mod

import typings.geojson.mod.GeoJsonObject
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.GeoJsonTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtendedFeature[GeometryType /* <: GeoGeometryObjects | Null */, Properties /* <: GeoJsonProperties */] extends GeoJsonObject {
  var geometry: GeometryType = js.native
  var id: js.UndefOr[String | Double] = js.native
  var properties: Properties = js.native
}

object ExtendedFeature {
  @scala.inline
  def apply[/* <: typings.d3Geo.mod.GeoGeometryObjects | scala.Null */ GeometryType, /* <: typings.geojson.mod.GeoJsonProperties */ Properties](geometry: GeometryType, properties: Properties, `type`: GeoJsonTypes): ExtendedFeature[GeometryType, Properties] = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedFeature[GeometryType, Properties]]
  }
  @scala.inline
  implicit class ExtendedFeatureOps[Self <: ExtendedFeature[_, _], /* <: typings.d3Geo.mod.GeoGeometryObjects | scala.Null */ GeometryType, /* <: typings.geojson.mod.GeoJsonProperties */ Properties] (val x: Self with (ExtendedFeature[GeometryType, Properties])) extends AnyVal {
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
    def setGeometry(value: GeometryType): Self = this.set("geometry", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: Properties): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

