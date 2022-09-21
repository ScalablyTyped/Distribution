package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionProviderOptions extends StObject {
  
  var options: js.Array[ConnectionOption]
}
object ConnectionProviderOptions {
  
  inline def apply(options: js.Array[ConnectionOption]): ConnectionProviderOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionProviderOptions]
  }
  
  extension [Self <: ConnectionProviderOptions](x: Self) {
    
    inline def setOptions(value: js.Array[ConnectionOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: ConnectionOption*): Self = StObject.set(x, "options", js.Array(value*))
  }
}
