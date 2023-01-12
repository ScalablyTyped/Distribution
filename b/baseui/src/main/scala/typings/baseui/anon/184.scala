package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign974
import typings.baseui.baseuiStrings.QA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `184` extends StObject {
  
  val dialCode: Plussign974
  
  val id: QA
  
  val label: /* Qatar (‫قطر‬‎) */ String
}
object `184` {
  
  inline def apply(): `184` = {
    val __obj = js.Dynamic.literal(dialCode = "+974", id = "QA", label = "Qatar (\u202B\u0642\u0637\u0631\u202C\u200E)")
    __obj.asInstanceOf[`184`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `184`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign974): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: QA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Qatar (‫قطر‬‎) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
