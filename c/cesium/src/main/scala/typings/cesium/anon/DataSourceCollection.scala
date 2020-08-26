package typings.cesium.anon

import typings.cesium.mod.DataSource
import typings.cesium.mod.DataSourceDisplay.VisualizersCallback
import typings.cesium.mod.Visualizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceCollection extends js.Object {
  var dataSourceCollection: typings.cesium.mod.DataSourceCollection = js.native
  var scene: typings.cesium.mod.Scene = js.native
  var visualizersCallback: js.UndefOr[VisualizersCallback] = js.native
}

object DataSourceCollection {
  @scala.inline
  def apply(dataSourceCollection: typings.cesium.mod.DataSourceCollection, scene: typings.cesium.mod.Scene): DataSourceCollection = {
    val __obj = js.Dynamic.literal(dataSourceCollection = dataSourceCollection.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceCollection]
  }
  @scala.inline
  implicit class DataSourceCollectionOps[Self <: DataSourceCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataSourceCollection(value: typings.cesium.mod.DataSourceCollection): Self = this.set("dataSourceCollection", value.asInstanceOf[js.Any])
    @scala.inline
    def setScene(value: typings.cesium.mod.Scene): Self = this.set("scene", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisualizersCallback(value: (/* scene */ typings.cesium.mod.Scene, /* dataSource */ DataSource) => js.Array[Visualizer]): Self = this.set("visualizersCallback", js.Any.fromFunction2(value))
    @scala.inline
    def deleteVisualizersCallback: Self = this.set("visualizersCallback", js.undefined)
  }
  
}

