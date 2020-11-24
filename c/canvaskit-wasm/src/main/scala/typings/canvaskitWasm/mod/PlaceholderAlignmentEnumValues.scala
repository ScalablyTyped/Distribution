package typings.canvaskitWasm.mod

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
  implicit class PlaceholderAlignmentEnumValuesOps[Self <: PlaceholderAlignmentEnumValues] (val x: Self) extends AnyVal {
    
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
    def setAboveBaseline(value: PlaceholderAlignment): Self = this.set("AboveBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseline(value: PlaceholderAlignment): Self = this.set("Baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBelowBaseline(value: PlaceholderAlignment): Self = this.set("BelowBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottom(value: PlaceholderAlignment): Self = this.set("Bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddle(value: PlaceholderAlignment): Self = this.set("Middle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: PlaceholderAlignment): Self = this.set("Top", value.asInstanceOf[js.Any])
  }
}
