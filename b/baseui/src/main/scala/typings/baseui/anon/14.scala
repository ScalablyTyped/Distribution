package typings.baseui.anon

import typings.baseui.baseuiStrings.BE
import typings.baseui.baseuiStrings.Plussign32
import typings.baseui.baseuiStrings.`Belgium LeftparenthesisBelgiëRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  var dialCode: Plussign32
  
  var id: BE
  
  var label: `Belgium LeftparenthesisBelgiëRightparenthesis`
}
object `14` {
  
  inline def apply(): `14` = {
    val __obj = js.Dynamic.literal(dialCode = "+32", id = "BE", label = "Belgium (Belgi\u00EB)")
    __obj.asInstanceOf[`14`]
  }
  
  extension [Self <: `14`](x: Self) {
    
    inline def setDialCode(value: Plussign32): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: BE): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Belgium LeftparenthesisBelgiëRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
