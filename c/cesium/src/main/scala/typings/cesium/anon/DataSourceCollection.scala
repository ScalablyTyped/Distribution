package typings.cesium.anon

import typings.cesium.mod.DataSource
import typings.cesium.mod.DataSourceDisplay.VisualizersCallback
import typings.cesium.mod.Visualizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceCollection extends StObject {
  
  var dataSourceCollection: typings.cesium.mod.DataSourceCollection
  
  var scene: typings.cesium.mod.Scene
  
  var visualizersCallback: js.UndefOr[VisualizersCallback] = js.undefined
}
object DataSourceCollection {
  
  inline def apply(dataSourceCollection: typings.cesium.mod.DataSourceCollection, scene: typings.cesium.mod.Scene): DataSourceCollection = {
    val __obj = js.Dynamic.literal(dataSourceCollection = dataSourceCollection.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceCollection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSourceCollection] (val x: Self) extends AnyVal {
    
    inline def setDataSourceCollection(value: typings.cesium.mod.DataSourceCollection): Self = StObject.set(x, "dataSourceCollection", value.asInstanceOf[js.Any])
    
    inline def setScene(value: typings.cesium.mod.Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    inline def setVisualizersCallback(value: (/* scene */ typings.cesium.mod.Scene, /* dataSource */ DataSource) => js.Array[Visualizer]): Self = StObject.set(x, "visualizersCallback", js.Any.fromFunction2(value))
    
    inline def setVisualizersCallbackUndefined: Self = StObject.set(x, "visualizersCallback", js.undefined)
  }
}
