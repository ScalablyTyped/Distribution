package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CustomDataSource")
@js.native
class CustomDataSource ()
  extends cesiumLib.cesiumMod.CesiumNs.CustomDataSource {
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

