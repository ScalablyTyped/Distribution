package typings.ckeditorCkeditor5Engine.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyString extends StObject {
  
  var key: String
  
  var value: String | js.Array[String] | (Record[String, String])
}
object KeyString {
  
  inline def apply(key: String, value: String | js.Array[String] | (Record[String, String])): KeyString = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyString]
  }
  
  extension [Self <: KeyString](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String | js.Array[String] | (Record[String, String])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
