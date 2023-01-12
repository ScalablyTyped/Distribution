package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign46
import typings.baseui.baseuiStrings.SE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `219` extends StObject {
  
  val dialCode: Plussign46
  
  val id: SE
  
  val label: /* Sweden (Sverige) */ String
}
object `219` {
  
  inline def apply(): `219` = {
    val __obj = js.Dynamic.literal(dialCode = "+46", id = "SE", label = "Sweden (Sverige)")
    __obj.asInstanceOf[`219`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `219`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign46): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: SE): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Sweden (Sverige) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
