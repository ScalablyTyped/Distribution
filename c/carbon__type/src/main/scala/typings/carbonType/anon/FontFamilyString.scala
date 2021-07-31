package typings.carbonType.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFamilyString extends StObject {
  
  var fontFamily: String
}
object FontFamilyString {
  
  @scala.inline
  def apply(fontFamily: String): FontFamilyString = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFamilyString]
  }
  
  @scala.inline
  implicit class FontFamilyStringMutableBuilder[Self <: FontFamilyString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
  }
}
