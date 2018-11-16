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

