package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "KmlDataSource")
@js.native
class KmlDataSource ()
  extends cesiumLib.cesiumMod.CesiumNs.KmlDataSource {
  def this(options: cesiumLib.Anon_Camera) = this()
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

/* static members */
@JSImport("cesium", "KmlDataSource")
@js.native
object KmlDataSource extends js.Object {
  def load(data: cesiumLib.cesiumMod.CesiumNs.Resource): js.Promise[cesiumLib.cesiumMod.CesiumNs.KmlDataSource] = js.native
  def load(data: cesiumLib.cesiumMod.CesiumNs.Resource, options: cesiumLib.Anon_CameraCanvas): js.Promise[cesiumLib.cesiumMod.CesiumNs.KmlDataSource] = js.native
  def load(data: java.lang.String): js.Promise[cesiumLib.cesiumMod.CesiumNs.KmlDataSource] = js.native
  def load(data: java.lang.String, options: cesiumLib.Anon_CameraCanvas): js.Promise[cesiumLib.cesiumMod.CesiumNs.KmlDataSource] = js.native
  def load(data: stdLib.Blob): js.Promise[cesiumLib.cesiumMod.CesiumNs.KmlDataSource] = js.native
  def load(data: stdLib.Blob, options: cesiumLib.Anon_CameraCanvas): js.Promise[cesiumLib.cesiumMod.CesiumNs.KmlDataSource] = js.native
  def load(data: stdLib.Document): js.Promise[cesiumLib.cesiumMod.CesiumNs.KmlDataSource] = js.native
  def load(data: stdLib.Document, options: cesiumLib.Anon_CameraCanvas): js.Promise[cesiumLib.cesiumMod.CesiumNs.KmlDataSource] = js.native
}

