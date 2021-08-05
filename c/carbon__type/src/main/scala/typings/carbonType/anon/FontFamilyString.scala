package typings.carbonType.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFamilyString extends StObject {
  
  var fontFamily: String
}
object FontFamilyString {
  
  inline def apply(fontFamily: String): FontFamilyString = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFamilyString]
  }
  
  extension [Self <: FontFamilyString](x: Self) {
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
  }
}
