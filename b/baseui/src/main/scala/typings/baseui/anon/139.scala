package typings.baseui.anon

import typings.baseui.baseuiStrings.MY
import typings.baseui.baseuiStrings.Malaysia
import typings.baseui.baseuiStrings.Plussign60
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `139` extends StObject {
  
  val dialCode: Plussign60
  
  val id: MY
  
  val label: Malaysia
}
object `139` {
  
  inline def apply(): `139` = {
    val __obj = js.Dynamic.literal(dialCode = "+60", id = "MY", label = "Malaysia")
    __obj.asInstanceOf[`139`]
  }
  
  extension [Self <: `139`](x: Self) {
    
    inline def setDialCode(value: Plussign60): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MY): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Malaysia): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
