package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaceholderAlignmentEnumValues
  extends StObject
     with EmbindEnum {
  
  var AboveBaseline: PlaceholderAlignment
  
  var Baseline: PlaceholderAlignment
  
  var BelowBaseline: PlaceholderAlignment
  
  var Bottom: PlaceholderAlignment
  
  var Middle: PlaceholderAlignment
  
  var Top: PlaceholderAlignment
}
object PlaceholderAlignmentEnumValues {
  
  inline def apply(
    AboveBaseline: PlaceholderAlignment,
    Baseline: PlaceholderAlignment,
    BelowBaseline: PlaceholderAlignment,
    Bottom: PlaceholderAlignment,
    Middle: PlaceholderAlignment,
    Top: PlaceholderAlignment,
    values: js.Array[Double]
  ): PlaceholderAlignmentEnumValues = {
    val __obj = js.Dynamic.literal(AboveBaseline = AboveBaseline.asInstanceOf[js.Any], Baseline = Baseline.asInstanceOf[js.Any], BelowBaseline = BelowBaseline.asInstanceOf[js.Any], Bottom = Bottom.asInstanceOf[js.Any], Middle = Middle.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceholderAlignmentEnumValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaceholderAlignmentEnumValues] (val x: Self) extends AnyVal {
    
    inline def setAboveBaseline(value: PlaceholderAlignment): Self = StObject.set(x, "AboveBaseline", value.asInstanceOf[js.Any])
    
    inline def setBaseline(value: PlaceholderAlignment): Self = StObject.set(x, "Baseline", value.asInstanceOf[js.Any])
    
    inline def setBelowBaseline(value: PlaceholderAlignment): Self = StObject.set(x, "BelowBaseline", value.asInstanceOf[js.Any])
    
    inline def setBottom(value: PlaceholderAlignment): Self = StObject.set(x, "Bottom", value.asInstanceOf[js.Any])
    
    inline def setMiddle(value: PlaceholderAlignment): Self = StObject.set(x, "Middle", value.asInstanceOf[js.Any])
    
    inline def setTop(value: PlaceholderAlignment): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
  }
}
