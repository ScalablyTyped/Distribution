package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.srcset
import typings.ckeditorCkeditor5Engine.srcConversionUpcastdispatcherMod.UpcastConversionApi
import typings.ckeditorCkeditor5Engine.srcViewElementMod.default
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `10`] (val x: Self) extends AnyVal {
    
    inline def setKey(value: srcset): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Data | (js.Function2[/* el */ default, /* api */ UpcastConversionApi, Data])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueFunction2(value: (/* el */ default, /* api */ UpcastConversionApi) => Data): Self = StObject.set(x, "value", js.Any.fromFunction2(value))
  }
}
