package typings.baseui.anon

import typings.baseui.baseuiStrings.BI
import typings.baseui.baseuiStrings.Plussign257
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `45` extends StObject {
  
  val dialCode: Plussign257
  
  val id: BI
  
  val label: /* Burundi (Uburundi) */ String
}
object `45` {
  
  inline def apply(): `45` = {
    val __obj = js.Dynamic.literal(dialCode = "+257", id = "BI", label = "Burundi (Uburundi)")
    __obj.asInstanceOf[`45`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `45`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign257): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: BI): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Burundi (Uburundi) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
