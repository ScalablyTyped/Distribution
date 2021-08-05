package typings.baseui.anon

import typings.baseui.baseuiStrings.LT
import typings.baseui.baseuiStrings.Plussign370
import typings.baseui.baseuiStrings.`Lithuania LeftparenthesisLietuvaRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `116` extends StObject {
  
  var dialCode: Plussign370
  
  var id: LT
  
  var label: `Lithuania LeftparenthesisLietuvaRightparenthesis`
}
object `116` {
  
  inline def apply(): `116` = {
    val __obj = js.Dynamic.literal(dialCode = "+370", id = "LT", label = "Lithuania (Lietuva)")
    __obj.asInstanceOf[`116`]
  }
  
  extension [Self <: `116`](x: Self) {
    
    inline def setDialCode(value: Plussign370): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: LT): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Lithuania LeftparenthesisLietuvaRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
