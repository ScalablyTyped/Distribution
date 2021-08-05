package typings.baseui.anon

import typings.baseui.baseuiStrings.NL
import typings.baseui.baseuiStrings.Plussign31
import typings.baseui.baseuiStrings.`Netherlands LeftparenthesisNederlandRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `144` extends StObject {
  
  var dialCode: Plussign31
  
  var id: NL
  
  var label: `Netherlands LeftparenthesisNederlandRightparenthesis`
}
object `144` {
  
  inline def apply(): `144` = {
    val __obj = js.Dynamic.literal(dialCode = "+31", id = "NL", label = "Netherlands (Nederland)")
    __obj.asInstanceOf[`144`]
  }
  
  extension [Self <: `144`](x: Self) {
    
    inline def setDialCode(value: Plussign31): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: NL): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Netherlands LeftparenthesisNederlandRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
