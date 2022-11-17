package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsPlugin extends StObject {
  
  var options: js.Object
  
  var plugin: js.Object
}
object OptionsPlugin {
  
  inline def apply(options: js.Object, plugin: js.Object): OptionsPlugin = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsPlugin]
  }
  
  extension [Self <: OptionsPlugin](x: Self) {
    
    inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPlugin(value: js.Object): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
  }
}
