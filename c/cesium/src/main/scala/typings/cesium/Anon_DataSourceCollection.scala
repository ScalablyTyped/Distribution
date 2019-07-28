package typings.cesium

import typings.cesium.cesiumMod.DataSourceCollection
import typings.cesium.cesiumMod.DataSourceDisplayNs.VisualizersCallback
import typings.cesium.cesiumMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataSourceCollection extends js.Object {
  var dataSourceCollection: DataSourceCollection
  var scene: Scene
  var visualizersCallback: js.UndefOr[VisualizersCallback] = js.undefined
}

object Anon_DataSourceCollection {
  @scala.inline
  def apply(
    dataSourceCollection: DataSourceCollection,
    scene: Scene,
    visualizersCallback: VisualizersCallback = null
  ): Anon_DataSourceCollection = {
    val __obj = js.Dynamic.literal(dataSourceCollection = dataSourceCollection, scene = scene)
    if (visualizersCallback != null) __obj.updateDynamic("visualizersCallback")(visualizersCallback)
    __obj.asInstanceOf[Anon_DataSourceCollection]
  }
}

