package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign39
import typings.baseui.baseuiStrings.VA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `245` extends StObject {
  
  val dialCode: Plussign39
  
  val id: VA
  
  val label: /* Vatican City (Città del Vaticano) */ String
}
object `245` {
  
  inline def apply(): `245` = {
    val __obj = js.Dynamic.literal(dialCode = "+39", id = "VA", label = "Vatican City (Citt\u00E0 del Vaticano)")
    __obj.asInstanceOf[`245`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `245`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign39): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: VA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Vatican City (Città del Vaticano) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
