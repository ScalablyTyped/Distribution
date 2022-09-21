package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.upcastdispatcherMod.UpcastConversionApi
import typings.ckeditorCkeditor5Engine.viewElementMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyString extends StObject {
  
  var key: String
  
  var value: String | (js.Function2[/* viewElement */ default, /* api */ UpcastConversionApi, String | Null])
}
object KeyString {
  
  inline def apply(
    key: String,
    value: String | (js.Function2[/* viewElement */ default, /* api */ UpcastConversionApi, String | Null])
  ): KeyString = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyString]
  }
  
  extension [Self <: KeyString](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(
      value: String | (js.Function2[/* viewElement */ default, /* api */ UpcastConversionApi, String | Null])
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueFunction2(value: (/* viewElement */ default, /* api */ UpcastConversionApi) => String | Null): Self = StObject.set(x, "value", js.Any.fromFunction2(value))
  }
}
