package typings.cesium.global.Cesium

import typings.cesium.mod.DataSourceDisplay.VisualizersCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.DataSourceDisplay")
@js.native
class DataSourceDisplay protected ()
  extends typings.cesium.mod.DataSourceDisplay {
  def this(options: typings.cesium.anon.DataSourceCollection) = this()
}
object DataSourceDisplay {
  
  @JSGlobal("Cesium.DataSourceDisplay")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Cesium.DataSourceDisplay.defaultVisualizersCallback")
  @js.native
  def defaultVisualizersCallback: VisualizersCallback = js.native
  inline def defaultVisualizersCallback_=(x: VisualizersCallback): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultVisualizersCallback")(x.asInstanceOf[js.Any])
}
