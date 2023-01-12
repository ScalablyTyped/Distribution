package typings.baseui.anon

import typings.baseui.baseuiStrings.CL
import typings.baseui.baseuiStrings.Chile
import typings.baseui.baseuiStrings.Plussign56
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `53` extends StObject {
  
  val dialCode: Plussign56
  
  val id: CL
  
  val label: Chile
}
object `53` {
  
  inline def apply(): `53` = {
    val __obj = js.Dynamic.literal(dialCode = "+56", id = "CL", label = "Chile")
    __obj.asInstanceOf[`53`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `53`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign56): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CL): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Chile): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
