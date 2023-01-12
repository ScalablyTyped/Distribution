package typings.ckeditor4.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  var color: String
  
  var unprocessed: String
}
object Color {
  
  inline def apply(color: String, unprocessed: String): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], unprocessed = unprocessed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setUnprocessed(value: String): Self = StObject.set(x, "unprocessed", value.asInstanceOf[js.Any])
  }
}
