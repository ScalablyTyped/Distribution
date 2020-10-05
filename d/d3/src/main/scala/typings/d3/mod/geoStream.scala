package typings.d3.mod

import typings.d3Geo.mod.ExtendedFeature
import typings.d3Geo.mod.ExtendedFeatureCollection
import typings.d3Geo.mod.ExtendedGeometryCollection
import typings.d3Geo.mod.GeoGeometryObjects
import typings.d3Geo.mod.GeoStream_
import typings.geojson.mod.GeoJsonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "geoStream")
@js.native
object geoStream extends js.Object {
  def apply(
    `object`: ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]],
    stream: GeoStream_
  ): Unit = js.native
  def apply(`object`: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties], stream: GeoStream_): Unit = js.native
  def apply(`object`: ExtendedGeometryCollection[GeoGeometryObjects], stream: GeoStream_): Unit = js.native
  def apply(`object`: GeoGeometryObjects, stream: GeoStream_): Unit = js.native
}

