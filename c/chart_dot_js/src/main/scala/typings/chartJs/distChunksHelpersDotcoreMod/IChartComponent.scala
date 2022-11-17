package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IChartComponent extends StObject {
  
  var defaultRoutes: Any
  
  var defaults: Any
  
  var id: String
  
  var overrides: js.UndefOr[Any] = js.undefined
}
object IChartComponent {
  
  inline def apply(defaultRoutes: Any, defaults: Any, id: String): IChartComponent = {
    val __obj = js.Dynamic.literal(defaultRoutes = defaultRoutes.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChartComponent]
  }
  
  extension [Self <: IChartComponent](x: Self) {
    
    inline def setDefaultRoutes(value: Any): Self = StObject.set(x, "defaultRoutes", value.asInstanceOf[js.Any])
    
    inline def setDefaults(value: Any): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOverrides(value: Any): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
  }
}
