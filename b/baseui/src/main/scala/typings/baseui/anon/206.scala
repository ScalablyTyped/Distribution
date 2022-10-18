package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign421
import typings.baseui.baseuiStrings.SK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `206` extends StObject {
  
  val dialCode: Plussign421
  
  val id: SK
  
  val label: /* Slovakia (Slovensko) */ String
}
object `206` {
  
  inline def apply(): `206` = {
    val __obj = js.Dynamic.literal(dialCode = "+421", id = "SK", label = "Slovakia (Slovensko)")
    __obj.asInstanceOf[`206`]
  }
  
  extension [Self <: `206`](x: Self) {
    
    inline def setDialCode(value: Plussign421): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: SK): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Slovakia (Slovensko) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
