package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign381
import typings.baseui.baseuiStrings.RS
import typings.baseui.baseuiStrings.`Serbia LeftparenthesisСрбијаRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `204` extends StObject {
  
  val dialCode: Plussign381
  
  val id: RS
  
  val label: `Serbia LeftparenthesisСрбијаRightparenthesis`
}
object `204` {
  
  inline def apply(): `204` = {
    val __obj = js.Dynamic.literal(dialCode = "+381", id = "RS", label = "Serbia (\u0421\u0440\u0431\u0438\u0458\u0430)")
    __obj.asInstanceOf[`204`]
  }
  
  extension [Self <: `204`](x: Self) {
    
    inline def setDialCode(value: Plussign381): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: RS): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Serbia LeftparenthesisСрбијаRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
