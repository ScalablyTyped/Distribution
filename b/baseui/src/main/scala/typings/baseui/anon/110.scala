package typings.baseui.anon

import typings.baseui.baseuiStrings.LV
import typings.baseui.baseuiStrings.Plussign371
import typings.baseui.baseuiStrings.`Latvia LeftparenthesisLatvijaRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `110` extends StObject {
  
  var dialCode: Plussign371
  
  var id: LV
  
  var label: `Latvia LeftparenthesisLatvijaRightparenthesis`
}
object `110` {
  
  inline def apply(): `110` = {
    val __obj = js.Dynamic.literal(dialCode = "+371", id = "LV", label = "Latvia (Latvija)")
    __obj.asInstanceOf[`110`]
  }
  
  extension [Self <: `110`](x: Self) {
    
    inline def setDialCode(value: Plussign371): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: LV): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Latvia LeftparenthesisLatvijaRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
