package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataSourceCollection extends js.Object {
  var dataSourceCollection: cesiumLib.cesiumMod.DataSourceCollection
  var scene: cesiumLib.cesiumMod.Scene
  var visualizersCallback: js.UndefOr[cesiumLib.cesiumMod.DataSourceDisplayNs.VisualizersCallback] = js.undefined
}

object Anon_DataSourceCollection {
  @scala.inline
  def apply(
    dataSourceCollection: cesiumLib.cesiumMod.DataSourceCollection,
    scene: cesiumLib.cesiumMod.Scene,
    visualizersCallback: cesiumLib.cesiumMod.DataSourceDisplayNs.VisualizersCallback = null
  ): Anon_DataSourceCollection = {
    val __obj = js.Dynamic.literal(dataSourceCollection = dataSourceCollection, scene = scene)
    if (visualizersCallback != null) __obj.updateDynamic("visualizersCallback")(visualizersCallback)
    __obj.asInstanceOf[Anon_DataSourceCollection]
  }
}

