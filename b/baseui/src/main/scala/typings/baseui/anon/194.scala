package typings.baseui.anon

import typings.baseui.baseuiStrings.KR
import typings.baseui.baseuiStrings.Plussign82
import typings.baseui.baseuiStrings.`South Korea Leftparenthesis대한민국Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `194` extends StObject {
  
  var dialCode: Plussign82
  
  var id: KR
  
  var label: `South Korea Leftparenthesis대한민국Rightparenthesis`
}
object `194` {
  
  inline def apply(): `194` = {
    val __obj = js.Dynamic.literal(dialCode = "+82", id = "KR", label = "South Korea (\uB300\uD55C\uBBFC\uAD6D)")
    __obj.asInstanceOf[`194`]
  }
  
  extension [Self <: `194`](x: Self) {
    
    inline def setDialCode(value: Plussign82): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: KR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `South Korea Leftparenthesis대한민국Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
