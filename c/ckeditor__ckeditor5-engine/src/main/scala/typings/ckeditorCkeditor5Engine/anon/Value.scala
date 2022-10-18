package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.srcViewStylesmapMod.BoxSides
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var path: String
  
  var value: BoxSides
}
object Value {
  
  inline def apply(path: String, value: BoxSides): Value = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setValue(value: BoxSides): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
