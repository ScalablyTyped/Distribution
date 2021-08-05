package typings.baseui.anon

import typings.baseui.baseuiStrings.DE
import typings.baseui.baseuiStrings.Plussign49
import typings.baseui.baseuiStrings.`Germany LeftparenthesisDeutschlandRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `73` extends StObject {
  
  var dialCode: Plussign49
  
  var id: DE
  
  var label: `Germany LeftparenthesisDeutschlandRightparenthesis`
}
object `73` {
  
  inline def apply(): `73` = {
    val __obj = js.Dynamic.literal(dialCode = "+49", id = "DE", label = "Germany (Deutschland)")
    __obj.asInstanceOf[`73`]
  }
  
  extension [Self <: `73`](x: Self) {
    
    inline def setDialCode(value: Plussign49): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: DE): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Germany LeftparenthesisDeutschlandRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
