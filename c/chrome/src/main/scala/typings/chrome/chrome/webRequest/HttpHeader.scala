package typings.chrome.chrome.webRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpHeader extends StObject {
  
  var binaryValue: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  var name: String
  
  var value: js.UndefOr[String] = js.undefined
}
object HttpHeader {
  
  inline def apply(name: String): HttpHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpHeader]
  }
  
  extension [Self <: HttpHeader](x: Self) {
    
    inline def setBinaryValue(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "binaryValue", value.asInstanceOf[js.Any])
    
    inline def setBinaryValueUndefined: Self = StObject.set(x, "binaryValue", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
