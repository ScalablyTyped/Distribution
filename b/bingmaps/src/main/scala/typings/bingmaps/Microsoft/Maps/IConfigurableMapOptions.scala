package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConfigurableMapOptions extends StObject {
  
  /** Initial map options. */
  var mapOptions: IMapOptions
  
  /** List of configuration modules to load. */
  var modules: js.Array[IConfigurableMapModule]
}
object IConfigurableMapOptions {
  
  inline def apply(mapOptions: IMapOptions, modules: js.Array[IConfigurableMapModule]): IConfigurableMapOptions = {
    val __obj = js.Dynamic.literal(mapOptions = mapOptions.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfigurableMapOptions]
  }
  
  extension [Self <: IConfigurableMapOptions](x: Self) {
    
    inline def setMapOptions(value: IMapOptions): Self = StObject.set(x, "mapOptions", value.asInstanceOf[js.Any])
    
    inline def setModules(value: js.Array[IConfigurableMapModule]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesVarargs(value: IConfigurableMapModule*): Self = StObject.set(x, "modules", js.Array(value :_*))
  }
}
