package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaceholderAlignmentEnumValues extends EmbindEnum {
  
  var AboveBaseline: PlaceholderAlignment = js.native
  
  var Baseline: PlaceholderAlignment = js.native
  
  var BelowBaseline: PlaceholderAlignment = js.native
  
  var Bottom: PlaceholderAlignment = js.native
  
  var Middle: PlaceholderAlignment = js.native
  
  var Top: PlaceholderAlignment = js.native
}
object PlaceholderAlignmentEnumValues {
  
  @scala.inline
  def apply(
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
  implicit class PlaceholderAlignmentEnumValuesMutableBuilder[Self <: PlaceholderAlignmentEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAboveBaseline(value: PlaceholderAlignment): Self = StObject.set(x, "AboveBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseline(value: PlaceholderAlignment): Self = StObject.set(x, "Baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBelowBaseline(value: PlaceholderAlignment): Self = StObject.set(x, "BelowBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottom(value: PlaceholderAlignment): Self = StObject.set(x, "Bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddle(value: PlaceholderAlignment): Self = StObject.set(x, "Middle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: PlaceholderAlignment): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
  }
}
