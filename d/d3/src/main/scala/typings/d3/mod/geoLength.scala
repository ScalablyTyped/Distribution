package typings.d3.mod

import typings.d3Geo.mod.ExtendedFeature
import typings.d3Geo.mod.ExtendedFeatureCollection
import typings.d3Geo.mod.ExtendedGeometryCollection
import typings.d3Geo.mod.GeoGeometryObjects
import typings.geojson.mod.GeoJsonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "geoLength")
@js.native
object geoLength extends js.Object {
  
  def apply(`object`: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]): Double = js.native
  def apply(`object`: ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]]): Double = js.native
  def apply(`object`: ExtendedGeometryCollection[GeoGeometryObjects]): Double = js.native
  def apply(`object`: GeoGeometryObjects): Double = js.native
}
