package typings.baseui.anon

import typings.baseui.baseuiStrings.BR
import typings.baseui.baseuiStrings.Plussign55
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `39` extends StObject {
  
  val dialCode: Plussign55
  
  val id: BR
  
  val label: /* Brazil (Brasil) */ String
}
object `39` {
  
  inline def apply(): `39` = {
    val __obj = js.Dynamic.literal(dialCode = "+55", id = "BR", label = "Brazil (Brasil)")
    __obj.asInstanceOf[`39`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `39`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign55): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: BR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Brazil (Brasil) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
