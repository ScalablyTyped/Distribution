package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Whitelist extends StObject {
  
  var whitelist: js.UndefOr[js.Array[String]] = js.undefined
}
object Whitelist {
  
  inline def apply(): Whitelist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Whitelist]
  }
  
  extension [Self <: Whitelist](x: Self) {
    
    inline def setWhitelist(value: js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
    
    inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
    
    inline def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value*))
  }
}
