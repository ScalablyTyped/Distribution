package typings.baseui.anon

import typings.baseui.baseuiStrings.JM
import typings.baseui.baseuiStrings.Jamaica
import typings.baseui.baseuiStrings.Plussign1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `116` extends StObject {
  
  val dialCode: Plussign1
  
  val id: JM
  
  val label: Jamaica
}
object `116` {
  
  inline def apply(): `116` = {
    val __obj = js.Dynamic.literal(dialCode = "+1", id = "JM", label = "Jamaica")
    __obj.asInstanceOf[`116`]
  }
  
  extension [Self <: `116`](x: Self) {
    
    inline def setDialCode(value: Plussign1): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: JM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Jamaica): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
