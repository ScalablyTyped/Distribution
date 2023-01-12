package typings.baseui.anon

import typings.baseui.baseuiStrings.IR
import typings.baseui.baseuiStrings.Plussign98
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `110` extends StObject {
  
  val dialCode: Plussign98
  
  val id: IR
  
  val label: /* Iran (‫ایران‬‎) */ String
}
object `110` {
  
  inline def apply(): `110` = {
    val __obj = js.Dynamic.literal(dialCode = "+98", id = "IR", label = "Iran (\u202B\u0627\u06CC\u0631\u0627\u0646\u202C\u200E)")
    __obj.asInstanceOf[`110`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `110`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign98): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: IR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Iran (‫ایران‬‎) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
