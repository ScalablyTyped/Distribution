package typings.baseui.anon

import typings.baseui.baseuiStrings.MN
import typings.baseui.baseuiStrings.Plussign976
import typings.baseui.baseuiStrings.`Mongolia LeftparenthesisМонголRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `135` extends StObject {
  
  var dialCode: Plussign976
  
  var id: MN
  
  var label: `Mongolia LeftparenthesisМонголRightparenthesis`
}
object `135` {
  
  inline def apply(): `135` = {
    val __obj = js.Dynamic.literal(dialCode = "+976", id = "MN", label = "Mongolia (\u041C\u043E\u043D\u0433\u043E\u043B)")
    __obj.asInstanceOf[`135`]
  }
  
  extension [Self <: `135`](x: Self) {
    
    inline def setDialCode(value: Plussign976): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MN): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Mongolia LeftparenthesisМонголRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
