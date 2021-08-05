package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign221
import typings.baseui.baseuiStrings.SN
import typings.baseui.baseuiStrings.`Senegal LeftparenthesisSénégalRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `183` extends StObject {
  
  var dialCode: Plussign221
  
  var id: SN
  
  var label: `Senegal LeftparenthesisSénégalRightparenthesis`
}
object `183` {
  
  inline def apply(): `183` = {
    val __obj = js.Dynamic.literal(dialCode = "+221", id = "SN", label = "Senegal (S\u00E9n\u00E9gal)")
    __obj.asInstanceOf[`183`]
  }
  
  extension [Self <: `183`](x: Self) {
    
    inline def setDialCode(value: Plussign221): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: SN): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Senegal LeftparenthesisSénégalRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
