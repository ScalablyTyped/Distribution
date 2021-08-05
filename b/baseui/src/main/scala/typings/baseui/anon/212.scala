package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign676
import typings.baseui.baseuiStrings.TO
import typings.baseui.baseuiStrings.Tonga
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `212` extends StObject {
  
  var dialCode: Plussign676
  
  var id: TO
  
  var label: Tonga
}
object `212` {
  
  inline def apply(): `212` = {
    val __obj = js.Dynamic.literal(dialCode = "+676", id = "TO", label = "Tonga")
    __obj.asInstanceOf[`212`]
  }
  
  extension [Self <: `212`](x: Self) {
    
    inline def setDialCode(value: Plussign676): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: TO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Tonga): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
