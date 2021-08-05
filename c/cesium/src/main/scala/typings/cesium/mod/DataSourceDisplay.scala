package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "DataSourceDisplay")
@js.native
class DataSourceDisplay protected () extends StObject {
  def this(options: typings.cesium.anon.DataSourceCollection) = this()
  
  var dataSources: DataSourceCollection = js.native
  
  var defaultDataSource: CustomDataSource = js.native
  
  def destroy(): Unit = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var scene: Scene = js.native
  
  def update(time: JulianDate): Boolean = js.native
}
object DataSourceDisplay {
  
  @JSImport("cesium", "DataSourceDisplay")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "DataSourceDisplay.defaultVisualizersCallback")
  @js.native
  def defaultVisualizersCallback: VisualizersCallback = js.native
  inline def defaultVisualizersCallback_=(x: VisualizersCallback): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultVisualizersCallback")(x.asInstanceOf[js.Any])
  
  type VisualizersCallback = js.Function2[/* scene */ Scene, /* dataSource */ DataSource, js.Array[Visualizer]]
}
