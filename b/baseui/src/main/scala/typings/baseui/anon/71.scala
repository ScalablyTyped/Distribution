package typings.baseui.anon

import typings.baseui.baseuiStrings.CZ
import typings.baseui.baseuiStrings.Plussign420
import typings.baseui.baseuiStrings.`Czech Republic LeftparenthesisČeská republikaRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `71` extends StObject {
  
  val dialCode: Plussign420
  
  val id: CZ
  
  val label: `Czech Republic LeftparenthesisČeská republikaRightparenthesis`
}
object `71` {
  
  inline def apply(): `71` = {
    val __obj = js.Dynamic.literal(dialCode = "+420", id = "CZ", label = "Czech Republic (\u010Cesk\u00E1 republika)")
    __obj.asInstanceOf[`71`]
  }
  
  extension [Self <: `71`](x: Self) {
    
    inline def setDialCode(value: Plussign420): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CZ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Czech Republic LeftparenthesisČeská republikaRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
