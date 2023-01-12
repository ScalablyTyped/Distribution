package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign58
import typings.baseui.baseuiStrings.VE
import typings.baseui.baseuiStrings.Venezuela
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `246` extends StObject {
  
  val dialCode: Plussign58
  
  val id: VE
  
  val label: Venezuela
}
object `246` {
  
  inline def apply(): `246` = {
    val __obj = js.Dynamic.literal(dialCode = "+58", id = "VE", label = "Venezuela")
    __obj.asInstanceOf[`246`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `246`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign58): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: VE): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Venezuela): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
