package typings.azdata.mod

import typings.azdata.azdataStrings.bold
import typings.azdata.azdataStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardDescriptionItem extends StObject {
  
  var fontWeight: js.UndefOr[normal | bold] = js.undefined
  
  var label: String
  
  var tooltip: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object CardDescriptionItem {
  
  inline def apply(label: String): CardDescriptionItem = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardDescriptionItem]
  }
  
  extension [Self <: CardDescriptionItem](x: Self) {
    
    inline def setFontWeight(value: normal | bold): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
