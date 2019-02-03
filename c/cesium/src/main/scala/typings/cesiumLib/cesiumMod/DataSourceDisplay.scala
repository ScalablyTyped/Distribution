package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "DataSourceDisplay")
@js.native
class DataSourceDisplay protected ()
  extends cesiumLib.cesiumMod.CesiumNs.DataSourceDisplay {
  def this(options: cesiumLib.Anon_DataSourceCollection) = this()
  /* CompleteClass */
  override var dataSources: cesiumLib.cesiumMod.CesiumNs.DataSourceCollection = js.native
  /* CompleteClass */
  override var defaultDataSource: cesiumLib.cesiumMod.CesiumNs.CustomDataSource = js.native
  /* CompleteClass */
  override var scene: cesiumLib.cesiumMod.CesiumNs.Scene = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def isDestroyed(): scala.Boolean = js.native
  /* CompleteClass */
  override def update(time: cesiumLib.cesiumMod.CesiumNs.JulianDate): scala.Boolean = js.native
}

/* static members */
@JSImport("cesium", "DataSourceDisplay")
@js.native
object DataSourceDisplay extends js.Object {
  @JSName("defaultVisualizersCallback")
  var defaultVisualizersCallback_Original: cesiumLib.cesiumMod.CesiumNs.DataSourceDisplayNs.VisualizersCallback = js.native
  def defaultVisualizersCallback(scene: cesiumLib.cesiumMod.CesiumNs.Scene, dataSource: cesiumLib.cesiumMod.CesiumNs.DataSource): js.Array[cesiumLib.cesiumMod.CesiumNs.Visualizer] = js.native
}

