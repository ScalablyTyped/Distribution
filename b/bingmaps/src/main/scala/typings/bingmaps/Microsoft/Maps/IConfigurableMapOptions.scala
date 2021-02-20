package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConfigurableMapOptions extends StObject {
  
  /** Initial map options. */
  var mapOptions: IMapOptions = js.native
  
  /** List of configuration modules to load. */
  var modules: js.Array[IConfigurableMapModule] = js.native
}
object IConfigurableMapOptions {
  
  @scala.inline
  def apply(mapOptions: IMapOptions, modules: js.Array[IConfigurableMapModule]): IConfigurableMapOptions = {
    val __obj = js.Dynamic.literal(mapOptions = mapOptions.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfigurableMapOptions]
  }
  
  @scala.inline
  implicit class IConfigurableMapOptionsMutableBuilder[Self <: IConfigurableMapOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMapOptions(value: IMapOptions): Self = StObject.set(x, "mapOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModules(value: js.Array[IConfigurableMapModule]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModulesVarargs(value: IConfigurableMapModule*): Self = StObject.set(x, "modules", js.Array(value :_*))
  }
}
