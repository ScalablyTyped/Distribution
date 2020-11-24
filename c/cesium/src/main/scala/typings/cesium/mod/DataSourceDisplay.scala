package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "DataSourceDisplay")
@js.native
class DataSourceDisplay protected () extends js.Object {
  def this(options: typings.cesium.anon.DataSourceCollection) = this()
  
  var dataSources: DataSourceCollection = js.native
  
  var defaultDataSource: CustomDataSource = js.native
  
  def destroy(): Unit = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var scene: Scene = js.native
  
  def update(time: JulianDate): Boolean = js.native
}
/* static members */
@JSImport("cesium", "DataSourceDisplay")
@js.native
object DataSourceDisplay extends js.Object {
  
  def defaultVisualizersCallback(scene: Scene, dataSource: DataSource): js.Array[Visualizer] = js.native
  @JSName("defaultVisualizersCallback")
  var defaultVisualizersCallback_Original: VisualizersCallback = js.native
  
  type VisualizersCallback = js.Function2[/* scene */ Scene, /* dataSource */ DataSource, js.Array[Visualizer]]
}
