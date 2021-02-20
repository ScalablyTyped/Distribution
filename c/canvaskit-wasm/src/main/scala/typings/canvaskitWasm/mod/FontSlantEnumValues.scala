package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontSlantEnumValues extends EmbindEnum {
  
  var Italic: FontSlant = js.native
  
  var Oblique: FontSlant = js.native
  
  var Upright: FontSlant = js.native
}
object FontSlantEnumValues {
  
  @scala.inline
  def apply(Italic: FontSlant, Oblique: FontSlant, Upright: FontSlant, values: js.Array[Double]): FontSlantEnumValues = {
    val __obj = js.Dynamic.literal(Italic = Italic.asInstanceOf[js.Any], Oblique = Oblique.asInstanceOf[js.Any], Upright = Upright.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSlantEnumValues]
  }
  
  @scala.inline
  implicit class FontSlantEnumValuesMutableBuilder[Self <: FontSlantEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItalic(value: FontSlant): Self = StObject.set(x, "Italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOblique(value: FontSlant): Self = StObject.set(x, "Oblique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpright(value: FontSlant): Self = StObject.set(x, "Upright", value.asInstanceOf[js.Any])
  }
}
