package typings.baseui.anon

import typings.baseui.baseuiStrings.MD
import typings.baseui.baseuiStrings.Plussign373
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `150` extends StObject {
  
  val dialCode: Plussign373
  
  val id: MD
  
  val label: /* Moldova (Republica Moldova) */ String
}
object `150` {
  
  inline def apply(): `150` = {
    val __obj = js.Dynamic.literal(dialCode = "+373", id = "MD", label = "Moldova (Republica Moldova)")
    __obj.asInstanceOf[`150`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `150`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign373): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MD): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Moldova (Republica Moldova) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
