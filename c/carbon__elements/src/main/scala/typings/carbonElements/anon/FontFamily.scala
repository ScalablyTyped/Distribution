package typings.carbonElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFamily extends StObject {
  
  var fontFamily: Any
}
object FontFamily {
  
  inline def apply(fontFamily: Any): FontFamily = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFamily]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontFamily] (val x: Self) extends AnyVal {
    
    inline def setFontFamily(value: Any): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
  }
}
