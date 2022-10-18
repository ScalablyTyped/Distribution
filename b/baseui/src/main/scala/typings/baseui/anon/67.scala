package typings.baseui.anon

import typings.baseui.baseuiStrings.CY
import typings.baseui.baseuiStrings.Plussign357
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `67` extends StObject {
  
  val dialCode: Plussign357
  
  val id: CY
  
  val label: /* Cyprus (Κύπρος) */ String
}
object `67` {
  
  inline def apply(): `67` = {
    val __obj = js.Dynamic.literal(dialCode = "+357", id = "CY", label = "Cyprus (\u039A\u03CD\u03C0\u03C1\u03BF\u03C2)")
    __obj.asInstanceOf[`67`]
  }
  
  extension [Self <: `67`](x: Self) {
    
    inline def setDialCode(value: Plussign357): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CY): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Cyprus (Κύπρος) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
