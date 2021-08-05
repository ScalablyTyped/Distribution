package typings.baseui.anon

import typings.baseui.baseuiStrings.JP
import typings.baseui.baseuiStrings.Plussign81
import typings.baseui.baseuiStrings.`Japan Leftparenthesis日本Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `100` extends StObject {
  
  var dialCode: Plussign81
  
  var id: JP
  
  var label: `Japan Leftparenthesis日本Rightparenthesis`
}
object `100` {
  
  inline def apply(): `100` = {
    val __obj = js.Dynamic.literal(dialCode = "+81", id = "JP", label = "Japan (\u65E5\u672C)")
    __obj.asInstanceOf[`100`]
  }
  
  extension [Self <: `100`](x: Self) {
    
    inline def setDialCode(value: Plussign81): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: JP): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Japan Leftparenthesis日本Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
