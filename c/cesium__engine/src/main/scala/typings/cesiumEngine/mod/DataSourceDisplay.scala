package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "DataSourceDisplay")
@js.native
open class DataSourceDisplay protected () extends StObject {
  def this(options: typings.cesiumEngine.anon.DataSourceCollection) = this()
  
  /**
    * Gets the collection of data sources to display.
    */
  var dataSources: DataSourceCollection = js.native
  
  /**
    * Gets the default data source instance which can be used to
    * manually create and visualize entities not tied to
    * a specific data source. This instance is always available
    * and does not appear in the list dataSources collection.
    */
  var defaultDataSource: CustomDataSource = js.native
  
  /**
    * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
    * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
    * <br /><br />
    * Once an object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.  Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    * @example
    * dataSourceDisplay = dataSourceDisplay.destroy();
    */
  def destroy(): Unit = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <br /><br />
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * @returns True if this object was destroyed; otherwise, false.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Gets a value indicating whether or not all entities in the data source are ready
    */
  val ready: Boolean = js.native
  
  /**
    * Gets the scene associated with this display.
    */
  var scene: Scene = js.native
  
  /**
    * Updates the display to the provided time.
    * @param time - The simulation time.
    * @returns True if all data sources are ready to be displayed, false otherwise.
    */
  def update(time: JulianDate): Boolean = js.native
}
/* static members */
object DataSourceDisplay {
  
  @JSImport("@cesium/engine", "DataSourceDisplay")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets or sets the default function which creates an array of visualizers used for visualization.
    * By default, this function uses all standard visualizers.
    */
  inline def defaultVisualizersCallback(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultVisualizersCallback")().asInstanceOf[Unit]
  
  /**
    * A function which creates an array of visualizers used for visualization.
    * @example
    * function createVisualizers(scene, dataSource) {
    *     return [new Cesium.BillboardVisualizer(scene, dataSource.entities)];
    * }
    * @param scene - The scene to create visualizers for.
    * @param dataSource - The data source to create visualizers for.
    */
  type VisualizersCallback = js.Function2[/* scene */ Scene, /* dataSource */ DataSource, js.Array[Visualizer]]
}
