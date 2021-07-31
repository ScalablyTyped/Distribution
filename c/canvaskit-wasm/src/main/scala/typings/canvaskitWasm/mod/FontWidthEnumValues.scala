package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontWidthEnumValues
  extends StObject
     with EmbindEnum {
  
  var Condensed: FontWidth
  
  var Expanded: FontWidth
  
  var ExtraCondensed: FontWidth
  
  var ExtraExpanded: FontWidth
  
  var Normal: FontWidth
  
  var SemiCondensed: FontWidth
  
  var SemiExpanded: FontWidth
  
  var UltraCondensed: FontWidth
  
  var UltraExpanded: FontWidth
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
  implicit class FontWidthEnumValuesMutableBuilder[Self <: FontWidthEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondensed(value: FontWidth): Self = StObject.set(x, "Condensed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpanded(value: FontWidth): Self = StObject.set(x, "Expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraCondensed(value: FontWidth): Self = StObject.set(x, "ExtraCondensed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraExpanded(value: FontWidth): Self = StObject.set(x, "ExtraExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: FontWidth): Self = StObject.set(x, "Normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemiCondensed(value: FontWidth): Self = StObject.set(x, "SemiCondensed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemiExpanded(value: FontWidth): Self = StObject.set(x, "SemiExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUltraCondensed(value: FontWidth): Self = StObject.set(x, "UltraCondensed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUltraExpanded(value: FontWidth): Self = StObject.set(x, "UltraExpanded", value.asInstanceOf[js.Any])
  }
}
