package typings.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scripts extends StObject {
  
  var scripts: js.UndefOr[js.Array[String]] = js.undefined
}
object Scripts {
  
  inline def apply(): Scripts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scripts]
  }
  
  extension [Self <: Scripts](x: Self) {
    
    inline def setScripts(value: js.Array[String]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    
    inline def setScriptsVarargs(value: String*): Self = StObject.set(x, "scripts", js.Array(value*))
  }
}
