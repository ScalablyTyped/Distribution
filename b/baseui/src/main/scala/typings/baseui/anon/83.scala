package typings.baseui.anon

import typings.baseui.baseuiStrings.FI
import typings.baseui.baseuiStrings.Plussign358
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `83` extends StObject {
  
  val dialCode: Plussign358
  
  val id: FI
  
  val label: /* Finland (Suomi) */ String
}
object `83` {
  
  inline def apply(): `83` = {
    val __obj = js.Dynamic.literal(dialCode = "+358", id = "FI", label = "Finland (Suomi)")
    __obj.asInstanceOf[`83`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `83`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign358): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: FI): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Finland (Suomi) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
