package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RectHeightStyleEnumValues extends EmbindEnum {
  
  var IncludeLineSpacingBottom: RectHeightStyle = js.native
  
  var IncludeLineSpacingMiddle: RectHeightStyle = js.native
  
  var IncludeLineSpacingTop: RectHeightStyle = js.native
  
  var Max: RectHeightStyle = js.native
  
  var Tight: RectHeightStyle = js.native
}
object RectHeightStyleEnumValues {
  
  @scala.inline
  def apply(
    IncludeLineSpacingBottom: RectHeightStyle,
    IncludeLineSpacingMiddle: RectHeightStyle,
    IncludeLineSpacingTop: RectHeightStyle,
    Max: RectHeightStyle,
    Tight: RectHeightStyle,
    values: js.Array[Double]
  ): RectHeightStyleEnumValues = {
    val __obj = js.Dynamic.literal(IncludeLineSpacingBottom = IncludeLineSpacingBottom.asInstanceOf[js.Any], IncludeLineSpacingMiddle = IncludeLineSpacingMiddle.asInstanceOf[js.Any], IncludeLineSpacingTop = IncludeLineSpacingTop.asInstanceOf[js.Any], Max = Max.asInstanceOf[js.Any], Tight = Tight.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectHeightStyleEnumValues]
  }
  
  @scala.inline
  implicit class RectHeightStyleEnumValuesOps[Self <: RectHeightStyleEnumValues] (val x: Self) extends AnyVal {
    
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
    def setIncludeLineSpacingBottom(value: RectHeightStyle): Self = this.set("IncludeLineSpacingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeLineSpacingMiddle(value: RectHeightStyle): Self = this.set("IncludeLineSpacingMiddle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeLineSpacingTop(value: RectHeightStyle): Self = this.set("IncludeLineSpacingTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: RectHeightStyle): Self = this.set("Max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTight(value: RectHeightStyle): Self = this.set("Tight", value.asInstanceOf[js.Any])
  }
}
