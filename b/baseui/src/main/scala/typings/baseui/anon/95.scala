package typings.baseui.anon

import typings.baseui.baseuiStrings.GI
import typings.baseui.baseuiStrings.Gibraltar
import typings.baseui.baseuiStrings.Plussign350
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `95` extends StObject {
  
  val dialCode: Plussign350
  
  val id: GI
  
  val label: Gibraltar
}
object `95` {
  
  inline def apply(): `95` = {
    val __obj = js.Dynamic.literal(dialCode = "+350", id = "GI", label = "Gibraltar")
    __obj.asInstanceOf[`95`]
  }
  
  extension [Self <: `95`](x: Self) {
    
    inline def setDialCode(value: Plussign350): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: GI): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Gibraltar): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
