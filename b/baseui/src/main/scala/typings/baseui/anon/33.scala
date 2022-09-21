package typings.baseui.anon

import typings.baseui.baseuiStrings.BY
import typings.baseui.baseuiStrings.Plussign375
import typings.baseui.baseuiStrings.`Belarus LeftparenthesisБеларусьRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `33` extends StObject {
  
  val dialCode: Plussign375
  
  val id: BY
  
  val label: `Belarus LeftparenthesisБеларусьRightparenthesis`
}
object `33` {
  
  inline def apply(): `33` = {
    val __obj = js.Dynamic.literal(dialCode = "+375", id = "BY", label = "Belarus (\u0411\u0435\u043B\u0430\u0440\u0443\u0441\u044C)")
    __obj.asInstanceOf[`33`]
  }
  
  extension [Self <: `33`](x: Self) {
    
    inline def setDialCode(value: Plussign375): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: BY): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Belarus LeftparenthesisБеларусьRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
