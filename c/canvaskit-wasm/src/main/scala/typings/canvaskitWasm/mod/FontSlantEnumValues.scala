package typings.canvaskitWasm.mod

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
  implicit class FontSlantEnumValuesOps[Self <: FontSlantEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setItalic(value: FontSlant): Self = this.set("Italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOblique(value: FontSlant): Self = this.set("Oblique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpright(value: FontSlant): Self = this.set("Upright", value.asInstanceOf[js.Any])
  }
}
