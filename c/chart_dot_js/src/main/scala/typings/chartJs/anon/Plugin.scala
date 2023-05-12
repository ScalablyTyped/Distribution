package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plugin extends StObject {
  
  var options: Any
  
  var plugin: Any
}
object Plugin {
  
  inline def apply(options: Any, plugin: Any): Plugin = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Plugin] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPlugin(value: Any): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
  }
}
