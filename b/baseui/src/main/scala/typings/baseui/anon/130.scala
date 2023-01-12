package typings.baseui.anon

import typings.baseui.baseuiStrings.LR
import typings.baseui.baseuiStrings.Liberia
import typings.baseui.baseuiStrings.Plussign231
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `130` extends StObject {
  
  val dialCode: Plussign231
  
  val id: LR
  
  val label: Liberia
}
object `130` {
  
  inline def apply(): `130` = {
    val __obj = js.Dynamic.literal(dialCode = "+231", id = "LR", label = "Liberia")
    __obj.asInstanceOf[`130`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `130`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign231): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: LR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Liberia): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
