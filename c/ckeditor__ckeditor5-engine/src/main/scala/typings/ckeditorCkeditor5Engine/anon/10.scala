package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.srcset
import typings.ckeditorCkeditor5Engine.upcastdispatcherMod.UpcastConversionApi
import typings.ckeditorCkeditor5Engine.viewElementMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10` extends StObject {
  
  var key: srcset
  
  var value: Data | (js.Function2[/* el */ default, /* api */ UpcastConversionApi, Data])
}
object `10` {
  
  inline def apply(value: Data | (js.Function2[/* el */ default, /* api */ UpcastConversionApi, Data])): `10` = {
    val __obj = js.Dynamic.literal(key = "srcset", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`10`]
  }
  
  extension [Self <: `10`](x: Self) {
    
    inline def setKey(value: srcset): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Data | (js.Function2[/* el */ default, /* api */ UpcastConversionApi, Data])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueFunction2(value: (/* el */ default, /* api */ UpcastConversionApi) => Data): Self = StObject.set(x, "value", js.Any.fromFunction2(value))
  }
}
