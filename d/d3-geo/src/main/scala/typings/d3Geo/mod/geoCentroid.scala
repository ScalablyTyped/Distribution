package typings.d3Geo.mod

import typings.geojson.mod.GeoJsonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3-geo", "geoCentroid")
@js.native
object geoCentroid extends js.Object {
  def apply(`object`: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]): js.Tuple2[Double, Double] = js.native
  def apply(`object`: ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]]): js.Tuple2[Double, Double] = js.native
  def apply(`object`: ExtendedGeometryCollection[GeoGeometryObjects]): js.Tuple2[Double, Double] = js.native
  def apply(`object`: GeoGeometryObjects): js.Tuple2[Double, Double] = js.native
}

