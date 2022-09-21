package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `15` extends StObject {
  
  var key: String | js.RegExp
  
  var value: String | js.RegExp | Boolean
}
object `15` {
  
  inline def apply(key: String | js.RegExp, value: String | js.RegExp | Boolean): `15` = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`15`]
  }
  
  extension [Self <: `15`](x: Self) {
    
    inline def setKey(value: String | js.RegExp): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String | js.RegExp | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
