package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign380
import typings.baseui.baseuiStrings.UA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `238` extends StObject {
  
  val dialCode: Plussign380
  
  val id: UA
  
  val label: /* Ukraine (Україна) */ String
}
object `238` {
  
  inline def apply(): `238` = {
    val __obj = js.Dynamic.literal(dialCode = "+380", id = "UA", label = "Ukraine (\u0423\u043A\u0440\u0430\u0457\u043D\u0430)")
    __obj.asInstanceOf[`238`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `238`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign380): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: UA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Ukraine (Україна) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
