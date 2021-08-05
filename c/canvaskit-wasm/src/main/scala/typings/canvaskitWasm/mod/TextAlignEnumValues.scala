package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextAlignEnumValues
  extends StObject
     with EmbindEnum {
  
  var Center: TextAlign
  
  var End: TextAlign
  
  var Justify: TextAlign
  
  var Left: TextAlign
  
  var Right: TextAlign
  
  var Start: TextAlign
}
object TextAlignEnumValues {
  
  inline def apply(
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
  
  extension [Self <: TextAlignEnumValues](x: Self) {
    
    inline def setCenter(value: TextAlign): Self = StObject.set(x, "Center", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: TextAlign): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    inline def setJustify(value: TextAlign): Self = StObject.set(x, "Justify", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: TextAlign): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: TextAlign): Self = StObject.set(x, "Right", value.asInstanceOf[js.Any])
    
    inline def setStart(value: TextAlign): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
  }
}
