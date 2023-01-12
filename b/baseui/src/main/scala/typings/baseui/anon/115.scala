package typings.baseui.anon

import typings.baseui.baseuiStrings.IT
import typings.baseui.baseuiStrings.Plussign39
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `115` extends StObject {
  
  val dialCode: Plussign39
  
  val id: IT
  
  val label: /* Italy (Italia) */ String
}
object `115` {
  
  inline def apply(): `115` = {
    val __obj = js.Dynamic.literal(dialCode = "+39", id = "IT", label = "Italy (Italia)")
    __obj.asInstanceOf[`115`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `115`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign39): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: IT): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Italy (Italia) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
