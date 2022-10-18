package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign678
import typings.baseui.baseuiStrings.VU
import typings.baseui.baseuiStrings.Vanuatu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `244` extends StObject {
  
  val dialCode: Plussign678
  
  val id: VU
  
  val label: Vanuatu
}
object `244` {
  
  inline def apply(): `244` = {
    val __obj = js.Dynamic.literal(dialCode = "+678", id = "VU", label = "Vanuatu")
    __obj.asInstanceOf[`244`]
  }
  
  extension [Self <: `244`](x: Self) {
    
    inline def setDialCode(value: Plussign678): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: VU): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Vanuatu): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
