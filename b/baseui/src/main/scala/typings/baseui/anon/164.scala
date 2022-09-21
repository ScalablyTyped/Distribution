package typings.baseui.anon

import typings.baseui.baseuiStrings.NL
import typings.baseui.baseuiStrings.Plussign31
import typings.baseui.baseuiStrings.`Netherlands LeftparenthesisNederlandRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `164` extends StObject {
  
  val dialCode: Plussign31
  
  val id: NL
  
  val label: `Netherlands LeftparenthesisNederlandRightparenthesis`
}
object `164` {
  
  inline def apply(): `164` = {
    val __obj = js.Dynamic.literal(dialCode = "+31", id = "NL", label = "Netherlands (Nederland)")
    __obj.asInstanceOf[`164`]
  }
  
  extension [Self <: `164`](x: Self) {
    
    inline def setDialCode(value: Plussign31): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: NL): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Netherlands LeftparenthesisNederlandRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
