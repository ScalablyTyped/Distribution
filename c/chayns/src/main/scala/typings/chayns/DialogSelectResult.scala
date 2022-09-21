package typings.chayns

import typings.chayns.chayns.dialog.buttonType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogSelectResult extends StObject {
  
  var buttonType: typings.chayns.chayns.dialog.buttonType
  
  var selection: js.Array[DialogSelectResultItem]
}
object DialogSelectResult {
  
  inline def apply(buttonType: buttonType, selection: js.Array[DialogSelectResultItem]): DialogSelectResult = {
    val __obj = js.Dynamic.literal(buttonType = buttonType.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogSelectResult]
  }
  
  extension [Self <: DialogSelectResult](x: Self) {
    
    inline def setButtonType(value: buttonType): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
    
    inline def setSelection(value: js.Array[DialogSelectResultItem]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionVarargs(value: DialogSelectResultItem*): Self = StObject.set(x, "selection", js.Array(value*))
  }
}
