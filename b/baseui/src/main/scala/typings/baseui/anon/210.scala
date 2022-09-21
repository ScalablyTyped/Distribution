package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign386
import typings.baseui.baseuiStrings.SI
import typings.baseui.baseuiStrings.`Slovenia LeftparenthesisSlovenijaRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `210` extends StObject {
  
  val dialCode: Plussign386
  
  val id: SI
  
  val label: `Slovenia LeftparenthesisSlovenijaRightparenthesis`
}
object `210` {
  
  inline def apply(): `210` = {
    val __obj = js.Dynamic.literal(dialCode = "+386", id = "SI", label = "Slovenia (Slovenija)")
    __obj.asInstanceOf[`210`]
  }
  
  extension [Self <: `210`](x: Self) {
    
    inline def setDialCode(value: Plussign386): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: SI): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Slovenia LeftparenthesisSlovenijaRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
