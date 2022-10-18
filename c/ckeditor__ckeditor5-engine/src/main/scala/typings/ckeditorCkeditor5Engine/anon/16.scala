package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `16` extends StObject {
  
  var key: String | js.RegExp
  
  var value: String | js.RegExp | Boolean
}
object `16` {
  
  inline def apply(key: String | js.RegExp, value: String | js.RegExp | Boolean): `16` = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`16`]
  }
  
  extension [Self <: `16`](x: Self) {
    
    inline def setKey(value: String | js.RegExp): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String | js.RegExp | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
