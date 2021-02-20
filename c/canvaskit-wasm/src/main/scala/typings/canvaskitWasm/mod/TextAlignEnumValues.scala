package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
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
  implicit class TextAlignEnumValuesMutableBuilder[Self <: TextAlignEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: TextAlign): Self = StObject.set(x, "Center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: TextAlign): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustify(value: TextAlign): Self = StObject.set(x, "Justify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: TextAlign): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: TextAlign): Self = StObject.set(x, "Right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: TextAlign): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
  }
}
