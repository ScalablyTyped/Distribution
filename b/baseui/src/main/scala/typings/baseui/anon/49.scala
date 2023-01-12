package typings.baseui.anon

import typings.baseui.baseuiStrings.CV
import typings.baseui.baseuiStrings.Plussign238
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `49` extends StObject {
  
  val dialCode: Plussign238
  
  val id: CV
  
  val label: /* Cape Verde (Kabu Verdi) */ String
}
object `49` {
  
  inline def apply(): `49` = {
    val __obj = js.Dynamic.literal(dialCode = "+238", id = "CV", label = "Cape Verde (Kabu Verdi)")
    __obj.asInstanceOf[`49`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `49`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign238): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CV): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Cape Verde (Kabu Verdi) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
