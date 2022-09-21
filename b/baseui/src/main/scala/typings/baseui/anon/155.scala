package typings.baseui.anon

import typings.baseui.baseuiStrings.MN
import typings.baseui.baseuiStrings.Plussign976
import typings.baseui.baseuiStrings.`Mongolia LeftparenthesisМонголRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `155` extends StObject {
  
  val dialCode: Plussign976
  
  val id: MN
  
  val label: `Mongolia LeftparenthesisМонголRightparenthesis`
}
object `155` {
  
  inline def apply(): `155` = {
    val __obj = js.Dynamic.literal(dialCode = "+976", id = "MN", label = "Mongolia (\u041C\u043E\u043D\u0433\u043E\u043B)")
    __obj.asInstanceOf[`155`]
  }
  
  extension [Self <: `155`](x: Self) {
    
    inline def setDialCode(value: Plussign976): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MN): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Mongolia LeftparenthesisМонголRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
