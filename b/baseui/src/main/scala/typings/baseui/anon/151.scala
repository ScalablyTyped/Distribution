package typings.baseui.anon

import typings.baseui.baseuiStrings.MX
import typings.baseui.baseuiStrings.Plussign52
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `151` extends StObject {
  
  val dialCode: Plussign52
  
  val id: MX
  
  val label: String
}
object `151` {
  
  inline def apply(): `151` = {
    val __obj = js.Dynamic.literal(dialCode = "+52", id = "MX", label = "Mexico (M\u00E9xico)")
    __obj.asInstanceOf[`151`]
  }
  
  extension [Self <: `151`](x: Self) {
    
    inline def setDialCode(value: Plussign52): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MX): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
