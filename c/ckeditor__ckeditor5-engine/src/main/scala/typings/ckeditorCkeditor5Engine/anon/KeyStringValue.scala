package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.upcastdispatcherMod.UpcastConversionApi
import typings.ckeditorCkeditor5Engine.viewElementMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyStringValue extends StObject {
  
  var key: String
  
  var value: String | (js.Function2[/* el */ default, /* api */ UpcastConversionApi, String])
}
object KeyStringValue {
  
  inline def apply(
    key: String,
    value: String | (js.Function2[/* el */ default, /* api */ UpcastConversionApi, String])
  ): KeyStringValue = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyStringValue]
  }
  
  extension [Self <: KeyStringValue](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String | (js.Function2[/* el */ default, /* api */ UpcastConversionApi, String])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueFunction2(value: (/* el */ default, /* api */ UpcastConversionApi) => String): Self = StObject.set(x, "value", js.Any.fromFunction2(value))
  }
}
