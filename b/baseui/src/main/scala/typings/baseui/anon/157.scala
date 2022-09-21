package typings.baseui.anon

import typings.baseui.baseuiStrings.MS
import typings.baseui.baseuiStrings.Montserrat
import typings.baseui.baseuiStrings.Plussign1664
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `157` extends StObject {
  
  val dialCode: Plussign1664
  
  val id: MS
  
  val label: Montserrat
}
object `157` {
  
  inline def apply(): `157` = {
    val __obj = js.Dynamic.literal(dialCode = "+1664", id = "MS", label = "Montserrat")
    __obj.asInstanceOf[`157`]
  }
  
  extension [Self <: `157`](x: Self) {
    
    inline def setDialCode(value: Plussign1664): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MS): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Montserrat): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
