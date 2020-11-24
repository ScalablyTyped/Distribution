package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextAlignEnumValues extends EmbindEnum {
  
  var Center: TextAlign = js.native
  
  var End: TextAlign = js.native
  
  var Justify: TextAlign = js.native
  
  var Left: TextAlign = js.native
  
  var Right: TextAlign = js.native
  
  var Start: TextAlign = js.native
}
object TextAlignEnumValues {
  
  @scala.inline
  def apply(
    Center: TextAlign,
    End: TextAlign,
    Justify: TextAlign,
    Left: TextAlign,
    Right: TextAlign,
    Start: TextAlign,
    values: js.Array[Double]
  ): TextAlignEnumValues = {
    val __obj = js.Dynamic.literal(Center = Center.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], Justify = Justify.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Right = Right.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAlignEnumValues]
  }
  
  @scala.inline
  implicit class TextAlignEnumValuesOps[Self <: TextAlignEnumValues] (val x: Self) extends AnyVal {
    
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
    def setCenter(value: TextAlign): Self = this.set("Center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: TextAlign): Self = this.set("End", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustify(value: TextAlign): Self = this.set("Justify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: TextAlign): Self = this.set("Left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: TextAlign): Self = this.set("Right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: TextAlign): Self = this.set("Start", value.asInstanceOf[js.Any])
  }
}
