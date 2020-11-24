package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontWidthEnumValues extends EmbindEnum {
  
  var Condensed: FontWidth = js.native
  
  var Expanded: FontWidth = js.native
  
  var ExtraCondensed: FontWidth = js.native
  
  var ExtraExpanded: FontWidth = js.native
  
  var Normal: FontWidth = js.native
  
  var SemiCondensed: FontWidth = js.native
  
  var SemiExpanded: FontWidth = js.native
  
  var UltraCondensed: FontWidth = js.native
  
  var UltraExpanded: FontWidth = js.native
}
object FontWidthEnumValues {
  
  @scala.inline
  def apply(
    Condensed: FontWidth,
    Expanded: FontWidth,
    ExtraCondensed: FontWidth,
    ExtraExpanded: FontWidth,
    Normal: FontWidth,
    SemiCondensed: FontWidth,
    SemiExpanded: FontWidth,
    UltraCondensed: FontWidth,
    UltraExpanded: FontWidth,
    values: js.Array[Double]
  ): FontWidthEnumValues = {
    val __obj = js.Dynamic.literal(Condensed = Condensed.asInstanceOf[js.Any], Expanded = Expanded.asInstanceOf[js.Any], ExtraCondensed = ExtraCondensed.asInstanceOf[js.Any], ExtraExpanded = ExtraExpanded.asInstanceOf[js.Any], Normal = Normal.asInstanceOf[js.Any], SemiCondensed = SemiCondensed.asInstanceOf[js.Any], SemiExpanded = SemiExpanded.asInstanceOf[js.Any], UltraCondensed = UltraCondensed.asInstanceOf[js.Any], UltraExpanded = UltraExpanded.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontWidthEnumValues]
  }
  
  @scala.inline
  implicit class FontWidthEnumValuesOps[Self <: FontWidthEnumValues] (val x: Self) extends AnyVal {
    
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
    def setCondensed(value: FontWidth): Self = this.set("Condensed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpanded(value: FontWidth): Self = this.set("Expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraCondensed(value: FontWidth): Self = this.set("ExtraCondensed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraExpanded(value: FontWidth): Self = this.set("ExtraExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: FontWidth): Self = this.set("Normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemiCondensed(value: FontWidth): Self = this.set("SemiCondensed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemiExpanded(value: FontWidth): Self = this.set("SemiExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUltraCondensed(value: FontWidth): Self = this.set("UltraCondensed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUltraExpanded(value: FontWidth): Self = this.set("UltraExpanded", value.asInstanceOf[js.Any])
  }
}
