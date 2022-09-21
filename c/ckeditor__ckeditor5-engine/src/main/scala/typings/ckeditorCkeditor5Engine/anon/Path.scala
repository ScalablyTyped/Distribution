package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.stylesmapMod.BoxSides
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path extends StObject {
  
  var path: String
  
  var value: BoxSides
}
object Path {
  
  inline def apply(path: String, value: BoxSides): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
  
  extension [Self <: Path](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setValue(value: BoxSides): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
