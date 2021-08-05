package typings.baseui.anon

import typings.baseui.baseuiStrings.CH
import typings.baseui.baseuiStrings.Plussign41
import typings.baseui.baseuiStrings.`Switzerland LeftparenthesisSchweizRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `203` extends StObject {
  
  var dialCode: Plussign41
  
  var id: CH
  
  var label: `Switzerland LeftparenthesisSchweizRightparenthesis`
}
object `203` {
  
  inline def apply(): `203` = {
    val __obj = js.Dynamic.literal(dialCode = "+41", id = "CH", label = "Switzerland (Schweiz)")
    __obj.asInstanceOf[`203`]
  }
  
  extension [Self <: `203`](x: Self) {
    
    inline def setDialCode(value: Plussign41): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CH): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Switzerland LeftparenthesisSchweizRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
