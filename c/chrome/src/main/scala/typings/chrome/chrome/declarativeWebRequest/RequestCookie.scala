package typings.chrome.chrome.declarativeWebRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestCookie extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object RequestCookie {
  
  inline def apply(): RequestCookie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestCookie]
  }
  
  extension [Self <: RequestCookie](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
