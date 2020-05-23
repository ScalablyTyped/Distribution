package typings.cesium.anon

import typings.cesium.mod.DataSource
import typings.cesium.mod.DataSourceDisplay.VisualizersCallback
import typings.cesium.mod.Visualizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceCollection extends js.Object {
  var dataSourceCollection: typings.cesium.mod.DataSourceCollection
  var scene: typings.cesium.mod.Scene
  var visualizersCallback: js.UndefOr[VisualizersCallback] = js.undefined
}

object DataSourceCollection {
  @scala.inline
  def apply(
    dataSourceCollection: typings.cesium.mod.DataSourceCollection,
    scene: typings.cesium.mod.Scene,
    visualizersCallback: (/* scene */ typings.cesium.mod.Scene, /* dataSource */ DataSource) => js.Array[Visualizer] = null
  ): DataSourceCollection = {
    val __obj = js.Dynamic.literal(dataSourceCollection = dataSourceCollection.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    if (visualizersCallback != null) __obj.updateDynamic("visualizersCallback")(js.Any.fromFunction2(visualizersCallback))
    __obj.asInstanceOf[DataSourceCollection]
  }
}

