package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "GeoJsonDataSource")
@js.native
class GeoJsonDataSource () extends DataSource {
  def this(name: java.lang.String) = this()
  def load(data: Resource): js.Promise[GeoJsonDataSource] = js.native
  def load(data: Resource, options: cesiumLib.Anon_ClampToGround): js.Promise[GeoJsonDataSource] = js.native
  def load(data: java.lang.String): js.Promise[GeoJsonDataSource] = js.native
  def load(data: java.lang.String, options: cesiumLib.Anon_ClampToGround): js.Promise[GeoJsonDataSource] = js.native
  def load(data: js.Object): js.Promise[GeoJsonDataSource] = js.native
  def load(data: js.Object, options: cesiumLib.Anon_ClampToGround): js.Promise[GeoJsonDataSource] = js.native
}

/* static members */
@JSImport("cesium", "GeoJsonDataSource")
@js.native
object GeoJsonDataSource extends js.Object {
  var clampToGround: scala.Boolean = js.native
  var crsLinkHrefs: js.Any = js.native
  var crsLinkTypes: js.Any = js.native
  var crsNames: js.Any = js.native
  var fill: cesiumLib.cesiumMod.Color = js.native
  var markerColor: cesiumLib.cesiumMod.Color = js.native
  var markerSize: scala.Double = js.native
  var markerSymbol: java.lang.String = js.native
  var stroke: cesiumLib.cesiumMod.Color = js.native
  var strokeWidth: scala.Double = js.native
  def load(data: cesiumLib.cesiumMod.Resource): js.Promise[cesiumLib.cesiumMod.GeoJsonDataSource] = js.native
  def load(data: cesiumLib.cesiumMod.Resource, options: cesiumLib.Anon_ClampToGround): js.Promise[cesiumLib.cesiumMod.GeoJsonDataSource] = js.native
  def load(data: java.lang.String): js.Promise[cesiumLib.cesiumMod.GeoJsonDataSource] = js.native
  def load(data: java.lang.String, options: cesiumLib.Anon_ClampToGround): js.Promise[cesiumLib.cesiumMod.GeoJsonDataSource] = js.native
  def load(data: js.Object): js.Promise[cesiumLib.cesiumMod.GeoJsonDataSource] = js.native
  def load(data: js.Object, options: cesiumLib.Anon_ClampToGround): js.Promise[cesiumLib.cesiumMod.GeoJsonDataSource] = js.native
}

