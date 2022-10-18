package typings.baseui.anon

import typings.baseui.baseuiStrings.MG
import typings.baseui.baseuiStrings.Plussign261
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `137` extends StObject {
  
  val dialCode: Plussign261
  
  val id: MG
  
  val label: /* Madagascar (Madagasikara) */ String
}
object `137` {
  
  inline def apply(): `137` = {
    val __obj = js.Dynamic.literal(dialCode = "+261", id = "MG", label = "Madagascar (Madagasikara)")
    __obj.asInstanceOf[`137`]
  }
  
  extension [Self <: `137`](x: Self) {
    
    inline def setDialCode(value: Plussign261): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Madagascar (Madagasikara) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
