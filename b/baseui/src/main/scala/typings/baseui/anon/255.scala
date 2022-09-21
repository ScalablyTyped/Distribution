package typings.baseui.anon

import typings.baseui.baseuiStrings.AX
import typings.baseui.baseuiStrings.Plussign358
import typings.baseui.baseuiStrings.`Åland Islands`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `255` extends StObject {
  
  val dialCode: Plussign358
  
  val id: AX
  
  val label: `Åland Islands`
}
object `255` {
  
  inline def apply(): `255` = {
    val __obj = js.Dynamic.literal(dialCode = "+358", id = "AX", label = "\u00C5land Islands")
    __obj.asInstanceOf[`255`]
  }
  
  extension [Self <: `255`](x: Self) {
    
    inline def setDialCode(value: Plussign358): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: AX): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Åland Islands`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
