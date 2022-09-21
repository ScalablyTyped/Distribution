package typings.baseui.anon

import typings.baseui.baseuiStrings.GW
import typings.baseui.baseuiStrings.Plussign245
import typings.baseui.baseuiStrings.`Guinea-Bissau LeftparenthesisGuiné BissauRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `104` extends StObject {
  
  val dialCode: Plussign245
  
  val id: GW
  
  val label: `Guinea-Bissau LeftparenthesisGuiné BissauRightparenthesis`
}
object `104` {
  
  inline def apply(): `104` = {
    val __obj = js.Dynamic.literal(dialCode = "+245", id = "GW", label = "Guinea-Bissau (Guin\u00E9 Bissau)")
    __obj.asInstanceOf[`104`]
  }
  
  extension [Self <: `104`](x: Self) {
    
    inline def setDialCode(value: Plussign245): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: GW): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Guinea-Bissau LeftparenthesisGuiné BissauRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
