package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "GeoJsonDataSource")
@js.native
class GeoJsonDataSource ()
  extends cesiumLib.cesiumMod.CesiumNs.GeoJsonDataSource {
  def this(name: java.lang.String) = this()
  /* CompleteClass */
  override var changedEvent: cesiumLib.cesiumMod.CesiumNs.Event = js.native
  /* CompleteClass */
  override var clock: cesiumLib.cesiumMod.CesiumNs.DataSourceClock = js.native
  /* CompleteClass */
  override var clustering: cesiumLib.cesiumMod.CesiumNs.EntityCluster = js.native
  /* CompleteClass */
  override var entities: cesiumLib.cesiumMod.CesiumNs.EntityCollection = js.native
  /* CompleteClass */
  override var errorEvent: cesiumLib.cesiumMod.CesiumNs.Event = js.native
  /* CompleteClass */
  override var isLoading: scala.Boolean = js.native
  /* CompleteClass */
  override var loadingEvent: cesiumLib.cesiumMod.CesiumNs.Event = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var show: scala.Boolean = js.native
  /* CompleteClass */
  override def update(time: cesiumLib.cesiumMod.CesiumNs.JulianDate): scala.Boolean = js.native
}

@JSImport("cesium", "GeoJsonDataSource")
@js.native
object GeoJsonDataSource extends js.Object {
  var clampToGround: scala.Boolean = js.native
  var crsLinkHrefs: js.Any = js.native
  var crsLinkTypes: js.Any = js.native
  var crsNames: js.Any = js.native
  var fill: cesiumLib.cesiumMod.CesiumNs.Color = js.native
  var markerColor: cesiumLib.cesiumMod.CesiumNs.Color = js.native
  var markerSize: scala.Double = js.native
  var markerSymbol: java.lang.String = js.native
  var stroke: cesiumLib.cesiumMod.CesiumNs.Color = js.native
  var strokeWidth: scala.Double = js.native
  def load(data: cesiumLib.cesiumMod.CesiumNs.Resource): stdLib.Promise[cesiumLib.cesiumMod.CesiumNs.GeoJsonDataSource] = js.native
  def load(data: cesiumLib.cesiumMod.CesiumNs.Resource, options: cesiumLib.Anon_Stroke): stdLib.Promise[cesiumLib.cesiumMod.CesiumNs.GeoJsonDataSource] = js.native
  def load(data: java.lang.String): stdLib.Promise[cesiumLib.cesiumMod.CesiumNs.GeoJsonDataSource] = js.native
  def load(data: java.lang.String, options: cesiumLib.Anon_Stroke): stdLib.Promise[cesiumLib.cesiumMod.CesiumNs.GeoJsonDataSource] = js.native
  def load(data: js.Object): stdLib.Promise[cesiumLib.cesiumMod.CesiumNs.GeoJsonDataSource] = js.native
  def load(data: js.Object, options: cesiumLib.Anon_Stroke): stdLib.Promise[cesiumLib.cesiumMod.CesiumNs.GeoJsonDataSource] = js.native
}

