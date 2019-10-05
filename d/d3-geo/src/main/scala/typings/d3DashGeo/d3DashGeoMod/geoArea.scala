package typings.d3DashGeo.d3DashGeoMod

import typings.geojson.geojsonMod.GeoJsonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-geo", "geoArea")
@js.native
object geoArea extends js.Object {
  def apply(`object`: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]): Double = js.native
  def apply(`object`: ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]]): Double = js.native
  def apply(`object`: ExtendedGeometryCollection[GeoGeometryObjects]): Double = js.native
  def apply(`object`: GeoGeometryObjects): Double = js.native
}

