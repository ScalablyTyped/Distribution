package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "DataSourceDisplay")
@js.native
class DataSourceDisplay protected () extends js.Object {
  def this(options: cesiumLib.Anon_DataSourceCollection) = this()
  var dataSources: DataSourceCollection = js.native
  var defaultDataSource: CustomDataSource = js.native
  var scene: Scene = js.native
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
  def update(time: JulianDate): scala.Boolean = js.native
}

/* static members */
@JSImport("cesium", "DataSourceDisplay")
@js.native
object DataSourceDisplay extends js.Object {
  @JSName("defaultVisualizersCallback")
  var defaultVisualizersCallback_Original: cesiumLib.cesiumMod.DataSourceDisplayNs.VisualizersCallback = js.native
  def defaultVisualizersCallback(scene: cesiumLib.cesiumMod.Scene, dataSource: cesiumLib.cesiumMod.DataSource): js.Array[cesiumLib.cesiumMod.Visualizer] = js.native
}

