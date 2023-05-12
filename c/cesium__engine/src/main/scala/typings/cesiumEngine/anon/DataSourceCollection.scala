package typings.cesiumEngine.anon

import typings.cesiumEngine.mod.DataSource
import typings.cesiumEngine.mod.DataSourceDisplay.VisualizersCallback
import typings.cesiumEngine.mod.Scene
import typings.cesiumEngine.mod.Visualizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceCollection extends StObject {
  
  var dataSourceCollection: typings.cesiumEngine.mod.DataSourceCollection
  
  var scene: Scene
  
  var visualizersCallback: js.UndefOr[VisualizersCallback] = js.undefined
}
object DataSourceCollection {
  
  inline def apply(dataSourceCollection: typings.cesiumEngine.mod.DataSourceCollection, scene: Scene): DataSourceCollection = {
    val __obj = js.Dynamic.literal(dataSourceCollection = dataSourceCollection.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceCollection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSourceCollection] (val x: Self) extends AnyVal {
    
    inline def setDataSourceCollection(value: typings.cesiumEngine.mod.DataSourceCollection): Self = StObject.set(x, "dataSourceCollection", value.asInstanceOf[js.Any])
    
    inline def setScene(value: Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    inline def setVisualizersCallback(value: (/* scene */ Scene, /* dataSource */ DataSource) => js.Array[Visualizer]): Self = StObject.set(x, "visualizersCallback", js.Any.fromFunction2(value))
    
    inline def setVisualizersCallbackUndefined: Self = StObject.set(x, "visualizersCallback", js.undefined)
  }
}
