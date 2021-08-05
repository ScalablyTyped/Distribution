package typings.baseui.anon

import typings.baseui.baseuiStrings.CF
import typings.baseui.baseuiStrings.Plussign236
import typings.baseui.baseuiStrings.`Central African Republic LeftparenthesisRépublique centrafricaineRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `34` extends StObject {
  
  var dialCode: Plussign236
  
  var id: CF
  
  var label: `Central African Republic LeftparenthesisRépublique centrafricaineRightparenthesis`
}
object `34` {
  
  inline def apply(): `34` = {
    val __obj = js.Dynamic.literal(dialCode = "+236", id = "CF", label = "Central African Republic (R\u00E9publique centrafricaine)")
    __obj.asInstanceOf[`34`]
  }
  
  extension [Self <: `34`](x: Self) {
    
    inline def setDialCode(value: Plussign236): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CF): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Central African Republic LeftparenthesisRépublique centrafricaineRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
