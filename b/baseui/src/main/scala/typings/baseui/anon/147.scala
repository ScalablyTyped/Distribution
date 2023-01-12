package typings.baseui.anon

import typings.baseui.baseuiStrings.Mayotte
import typings.baseui.baseuiStrings.Plussign262
import typings.baseui.baseuiStrings.YT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `147` extends StObject {
  
  val dialCode: Plussign262
  
  val id: YT
  
  val label: Mayotte
}
object `147` {
  
  inline def apply(): `147` = {
    val __obj = js.Dynamic.literal(dialCode = "+262", id = "YT", label = "Mayotte")
    __obj.asInstanceOf[`147`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `147`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign262): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: YT): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Mayotte): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
